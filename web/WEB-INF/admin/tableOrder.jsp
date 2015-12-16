<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.Transaction" %>
<%@ page import="bean.User" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<Transaction> trans = Transaction.getAllTransaction();

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
        <div class="row">
            <div class="col-md-12 custyle" style="margin-top: 70px;">
                <h1>My Order</h1>
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
                            <th>Username</th>
                            <th>Transaction Date</th>
                            
                            <th>Package</th>
                            <th>Total Price</th>
                            <th>Status</th>
                            <th>Order Date</th>
                            <th>Approve</th>
                            <th class="text-center">Action</th>
                        </tr>
                    </thead>
                    <c:forEach items="${trans}" var="t" varStatus="ctr">
                        
                        <tr>
                            <td>${t.getId()}</td>
                            <td><a href="<%= request.getContextPath()%>/admin/viewUser.jsp?username=${t.getUsername()}">${t.getUsername()}</a></td>
                            <td>${t.getCreatedAt()}</td>
                            
                            <td>${t.getPackageName()}</td>
                            <td>RM ${t.getTotalPrice()}</td>
                            <td>${t.getStatus()}</td>
                            <td>${t.getEventAt()}</td>
                            <td>
                                <c:if test="${t.getNumericStatus() == 0}">
                                    <a href="<%= request.getContextPath()%>/admin/approveOrder.jsp?id=${t.getId()}" class="btn btn-success btn-xs"><span class="glyphicon glyphicon-trash"></span> Approve</a> 
                                </c:if>
                            </td>
                            <td class="text-center">
                                
                                <a class='btn btn-info btn-xs' href="#"  data-toggle="modal" data-target="#myEdit${ctr.index+1}"><span class="glyphicon glyphicon-edit"></span> Edit</a>
                            </td>
                        </tr>
                    </c:forEach>
                    
                </table>
            </div>
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
