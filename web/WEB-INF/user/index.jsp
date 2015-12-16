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
    <div style="margin-top: 80px;"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-12 custyle">
                <h2> Howdy, ${loginUser.getFullname()}! </h2>
                <hr>
                <h3>My Order</h3>
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
                            <th>Order Date</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <c:forEach items="${trans}" var="t" varStatus="ctr">
                        <tr>
                            <td>${t.getId()}</td>
                            <td>${t.getCreatedAt()}</td>
                            <td>${t.getPackageName()}</td>
                            <td>RM ${t.getTotalPrice()}</td>
                            <td>${t.getEventAt()}</td>
                            <td>${t.getStatus()}</td>
                        </tr>
                    </c:forEach>
                </table>

                <div class="pull-right">
                    <a href="http://localhost:8080/e-tourism-servlet/user/transactionHistory.jsp">View All Order >></a>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="../script.jsp" />

</body>
</html>
