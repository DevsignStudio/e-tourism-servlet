<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.servlet.http.HttpSession" %>

<%
  HttpSession ss = request.getSession(true);        
                
  String  scs = (String)ss.getAttribute("scs");  
    
%>
<jsp
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="head.jsp" />
<body class="login">
    <jsp:include page="nav/public.jsp" />

    <div class="container">
        <div class="row vertical-offset-200">
            <div class="col-md-10 col-md-offset-1">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Enter Register Form</h3>
                    </div>
                    <div class="panel-body">
                        <c:if test="${scs != null}">
                            <div class="alert alert-danger">
                                ${scs}
                            </div>
                        </c:if>
                        <% ss.invalidate(); %>
                        <form accept-charset="UTF-8" role="form" action="registerServlet" method="post">
                            <fieldset>
                                <div class="row">
                                    <div class="col-xs-6 ">
                                        <div class="form-group">
                                            <input class="form-control" placeholder="First Name" name="firstName" type="text">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Last Name" name="lastName" type="text">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Email" name="email" type="text">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Username" name="username" type="text">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" placeholder="Confirm Password" name="re-Password" type="password" value="">
                                        </div>
                                    </div>

                                    <div class="col-xs-6" >
                                        <div class="form-group">
                                            <select name="gender" class="form-control" >
                                                <option value="">SetGender</option>
                                                <option value="1">Female</option>
                                                <option value="0">Male</option>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <textarea class="form-control" name="address" placeholder="Street Address" type="text" value="" id="address"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" name="zip" type="text" value=""  placeholder="Zip Code">
                                        </div>
                                        <div class="form-group">
                                            <input class="form-control" name="city" placeholder="City" type="text" value="">
                                        </div>

                                        <div class="form-group">
                                            <select name="state" class="form-control" >
                                                <option value="">Set state</option>
                                                <option value="JB">Johor</option>
                                                <option value="KL">Kuala Lumpur</option>
                                                <option value="PNG">Penang</option>
                                            </select>

                                                <label><input type="checkbox" name="terms"> I agree with the <a href="termConditions.jsp">Terms and Conditions</a>.</label>
                                                <input class="btn btn-lg btn-success btn-block" type="submit" value="Register">
                                            </div>
                                        </div>

                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <jsp:include page="script.jsp" />

            <script src="<%=request.getContextPath()%>/js/TweenLite.min.js"></script>
            <script charset="utf-8">
            $(document).ready(function(){
                $(document).mousemove(function(e){
                    TweenLite.to($('body'),
                    .5,
                    { css:
                        {
                            backgroundPosition: ""+ parseInt(event.pageX/8) + "px "+parseInt(event.pageY/'12')+"px, "+parseInt(event.pageX/'15')+"px "+parseInt(event.pageY/'15')+"px, "+parseInt(event.pageX/'30')+"px "+parseInt(event.pageY/'30')+"px"
                        }
                    });
                });
            });
            </script>
        </body>
        </html>
