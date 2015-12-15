<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.Package" %>
<%@ page import="bean.User" %>
<%@ page import="bean.Transaction" %>
<%@ page import="bean.PackageAddon" %>
<%@ page import="java.util.ArrayList" %>
<%
    Package pkg = Package.getPackageById(Integer.parseInt(request.getParameter("id")));

    request.setAttribute("pkg", pkg);
    HttpSession ss = request.getSession(true);
    Transaction trans = new Transaction(pkg.getId(), ((User)request.getAttribute("loginUser")).getID());
    session.setAttribute("sessionTransaction", trans);
  
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../head.jsp" />
    
    
</head>

<body>
    <jsp:include page="../nav/user.jsp" />
    
    <div class="container">
        <div class="row vertical-offset-200">
            <div class="col-md-8" style="margin-top: 70px">
                <h1>Book Package</h1>
                <div class="well">
                    <form action="<%= request.getContextPath() %>/user/successPackage.jsp" method="post" class="form-horizontal">

                        <div class="form-group">
                            <label class="col-sm-3 control-label">Select Date: </label>
                            <div class ="col-sm-9" >
                                <div class="date-picker"  data-date="2014-02-03">
                                    <div class="date-container">
                                        <h3 class="date">
                                            <span data-toggle="datepicker" data-method="subtract" data-type="d" class="fa fa-angle-left"></span>
                                            <span class="text">17th</span>
                                            <span data-toggle="datepicker" data-method="add" data-type="d" class="fa fa-angle-right"></span>
                                        </h3>
                                        <h2 class="month">
                                            <span data-toggle="datepicker" data-method="subtract" data-type="M" class="fa fa-angle-left"></span>
                                            <span class="text">December</span>
                                            <span data-toggle="datepicker" data-method="add" data-type="M" class="fa fa-angle-right"></span>
                                        </h2>
                                        <h3 class="year">
                                            <span data-toggle="datepicker" data-method="subtract" data-type="y" class="fa fa-angle-left"></span>
                                            <span class="text">2014</span>
                                            <span data-toggle="datepicker" data-method="add" data-type="y" class="fa fa-angle-right"></span>
                                        </h3>

                                        <input type="hidden" id="dateinput" name="date"></input>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">Number Of Person</label>
                            <div class="col-sm-9">
                                <input class="form-control" placeholder="Number of Person" name="quantity" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label"> Select AddOn:  </label>
                            <div class ="col-sm-9" >
                                
                                <c:forEach items="${pkg.getAllAddon()}" var="pkgAO" varStatus="count">
                                    <div class="checkbox">
                                        <label>
                                            <input type="checkbox" value="${pkgAO.getId()}" name="addOns">
                                            ${pkgAO.getName()} (RM ${pkgAO.getPrice()}
                                        </label>
                                    </div>    
                                </c:forEach>
                            </div>
                        </div>
                           
                        <div class="col-md-offset-8">
                            <a href="<%=request.getContextPath()%>/user/package.jsp" class="btn btn-primary" ><span class="glyphicon glyphicon-menu-left"></span> Back </a>                          
                            <a href="" class="btn btn-success" data-toggle="modal" data-target="#myEditData" ><span class="glyphicon glyphicon-shopping-cart"></span> Buy </a>              
                        </div>

                        <div class="modal fade" id="myEditData">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form action="" class="form-horizontal">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                            <h5 class="modal-title">Are you sure you want to Buy Package?</h5>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-warning" data-dismiss="modal">Cancel</button>
                                            <button type="submit" class="btn btn-primary">Checkout</button>
                                        </div>
                                    </form>
                                </div>
                            </div><!-- /.modal-dialog -->
                        </div><!-- /.modal -->
                    </form>
                </div>
            </div>
        </div>
    </div>


    <jsp:include page="../script.jsp" />
    
    <script src="<%=request.getContextPath()%>/js/moment.js"></script>
    <script >
    $(document).ready(function() {

        $('.date-picker').each(function () {
            var $datepicker = $(this),
            cur_date = ($datepicker.data('date') ? moment($datepicker.data('date'), "YYYY/MM/dd") : moment());

            function updateDisplay(cur_date) {
                $('#dateinput').val(cur_date.format("YYYY-MM-DD"));

                $datepicker.find('.date-container > .date > .text').text(cur_date.format('Do'));
                $datepicker.find('.date-container > .month > .text').text(cur_date.format('MMMM'));
                $datepicker.find('.date-container > .year > .text').text(cur_date.format('YYYY'));
                $datepicker.data('date', cur_date.format('YYYY/MM/DD'));
            }

            updateDisplay(moment());

            $datepicker.on('click', '[data-toggle="datepicker"]', function(event) {
                event.preventDefault();

                var cur_date = moment($(this).closest('.date-picker').data('date'), "YYYY/MM/DD"),
                type = ($(this).data('type') ? $(this).data('type') : "date"),
                method = ($(this).data('method') ? $(this).data('method') : "add"),
                amt = ($(this).data('amt') ? $(this).data('amt') : 1);

                if (method == "add") {
                    var duration = moment.duration(1,type);
                    cur_date = cur_date.add(duration);
                }else if (method == "subtract") {
                    cur_date = cur_date.subtract(1,type);
                }

                updateDisplay(cur_date);
            });

        });

    });
    </script>

</body>
</html>
