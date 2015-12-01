package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tableOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav/admin.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 custyle\" style=\"margin-top: 70px;\">\n");
      out.write("                <h1>Order List</h1>\n");
      out.write("                <table class=\"table table-striped custab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>ID</th>\n");
      out.write("                            <th>Username</th>\n");
      out.write("                            <th>Package</th>\n");
      out.write("                            <th>Total Price</th>\n");
      out.write("                            <th>Status</th>\n");
      out.write("                            <th>Order Date</th>\n");
      out.write("                            <th class=\"text-center\">Action</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>1</td>\n");
      out.write("                        <td><a href=\"\" data-toggle=\"modal\" data-target=\"#myModal1\">Lili93</a></td>\n");
      out.write("                        <td>Langkawi Package</td>\n");
      out.write("                        <td>RM 990.00</td>\n");
      out.write("                        <td><span class=\"label label-warning\">Payment Overdue</span></td>\n");
      out.write("                        <td>11/12/2015</td>\n");
      out.write("                        <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"  data-toggle=\"modal\" data-target=\"#myEdit\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>2</td>\n");
      out.write("                        <td><a href=\"\" data-toggle=\"modal\" data-target=\"#myModal2\">Nizul</a></td>\n");
      out.write("                        <td>Sabah Package</td>\n");
      out.write("                        <td>RM 440.00</td>\n");
      out.write("                        <td><span class=\"label label-success\">Success</span></td>\n");
      out.write("                        <td>11/12/2015</td>\n");
      out.write("                        <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>3</td>\n");
      out.write("                        <td><a href=\"\" data-toggle=\"modal\" data-target=\"#myModal3\">zill</a></td>\n");
      out.write("                        <td>Tioman Island Package</td>\n");
      out.write("                        <td>RM 220.00</td>\n");
      out.write("                        <td><span class=\"label label-primary\">In-Progress</span></td>\n");
      out.write("                        <td>11/12/2015</td>\n");
      out.write("                        <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td><a href=\"\" data-toggle=\"modal\" data-target=\"#myModal4\">Mark67</a></td>\n");
      out.write("                        <td>Penang Package</td>\n");
      out.write("                        <td>RM 550.00</td>\n");
      out.write("                        <td><span class=\"label label-danger\">Cancel</span></td>\n");
      out.write("                        <td>11/12/2015</td>\n");
      out.write("                        <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"><span class=\"glyphicon glyphicon-edit\"></span> Edit</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModal1\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                    <h4 class=\"modal-title\">User Example : Lili93</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"\" class=\"form-horizontal\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <p class=\"form-control-static\">email@example.com</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-2 control-label\">Username</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <p class=\"form-control-static\">luxey93</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <p class=\"form-control-static\">Nijol Jaim Anu'ar</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-2 control-label\">Gender</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <p class=\"form-control-static\">Female</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    <a href=\"\" type=\"button\" class=\"btn btn-primary\">View Complete Details</a>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -->\n");
      out.write("    </div><!-- /.modal -->\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModal2\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                    <h4 class=\"modal-title\">Modal title 2</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <p>One fine body&hellip;</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -->\n");
      out.write("    </div><!-- /.modal -->\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModal3\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                    <h4 class=\"modal-title\">Modal title 3</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <p>One fine body&hellip;</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -->\n");
      out.write("    </div><!-- /.modal -->\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModal4\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                    <h4 class=\"modal-title\">Modal title 4</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <p>One fine body&hellip;</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -->\n");
      out.write("    </div><!-- /.modal -->\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myEdit\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <form action=\"\" class=\"form-horizontal\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                        <h4 class=\"modal-title\">Modal title 4</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-2 control-label\">Status</label>\n");
      out.write("                            <div class=\"col-sm-10\">\n");
      out.write("                                <select name=\"status\" class=\"form-control\" >\n");
      out.write("                                    <option value=\"\">In-Progress</option>\n");
      out.write("                                    <option value=\"\">Cancel</option>\n");
      out.write("                                    <option value=\"\">Success</option>\n");
      out.write("                                    <option value=\"\">Pyment Overdue</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div><!-- /.modal-content -->\n");
      out.write("        </div><!-- /.modal-dialog -->\n");
      out.write("    </div><!-- /.modal -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "script.jsp", out, false);
      out.write("\n");
      out.write("    \n");
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
