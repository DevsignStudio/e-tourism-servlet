/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.JDBCUtility;
import user.registerServlet;

/**
 *
 * @author Nizul Zaim
 */
public class User implements Serializable {
    private String username, password, email;
    private int userType, gender, zipCode, id;
    private String firstName, lastName, address, city, state;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the userType
     */
    public int getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }

    /**
     * @return the gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * @return the zipCode
     */
    public int getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    public static User getUserFromUsername(String username) {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;

        User user = new User();

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
                PreparedStatement preparedStatement = jdbcUtility.psSelectUserExists();
                preparedStatement.setString(1, username);
                rs = preparedStatement.executeQuery();

                while (rs.next())
                {
                    user.setFirstName(rs.getString("firstName"));
                    user.setID(Integer.parseInt(rs.getString("id")));
                    user.setLastName(rs.getString("lastName"));
                    user.setUsername(rs.getString("username"));
                    user.setEmail(rs.getString("email"));
                    user.setGender(Integer.parseInt(rs.getString("gender")));
                    user.setAddress(rs.getString("address"));
                    user.setCity(rs.getString("city"));
                    user.setState(rs.getString("state"));
                    user.setZipCode(Integer.parseInt(rs.getString("zipCode")));
                    user.setUserType(Integer.parseInt(rs.getString("userType")));
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

        return user;
    }

    public String getFullname() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public static ArrayList<User> getAllClient() {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;

        User user = new User();

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

        ArrayList clients = new ArrayList();
        try {
            rs = jdbcUtility.psSelectAllClient().executeQuery();

            while (rs.next()) {
                User client = User.getUserFromUsername(rs.getString("username"));
                System.out.println(rs.getString("username"));
                clients.add(client);

                //out.println("<p>" + matriks + "</p>");
            }
        }
        catch (SQLException ex)
        {
        }

        return clients;
    }
    
    public static boolean deleteClient(int id) {
        String driver = "com.mysql.jdbc.Driver";
        JDBCUtility jdbcUtility;
        Connection con;

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";
        ResultSet rs;

        User user = new User();

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
                PreparedStatement preparedStatement = jdbcUtility.psDeleteClient();
                preparedStatement.setString(1, ((Integer)id).toString());
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
