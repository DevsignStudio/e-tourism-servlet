/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import bean.User;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JDBCUtility;
import static user.registerServlet.isNullorEqual;

/**
 *
 * @author Lili Madiha
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    
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
        
        User user = null;
        
        //Get the session object
        HttpSession session = request.getSession(true);
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int userType = 2;
        int scs = 0;
        ResultSet rs = null;
        String dbPassword = "";
        String dbUsername = "";
        Boolean result = isNullorEqual(new String[] {username, password});
  //      Boolean userExists = false;

        
        if ( result ) {
            session = request.getSession(true);
        
            session.setAttribute("scs", "Please Enter All fields");
            response.sendRedirect("login.jsp");
                
            return;
        }
        
        
        try {
                PreparedStatement preparedStatement = jdbcUtility.psSelectUserExists();
                preparedStatement.setString(1, username);
                rs = preparedStatement.executeQuery();
                    if ( rs.next() == false) {
                        session = request.getSession(true);
        
                        session.setAttribute("scs", "User does not exists");
                        response.sendRedirect("login.jsp");
                        return;
                    }
                
                while (rs.next()) 
                {                
                    dbPassword = rs.getString("password");
                    userType = Integer.parseInt(rs.getString("userType"));
                    dbUsername = rs.getString("username");
 //                   userExists = true;
                    
                    System.out.println(dbUsername);
                    
                    if ( !password.equals(dbPassword)) {
                        session = request.getSession(true);
        
                        session.setAttribute("scs", "Username or Password Problem");
                        response.sendRedirect("login.jsp");
                        return;
                    } 
                    
                    
                    
                   
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
                
                session = request.getSession(true);
        
                session.setAttribute("scs", "Error when try to login");
                response.sendRedirect("login.jsp");
                return;
            }
            catch (java.lang.Exception ex)
            {
                ex.printStackTrace ();
            }
//           finally {
//                if (userExists) {
//                    HttpSession session = request.getSession(true);
//
//                    session.setAttribute("scs", "Username Already Exists");
//                    response.sendRedirect("register.jsp");
//                }
//
//            }
        
        session.setAttribute("username", username);
        session.setAttribute("userType", userType);
        
        if ( userType == 1 ) {
            response.sendRedirect(request.getContextPath() + "/admin/"); 
        } else {
            response.sendRedirect(request.getContextPath() + "/user/"); 
        }
        
        
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
