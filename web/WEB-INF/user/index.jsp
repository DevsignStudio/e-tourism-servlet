<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="bean.User" %>

<%
  
  
  
    
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../head.jsp" />
</head>

<body>
    <jsp:include page="../nav/user.jsp" />



    <h1> ${loginUser.getUsername()} </h1>
    <jsp:include page="../script.jsp" />

</body>
</html>
