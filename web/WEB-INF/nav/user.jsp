<nav class="navbar navbar-inverse navbar-custom navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">E-Tourism</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="package.jsp">Book Package</a></li>

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Welcome, ${loginUser.getFullname()} <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#" data-toggle="modal" data-target="#myEdit">Edit Account</a></li>
                            <li><a href="<%=request.getContextPath()%>/user/transactionHistory.jsp">Transaction History</a></li>
                            <li><a href="<%=request.getContextPath()%>/user/myOrder.jsp">View Order</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="<%=request.getContextPath()%>/logout.jsp">Logout</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
                        
                         <!-- /.Edit account modal -->
        <div class="modal fade" id="myEdit">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">

                <div class="panel-heading text-center">
                    <h2>Edit Account</h2>
                    <p><i>Change your basic details</i></p>
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

              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
              </div>
            </div><!-- /.modal-header -->
          </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
      </div><!-- /.modal -->