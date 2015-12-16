/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualServlet;

import bean.User;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import user.registerServlet;

/**
 *
 * @author Nizul Zaim
 */
@WebServlet(name = "changePasswordServlet", urlPatterns = {"/user/changePassword.jsp", "/admin/changePassword.jsp"})
public class changePasswordServlet extends HttpServlet {
    
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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession ss = request.getSession(true);        
                
        String username = (String)ss.getAttribute("username");  
        User loginUser = User.getUserFromUsername(username);
        String id = ((Integer)loginUser.getID()).toString();
        String password = request.getParameter("password");
        String rePassword = request.getParameter("re-Password");
        String currentPassword = request.getParameter("current-Password");
        String referer = request.getHeader("Referer");
        
        boolean scsGet = false;
        
        if (!password.equals(rePassword)) {
            HttpSession session = request.getSession(true);
        
            session.setAttribute("err", "Please Re-enter correct password");
            response.sendRedirect(referer);
            return;
        }
        
        try {                    
            PreparedStatement preparedStatement = jdbcUtility.psUpdatePassword();
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, id);
            preparedStatement.executeUpdate();
            
            HttpSession session = request.getSession(true);
        
            session.setAttribute("scs", "Successfully Change");
            response.sendRedirect(referer);
            scsGet = true;
            
            con.close();
            return;
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
        
        if (!scsGet) {
            HttpSession session = request.getSession(true);
        
            session.setAttribute("err", "Something wrong when trying to update client data");
            response.sendRedirect(referer);
            return;
        }
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
