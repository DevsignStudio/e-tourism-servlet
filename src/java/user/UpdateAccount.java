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
import user.UserController;
import user.registerServlet;


/**
 *
 * @author Lili Madiha
 */
@WebServlet(name = "UpdateAccount", urlPatterns = {"/user/UpdateAccount", "/admin/UpdateAccount"})
public class UpdateAccount extends HttpServlet {

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

        
        
        
    }  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        jdbcUtility.jdbcConnect();
        try {
             jdbcUtility.prepareSQLStatement();
         } catch (SQLException ex) {
             Logger.getLogger(registerServlet.class.getName()).log(Level.SEVERE, null, ex);
         }
        con = jdbcUtility.jdbcGetConnection();
        
        HttpSession ss = request.getSession(true);
        User user= User.getUserFromUsername((String)ss.getAttribute("username"));
        Integer id = user.getID();
        System.out.println(user.getLastName());
        String username = request.getParameter("username");
        String referer = request.getHeader("Referer");
        
        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String zipCode = request.getParameter("zip");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        boolean scsGet = false;
   
        try {
            PreparedStatement preparedStatement = jdbcUtility.psUpdateClient();
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, firstName);
            preparedStatement.setString(4, lastName);
            preparedStatement.setString(5, ((Integer)user.getGender()).toString());
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, zipCode);
            preparedStatement.setString(8, city);
            preparedStatement.setString(9, state);
            preparedStatement.setString(10, ((Integer)id).toString());
            preparedStatement.executeUpdate();
            
            HttpSession session = request.getSession(true);
        
            session.setAttribute("scs", "Successfully Change");
            
            con.close();
            scsGet = true;
            response.sendRedirect(referer);
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
            response.sendRedirect(request.getContextPath() + "/admin/tableUser.jsp");
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
