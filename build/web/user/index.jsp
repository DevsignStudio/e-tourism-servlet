<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="bean.User" %>

<%
  HttpSession ss = request.getSession(true);        
                
  Object  username = ss.getAttribute("username");  
  User loginUser = new User();
  if (username == null) {
      response.sendRedirect(request.getContextPath()); 
  } else {
      loginUser = User.getUserFromUsername((String)username);
  }
  
  
    
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../head.jsp" />
</head>

<body>
    <jsp:include page="../nav/user.jsp" />



    <h1> <%= loginUser.getUsername() %></h1>
    <jsp:include page="../script.jsp" />

</body>
</html>
