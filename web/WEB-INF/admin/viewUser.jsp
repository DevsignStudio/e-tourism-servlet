<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.User" %>
<%@ page import="bean.Transaction" %>

<%@ page import="java.util.ArrayList" %>
<%
    User user = User.getUserFromUsername(request.getParameter("username"));
    request.setAttribute("user", user);
    
    ArrayList<Transaction> trans = Transaction.getAllTransaction(user.getID());

    request.setAttribute("trans", trans);
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
        <div class="row vertical-offset-200">
            <div class="col-md-8" style="margin-top: 70px">
                <a href="<%= request.getContextPath() %>/admin/tableUser.jsp" class="btn btn-info">Back to User Table</a>
                
                
                <h1>View User Details</h1>
                <div class="well">
                    <form action="" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">First Name: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getFirstName()}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Last Name: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getLastName()}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Email: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getEmail()}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Username: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getUsername()}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Gender: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getGender() == 1 ? 'Male' : 'Female'}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Street: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getAddress()}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Zip Code: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getZipCode()}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">City: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getCity()}</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">State: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">${user.getState().equals("JB") ? 'Johor Bharu' : ""}${user.getState().equals("KL") ? 'Kuala Lumpur' : ""}${user.getState().equals("PNG") ? 'Pulau Pinang' : ""}</p>
                            </div>
                        </div>
                    </form>
                </div>

            </div>
        </div>

        <div class="col-md-12 custyle" style="margin-top: 10px;">
            <h1>Order History</h1>
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
            <table class="table table-striped custab">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Transaction Date</th>
                            
                            <th>Package</th>
                            <th>Total Price</th>
                            <th>Status</th>
                            <th>Order Date</th>
                            <th class="text-center">Action</th>
                        </tr>
                    </thead>
                    <c:forEach items="${trans}" var="t" varStatus="ctr">
                        
                        <tr>
                            <td>${t.getId()}</td>
                            <td>${t.getCreatedAt()}</td>
                            
                            <td>${t.getPackageName()}</td>
                            <td>RM ${t.getTotalPrice()}</td>
                            <td>${t.getStatus()}</td>
                            <td>${t.getEventAt()}</td>
                            <td class="text-center"><a class='btn btn-info btn-xs' href="#"  data-toggle="modal" data-target="#myEdit${ctr.index+1}"><span class="glyphicon glyphicon-edit"></span> Edit</a></td>
                        </tr>
                    </c:forEach>
                    
                </table>
        </div>
    </div>
    
     <c:forEach items="${trans}" var="t" varStatus="ctr">
         <div class="modal fade" id="myEdit${ctr.index+1}">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="<%= request.getContextPath()%>/admin/changeOrderStatus.jsp" class="form-horizontal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Change Status</h4>
                    </div>
                    <div class="modal-body">

                        <div class="form-group">
                            <label class="col-sm-3 control-label">Status :</label>
                            <div class="col-sm-9">
                                <select name="status" class="form-control" >
                                    <option value="0" ${t.getNumericStatus() == 0 ? 'selected="selected"' : ''}>Pending Payment</option>
                                    <option value="1" ${t.getNumericStatus() == 1 ? 'selected="selected"' : ''}>Cancel</option>
                                    <option value="2" ${t.getNumericStatus() == 2 ? 'selected="selected"' : ''}>Success</option>
                                    <option value="3" ${t.getNumericStatus() == 3 ? 'selected="selected"' : ''}>Payment Overdue</option>
                                </select>
                            </div>
                            <input type="hidden" name="id" value="${t.getId()}" />
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
    </c:forEach>
    
    
    <jsp:include page="../script.jsp" />
    

</body>
</html>