<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="../head.jsp" />
</head>

<body>
    <jsp:include page="../nav/user.jsp" />
    
    <div class="container" style="margin-top: 80px;">
        <div class="row" id="thumbnail-box">
            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" >
                    <img src="../img/langkawe.jpg" class="img-responsive">
                    <div class="caption">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <h3>Langkawi Package</h3>
                            </div>
                            <div class="col-md-6 col-xs-6 price">
                                <h3>
                                    <label>RM300</label>
                                </h3>
                            </div>
                        </div>
                        <p>Langkawi, officially known as Langkawi the Jewel of Kedah is an archipelago of 104 islands in the Andaman Sea, some 30 km off the mainland coast of northwestern Malaysia.</p>
                        <ul style="list-style-type: square;">
                            <label>Highlight:</label>
                            <li>2 Nights Accomodation</li>
                            <li>Daily Buffet Breakfast</li>
                            <li>1 Buffet Dinner</li>
                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>
                        </ul>
                        <div class="row">
                            <div class="col-md-6">
                                <a href="buyPackage.jsp" class="btn btn-success btn-product" ><span class="glyphicon glyphicon-shopping-cart"></span> Buy </a>
                            </div>
                        </div>

                    </div>
                </div>
            </div>




            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" >
                    <img src="../img/sabah.jpg" class="img-responsive">
                    <div class="caption">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <h3>Sabah Package</h3>
                            </div>
                            <div class="col-md-6 col-xs-6 price">
                                <h3>
                                    <label>RM300</label>
                                </h3>
                            </div>
                        </div>
                        <p>Sabah is a Malaysian state occupying the northern part of Borneo. It's famed for its 4,095m-tall Mt. Kinabalu, the highest peak on the island, crowned with distinctive granite spires. Sabah is also known for its beaches, rainforest, coral reefs and abundant endemic wildlife, much of it within parks and reserves. Offshore, the Sipadan and Mabul islands are noted diving destinations.</p>
                        <ul style="list-style-type: square;">
                            <label>Highlight:</label>
                            <li>2 Nights Accomodation</li>
                            <li>Daily Buffet Breakfast</li>
                            <li>1 Buffet Dinner</li>
                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>
                        </ul>
                        <div class="row">
                            <div class="col-md-6">
                                <a href="buy-package.html" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" >
                    <img src="../img/sabah.jpg" class="img-responsive">
                    <div class="caption">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <h3>Tioman Island Package</h3>
                            </div>
                            <div class="col-md-6 col-xs-6 price">
                                <h3>
                                    <label>RM300</label>
                                </h3>
                            </div>
                        </div>
                        <p>Sabah is a Malaysian state occupying the northern part of Borneo. It's famed for its 4,095m-tall Mt. Kinabalu, the highest peak on the island, crowned with distinctive granite spires. Sabah is also known for its beaches, rainforest, coral reefs and abundant endemic wildlife, much of it within parks and reserves. Offshore, the Sipadan and Mabul islands are noted diving destinations.</p>
                        <ul style="list-style-type: square;">
                            <label>Highlight:</label>
                            <li>2 Nights Accomodation</li>
                            <li>Daily Buffet Breakfast</li>
                            <li>1 Buffet Dinner</li>
                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>
                        </ul>
                        <div class="row">
                            <div class="col-md-6">
                                <a href="buy-package.html" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            <div class="col-sm-6 col-md-4">
                <div class="thumbnail" >
                    <img src="../img/penang.jpg" class="img-responsive">
                    <div class="caption">
                        <div class="row">
                            <div class="col-md-6 col-xs-6">
                                <h3>Penang Package</h3>
                            </div>
                            <div class="col-md-6 col-xs-6 price">
                                <h3>
                                    <label>RM300</label>
                                </h3>
                            </div>
                        </div>
                        <p>Langkawi, officially known as Langkawi the Jewel of Kedah is an archipelago of 104 islands in the Andaman Sea, some 30 km off the mainland coast of northwestern Malaysia</p>
                        <ul style="list-style-type: square;">
                            <label>Highlight:</label>
                            <li>2 Nights Accomodation</li>
                            <li>Daily Buffet Breakfast</li>
                            <li>1 Buffet Dinner</li>
                            <li>3D2N Mai Langkawi Package is valid until 31 March 2015.</li>
                        </ul>
                        <div class="row">
                            <div class="col-md-6">
                                <a href="buy-package.html" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>






    <jsp:include page="../script.jsp" />
    <script src="../js/masonry.pkgd.min.js"></script>
    <script>

$(document).ready( function() {

  $("#thumbnail-box").masonry({
    itemSelector: '.col-sm-6',
    
  });

});
</script>


</body>
</html>
