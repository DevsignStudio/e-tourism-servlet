<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.User" %>
<%@ page import="java.util.ArrayList" %>
<%
ArrayList<User> clients = User.getAllClient();

request.setAttribute("clients", clients);
%>
<%
  HttpSession ss = request.getSession(true);

  String  scs = (String)ss.getAttribute("scs");
  String  err = (String)ss.getAttribute("err");
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="../head.jsp"/>
    </head>

    <body>
        <jsp:include page="../nav/admin.jsp"/>

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
                    <h1>Users List</h1>
                    <table class="table table-striped custab">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Email</th>
                                <th>Username</th>
                                <th>Name</th>
                                <th>Gender</th>
                                <th class="text-center">Action</th>
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
                                <td class="text-center">
                                    <a class='btn btn-info btn-xs' data-target="#myEditData${ctr.index}" data-toggle="modal" href="#">
                                        <span class="glyphicon glyphicon-edit"></span>
                                        Edit
                                    </a>
                                    <a class="btn btn-danger btn-xs" href="#">
                                        <span class="glyphicon glyphicon-remove"></span>
                                        Del
                                    </a>
                                    <a class="btn btn-default btn-xs" href="viewUser.jsp">
                                        <span class="glyphicon glyphicon-info-sign"></span>
                                        View
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
        <c:forEach items="${clients}" var="client" varStatus="ctr">
            <div class="modal fade" id="myEditData${ctr.index}">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="<%= request.getContextPath() %>/admin/update-client.jsp" method="post" class="form-horizontal">
                            <div class="modal-header">
                                <button aria-label="Close" class="close" data-dismiss="modal" type="button">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                <h4 class="modal-title">Edit User</h4>
                            </div>
                            <div class="modal-body">

                                <div class="form-group">
                                    <label class="col-sm-3 control-label">First Name</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="firstName" placeholder="First Name" type="text" value="${client.getFirstName()}"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Last Name</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="lastName" placeholder="Last Name" type="text" value="${client.getLastName()}"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Email</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="email" placeholder="Email" type="text" value="${client.getEmail()}"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Username</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="username" placeholder="Username" type="text" value="${client.getUsername()}"/>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Street Address</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" id="address" name="address" placeholder="Street Address" type="text" value="${client.getAddress()}" />
                                        <span class="help-inline"></span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Zip Code</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="zipCode" placeholder="Zip Code" type="text" value="${client.getZipCode()}"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">City</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="city" placeholder="City" type="text" value="${client.getCity()}"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">State</label>
                                    <div class="col-sm-9">
                                        <select class="form-control" name="state">
                                            <option value="">Set state</option>
                                            <option value="JB" ${client.getState().equals('JB') ? 'selected="selected"' : ''}>Johor</option>
                                            <option value="KL" ${client.getState().equals('KL') ? 'selected="selected"' : ''}>Kuala Lumpur</option>
                                            <option value="PNG" ${client.getState().equals('PNG') ? 'selected="selected"' : ''}>Penang</option>



                                        </select>
                                    </div>
                                </div>
                                <input type="hidden" name="id" value="${client.getID()}">
                                <div class="modal-footer">
                                    <button class="btn btn-default" data-dismiss="modal" type="button">Close</button>
                                    <button class="btn btn-primary" type="submit">Save changes</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </c:forEach>

        <jsp:include page="../script.jsp"/>
    </body>
</html>
