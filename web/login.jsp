
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="head.jsp" />
</head>
    
<body class="login">
    <jsp:include page="nav/public.jsp" />
    <div class="container">
        <div class="row vertical-offset-200">
            <div class="col-md-4 col-md-offset-4">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <p class="panel-title">Please Sign in</p>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="loginServlet" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Username" name="username" type="text">
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me"> Remember Me
                                    </label>
                                </div>

                                <input class="btn btn-lg btn-success btn-block" type="submit" value="Login">
                                <p style="margin-top: 20px; text-align: right">Not Register? <a href="register.jsp">Register here</a></p>
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
