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
                            <label class="col-sm-2 control-label">Username: </label>
                            <div class="col-sm-10">
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
                    </form>
                </div>

            </div>
        </div>

        <div class="col-md-12 custyle" style="margin-top: 10px;">
            <h1>Order History</h1>
            <table class="table table-striped custab">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Package</th>
                        <th>Total Price</th>
                        <th>Status</th>
                        <th>Order Date</th>
                        <th class="text-center">Action</th>
                    </tr>
                </thead>
                <tr>
                    <td>1</td>
                    <td>Langkawi Package</td>
                    <td>RM 60.00</td>
                    <td><span class="label label-warning">Payment Overdue</span></td>
                    <td>11/12/2015</td>
                    <td class="text-center"><a class='btn btn-info btn-xs' href="#"  data-toggle="modal" data-target="#myEdit"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a> </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Sabah Package</td>
                    <td>RM 300.00</td>
                    <td><span class="label label-warning">Success</span></td>
                    <td>11/12/2015</td>
                    <td class="text-center"><a class='btn btn-info btn-xs' href="#"  data-toggle="modal" data-target="#myEdit"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a> </td>
                </tr>
            </table>
        </div>
    </div>
    
    
    
    <jsp:include page="../script.jsp" />
    

</body>
</html>