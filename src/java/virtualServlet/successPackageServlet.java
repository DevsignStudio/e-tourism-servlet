/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualServlet;

import bean.Transaction;
import java.io.IOException;
import java.text.ParseException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nizul Zaim
 */
@WebServlet(name = "successPackageServlet", urlPatterns = {"/user/successPackage.jsp"})
public class successPackageServlet extends HttpServlet {

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

        String[] addOns = request.getParameterValues("addOns");
        HttpSession ss = request.getSession(true);
        Transaction transaction = (Transaction)ss.getAttribute("sessionTransaction");
        transaction.setEventAt(request.getParameter("date"));
        transaction.setQuantity(Integer.parseInt(request.getParameter("quantity")));

        if (addOns != null) {
            for (int i = 0; i < addOns.length; i++) {
                transaction.addNewAddOn(Integer.parseInt(addOns[i]));
            }
        }

        boolean success = transaction.create();

        HttpSession session = request.getSession(true);


        if (success) {
            session.setAttribute("scs", "Successfully Book New Package");
        } else {
            session.setAttribute("err", "Error when trying to Book New Package");
        }
        response.sendRedirect(request.getContextPath() + "/user/transactionHistory.jsp");



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
