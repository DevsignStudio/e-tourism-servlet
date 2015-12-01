package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class package_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"container\" style=\"margin-top: 80px;\">\n");
      out.write("        <div class=\"row\" id=\"thumbnail-box\">\n");
      out.write("            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                <div class=\"thumbnail\" >\n");
      out.write("                    <img src=\"img/langkawe.jpg\" class=\"img-responsive\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 col-xs-6\">\n");
      out.write("                                <h3>Langkawi Package</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-xs-6 price\">\n");
      out.write("                                <h3>\n");
      out.write("                                    <label>RM300</label>\n");
      out.write("                                </h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <p>Langkawi, officially known as Langkawi the Jewel of Kedah is an archipelago of 104 islands in the Andaman Sea, some 30 km off the mainland coast of northwestern Malaysia.</p>\n");
      out.write("                        <ul style=\"list-style-type: square;\">\n");
      out.write("                            <label>Highlight:</label>\n");
      out.write("                            <li>2 Nights Accomodation</li>\n");
      out.write("                            <li>Daily Buffet Breakfast</li>\n");
      out.write("                            <li>1 Buffet Dinner</li>\n");
      out.write("                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <a href=\"buy-package.html\" class=\"btn btn-success btn-product\" ><span class=\"glyphicon glyphicon-shopping-cart\"></span> Buy </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                <div class=\"thumbnail\" >\n");
      out.write("                    <img src=\"img/sabah.jpg\" class=\"img-responsive\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 col-xs-6\">\n");
      out.write("                                <h3>Sabah Package</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-xs-6 price\">\n");
      out.write("                                <h3>\n");
      out.write("                                    <label>RM300</label>\n");
      out.write("                                </h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <p>Sabah is a Malaysian state occupying the northern part of Borneo. It's famed for its 4,095m-tall Mt. Kinabalu, the highest peak on the island, crowned with distinctive granite spires. Sabah is also known for its beaches, rainforest, coral reefs and abundant endemic wildlife, much of it within parks and reserves. Offshore, the Sipadan and Mabul islands are noted diving destinations.</p>\n");
      out.write("                        <ul style=\"list-style-type: square;\">\n");
      out.write("                            <label>Highlight:</label>\n");
      out.write("                            <li>2 Nights Accomodation</li>\n");
      out.write("                            <li>Daily Buffet Breakfast</li>\n");
      out.write("                            <li>1 Buffet Dinner</li>\n");
      out.write("                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <a href=\"buy-package.html\" class=\"btn btn-success btn-product\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Buy </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                <div class=\"thumbnail\" >\n");
      out.write("                    <img src=\"img/sabah.jpg\" class=\"img-responsive\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 col-xs-6\">\n");
      out.write("                                <h3>Tioman Island Package</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-xs-6 price\">\n");
      out.write("                                <h3>\n");
      out.write("                                    <label>RM300</label>\n");
      out.write("                                </h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <p>Sabah is a Malaysian state occupying the northern part of Borneo. It's famed for its 4,095m-tall Mt. Kinabalu, the highest peak on the island, crowned with distinctive granite spires. Sabah is also known for its beaches, rainforest, coral reefs and abundant endemic wildlife, much of it within parks and reserves. Offshore, the Sipadan and Mabul islands are noted diving destinations.</p>\n");
      out.write("                        <ul style=\"list-style-type: square;\">\n");
      out.write("                            <label>Highlight:</label>\n");
      out.write("                            <li>2 Nights Accomodation</li>\n");
      out.write("                            <li>Daily Buffet Breakfast</li>\n");
      out.write("                            <li>1 Buffet Dinner</li>\n");
      out.write("                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <a href=\"buy-package.html\" class=\"btn btn-success btn-product\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Buy </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                <div class=\"thumbnail\" >\n");
      out.write("                    <img src=\"img/penang.jpg\" class=\"img-responsive\">\n");
      out.write("                    <div class=\"caption\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 col-xs-6\">\n");
      out.write("                                <h3>Penang Package</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6 col-xs-6 price\">\n");
      out.write("                                <h3>\n");
      out.write("                                    <label>RM300</label>\n");
      out.write("                                </h3>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <p>Langkawi, officially known as Langkawi the Jewel of Kedah is an archipelago of 104 islands in the Andaman Sea, some 30 km off the mainland coast of northwestern Malaysia</p>\n");
      out.write("                        <ul style=\"list-style-type: square;\">\n");
      out.write("                            <label>Highlight:</label>\n");
      out.write("                            <li>2 Nights Accomodation</li>\n");
      out.write("                            <li>Daily Buffet Breakfast</li>\n");
      out.write("                            <li>1 Buffet Dinner</li>\n");
      out.write("                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <a href=\"buy-package.html\" class=\"btn btn-success btn-product\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> Buy </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../script.jsp", out, false);
      out.write("\n");
      out.write("    <script src=\"js/masonry.pkgd.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("$(document).ready( function() {\n");
      out.write("\n");
      out.write("  $(\"#thumbnail-box\").masonry({\n");
      out.write("    itemSelector: '.col-sm-6',\n");
      out.write("    \n");
      out.write("  });\n");
      out.write("\n");
      out.write("});\n");
      out.write("</script>\n");
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
