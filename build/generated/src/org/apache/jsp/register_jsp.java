package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("<body class=\"login\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav/public.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row vertical-offset-200\">\r\n");
      out.write("            <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">Please Enter Register Form</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <form accept-charset=\"UTF-8\" role=\"form\" action=\"registerServlet\" method=\"post\">\r\n");
      out.write("                            <fieldset>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-xs-6 \">\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"First Name\" name=\"firstName\" type=\"text\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Last Name\" name=\"lasttName\" type=\"text\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Email\" name=\"email\" type=\"text\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Username\" name=\"username\" type=\"text\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Confirm Password\" name=\"re-Password\" type=\"password\" value=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-xs-6\" >\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <select name=\"gender\" class=\"form-control\" >\r\n");
      out.write("                                                <option value=\"\">SetGender</option>\r\n");
      out.write("                                                <option value=\"female\">Female</option>\r\n");
      out.write("                                                <option value=\"male\">Male</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <textarea class=\"form-control\" name=\"address\" placeholder=\"Street Address\" type=\"text\" value=\"\" id=\"address\"></textarea>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" name=\"zip\" type=\"text\" value=\"\"  placeholder=\"Zip Code\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <input class=\"form-control\" name=\"city\" placeholder=\"City\" type=\"text\" value=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"form-group\">\r\n");
      out.write("                                            <select name=\"state\" class=\"form-control\" >\r\n");
      out.write("                                                <option value=\"\">Set state</option>\r\n");
      out.write("                                                <option value=\"JB\">Johor</option>\r\n");
      out.write("                                                <option value=\"KL\">Kuala Lumpur</option>\r\n");
      out.write("                                                <option value=\"PNG\">Penang</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("\r\n");
      out.write("                                                <label><input type=\"checkbox\" name=\"terms\"> I agree with the <a href=\"termConditions.jsp\">Terms and Conditions</a>.</label>\r\n");
      out.write("                                                <input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Register\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </fieldset>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "script.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/TweenLite.min.js\"></script>\r\n");
      out.write("            <script charset=\"utf-8\">\r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("                $(document).mousemove(function(e){\r\n");
      out.write("                    TweenLite.to($('body'),\r\n");
      out.write("                    .5,\r\n");
      out.write("                    { css:\r\n");
      out.write("                        {\r\n");
      out.write("                            backgroundPosition: \"\"+ parseInt(event.pageX/8) + \"px \"+parseInt(event.pageY/'12')+\"px, \"+parseInt(event.pageX/'15')+\"px \"+parseInt(event.pageY/'15')+\"px, \"+parseInt(event.pageX/'30')+\"px \"+parseInt(event.pageY/'30')+\"px\"\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("            </script>\r\n");
      out.write("        </body>\r\n");
      out.write("        </html>\r\n");
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
