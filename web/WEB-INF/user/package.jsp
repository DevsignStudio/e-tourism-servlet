<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.Package" %>
<%@ page import="bean.PackageAddon" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<Package> pkgs = Package.allPackage();

    request.setAttribute("pkgs", pkgs);
    HttpSession ss = request.getSession(true);

    String  scs = (String)ss.getAttribute("scs");
    String  err = (String)ss.getAttribute("err");
  
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../head.jsp" />
</head>

<body>
    <jsp:include page="../nav/user.jsp" />
    
    <div class="container" style="margin-top: 80px;">
        <div class="row" id="thumbnail-box">
            <c:forEach items="${pkgs}" var="pkg" varStatus="ctr">
                <c:if test="${pkg.getDisplay() == 1}">
                <div class="col-sm-6 col-md-4">
                    <div class="thumbnail" >
                        <img src="${pkg.getImage()}" class="img-responsive">
                        <div class="caption">
                            <div class="row">
                                <div class="col-md-6 col-xs-6">
                                    <h3>${pkg.getName()}</h3>
                                </div>
                                <div class="col-md-6 col-xs-6 price">
                                    <h3>
                                        <label>RM ${pkg.getPrice()}</label>
                                    </h3>
                                </div>
                            </div>
                            <p>${pkg.getDescription()}</p>
                            
                            <div class="row">
                                <div class="col-md-6">
                                    <a href="buyPackage.jsp?id=${pkg.getId()}" class="btn btn-success btn-product" ><span class="glyphicon glyphicon-shopping-cart"></span> Book </a>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                </c:if>

            </c:forEach>
            
        </div>
    </div>

    <jsp:include page="../script.jsp" />
    <script src="../js/masonry.pkgd.min.js"></script>
    <script>

$(document).ready( function() {

  $("#thumbnail-box").masonry({
    itemSelector: '.col-sm-6',
    
  });

});
</script>


</body>
</html>
