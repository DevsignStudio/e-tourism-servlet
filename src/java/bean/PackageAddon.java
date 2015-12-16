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
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.Driver;
import jdbc.JDBCUtility;
import user.registerServlet;

/**
 *
 * @author Nizul Zaim
 */
public class PackageAddon {
    private int id;
    private String name;
    private double price;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    public static PackageAddon getById(Integer id) {
        JDBCUtility jdbcUtility = Driver.startDB();
        ResultSet rs;
        Connection con;
        PackageAddon pkg = null;

        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();


        try {
                PreparedStatement preparedStatement = jdbcUtility.psSelectPackageAddonById();
                preparedStatement.setString(1, id.toString());
                rs = preparedStatement.executeQuery();

                while (rs.next())
                {
                    pkg = new PackageAddon();
                    System.out.println(rs.getString("id"));
                    pkg.setId(Integer.parseInt(rs.getString("id")));
                    pkg.setName(rs.getString("name"));
                    pkg.setPrice(Double.parseDouble(rs.getString("price")));
                }
                con.close();
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

        return pkg;
    }
    public boolean updatePackageAddon() {
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
                PreparedStatement preparedStatement = jdbcUtility.psUpdatePackageAddon();
                
                preparedStatement.setString(1, this.getName());
                preparedStatement.setString(2, ((Double)this.getPrice()).toString());
                preparedStatement.setString(3, ((Integer)this.getId()).toString());
                preparedStatement.executeUpdate();
                con.close();
            }
            catch (SQLException ex)
            {
                while (ex != null)
                {
                    System.out.println ("SQLState: " + ex.getSQLState ());
                    System.out.println ("Message:  " +ex.getMessage ());
                    System.out.println ("Vendor:   " + ex.getErrorCode ());
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
