

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="bean.User" %>

<%@page import="javax.servlet.http.HttpSession" %>

<%
  HttpSession ss = request.getSession(true);        
                
  String scs = (String)ss.getAttribute("scs");  
  String username = (String)ss.getAttribute("username"); 
  
  User loginUser = User.getUserFromUsername(username);
  
  if (username == null) {
    if ( loginUser.getUserType() == 1 ) {
        response.sendRedirect(request.getContextPath() + "/admin"); 
    } else if ( loginUser.getUserType() == 2 ) {
        response.sendRedirect(request.getContextPath() + "/user"); 
    }
  }
  
%>


<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="head.jsp" />
    <link href="css/carousel.css" rel="stylesheet">
</head>
    
<body>
    <jsp:include page="nav/public.jsp" />
    
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class=""></li>
            <li data-target="#myCarousel" data-slide-to="1" class=""></li>
            <li data-target="#myCarousel" data-slide-to="2" class="active"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
            <div class="item">
                <img class="first-slide" src="img/langkawi.jpg" alt="First slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>E-Tourism Malaysia</h1>
                        <p>This website will display information on the tourism packages around Malaysia. Please sign up to be a member and get the latest updates.
                        </p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
                    </div>
                </div>
            </div>
            <div class="item">
                <img class="second-slide" src="img/hut.jpg" alt="Second slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>About E-Tourism Malaysia</h1>
                        <p>Malaysia is one of the largest tourism spot in Asia. Book your package to a trip down this beautiful county here. We have fascinating packages for you.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
                    </div>
                </div>
            </div>
            <div class="item active">
                <img class="third-slide" src="img/malaysia.png" alt="Third slide">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>Gallery</h1>
                        <p>Can't make your mind yet. Browse through our gallery for more interesting travel ideas.</p>
                        <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
                    </div>
                </div>
            </div>
        </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <!-- /.carousel -->


    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

        <!-- Three columns of text below the carousel -->
        <div class="row">
            <div class="col-lg-4">
                <img class="img-circle img-responsive" src="img/langkawi-2.jpg" alt="Generic placeholder image" width="140" height="140">
                <h2>Langkawi Package</h2>
                <p>Langkawi, officially known as Langkawi the Jewel of Kedah is an archipelago of 104 islands in the Andaman Sea, some 30 km off the mainland coast of northwestern Malaysia.</p>
                <p><a class="btn btn-default" href="#" role="button">View details »</a></p>
            </div>
            <!-- /.col-lg-4 -->
            <div class="col-lg-4">
                <img class="img-circle img-responsive" src="img/sabah.jpg" alt="Generic placeholder image" width="140" height="140">
                <h2>Sabah Package</h2>
                <p>Sabah is a Malaysian state occupying the northern part of Borneo. It's famed for its 4,095m-tall Mt. Kinabalu, the highest peak on the island, crowned with distinctive granite spires. Sabah is also known for its beaches, rainforest, coral
                    reefs and abundant endemic wildlife, much of it within parks and reserves. Offshore, the Sipadan and Mabul islands are noted diving destinations.</p>
                <p><a class="btn btn-default" href="#" role="button">View details »</a></p>
            </div>
            <!-- /.col-lg-4 -->
            <div class="col-lg-4">
                <img class="img-circle img-responsive" src="img/penang.jpg" alt="Generic placeholder image" width="140" height="140">
                <h2>Penang Package</h2>
                <p>Penang is a state in Malaysia located on the northwest coast of Peninsular Malaysia, by the Strait of Malacca. Penang state is bordered by Kedah in the north and east, and Perak in the south.</p>
                <p><a class="btn btn-default" href="#" role="button">View details »</a></p>
            </div>
            <!-- /.col-lg-4 -->
        </div>
        <!-- /.row -->


        <!-- START THE FEATURETTES -->

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">Packages in E-Tourism Malaysia
                    <span class="text-muted">
                        <br>It'll blow your mind.</br>
                    </span>
                </h2>
                <p class="lead">Find the most affordable tour packages for you at our website. We are fully certified by the Ministry of Tourism Malaysia.</p>
            </div>
            <div class="col-md-5">
                <img class="featurette-image img-responsive center-block img-circle" alt="500x500" src="img/Malaysia-2.jpg" data-holder-rendered="true">
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7 col-md-push-5">
                <h2 class="featurette-heading">Oh yeah, it's that good.
                    <span class="text-muted">
                        <br>See for yourself.</span>
                </h2>
                <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
            </div>
            <div class="col-md-5 col-md-pull-7">
                <img class="featurette-image img-responsive center-block img-circle" alt="500x500" src="img/sbux.jpg" data-holder-rendered="true">
            </div>
        </div>

        <hr class="featurette-divider">

        <div class="row featurette">
            <div class="col-md-7">
                <h2 class="featurette-heading">#beautifulMalaysia
                    <span class="text-muted">
                        <br>Photo contest</span>
                </h2>
                <p class="lead">Click pictures of your trip and hashtag with #beautifulMalaysia to win weekly prizes.</p>
            </div>
            <div class="col-md-5">
                <img class="featurette-image img-responsive center-block img-circle" alt="500x500" src="img/beautifulmalaysia.jpg" data-holder-rendered="true">
            </div>
        </div>

        <hr class="featurette-divider">

        <!-- /END THE FEATURETTES -->


        <!-- FOOTER -->
        <footer>
            <p class="pull-right"><a href="#">Back to top</a></p>
            <p>© 2015 Company, Inc. · <a href="#">Privacy</a> · <a href="#">Terms</a></p>
        </footer>

    </div>
    <!-- /.container -->
    
    
    
    <jsp:include page="script.jsp" />
    <script>
        window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')
    </script>
    
</body>
</html>
