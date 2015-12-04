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
                    <tr>
                        <td>1</td>
                        <td>Lili93@gmail.com</td>
                        <td>News</td>
                        <td>News Cate</td>
                        <td>Male</td>
                        <td class="text-center">
                            <a href="view-user.html" class="btn btn-default btn-xs" data-toggle="modal" data-target="#myModel">
                                <span class="glyphicon glyphicon-info-sign"></span> View </a>
                        </td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Lili93@gmail.com</td>
                        <td>Products</td>
                        <td>Main Products</td>
                        <td>Female</td>
                        <td class="text-center">
                            <a href="view-user.html" class="btn btn-default btn-xs" data-toggle="modal" data-target="#myModel">
                                <span class="glyphicon glyphicon-info-sign"></span> View </a>
                        </td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>Lili93@gmail.com</td>
                        <td>luxey93</td>
                        <td>Lili Madiha</td>
                        <td>Female</td>
                        <td class="text-center">
                            <a href="view-user.html" class="btn btn-default btn-xs" data-toggle="modal" data-target="#myModel">
                                <span class="glyphicon glyphicon-info-sign"></span> View </a>
                        </td>
                </table>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            <span class="glyphicon glyphicon-time"></span> Tasks Panel</h3>
                    </div>
                    <div class="panel-body">
                        <div class="list-group">
                            <a href="#" class="list-group-item">
                                <span class="badge">just now</span>
                                <span class="glyphicon glyphicon-calendar"></span> Calendar updated
                            </a>
                            <a href="#" class="list-group-item">
                                <span class="badge">4 minutes ago</span>
                                <span class="glyphicon glyphicon-comment"></span> Commented on a post
                            </a>
                            <a href="#" class="list-group-item">
                                <span class="badge">23 minutes ago</span>
                                <span class="glyphicon glyphicon-plane"></span> Order 392 shipped
                            </a>
                            <a href="#" class="list-group-item">
                                <span class="badge">46 minutes ago</span>
                                <span class="glyphicon glyphicon-usd"></span> Invoice 653 has been paid
                            </a>
                            <a href="#" class="list-group-item">
                                <span class="badge">1 hour ago</span>
                                <span class="glyphicon glyphicon-user"></span> A new user has been added
                            </a>
                            <a href="#" class="list-group-item">
                                <span class="badge">2 hours ago</span>
                                <span class="glyphicon glyphicon-list-alt"></span> Completed task: "pick up dry cleaning"
                            </a>
                            <a href="#" class="list-group-item">
                                <span class="badge">two days ago</span>
                                <span class="glyphicon glyphicon-list-alt"></span> Completed task: "fix error on sales page"
                            </a>
                        </div>
                        <div class="text-right">
                            <a href="#">View All Activity <span class="glyphicon glyphicon-chevron-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>




            <div class="col-lg-6">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">
                            <span class="glyphicon glyphicon-usd"></span> Transactions Panel</h3>
                    </div>
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th>Order #</th>
                                        <th>Order Date</th>
                                        <th>Order Time</th>
                                        <th>Amount (USD)</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>3326</td>
                                        <td>10/21/2013</td>
                                        <td>3:29 PM</td>
                                        <td>$321.33</td>
                                    </tr>
                                    <tr>
                                        <td>3325</td>
                                        <td>10/21/2013</td>
                                        <td>3:20 PM</td>
                                        <td>$234.34</td>
                                    </tr>
                                    <tr>
                                        <td>3324</td>
                                        <td>10/21/2013</td>
                                        <td>3:03 PM</td>
                                        <td>$724.17</td>
                                    </tr>
                                    <tr>
                                        <td>3323</td>
                                        <td>10/21/2013</td>
                                        <td>3:00 PM</td>
                                        <td>$23.71</td>
                                    </tr>
                                    <tr>
                                        <td>3322</td>
                                        <td>10/21/2013</td>
                                        <td>2:49 PM</td>
                                        <td>$8345.23</td>
                                    </tr>
                                    <tr>
                                        <td>3321</td>
                                        <td>10/21/2013</td>
                                        <td>2:23 PM</td>
                                        <td>$245.12</td>
                                    </tr>
                                    <tr>
                                        <td>3320</td>
                                        <td>10/21/2013</td>
                                        <td>2:15 PM</td>
                                        <td>$5663.54</td>
                                    </tr>
                                    <tr>
                                        <td>3319</td>
                                        <td>10/21/2013</td>
                                        <td>2:13 PM</td>
                                        <td>$943.45</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                        <div class="text-right">
                            <a href="manage-order-admin.html">View All Transactions <span class="glyphicon glyphicon-chevron-right"></span></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <div class="modal fade" id="myModel">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="col-md-8" style="margin-top: 70px">
                    <h1>View User Details</h1>
                    <div class="well">
                        <form action="" class="form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">First Name: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">email@example.com</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Last Name: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">email@example.com</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Email: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">email@example.com</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Username: </label>
                                <div class="col-sm-9">
                                    <p class="form-control-static">luxey93</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Gender: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">Female</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Street: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">Kampung</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Zip Code: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">83400</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">City: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">Batu Pahat</p>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">State: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">Johor</p>
                                </div>
                            </div>

                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>

                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>


    <jsp:include page="../script.jsp" />
    <script>
        $(document).ready(function() {
            $(".push_menu").click(function() {
                $(".wrapper").toggleClass("active");
            });
        });
    </script>

</body>
</html>
