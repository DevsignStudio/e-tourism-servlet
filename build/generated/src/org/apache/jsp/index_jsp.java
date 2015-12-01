package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "nav/public.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("        <!-- Indicators -->\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\" class=\"active\"></li>\n");
      out.write("        </ol>\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img class=\"first-slide\" src=\"img/langkawi.jpg\" alt=\"First slide\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h1>E-Tourism Malaysia</h1>\n");
      out.write("                        <p>This website will display information on the tourism packages around Malaysia. Please sign up to be a member and get the latest updates.\n");
      out.write("                        </p>\n");
      out.write("                        <p><a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Sign up today</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <img class=\"second-slide\" src=\"img/hut.jpg\" alt=\"Second slide\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h1>About E-Tourism Malaysia</h1>\n");
      out.write("                        <p>Malaysia is one of the largest tourism spot in Asia. Book your package to a trip down this beautiful county here. We have fascinating packages for you.</p>\n");
      out.write("                        <p><a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Learn more</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item active\">\n");
      out.write("                <img class=\"third-slide\" src=\"img/malaysia.png\" alt=\"Third slide\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h1>Gallery</h1>\n");
      out.write("                        <p>Can't make your mind yet. Browse through our gallery for more interesting travel ideas.</p>\n");
      out.write("                        <p><a class=\"btn btn-lg btn-primary\" href=\"#\" role=\"button\">Browse gallery</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("            <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.carousel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Marketing messaging and featurettes\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Wrap the rest of the page in another container to center all the content. -->\n");
      out.write("\n");
      out.write("    <div class=\"container marketing\">\n");
      out.write("\n");
      out.write("        <!-- Three columns of text below the carousel -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-circle img-responsive\" src=\"img/langkawi-2.jpg\" alt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("                <h2>Langkawi Package</h2>\n");
      out.write("                <p>Langkawi, officially known as Langkawi the Jewel of Kedah is an archipelago of 104 islands in the Andaman Sea, some 30 km off the mainland coast of northwestern Malaysia.</p>\n");
      out.write("                <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details »</a></p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-circle img-responsive\" src=\"img/sabah.jpg\" alt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("                <h2>Sabah Package</h2>\n");
      out.write("                <p>Sabah is a Malaysian state occupying the northern part of Borneo. It's famed for its 4,095m-tall Mt. Kinabalu, the highest peak on the island, crowned with distinctive granite spires. Sabah is also known for its beaches, rainforest, coral\n");
      out.write("                    reefs and abundant endemic wildlife, much of it within parks and reserves. Offshore, the Sipadan and Mabul islands are noted diving destinations.</p>\n");
      out.write("                <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details »</a></p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-circle img-responsive\" src=\"img/penang.jpg\" alt=\"Generic placeholder image\" width=\"140\" height=\"140\">\n");
      out.write("                <h2>Penang Package</h2>\n");
      out.write("                <p>Penang is a state in Malaysia located on the northwest coast of Peninsular Malaysia, by the Strait of Malacca. Penang state is bordered by Kedah in the north and east, and Perak in the south.</p>\n");
      out.write("                <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details »</a></p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-lg-4 -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- START THE FEATURETTES -->\n");
      out.write("\n");
      out.write("        <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("        <div class=\"row featurette\">\n");
      out.write("            <div class=\"col-md-7\">\n");
      out.write("                <h2 class=\"featurette-heading\">Packages in E-Tourism Malaysia\n");
      out.write("                    <span class=\"text-muted\">\n");
      out.write("                        <br>It'll blow your mind.</br>\n");
      out.write("                    </span>\n");
      out.write("                </h2>\n");
      out.write("                <p class=\"lead\">Find the most affordable tour packages for you at our website. We are fully certified by the Ministry of Tourism Malaysia.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <img class=\"featurette-image img-responsive center-block img-circle\" alt=\"500x500\" src=\"img/Malaysia-2.jpg\" data-holder-rendered=\"true\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("        <div class=\"row featurette\">\n");
      out.write("            <div class=\"col-md-7 col-md-push-5\">\n");
      out.write("                <h2 class=\"featurette-heading\">Oh yeah, it's that good.\n");
      out.write("                    <span class=\"text-muted\">\n");
      out.write("                        <br>See for yourself.</span>\n");
      out.write("                </h2>\n");
      out.write("                <p class=\"lead\">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5 col-md-pull-7\">\n");
      out.write("                <img class=\"featurette-image img-responsive center-block img-circle\" alt=\"500x500\" src=\"img/sbux.jpg\" data-holder-rendered=\"true\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("        <div class=\"row featurette\">\n");
      out.write("            <div class=\"col-md-7\">\n");
      out.write("                <h2 class=\"featurette-heading\">#beautifulMalaysia\n");
      out.write("                    <span class=\"text-muted\">\n");
      out.write("                        <br>Photo contest</span>\n");
      out.write("                </h2>\n");
      out.write("                <p class=\"lead\">Click pictures of your trip and hashtag with #beautifulMalaysia to win weekly prizes.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                <img class=\"featurette-image img-responsive center-block img-circle\" alt=\"500x500\" src=\"img/beautifulmalaysia.jpg\" data-holder-rendered=\"true\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr class=\"featurette-divider\">\n");
      out.write("\n");
      out.write("        <!-- /END THE FEATURETTES -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- FOOTER -->\n");
      out.write("        <footer>\n");
      out.write("            <p class=\"pull-right\"><a href=\"#\">Back to top</a></p>\n");
      out.write("            <p>© 2015 Company, Inc. · <a href=\"#\">Privacy</a> · <a href=\"#\">Terms</a></p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "script.jsp", out, false);
      out.write("\n");
      out.write("    <script>\n");
      out.write("        window.jQuery || document.write('<script src=\"js/jquery.min.js\"><\\/script>')\n");
      out.write("    </script>\n");
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
