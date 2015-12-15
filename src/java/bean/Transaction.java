/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Driver;
import jdbc.JDBCUtility;
import user.registerServlet;
/**
 *
 * @author Nizul Zaim
 */
public class Transaction {
    private int id;
    private int status;
    private int packageId;
    private int userId;
    private Timestamp createdAt;
    private String eventAt;
    ArrayList<TransactionAddon> addons;
    private Integer quantity;
    
    public Transaction(int packageId, int userId) {
        this.status = 0;
        this.packageId = packageId;
        this.userId = userId;
        this.addons = new ArrayList();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        if (status == 0) {
            return "<span class=\"label label-primary\">Pending Payment</span>";
        }else if (status == 1) {
            return "<span class=\"label label-danger\">Cancel</span>";
        } else if (status == 2) {
            return "<span class=\"label label-success\">Success</span>";
        }
        
        return "<span class=\"label label-warning\">Payment Overdue</span>";
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the packageId
     */
    public int getPackageId() {
        return packageId;
    }
    
    private void setPackageId(int id) {
        this.packageId = id;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }
    
    private void setUserId(int id) {
        this.userId = id;
    }

    /**
     * @return the createAt
     */
    public String getCreatedAt() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(createdAt);
    }
    
    private void setCreatedAt(Timestamp t) {
        this.createdAt = t;
    }
    
    public boolean create() {

        JDBCUtility jdbcUtility = Driver.startDB();
        Connection con;

        
        ResultSet rs;

        Package pkg = null;

        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();
        
        try {
                PreparedStatement preparedStatement = jdbcUtility.psInsertTransaction();
                preparedStatement.setString(1, ((Integer)this.packageId).toString());
                preparedStatement.setString(2, ((Integer)this.userId).toString());
                preparedStatement.setString(3, this.eventAt);
                preparedStatement.setString(4, (this.quantity).toString());
                
                preparedStatement.executeUpdate();
                rs = preparedStatement.getGeneratedKeys();
                
                while (rs != null && rs.next()) {
                    this.setId(rs.getInt(1));
                }

            }

            catch (SQLException ex)
            {
                while (ex != null)
                {
                    System.out.println ("SQLState: " +
                                         ex.getSQLState ());
                    System.out.println ("Message:  " +
                                         ex.getMessage ());
                    System.out.println ("Vendor:   " +
                                         ex.getErrorCode ());
                    ex = ex.getNextException ();
                    System.out.println ("");
                    
                }
                
                return false;
            }
            catch (java.lang.Exception ex)
            {
                ex.printStackTrace ();
                return false;
            }
        
        for (int i = 0; i < this.addons.size(); i++) {
            try {
                PreparedStatement preparedStatement = jdbcUtility.psInsertTransactionAddon();
                System.out.println(this.getId());
                preparedStatement.setInt(1, this.getId());
                preparedStatement.setString(2, (this.addons.get(i).addon_id).toString());

                preparedStatement.executeUpdate();
            }

            catch (SQLException ex)
            {
                while (ex != null)
                {
                    System.out.println ("SQLState: " +
                                         ex.getSQLState ());
                    System.out.println ("Message:  " +
                                         ex.getMessage ());
                    System.out.println ("Vendor:   " +
                                         ex.getErrorCode ());
                    ex = ex.getNextException ();
                    System.out.println ("");
                    
                }
                
                return false;
            }
            catch (java.lang.Exception ex)
            {
                ex.printStackTrace ();
                return false;
            }
        }
        
        
        return true;
    }
    
    public ArrayList<TransactionAddon> getAddons() {
        return this.addons;
    }
    
    public ArrayList<PackageAddon> getPackageAddon() {
        ResultSet rs;
        Connection con;
        JDBCUtility jdbcUtility = Driver.startDB();
        con = jdbcUtility.jdbcGetConnection();
        ArrayList<PackageAddon> pkgAddons = new ArrayList();
        try {
            PreparedStatement ps = jdbcUtility.psSelectTransactionAddon();

            ps.setString(1, ((Integer)this.id).toString());
            rs = ps.executeQuery();
            while (rs.next())
            {
                pkgAddons.add(PackageAddon.getById(Integer.parseInt(rs.getString("addon_id"))));
            }
        }
        catch (SQLException ex)
        {
        }

        return pkgAddons;
    }
    
    public boolean addNewAddOn(Integer addon_id) {
        TransactionAddon addon = new TransactionAddon(addon_id, this.id);
        this.addons.add(addon);
        return true;
    }

    /**
     * @return the eventAt
     */
    public String getEventAt() {
        SimpleDateFormat fromUser = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {

            String reformattedStr = myFormat.format(fromUser.parse(this.eventAt));
            return reformattedStr;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param eventAt the eventAt to set
     */
    public void setEventAt(String eventAt) {
        this.eventAt = eventAt;
    }
    
    public static ArrayList<Transaction> getAllTransaction() {
        ResultSet rs;
        Connection con;
        JDBCUtility jdbcUtility = Driver.startDB();
        con = jdbcUtility.jdbcGetConnection();

        ArrayList trans = new ArrayList();
        try {
            rs = jdbcUtility.psSelectAllTransaction().executeQuery();

            while (rs.next()) {
                Transaction tran = Transaction.getTransactionById(Integer.parseInt(rs.getString("id")));
                trans.add(tran);
            }
        }
        catch (SQLException ex)
        {
        }

        return trans;
    }
    
    public static ArrayList<Transaction> getAllTransaction(Integer userID) {
        ResultSet rs;
        Connection con;
        JDBCUtility jdbcUtility = Driver.startDB();
        con = jdbcUtility.jdbcGetConnection();

        ArrayList trans = new ArrayList();
        try {
            PreparedStatement ps = jdbcUtility.psSelectAllTransactionUser();
            ps.setString(1, userID.toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                Transaction tran = Transaction.getTransactionById(Integer.parseInt(rs.getString("id")));
                trans.add(tran);
            }
        }
        catch (SQLException ex)
        {
        }

        return trans;
    }
    
    
    public static Transaction getTransactionById(Integer id) {
        JDBCUtility jdbcUtility;
        Connection con;
        ResultSet rs;
        Transaction trans = null;
        jdbcUtility = Driver.startDB();
        jdbcUtility.jdbcConnect();
        
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();


        try {
                PreparedStatement preparedStatement = jdbcUtility.psSelectTransactionById();
                preparedStatement.setString(1, id.toString());
                rs = preparedStatement.executeQuery();

                while (rs.next())
                {
                    trans = new Transaction(Integer.parseInt(rs.getString("package_id")), Integer.parseInt(rs.getString("package_id")));
                    trans.setId(Integer.parseInt(rs.getString("id")));
                    trans.setEventAt(rs.getString("event_at"));
                    trans.setStatus(Integer.parseInt(rs.getString("status")));
                    trans.setCreatedAt(rs.getTimestamp("created_at"));
                    trans.setQuantity(Integer.parseInt(rs.getString("quantity")));
                    
                    
                }

            }
            catch (SQLException ex)
            {
                while (ex != null)
                {
                    System.out.println ("SQLState: " +
                                         ex.getSQLState ());
                    System.out.println ("Message:  " +
                                         ex.getMessage ());
                    System.out.println ("Vendor:   " +
                                         ex.getErrorCode ());
                    ex = ex.getNextException ();
                    System.out.println ("");
                }
            }
            catch (java.lang.Exception ex)
            {
                ex.printStackTrace ();
            }

        return trans;
    }
    
    public String getPackageName() {
        return Package.getPackageById(this.packageId).getName();
    }
    
    public Double getTotalPrice() {
        Double price = 0.0;
        ArrayList<PackageAddon> addons = this.getPackageAddon();
        
        for (int i = 0; i < addons.size(); i++) {
            price += addons.get(i).getPrice();
        }
        return (Package.getPackageById(this.packageId).getPrice() + price) * this.quantity;
    }

    /**
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public boolean changeStatus(Integer status) {
        JDBCUtility jdbcUtility;
        Connection con;
        jdbcUtility = Driver.startDB();
        jdbcUtility.jdbcConnect();
        
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();


        try {
                PreparedStatement preparedStatement = jdbcUtility.psUpdateTransactionStatus();
                preparedStatement.setString(1, status.toString());
                preparedStatement.setString(2, ((Integer)this.id).toString());
                preparedStatement.executeUpdate();


            }
            catch (SQLException ex)
            {
                while (ex != null)
                {
                    System.out.println ("SQLState: " +
                                         ex.getSQLState ());
                    System.out.println ("Message:  " +
                                         ex.getMessage ());
                    System.out.println ("Vendor:   " +
                                         ex.getErrorCode ());
                    ex = ex.getNextException ();
                    System.out.println ("");
                }
                
                return false;
            }
            catch (java.lang.Exception ex)
            {
                ex.printStackTrace ();
                return false;
            }
        
        return true;
    }
    
}
