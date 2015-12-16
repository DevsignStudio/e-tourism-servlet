<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.User" %>
<%@ page import="bean.Report" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="bean.Package" %>
<%@ page import="bean.PackageAddon" %>
<%
ArrayList<User> clients = User.getAllClient();

request.setAttribute("clients", clients);

ArrayList<Package> pkgs = Package.allPackage();

    request.setAttribute("pkgs", pkgs);
%>
<%
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
    <jsp:include page="../nav/admin.jsp" />
    
    <div class="container">
        <div class="row">
            <div class="col-md-12 custyle" style="margin-top: 70px;">
                    <c:if test="${err != null}">
                        <div class="alert alert-danger">
                            ${err}
                        </div>
                    </c:if>
                    <c:if test="${scs != null}">
                        <div class="alert alert-success">
                            ${scs}
                        </div>
                    </c:if>
                    <% ss.removeAttribute("scs"); ss.removeAttribute("err"); %>
                    <h3>Simple Report</h3>
                    <table class="table" style="font-size: 16px;"> 
                        <tbody> 
                            <tr class="success"> 
                                <th scope="row">Total Number Of Client</th> 
                                <td><%= Report.getTotalUser() %> person(s)</td>
                            </tr>
                            <tr class="success"> 
                                <th scope="row">Total Number Of Package</th> 
                                <td><%= Report.getTotalPackage() %> package(s)</td>
                            </tr> 
                            <tr class="success"> 
                                <th scope="row">Total Number Of Order</th> 
                                <td><%= Report.getTotalOrder() %> order(s)</td>
                            </tr> 
                            <tr class="success"> 
                                <th scope="row">Total Number Of Order (Success)</th> 
                                <td><%= Report.totalSuccessOrder() %> order(s)</td>
                            </tr> 
                            <tr class="success"> 
                                <th scope="row">Total Number Of Order (Pending)</th> 
                                <td><%= Report.totalPendingOrder() %> order(s)</td>
                            </tr> 
                            <tr class="success"> 
                                <th scope="row">Total Sales</th> 
                                <td>MYR <%= Report.getTotalSales() %></td>
                            </tr> 
                        </tbody> 
                    </table>
                    <h3>Users List</h3>
                    <table class="table table-striped custab">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Email</th>
                                <th>Username</th>
                                <th>Name</th>
                                <th>Gender</th>
                            </tr>
                        </thead>
                        <c:forEach items="${clients}" var="client" varStatus="ctr">

                            <tr>
                                <td>${ctr.index+1}</td>
                                <td>${client.getEmail()}</td>
                                <td>${client.getUsername()}</td>
                                <td>${client.getFullname()}</td>
                                <c:if test="${client.getGender() == 1}">
                                    <td>Male</td>
                                </c:if>
                                <c:if test="${client.getGender() != 1}">
                                    <td>Female</td>
                                </c:if>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                    
            <div class="col-md-12 custyle">
                <c:if test="${err != null}">
                    <div class="alert alert-danger">
                        ${err}
                    </div>
                </c:if>
                <c:if test="${scs != null}">
                    <div class="alert alert-success">
                        ${scs}
                    </div>
                </c:if>
                <% ss.removeAttribute("scs"); ss.removeAttribute("err"); %>
                <h3>Manage Package</h3>
                <table class="table table-striped custab">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Package Name</th>
                            <th>Package Price</th>
                            <th class="text-center">Action</th>
                        </tr>
                    </thead>
                    
                    <c:forEach items="${pkgs}" var="pkg" varStatus="ctr">
                        <tr>
                            <td>${ctr.index +1}</td>
                            <td><a href="javascript:;" data-toggle="modal" data-target="#myModal${ctr.index}">${pkg.name}</a></td>
                            <td>RM ${pkg.price}</td>
                            <td class="text-center">
                                <a href="#" class="btn btn-default btn-xs" data-toggle="modal" data-target="#myModal${ctr.index}"><span class="glyphicon glyphicon-info-sign"></span> View </a>
                            </td>
                        </tr>
                    </c:forEach>
                    
                </table>
            </div>
        </div>

    </div>

                
    <c:forEach items="${pkgs}" var="pkg" varStatus="ctr">
        <div class="modal fade" id="myModal${ctr.index}">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Package Details</h4>
                    </div>
                    <div class="modal-body">
                        <form action="" class="form-horizontal">

                            <div class="form-group">
                                <div class="col-sm-12">
                                    <img src="${pkg.getImage()}" class="img-responsive" style="width:100%;"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-4 control-label">Package Name: </label>
                                <div class="col-sm-8">
                                    <p class="form-control-static">${pkg.getName()}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-4 control-label">Package Price: </label>
                                <div class="col-sm-8">
                                    <p class="form-control-static">RM ${pkg.getPrice()}</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-4 control-label">Package Description: </label>
                                <div class="col-sm-8">
                                    <p class="form-control-static">${pkg.getDescription()}</p>
                                </div>
                            </div>
                            
                            <c:forEach items="${pkg.getAllAddon()}" var="pkgAO" varStatus="count">
                                <div class="form-group">
                                    <label class="col-sm-4 control-label">Package Add On ${count.index+1}: </label>
                                    <div class="col-sm-8">
                                        <p class="form-control-static">${pkgAO.getName()} (RM ${pkgAO.getPrice()})</p>
                                    </div>
                                </div>
                            </c:forEach>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        <!-- /.Edit Package Modal -->
        <div class="modal fade" id="myEdit${ctr.index}">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="" class="form-horizontal">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title">Edit Package</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Package Name: </label>
                                <div class="col-sm-10">
                                    <input class="form-control" placeholder="Package Name" name="packageName" type="text" value="${pkg.getName()}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Package Price: </label>
                                <div class="col-sm-10">
                                    <input class="form-control" placeholder="Package Price" name="packagePrice" type="text" value="${pkg.getPrice()}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Package Description: </label>
                                <div class="col-sm-10" >
                                    <textarea class="form-control" placeholder="Package Description" name="#packageDescription" id="packageDescriptionn" type="textarea" maxlength="300" rows="5">${pkg.getDescription()}</textarea>
                                </div>
                            </div>
                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Save changes</button>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        <!-- /.Add-On Modal -->
        <div class="modal fade" id="addOn${ctr.index}">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="<%= request.getContextPath() %>/admin/addPackageAddon.jsp" class="form-horizontal">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title">Add Add-On</h4>
                        </div>
                        <div class="modal-body">

                            <div class="form-group">
                                <label class="col-sm-2 control-label">Add-On Name: </label>
                                <div class="col-sm-10">
                                    <input class="form-control" placeholder="Add-On Name" name="name" type="text">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Add-On Price: </label>
                                <div class="col-sm-10">
                                    <input class="form-control" placeholder="Ad-On Price" name="price" type="text">
                                </div>
                            </div>
                            <input type="hidden" name="id" value="${pkg.id}" />
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Save changes</button>
                        </div>
                    </form>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
    </c:forEach>

    <jsp:include page="../script.jsp" />
    <script>
        $(document).ready(function() {
            $(".push_menu").click(function() {
                $(".wrapper").toggleClass("active");
            });
        });
    </script>

</body>
</html>
