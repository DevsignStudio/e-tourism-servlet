package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tableUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../nav/admin.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 custyle\" style=\"margin-top: 70px;\">\n");
      out.write("                <h1>Users List</h1>\n");
      out.write("                <table class=\"table table-striped custab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Email</th>\n");
      out.write("                            <th>Username</th>\n");
      out.write("                            <th>Name</th>\n");
      out.write("                            <th>Gender</th>\n");
      out.write("                            <th class=\"text-center\">Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>1</td>\n");
      out.write("                        <td>Lili93@gmail.com</td>\n");
      out.write("                        <td>News</td>\n");
      out.write("                        <td>News Cate</td>\n");
      out.write("                        <td>Male</td>\n");
      out.write("                        <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\" data-toggle=\"modal\" data-target=\"#myEditData\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a> <a href=\"viewUser.jsp\" class=\"btn btn-default btn-xs\"><span class=\"glyphicon glyphicon-info-sign\"></span> View </a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>2</td>\n");
      out.write("                        <td>Lili93@gmail.com</td>\n");
      out.write("                        <td>Products</td>\n");
      out.write("                        <td>Main Products</td>\n");
      out.write("                        <td>Female</td>\n");
      out.write("                        <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\" data-toggle=\"modal\" data-target=\"#myEditData\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a> <a href=\"#\" class=\"btn btn-default btn-xs\"><span class=\"glyphicon glyphicon-info-sign\"></span> View </a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td>Lili93@gmail.com</td>\n");
      out.write("                        <td>luxey93</td>\n");
      out.write("                        <td>Lili Madiha</td>\n");
      out.write("                        <td>Female</td>\n");
      out.write("                        <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a> <a href=\"#\" class=\"btn btn-default btn-xs\"><span class=\"glyphicon glyphicon-info-sign\"></span> View </a></td>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"myEditData\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"\" class=\"form-horizontal\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                            <h4 class=\"modal-title\">Edit User</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">First Name</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"First Name\" name=\"firstName\" type=\"text\">\n");
      out.write("                                </div>\n");
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
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Username</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Username\" name=\"username\" type=\"text\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Password</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Confirm Password</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Confirm Password\" name=\"re-Password\" type=\"password\" value=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"col-sm-3 control-label\">Street Address</label>\n");
      out.write("                                <div class=\"col-sm-9\">\n");
      out.write("                                    <input class=\"form-control\" name=\"address\" placeholder=\"Street Address\" type=\"text\" value=\"\" id=\"address\"><span class=\"help-inline\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-3 control-label\">Zip Code</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <input class=\"form-control\" name=\"zip\" type=\"text\" value=\"\"  placeholder=\"Zip Code\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-3 control-label\">City</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <input class=\"form-control\" name=\"city\" placeholder=\"City\" type=\"text\" value=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-3 control-label\">State</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <select name=\"state\" class=\"form-control\" >\n");
      out.write("                                            <option value=\"\">Set state</option>\n");
      out.write("                                            <option value=\"JB\">Johor</option>\n");
      out.write("                                            <option value=\"KL\">Kuala Lumpur</option>\n");
      out.write("                                            <option value=\"PNG\">Penang</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div><!-- /.modal-content -->\n");
      out.write("                    </div><!-- /.modal-dialog -->\n");
      out.write("                </div><!-- /.modal -->\n");
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
