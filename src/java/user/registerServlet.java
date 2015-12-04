package user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JDBCUtility;
/**
 *
 * @author Lili Madiha
 */
@WebServlet(urlPatterns = {"/registerServlet"})
public class registerServlet extends HttpServlet {
    
    
   private JDBCUtility jdbcUtility;
    private Connection con;
    
    public void init() throws ServletException
    {
        String driver = "com.mysql.jdbc.Driver";

        String dbName = "etourism";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";

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
        
    }          

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repassword = request.getParameter("re-Password");

        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String zipCode = request.getParameter("zip");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        
        
        int userType = 2;
//        String email = request.getParameter("email");
        int scs = 0;
        
        ResultSet rs = null;
        Boolean userExists = false;
        Boolean errGet = false;
        
        Boolean result = isNullorEqual(new String[] {username, password, email, firstName, lastName, zipCode, address, city});
        
        if ( result ) {
            HttpSession session = request.getSession(true);
        
            session.setAttribute("scs", "Please Enter All fields");
            response.sendRedirect("register.jsp");
                
            errGet = true;
        }
        
        if (!errGet) {
            try {
                PreparedStatement preparedStatement = jdbcUtility.psSelectUserExists();
                preparedStatement.setString(1, username);
                rs = preparedStatement.executeQuery();

                while (rs.next()) 
                {                
                    userExists = true;
                    errGet = true;
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
            finally {
                if (userExists) {
                    HttpSession session = request.getSession(true);

                    session.setAttribute("scs", "Username Already Exists");
                    response.sendRedirect("register.jsp");
                }

            }
        }
        
        try {
            rs = null;
            PreparedStatement preparedStatement = jdbcUtility.psSelectUserExistsByEmail();
            preparedStatement.setString(1, email);
            rs = preparedStatement.executeQuery();
                    
            while (rs.next()) 
            {                
                userExists = true;
                errGet = true;
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
        finally {
            if (userExists) {
                HttpSession session = request.getSession(true);
        
                session.setAttribute("scs", "Email Already Exists");
                response.sendRedirect("register.jsp");
            }
            
        }
        
        
        
        if (!errGet) {
            if (!password.equals(repassword)) {
                HttpSession session = request.getSession(true);
        
                session.setAttribute("scs", "Password does not macth");
                response.sendRedirect("register.jsp");
                
                errGet = true;
            }
  
            
        }
        
         if (!errGet) {
            if (!isNumeric(zipCode)) {
                HttpSession session = request.getSession(true);
        
                session.setAttribute("scs", "Zip Code must be Numeral");
                response.sendRedirect("register.jsp");
                
                errGet = true;
            }
  
            
        }
              
        
        if (!errGet) {
            try {
                PreparedStatement preparedStatement = jdbcUtility.psInsertClient();
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, email);
                preparedStatement.setString(4, firstName);
                preparedStatement.setString(5, lastName);
                preparedStatement.setString(6, gender);
                preparedStatement.setString(7, address);
                preparedStatement.setString(8, zipCode);
                preparedStatement.setString(9, city);
                preparedStatement.setString(10, state);


                scs = preparedStatement.executeUpdate();

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

            response.sendRedirect("?scs="+ scs);
        }
    }
    
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        }
        
        catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public static boolean isNullorEqual(String... strArr) {
        for ( String st : strArr ) {
            if (st==null || st.equals("")) {
                return true;
            }
             
        }
        return false;
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
