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
   PreparedStatement psSelectUserExistsByEmail = null;
   PreparedStatement psUpdateClient = null;
   PreparedStatement psDeleteClient = null;
   PreparedStatement psSelectPackageById = null;
   PreparedStatement psInsertPackage = null;
   PreparedStatement psSelectAllPackage = null;
   PreparedStatement psInsertPackageAddon = null;
   PreparedStatement psSelectPackageAddonById = null;
   PreparedStatement psSelectAllPackageAddon = null;
   
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
//           //select all student
//            String sqlSelectAllStudent = "SELECT * FROM student";
//            psSelectAllStudent = con.prepareStatement(sqlSelectAllStudent);
//
//            //select student with matriks = ?
//            String sqlSelectStudentViaMatriks = "SELECT * FROM student where matriks = ?";
//            psSelectStudentViaMatriks = con.prepareStatement(sqlSelectStudentViaMatriks);
//
//            //insert student
//            String sqlInsertStudent = "INSERT INTO student(matriks, name, ic, age) VALUES(?, ?, ?, ?)";
//            psInsertStudent = con.prepareStatement(sqlInsertStudent);
//
//
            //update student name via matriks
            
//
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
}
