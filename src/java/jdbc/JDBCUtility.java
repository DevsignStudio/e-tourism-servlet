/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
 
import java.util.*;
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
   PreparedStatement psSelectUserExists = null;
   PreparedStatement psSelectUserExistsByEmail = null;

 
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
//            //update student name via matriks
//            String sqlUpdateStudentNameViaMatriks = "UPDATE student SET name = ?, ic = ?, age = ? WHERE matriks = ?"; 
//            psUpdateStudentNameViaMatriks = con.prepareStatement(sqlUpdateStudentNameViaMatriks);
// 
//            //delete student via matriks
//            String sqlDeleteStudentViaMatriks = "DELETE FROM student WHERE matriks = ?"; 
//            psDeleteStudentViaMatriks = con.prepareStatement(sqlDeleteStudentViaMatriks);
            
            
            //insert user
            String sqlInsertClient = "INSERT INTO user(username, password, userType, email, firstName, lastName, gender, address, zipCode, city, state ) VALUES(?, ?, 2, ?, ?, ?, ?, ?, ?, ?, ?);";
            psInsertClient = con.prepareStatement(sqlInsertClient);
            
            //select user
           
            
            String sqlQueryUserExists = "SELECT * FROM user WHERE username = ?";
            psSelectUserExists =  con.prepareStatement(sqlQueryUserExists);
            
            String sqlQueryUserExistsByEmail = "SELECT * FROM user WHERE email = ?";
            psSelectUserExistsByEmail =  con.prepareStatement(sqlQueryUserExistsByEmail);
            
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
 
   public PreparedStatement psSelectAllStudent()
   {
      return psSelectAllStudent;
   } 
 
   public PreparedStatement psSelectStudentViaMatriks()
   {
      return psSelectStudentViaMatriks;
   } 
 
   public PreparedStatement psInsertStudent()
   {
      return psInsertStudent;
   } 
 
   public PreparedStatement psUpdateStudentNameViaMatriks()
   {
      return psUpdateStudentNameViaMatriks;
   }
 
   public PreparedStatement psDeleteStudentViaMatriks()
   {
      return psDeleteStudentViaMatriks;
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
   
   
   public PreparedStatement psSelectUserExists()
   {
      return this.psSelectUserExists;
   } 
   
   public PreparedStatement psSelectUserExistsByEmail()
   {
      return this.psSelectUserExistsByEmail;
   } 
}