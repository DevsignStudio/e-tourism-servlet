<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../head.jsp" />
</head>

<body>
    <jsp:include page="../nav/user.jsp" />
    
    <div class="container" style="margin-top: 60px;">
        <div class="row">

            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading text-center">
                        <h2>Step 1: Fill In Your Details</h2>
                    </div>
                    <div class="panel-body">
                        <form class="form-horizontal" role="form">
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
                                <label class="col-sm-3 control-label">Street Address</label>
                                <div class="col-sm-9">
                                    <input class="form-control" name="address" placeholder="Street Address" type="text" value="" id="address">
                                    <span class="help-inline">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-3 control-label">Zip Code</label>
                                <div class="col-sm-9">
                                    <input class="form-control" name="zip" type="text" value="" placeholder="Zip Code">
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
                                    <select name="state" class="form-control">
                                        <option value="">Set state</option>
                                        <option value="JB">Johor</option>
                                        <option value="KL">Kuala Lumpur</option>
                                        <option value="PNG">Penang</option>
                                    </select>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading text-center">
                        <h2>Step 2: Choose Your Package</h2>
                    </div>
                    <div class="panel-body">

                    </div>
                </div>
            </div>

            <div class="col-md-12 custyle" style="margin-top: 10px;">
                <h1>Transaction History</h1>
                <table class="table table-striped custab">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Package</th>
                            <th>Total Price</th>
                            <th>Status</th>
                            <th>Order Date</th>
                        </tr>
                    </thead>
                    <tr>
                        <td>1</td>
                        <td>Langkawi Package</td>
                        <td>RM 60.00</td>
                        <td>
                            <span class="label label-warning">Paid</span>
                        </td>
                        <td>11/12/2015</td>

                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Sabah Package</td>
                        <td>RM 300.00</td>
                        <td>
                            <span class="label label-warning">Paid</span>
                        </td>
                        <td>11/12/2015</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>





    <jsp:include page="../script.jsp" />

</body>
</html>
