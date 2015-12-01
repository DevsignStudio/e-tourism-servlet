package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("    \r\n");
      out.write("<body class=\"login\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav/public.jsp", out, false);
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row vertical-offset-200\">\r\n");
      out.write("            <div class=\"col-md-4 col-md-offset-4\">\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <p class=\"panel-title\">Please Sign in</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        <form role=\"form\" action=\"loginServlet\" method=\"post\">\r\n");
      out.write("                            <fieldset>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Username\" name=\"username\" type=\"text\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <input class=\"form-control\" placeholder=\"Password\" name=\"password\" type=\"password\" value=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"checkbox\">\r\n");
      out.write("                                    <label>\r\n");
      out.write("                                        <input name=\"remember\" type=\"checkbox\" value=\"Remember Me\"> Remember Me\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <input class=\"btn btn-lg btn-success btn-block\" type=\"submit\" value=\"Login\">\r\n");
      out.write("                                <p style=\"margin-top: 20px; text-align: right\">Not Register? <a href=\"register.jsp\">Register here</a></p>\r\n");
      out.write("                            </fieldset>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "script.jsp", out, false);
      out.write("\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/TweenLite.min.js\"></script>\r\n");
      out.write("    <script charset=\"utf-8\">\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        $(document).mousemove(function(e){\r\n");
      out.write("            TweenLite.to($('body'),\r\n");
      out.write("            .5,\r\n");
      out.write("            { css:\r\n");
      out.write("                {\r\n");
      out.write("                    backgroundPosition: \"\"+ parseInt(event.pageX/8) + \"px \"+parseInt(event.pageY/'12')+\"px, \"+parseInt(event.pageX/'15')+\"px \"+parseInt(event.pageY/'15')+\"px, \"+parseInt(event.pageX/'30')+\"px \"+parseInt(event.pageY/'30')+\"px\"\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
