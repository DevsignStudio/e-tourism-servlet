/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualServlet;

import bean.Package;
import bean.PackageAddon;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "updatePackageServlet", urlPatterns = {"/admin/updatePackage.jsp"})
public class updatePackageServlet extends HttpServlet {

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
        Integer id = Integer.parseInt(request.getParameter("packageId"));
        String name = request.getParameter("packageName");
        Double price = Double.parseDouble(request.getParameter("packagePrice"));
        String description = request.getParameter("packageDescription");
        String[] addNames = request.getParameterValues("addonName");
        String[] addPrices = request.getParameterValues("addonPrice");
        
        Package pkg = Package.getPackageById(id);
        ArrayList<PackageAddon> pkga = pkg.getAllAddon();
        
        for(int i = 0; i < pkga.size(); i++) {
            pkga.get(i).setName(addNames[i]);
            pkga.get(i).setPrice(Double.parseDouble(addPrices[i]));
            
            pkga.get(i).updatePackageAddon();
            
            System.out.println("HARAM : " + pkga.get(i).getName());
        }
        
        boolean result = Package.updatePackage(id, name, price, description);
            
        HttpSession session = request.getSession(true);
        
        if (result) {
            
            session.setAttribute("scs", "Successfully update package");
        } else {
            session.setAttribute("err", "Error when trying to update package");
        }
            
            
        String referer = request.getHeader("Referer");
        response.sendRedirect(referer);
        
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
