<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.Transaction" %>
<%@ page import="bean.User" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<Transaction> trans = Transaction.getAllTransaction(((User)request.getAttribute("loginUser")).getID());

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
    <jsp:include page="../nav/user.jsp" />
    
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
                            <th>Transaction ID</th>
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
                            <td class="text-center"> <a href="<%= request.getContextPath()%>/user/CancelTransaction.jsp?id=${t.getId()}" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-trash"></span> Cancel</a> </td>
                        </tr>
                    </c:forEach>
                    
                </table>
            </div>
        </div>
    </div>

    <div class="modal fade" id="myDelete">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="" class="form-horizontal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h3 class="modal-title">Delete Transaction History</h3>
                    </div>
                    <div class="modal-body">

                        <h5>Are you sure you want to delete? </h5>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>

                </form>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->


    <jsp:include page="../script.jsp" />

</body>
</html>
