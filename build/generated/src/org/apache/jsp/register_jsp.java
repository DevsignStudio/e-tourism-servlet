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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\n");
      out.write("<body class=\"login\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav/public.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row vertical-offset-200\">\n");
      out.write("            <div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">Please Enter Register Form</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form accept-charset=\"UTF-8\" role=\"form\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-6 \">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"First Name\" name=\"firstName\" type=\"text\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Last Name\" name=\"lasttName\" type=\"text\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Email\" name=\"email\" type=\"text\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Username\" name=\"username\" type=\"text\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" placeholder=\"Confirm Password\" name=\"re-Password\" type=\"password\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-xs-6\" >\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select name=\"gender\" class=\"form-control\" >\n");
      out.write("                                                <option value=\"\">SetGender</option>\n");
      out.write("                                                <option value=\"female\">Female</option>\n");
      out.write("                                                <option value=\"male\">Male</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <textarea class=\"form-control\" name=\"address\" placeholder=\"Street Address\" type=\"text\" value=\"\" id=\"address\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" name=\"zip\" type=\"text\" value=\"\"  placeholder=\"Zip Code\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input class=\"form-control\" name=\"city\" placeholder=\"City\" type=\"text\" value=\"\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select name=\"state\" class=\"form-control\" >\n");
      out.write("                                                <option value=\"\">Set state</option>\n");
      out.write("                                                <option value=\"JB\">Johor</option>\n");
      out.write("                                                <option value=\"KL\">Kuala Lumpur</option>\n");
      out.write("                                                <option value=\"PNG\">Penang</option>\n");
      out.write("                                            </select>\n");
      out.write("\n");
      out.write("                                                <label><input type=\"checkbox\" name=\"terms\"> I agree with the <a href=\"termConditions.jsp\">Terms and Conditions</a>.</label>\n");
      out.write("                                                <input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Register\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "script.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/TweenLite.min.js\"></script>\n");
      out.write("            <script charset=\"utf-8\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $(document).mousemove(function(e){\n");
      out.write("                    TweenLite.to($('body'),\n");
      out.write("                    .5,\n");
      out.write("                    { css:\n");
      out.write("                        {\n");
      out.write("                            backgroundPosition: \"\"+ parseInt(event.pageX/8) + \"px \"+parseInt(event.pageY/'12')+\"px, \"+parseInt(event.pageX/'15')+\"px \"+parseInt(event.pageY/'15')+\"px, \"+parseInt(event.pageX/'30')+\"px \"+parseInt(event.pageY/'30')+\"px\"\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            </script>\n");
      out.write("        </body>\n");
      out.write("        </html>\n");
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
