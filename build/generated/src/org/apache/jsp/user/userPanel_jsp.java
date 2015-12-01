package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"container\" style=\"margin-top: 60px;\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading text-center\">\n");
      out.write("                        <h2>Step 1: Fill In Your Details</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">First Name</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"First Name\" name=\"firstName\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Last Name</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Last Name\" name=\"lastName\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Email</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Email\" name=\"email\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Street Address</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" name=\"address\" placeholder=\"Street Address\" type=\"text\" value=\"\" id=\"address\">\n");
      out.write("                                    <span class=\"help-inline\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Zip Code</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" name=\"zip\" type=\"text\" value=\"\" placeholder=\"Zip Code\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">City</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" name=\"city\" placeholder=\"City\" type=\"text\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">State</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <select name=\"state\" class=\"form-control\">\n");
      out.write("                                        <option value=\"\">Set state</option>\n");
      out.write("                                        <option value=\"JB\">Johor</option>\n");
      out.write("                                        <option value=\"KL\">Kuala Lumpur</option>\n");
      out.write("                                        <option value=\"PNG\">Penang</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading text-center\">\n");
      out.write("                        <h2>Step 2: Choose Your Package</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-12 custyle\" style=\"margin-top: 10px;\">\n");
      out.write("                <h1>Transaction History</h1>\n");
      out.write("                <table class=\"table table-striped custab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Package</th>\n");
      out.write("                            <th>Total Price</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                            <th>Order Date</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>1</td>\n");
      out.write("                        <td>Langkawi Package</td>\n");
      out.write("                        <td>RM 60.00</td>\n");
      out.write("                        <td>\n");
      out.write("                            <span class=\"label label-warning\">Paid</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td>11/12/2015</td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>2</td>\n");
      out.write("                        <td>Sabah Package</td>\n");
      out.write("                        <td>RM 300.00</td>\n");
      out.write("                        <td>\n");
      out.write("                            <span class=\"label label-warning\">Paid</span>\n");
      out.write("                        </td>\n");
      out.write("                        <td>11/12/2015</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
