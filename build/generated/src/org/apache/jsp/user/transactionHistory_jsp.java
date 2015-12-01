package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class transactionHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../head.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../nav/user.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 custyle\" style=\"margin-top: 70px;\">\n");
      out.write("                <h1>Transaction History</h1>\n");
      out.write("                <table class=\"table table-striped custab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Transaction ID</th>\n");
      out.write("                            <th>Transaction Date</th>\n");
      out.write("                            <th>Transaction Time</th>\n");
      out.write("                            <th>Package</th>\n");
      out.write("                            <th>Total Price</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                            <th>Order Date</th>\n");
      out.write("                            <th class=\"text-center\">Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>456124</td>\n");
      out.write("                        <td>05/09/2015</td>\n");
      out.write("                        <td>10.10 AM</td>\n");
      out.write("                        <td>Langkawi Package</td>\n");
      out.write("                        <td>RM 990.00</td>\n");
      out.write("                        <td><span class=\"label label-warning\">Payment Overdue</span></td>\n");
      out.write("                        <td>11/12/2015</td>\n");
      out.write("                        <td class=\"text-center\"> <a href=\"#\" class=\"btn btn-danger btn-xs\" data-toggle=\"modal\" data-target=\"#myDelete\"><span class=\"glyphicon glyphicon-trash\"></span> Delete</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>126731</td>\n");
      out.write("                        <td>12/05/2014</td>\n");
      out.write("                        <td>9.30 AM</td>\n");
      out.write("                        <td>Sabah Package</td>\n");
      out.write("                        <td>RM 440.00</td>\n");
      out.write("                        <td><span class=\"label label-success\">Success</span></td>\n");
      out.write("                        <td>11/12/2014</td>\n");
      out.write("                        <td class=\"text-center\"> <a href=\"#\" class=\"btn btn-danger btn-xs\" data-toggle=\"modal\" data-target=\"#myDelete\"><span class=\"glyphicon glyphicon-trash\"></span> Delete</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>781203</td>\n");
      out.write("                        <td>12/02/2013</td>\n");
      out.write("                        <td>12.57 PM</td>\n");
      out.write("                        <td>Tioman Island Package</td>\n");
      out.write("                        <td>RM 220.00</td>\n");
      out.write("                        <td><span class=\"label label-primary\">In-Progress</span></td>\n");
      out.write("                        <td>11/09/2013</td>\n");
      out.write("                        <td class=\"text-center\"> <a href=\"#\" class=\"btn btn-danger btn-xs\" data-toggle=\"modal\" data-target=\"#myDelete\"><span class=\"glyphicon glyphicon-trash\"></span> Delete</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>237810</td>\n");
      out.write("                        <td>12/03/2012</td>\n");
      out.write("                        <td>3.10 PM</td>\n");
      out.write("                        <td>Penang Package</td>\n");
      out.write("                        <td>RM 550.00</td>\n");
      out.write("                        <td><span class=\"label label-danger\">Cancel</span></td>\n");
      out.write("                        <td>11/12/2012</td>\n");
      out.write("                        <td class=\"text-center\"> <a href=\"#\" class=\"btn btn-danger btn-xs\" data-toggle=\"modal\" data-target=\"#myDelete\"><span class=\"glyphicon glyphicon-trash\"></span> Delete</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myDelete\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <form action=\"\" class=\"form-horizontal\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                        <h3 class=\"modal-title\">Delete Transaction History</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <h5>Are you sure you want to delete? </h5>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../script.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
