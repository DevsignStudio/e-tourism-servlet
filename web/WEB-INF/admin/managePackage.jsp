<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="bean.Package" %>
<%@ page import="java.util.ArrayList" %>
<%
    ArrayList<Package> pkgs = Package.allPackage();

    request.setAttribute("pkgs", pkgs);
    HttpSession ss = request.getSession(true);

    String  scs = (String)ss.getAttribute("scs");
    String  err = (String)ss.getAttribute("err");
  
%>
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
                <c:if test="${err != null}">
                    <div class="alert alert-danger">
                        ${err}
                    </div>
                </c:if>
                <c:if test="${scs != null}">
                    <div class="alert alert-success">
                        ${scs}
                    </div>
                </c:if>
                <% ss.removeAttribute("scs"); ss.removeAttribute("err"); %>
                <h1>Manage Package</h1>
                <a href="#" class="btn btn-primary pull-right" data-toggle="modal" data-target="#myAdd"><b>+</b> Add new Package</a>
                <table class="table table-striped custab">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Package Name</th>
                            <th>Package Price</th>
                            <th class="text-center">Action</th>
                        </tr>
                    </thead>
                    
                    <c:forEach items="${pkgs}" var="pkg" varStatus="ctr">
                        <tr>
                            <td>${ctr.index +1}</td>
                            <td><a href="javascript:;" data-toggle="modal" data-target="#myModal1">${pkg.name}</a></td>
                            <td>RM ${pkg.price}</td>
                            <td class="text-center">
                                <a class='btn btn-info btn-xs' href="#"  data-toggle="modal" data-target="#myEdit"><span class="glyphicon glyphicon-edit"></span> Edit</a> <a href="#" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#addOn"><span class="glyphicon glyphicon-info-sign"></span> Add Add-On</a>
                                <a href="#" class="btn btn-danger btn-xs"><span class="glyphicon glyphicon-remove"></span> Del</a> <a href="#" class="btn btn-default btn-xs" data-toggle="modal" data-target="#myView"><span class="glyphicon glyphicon-info-sign"></span> View </a>

                            </td>
                        </tr>
                    </c:forEach>
                    
                </table>
            </div>
        </div>
    </div>

    <div class="modal fade" id="myModal1">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Package Description</h4>
                </div>
                <div class="modal-body">
                    <form action="" class="form-horizontal">

                        <div class="form-group">
                            <div class="col-sm-9">
                                <div class="thumbnail-package">
                                    <img src="../img/langkawe.jpg" />
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Name: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">Langkawi Package</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Price: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">RM 130.00</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Description: </label>
                            <div class="col-sm-10">
                                <p class="form-control-static">An archipelago comprising of 99 Islands, Langkawi lies in the southern Andaman Sea adjacent to Thailand border. Langkawi is the part of Malayasias Kedah state and has a land area of about 528 sq. kms. Bestowed with some of the worlds finest white-sand beaches, lush green forests and rocky mountains, Langkawi draws visitors for a memorable honeymoon. Langkawi packages are also very popular for family vacations as well leisure trip. Numerous international airlines offer flights for travel to Langkawi. If you wish for holidays in Langkawi, check out the suitable holiday deals and book holiday packages. Langkawi tours provide you a wonderful chance to enjoy a laidback vacation in the lap of nature. .</p>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <a href="" type="button" class="btn btn-primary">View Complete Details</a>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <div class="modal fade" id="myModal2">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Modal title 2</h4>
                </div>
                <div class="modal-body">
                    <p>One fine body&hellip;</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <div class="modal fade" id="myModal3">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Modal title 3</h4>
                </div>
                <div class="modal-body">
                    <p>One fine body&hellip;</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <div class="modal fade" id="myModal4">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">Modal title 4</h4>
                </div>
                <div class="modal-body">
                    <p>One fine body&hellip;</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <!-- /.Edit Package Modal -->
    <div class="modal fade" id="myEdit">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="" class="form-horizontal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Edit Package</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form-group" style="text-align: center; padding-left: 40%;">
                            <div class="form-group col-sm-6" >
                                <p>Change Images</p>
                                <div class="img-picker"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Name: </label>
                            <div class="col-sm-10">
                                <input class="form-control" placeholder="Package Name" name="packageName" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Price: </label>
                            <div class="col-sm-10">
                                <input class="form-control" placeholder="Package Price" name="packagePrice" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Description: </label>
                            <div class="col-sm-10" >
                                <textarea class="form-control" placeholder="Package Description" name="#packageDescription" id="packageDescriptionn" type="textarea" maxlength="300" rows="5"></textarea>
                            </div>
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

    <!-- /.Add New Package Modal -->
    <div class="modal fade" id="myAdd">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="<%= request.getContextPath() %>/admin/addPackage.jsp" method="POST" class="form-horizontal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Add New Package</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form-group" style="text-align: center; padding-left: 40%;">
                            <div class="form-group col-sm-6" >
                                <p>Add Images</p>
                                <div class="img-picker"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Name: </label>
                            <div class="col-sm-10">
                                <input class="form-control" placeholder="Package Name" name="name" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Price: </label>
                            <div class="col-sm-10">
                                <input class="form-control" placeholder="Package Price" name="price" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Package Description: </label>
                            <div class="col-sm-10" >
                                <textarea class="form-control" placeholder="Package Description" name="description" id="packageDescription1" type="textarea" maxlength="300" rows="5"></textarea>
                                <span class="help-block"><p id="characterLeft" class="help-block ">You have reached the limit</p></span>
                            </div>
                        </div>
                        <input type="hidden"  name="image" id="imageUpload"/>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>
                </form>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <!-- /.Add-On Modal -->
    <div class="modal fade" id="addOn">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="" class="form-horizontal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">Add Add-On</h4>
                    </div>
                    <div class="modal-body">

                        <div class="form-group">
                            <label class="col-sm-2 control-label">Add-On Name: </label>
                            <div class="col-sm-10">
                                <input class="form-control" placeholder="Add-On Name" name="addOnName" type="text">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Add-On Price: </label>
                            <div class="col-sm-10">
                                <input class="form-control" placeholder="Ad-On Price" name="addOnPrice" type="text">
                            </div>
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

    <!-- /.View Package Modal -->
    <div class="modal fade" id="myView">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="" class="form-horizontal">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">View Package</h4>
                    </div>
                    <div class="modal-body">
                        <h1 class="modal-title" style="text-align:center; padding-bottom:50px;">Langkawi Island (RM400)</h1>
                        <form action="" class="form-horizontal">
                            <div class="form-group">
                                <div class="col-sm-9">
                                    <div class="thumbnail-package">
                                        <img src="../img/langkawi.jpg" />
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">Package Description: </label>
                                <div class="col-sm-10">
                                    <p class="form-control-static">An archipelago comprising of 99 Islands, Langkawi lies in the southern Andaman Sea adjacent to Thailand border. Langkawi is the part of Malayasias Kedah state and has a land area of about 528 sq. kms. Bestowed with some of the worlds finest white-sand beaches, lush green forests and rocky mountains, Langkawi draws visitors for a memorable honeymoon. Langkawi packages are also very popular for family vacations as well leisure trip. Numerous international airlines offer flights for travel to Langkawi. If you wish for holidays in Langkawi, check out the suitable holiday deals and book holiday packages. Langkawi tours provide you a wonderful chance to enjoy a laidback vacation in the lap of nature. .</p>
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save changes</button>
                    </div>
                </form>
            </div>
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    
    
    
      
    <jsp:include page="../script.jsp" />
    <script>
    $(document).ready(function(){
        $('#characterLeft').text('300 characters left');
        $('#packageDescription').keydown(function () {
            var max = 300;
            var len = $(this).val().length;
            if (len >= max) {
                $('#characterLeft').text('You have reached the limit');
                $('#characterLeft').addClass('red');
                $('#btnSubmit').addClass('disabled');
            }
            else {
                var ch = max - len;
                $('#characterLeft').text(ch + ' characters left');
                $('#btnSubmit').removeClass('disabled');
                $('#characterLeft').removeClass('red');
            }
        });
    });
    </script>

    <script>
    (function ( $ ) {

        $.fn.imagePicker = function( options ) {

            // Define plugin options
            var settings = $.extend({
                // Input name attribute
                name: "",
                // Classes for styling the input
                class: "form-control btn btn-default btn-block",
                // Icon which displays in center of input
                icon: "glyphicon glyphicon-plus"
            }, options );

            // Create an input inside each matched element
            return this.each(function() {
                $(this).html(create_btn(this, settings));
            });

        };

        // Private function for creating the input element
        function create_btn(that, settings) {
            // The input icon element
            var picker_btn_icon = $('<i class="'+settings.icon+'"></i>');

            // The actual file input which stays hidden
            var picker_btn_input = $('<input type="file" name="'+settings.name+'" />');

            // The actual element displayed
            var picker_btn = $('<div class="'+settings.class+' img-upload-btn"></div>')
            .append(picker_btn_icon)
            .append(picker_btn_input);

            // File load listener
            picker_btn_input.change(function() {
                if ($(this).prop('files')[0]) {
                    // Use FileReader to get file
                    var reader = new FileReader();

                    // Create a preview once image has loaded
                    reader.onload = function(e) {
                        var preview = create_preview(that, e.target.result, settings);
                        $(that).html(preview);
                    }

                    // Load image
                    reader.readAsDataURL(picker_btn_input.prop('files')[0]);
                }
            });

            return picker_btn
        };

        // Private function for creating a preview element
        function create_preview(that, src, settings) {

            // The preview image
            var picker_preview_image = $('<img src="'+src+'" class="img-responsive img-rounded" />');
            
            $("#imageUpload").val(src);

            // The remove image button
            var picker_preview_remove = $('<button class="btn btn-link"><small>Remove</small></button>');

            // The preview element
            var picker_preview = $('<div class="text-center"></div>')
            .append(picker_preview_image)
            .append(picker_preview_remove);

            // Remove image listener
            picker_preview_remove.click(function() {
                var btn = create_btn(that, settings);
                $(that).html(btn);
            });

            return picker_preview;
        };

    }( jQuery ));

    $(document).ready(function() {
        $('.img-picker').imagePicker({name: 'images-picker'});
    })
    </script>
    
</body>
</html>
