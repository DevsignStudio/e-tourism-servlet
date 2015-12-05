package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.JDBCUtility;
import user.registerServlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nizul Zaim
 */
public class Package {
    String name, description, image;
    int id;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public static Package getPackageById(Integer id) {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;

        Package pkg = null;

        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();


        try {
                PreparedStatement preparedStatement = jdbcUtility.psSelectPackageById();
                preparedStatement.setString(1, id.toString());
                rs = preparedStatement.executeQuery();

                while (rs.next())
                {
                    pkg = new Package();
                    
                    pkg.setId(Integer.parseInt(rs.getString("id")));
                    pkg.setName(rs.getString("name"));
                    pkg.setDescription(rs.getString("description"));
                    pkg.setImage(rs.getString("image"));
                    pkg.setPrice(Double.parseDouble(rs.getString("price")));
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

        return pkg;
    }
    
    public static boolean addPackage(String name, Double price, String description, String image) {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;

        Package pkg = null;

        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();
        
        try {
                PreparedStatement preparedStatement = jdbcUtility.psInsertPackage();
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, price.toString());
                preparedStatement.setString(3, description);
                preparedStatement.setString(4, image);


                preparedStatement.executeUpdate();
                
                return true;

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
        
        return false;
    }
    
    public static ArrayList<Package> allPackage() {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;


        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();

        ArrayList pkgs = new ArrayList();
        try {
            rs = jdbcUtility.psSelectAllPackage().executeQuery();

            while (rs.next()) {
                Package pkg = Package.getPackageById(Integer.parseInt(rs.getString("id")));
                pkgs.add(pkg);

                //out.println("<p>" + matriks + "</p>");
            }
        }
        catch (SQLException ex)
        {
        }

        return pkgs;
    }
    
    public boolean addPackageAddOn(String name, Double price) {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;

        Package pkg = null;

        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();
        
        try {
                PreparedStatement preparedStatement = jdbcUtility.psInsertPackageAddon();
                preparedStatement.setString(1, ((Integer)this.id).toString());
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, price.toString());

                preparedStatement.executeUpdate();
                
                return true;

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
        
        return false;
    }
    
    public ArrayList<PackageAddon> getAllAddon() {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;
        
        ArrayList<PackageAddon> arr = new ArrayList();
        PackageAddon pkg = null;

        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();


        try {
                PreparedStatement preparedStatement = jdbcUtility.psSelectAllPackageAddon();
                preparedStatement.setString(1, ((Integer)this.id).toString());
                rs = preparedStatement.executeQuery();
                while (rs.next())
                {
                    pkg = PackageAddon.getById(Integer.parseInt(rs.getString("id")));
                    System.out.println(pkg.getName());
                    arr.add(pkg);
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

        return arr;
    }
    
}
