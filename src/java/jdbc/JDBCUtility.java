/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author U
 */
public class JDBCUtility
{
   Connection con;
   String driver;
   String url;
   String userName;
   String password;

   PreparedStatement psInsertStudent = null;
   PreparedStatement psSelectAllStudent = null;
   PreparedStatement psSelectStudentViaMatriks = null;
   PreparedStatement psUpdateStudentNameViaMatriks = null;
   PreparedStatement psDeleteStudentViaMatriks = null;
   PreparedStatement psInsertClient = null;
   PreparedStatement psSelectClient = null;
   PreparedStatement psSelectAllClient = null;
   PreparedStatement psSelectUserExists = null;
   PreparedStatement psSelectUserExistsById = null;
   PreparedStatement psSelectUserExistsByEmail = null;
   PreparedStatement psUpdateClient = null;
   PreparedStatement psDeleteClient = null;
   PreparedStatement psSelectPackageById = null;
   PreparedStatement psInsertPackage = null;
   PreparedStatement psSelectAllPackage = null;
   PreparedStatement psInsertPackageAddon = null;
   PreparedStatement psSelectPackageAddonById = null;
   PreparedStatement psSelectAllPackageAddon = null;
   PreparedStatement psInsertTransaction = null;
   PreparedStatement psSelectTransactionById = null;
   PreparedStatement psSelectAllTransaction = null;
   PreparedStatement psSelectAllTransactionUser = null;
   PreparedStatement psInsertTransactionAddon = null;
   PreparedStatement psSelectTransactionAddon = null;
   PreparedStatement psUpdateTransactionStatus = null;
   PreparedStatement psDeletePackage = null;
   PreparedStatement psActivatePackage = null;
   PreparedStatement psUpdatePackage = null;
   PreparedStatement psUpdatePackageAddon = null;
   PreparedStatement psUpdatePassword = null;
   
   //use this constructor if using ConnectionPool
   public JDBCUtility()
   {
   }

   //use this constructor if not using ConnectionPool
   //ConnectionPool is used for multi user!
   public JDBCUtility(String driver,
                      String url,
                      String userName,
                      String password)
   {
      this.driver = driver;
      this.url = url;
      this.userName = userName;
      this.password = password;
   }

   public  void jdbcConnect()
   {
      try
       {
         Class.forName (driver);
         con = DriverManager.getConnection(url, userName, password);
         DatabaseMetaData dma = con.getMetaData ();
         System.out.println("\nConnected to " + dma.getURL());
         System.out.println("Driver       " + dma.getDriverName());
         System.out.println("Version      " + dma.getDriverVersion());
         System.out.println("");
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

         System.out.println("Connection to the database error");
       }
       catch (java.lang.Exception ex)
       {
         ex.printStackTrace ();
       }
   }

   public Connection jdbcGetConnection()
   {
    return con;
   }

   public void jdbcConClose()
   {
    try
    {
         con.close();
    }
    catch (Exception ex)
       {
       }
   }

   public void prepareSQLStatement() throws SQLException
   {
       try {
            
//            //delete student via matriks
            String sqlDeleteStudentViaMatriks = "DELETE FROM student WHERE matriks = ?";
            psDeleteStudentViaMatriks = con.prepareStatement(sqlDeleteStudentViaMatriks);


            //insert user
            String sqlInsertClient = "INSERT INTO user(username, password, userType, email, firstName, lastName, gender, address, zipCode, city, state ) VALUES(?, ?, 2, ?, ?, ?, ?, ?, ?, ?, ?);";
            psInsertClient = con.prepareStatement(sqlInsertClient);

            //select user
            String sqlQuerySelectAllClient = "SELECT * FROM user WHERE userType = 2";
            this.psSelectAllClient =  con.prepareStatement(sqlQuerySelectAllClient);

            String sqlQueryUserExists = "SELECT * FROM user WHERE username = ?";
            psSelectUserExists =  con.prepareStatement(sqlQueryUserExists);
            
            String sqlQueryUserExistsById = "SELECT * FROM user WHERE id = ?";
            psSelectUserExistsById =  con.prepareStatement(sqlQueryUserExistsById);

            String sqlQueryUserExistsByEmail = "SELECT * FROM user WHERE email = ?";
            psSelectUserExistsByEmail =  con.prepareStatement(sqlQueryUserExistsByEmail);
            
            String sqlUpdateClient = "UPDATE user SET username = ?, email = ? ,firstname = ?, lastname = ?, gender = ?, address = ?, zipCode = ?, city = ?, state = ? WHERE id = ?";
            psUpdateClient = con.prepareStatement(sqlUpdateClient);
            
            String sqlDeleteClient= "DELETE FROM user WHERE id = ?";
            psDeleteClient = con.prepareStatement(sqlDeleteClient);
            
            String sqlSelectPackageById = "SELECT * FROM package WHERE id = ?";
            this.psSelectPackageById =  con.prepareStatement(sqlSelectPackageById );
            
            String sqlInsertPackage = "INSERT INTO package(name, price, description, image ) VALUES(?, ?, ?, ?);";
            psInsertPackage = con.prepareStatement(sqlInsertPackage);
            
            String sqlQuerySelectAllPackage = "SELECT * FROM package";
            this.psSelectAllPackage =  con.prepareStatement(sqlQuerySelectAllPackage);
            
            String sqlInsertPackageAddon = "INSERT INTO package_add_on(package_id, name, price) VALUES(?, ?, ?);";
            psInsertPackageAddon = con.prepareStatement(sqlInsertPackageAddon);
            
            String sqlSelectPackageAddonById = "SELECT * FROM package_add_on WHERE id = ?";
            this.psSelectPackageAddonById =  con.prepareStatement(sqlSelectPackageAddonById );
            
            String sqlQuerySelectAllPackageAddon = "SELECT * FROM package_add_on WHERE package_id = ?";
            this.psSelectAllPackageAddon =  con.prepareStatement(sqlQuerySelectAllPackageAddon);
            
            String sqlInsertTransaction = "INSERT INTO transaction(package_id, user_id, event_at, quantity) VALUES(?, ?, ?, ?);";
            psInsertTransaction = con.prepareStatement(sqlInsertTransaction, PreparedStatement.RETURN_GENERATED_KEYS);
            
            String sqlQuerySelectAllTransaction = "SELECT * FROM transaction ORDER BY id DESC";
            this.psSelectAllTransaction =  con.prepareStatement(sqlQuerySelectAllTransaction);
            
            String sqlQuerySelectAllTransactionUser = "SELECT * FROM transaction WHERE user_id = ? ORDER BY id DESC";
            this.psSelectAllTransactionUser =  con.prepareStatement(sqlQuerySelectAllTransactionUser);
            
            String sqlSelectTransactionById = "SELECT * FROM transaction WHERE id = ?";
            this.psSelectTransactionById =  con.prepareStatement(sqlSelectTransactionById );
            
            String sqlInsertTransactionAddon = "INSERT INTO transaction_addon(transaction_id, addon_id) VALUES(?, ?);";
            psInsertTransactionAddon = con.prepareStatement(sqlInsertTransactionAddon);
            
            String sqlQuerySelectTransactionAddon = "SELECT * FROM transaction_addon WHERE transaction_id = ?";
            this.psSelectTransactionAddon =  con.prepareStatement(sqlQuerySelectTransactionAddon);
            
            String sqlUpdateTransactionStatus = "UPDATE transaction SET status = ? WHERE id = ?";
            psUpdateTransactionStatus = con.prepareStatement(sqlUpdateTransactionStatus);
            
            String sqlDeletePackage= "UPDATE package SET display = 0 WHERE id = ?";
            psDeletePackage = con.prepareStatement(sqlDeletePackage);
            
            String sqlActivatePackage= "UPDATE package SET display = 1 WHERE id = ?";
            psActivatePackage = con.prepareStatement(sqlActivatePackage);
            
            String sqlUpdatePackage = "UPDATE package SET name = ?,price = ?, description = ?  WHERE id = ?";
            psUpdatePackage = con.prepareStatement(sqlUpdatePackage);
            
            String sqlUpdatePackageAddon = "UPDATE package_add_on SET name = ?,price = ?  WHERE id = ?";
            psUpdatePackageAddon = con.prepareStatement(sqlUpdatePackageAddon);
            
            String sqlUpdatePassword = "UPDATE user SET password = ? WHERE id = ?";
            psUpdatePassword = con.prepareStatement(sqlUpdatePassword);
            

       } catch (SQLException ex) {
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

   }



   // client
   public PreparedStatement psInsertClient()
   {
      return psInsertClient;
   }

   public PreparedStatement psSelectClient()
   {
      return psSelectClient;
   }

   public PreparedStatement psSelectAllClient()
   {
      return psSelectAllClient;
   }


   public PreparedStatement psSelectUserExists()
   {
      return this.psSelectUserExists;
   }
   
   public PreparedStatement psSelectUserExistsById()
   {
      return this.psSelectUserExistsById;
   }

   public PreparedStatement psSelectUserExistsByEmail()
   {
      return this.psSelectUserExistsByEmail;
   }
   
   public PreparedStatement psUpdateClient()
   {
      return this.psUpdateClient;
   }
   
   public PreparedStatement psDeleteClient()
   {
      return this.psDeleteClient;
   }
   
   public PreparedStatement psSelectPackageById()
   {
      return this.psSelectPackageById;
   }
   
   public PreparedStatement psInsertPackage()
   {
      return psInsertPackage;
   }
   
   public PreparedStatement psSelectAllPackage()
   {
      return this.psSelectAllPackage;
   }
   
   public PreparedStatement psInsertPackageAddon()
   {
      return this.psInsertPackageAddon;
   }
   
   public PreparedStatement psSelectPackageAddonById()
   {
      return this.psSelectPackageAddonById;
   }
   
   public PreparedStatement psSelectAllPackageAddon()
   {
      return this.psSelectAllPackageAddon;
   }
   
   public PreparedStatement psInsertTransaction()
   {
      return psInsertTransaction;
   }
   
   public PreparedStatement psSelectTransactionById()
   {
      return this.psSelectTransactionById;
   }
   
    public PreparedStatement psSelectAllTransaction()
   {
      return this.psSelectAllTransaction;
   }
    
    public PreparedStatement psSelectAllTransactionUser()
   {
      return this.psSelectAllTransactionUser;
   }
    
   public PreparedStatement psInsertTransactionAddon()
   {
      return psInsertTransactionAddon;
   }
   
   public PreparedStatement psSelectTransactionAddon()
   {
      return psSelectTransactionAddon;
   }
   
   public PreparedStatement psUpdateTransactionStatus()
   {
      return psUpdateTransactionStatus;
   }
   
   public PreparedStatement psDeletePackage()
   {
      return psDeletePackage;
   }
   
   public PreparedStatement psUpdatePackage()
   {
      return psUpdatePackage;
   }
   
   public PreparedStatement psUpdatePackageAddon()
   {
      return psUpdatePackageAddon;
   }
   
   public PreparedStatement psUpdatePassword()
   {
      return psUpdatePassword;
   }
   
   public PreparedStatement psActivatePackage()
   {
      return psActivatePackage;
   }
}
