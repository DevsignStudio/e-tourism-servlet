<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../head.jsp" />
</head>

<body>
    <jsp:include page="../nav/user.jsp" />
    
    <div class="container">
        <div class="row">
            <div class="col-md-12 custyle" style="margin-top: 70px;">
                <h1>Transaction History</h1>
                <table class="table table-striped custab">
                    <thead>
                        <tr>
                            <th>Transaction ID</th>
                            <th>Transaction Date</th>
                            <th>Transaction Time</th>
                            <th>Package</th>
                            <th>Total Price</th>
                            <th>Status</th>
                            <th>Order Date</th>
                            <th class="text-center">Action</th>
                        </tr>
                    </thead>
                    <tr>
                        <td>456124</td>
                        <td>05/09/2015</td>
                        <td>10.10 AM</td>
                        <td>Langkawi Package</td>
                        <td>RM 990.00</td>
                        <td><span class="label label-warning">Payment Overdue</span></td>
                        <td>11/12/2015</td>
                        <td class="text-center"> <a href="#" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#myDelete"><span class="glyphicon glyphicon-trash"></span> Delete</a> </td>
                    </tr>
                    <tr>
                        <td>126731</td>
                        <td>12/05/2014</td>
                        <td>9.30 AM</td>
                        <td>Sabah Package</td>
                        <td>RM 440.00</td>
                        <td><span class="label label-success">Success</span></td>
                        <td>11/12/2014</td>
                        <td class="text-center"> <a href="#" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#myDelete"><span class="glyphicon glyphicon-trash"></span> Delete</a> </td>
                    </tr>
                    <tr>
                        <td>781203</td>
                        <td>12/02/2013</td>
                        <td>12.57 PM</td>
                        <td>Tioman Island Package</td>
                        <td>RM 220.00</td>
                        <td><span class="label label-primary">In-Progress</span></td>
                        <td>11/09/2013</td>
                        <td class="text-center"> <a href="#" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#myDelete"><span class="glyphicon glyphicon-trash"></span> Delete</a> </td>
                    </tr>
                    <tr>
                        <td>237810</td>
                        <td>12/03/2012</td>
                        <td>3.10 PM</td>
                        <td>Penang Package</td>
                        <td>RM 550.00</td>
                        <td><span class="label label-danger">Cancel</span></td>
                        <td>11/12/2012</td>
                        <td class="text-center"> <a href="#" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#myDelete"><span class="glyphicon glyphicon-trash"></span> Delete</a> </td>
                    </tr>

                </table>
            </div>
        </div>
    </div>

    <div class="modal fade" id="myDelete">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="" class="form-horizontal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h3 class="modal-title">Delete Transaction History</h3>
                    </div>
                    <div class="modal-body">

                        <h5>Are you sure you want to delete? </h5>

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
