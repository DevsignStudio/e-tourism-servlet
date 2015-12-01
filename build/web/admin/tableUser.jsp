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
                        <td class="text-center"><a class='btn btn-info btn-xs' href="#" data-toggle="modal" data-target="#myEditData"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a> <a href="viewUser.jsp" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-info-sign"></span> View </a></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Lili93@gmail.com</td>
                        <td>Products</td>
                        <td>Main Products</td>
                        <td>Female</td>
                        <td class="text-center"><a class='btn btn-info btn-xs' href="#" data-toggle="modal" data-target="#myEditData"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a> <a href="#" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-info-sign"></span> View </a></td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>Lili93@gmail.com</td>
                        <td>luxey93</td>
                        <td>Lili Madiha</td>
                        <td>Female</td>
                        <td class="text-center"><a class='btn btn-info btn-xs' href="#"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a> <a href="#" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-info-sign"></span> View </a></td>
                    </table>
                </div>
            </div>
        </div>

        <div class="modal fade" id="myEditData">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="" class="form-horizontal">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title">Edit User</h4>
                        </div>
                        <div class="modal-body">

                            <div class="form-group">
                                <label class="col-sm-3 control-label">First Name</label>
                                <div class="col-sm-9">
                                    <input class="form-control" placeholder="First Name" name="firstName" type="text">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-3 control-label">Last Name</label>
                                <div class="col-sm-9">
                                    <input class="form-control" placeholder="Last Name" name="lastName" type="text">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Email</label>
                                <div class="col-sm-9">
                                    <input class="form-control" placeholder="Email" name="email" type="text">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Username</label>
                                <div class="col-sm-9">
                                    <input class="form-control" placeholder="Username" name="username" type="text">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Password</label>
                                <div class="col-sm-9">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Confirm Password</label>
                                <div class="col-sm-9">
                                    <input class="form-control" placeholder="Confirm Password" name="re-Password" type="password" value="">
                                </div>
                            </div>

                            <div class="form-group">
                                <label class="col-sm-3 control-label">Street Address</label>
                                <div class="col-sm-9">
                                    <input class="form-control" name="address" placeholder="Street Address" type="text" value="" id="address"><span class="help-inline">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Zip Code</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="zip" type="text" value=""  placeholder="Zip Code">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">City</label>
                                    <div class="col-sm-9">
                                        <input class="form-control" name="city" placeholder="City" type="text" value="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">State</label>
                                    <div class="col-sm-9">
                                        <select name="state" class="form-control" >
                                            <option value="">Set state</option>
                                            <option value="JB">Johor</option>
                                            <option value="KL">Kuala Lumpur</option>
                                            <option value="PNG">Penang</option>
                                        </select>
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





    <jsp:include page="../script.jsp" />

</body>
</html>
