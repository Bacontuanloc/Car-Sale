<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.User"%> 
<!DOCTYPE html>
<html lang="en">
    <title>ThinhDepTrai</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body {font-family: "Lato", sans-serif}
        .mySlides {display: none}
    </style>

    <body>  


        <!-- Navbar -->
        <div class="w3-top">
            <div class="w3-bar w3-black w3-card">
                <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
                <a href="home" class="w3-bar-item w3-button w3-padding-large">HOME</a>
                <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ABOUT US</a>
                <a href="#tour" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CAR</a>
                <a href="#contact" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
                <a href="logout" class="w3-padding-large w3-hover-red w3-hide-small w3-right" style="text-decoration: none;">LOGOUT</a>
                <a href="${pageContext.request.contextPath }/ShoppingCart.jsp" class="w3-padding-large w3-hover-red w3-hide-small w3-right" >CART</a>
                
            </div>
        </div>

        <!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->
        <div id="navDemo" class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top:46px">
            <a href="#band" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">BAND</a>
            <a href="#tour" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">TOUR</a>
            <a href="#contact" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">CONTACT</a>
        </div>

        <!-- Page content -->
        <div class="w3-content" style="max-width:2000px;margin-top:46px">

            <!-- Automatic Slideshow Images -->
            <div class="mySlides w3-display-container w3-center">
                <img src="img/2020_ferrari_f8_spider_orhy.jpg" style="width:100%">
                <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
                    <h3>Ferrari</h3>
                    <p><b>A car is like a daughter, when it wins a race I feel like a father who knows that his daughter got
                            top grades at school.</b>
                        <br>
                        <b>Enzo Ferrari</b></p>   
                </div>
            </div>
            <div class="mySlides w3-display-container w3-center">
                <img src="img/lamborghini-sian-roadster-VNE-9_1594277287.jpg" style="width:100%">
                <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
                    <h3>Lamborghini</h3>
                    <p><b> When I miss the sound and the fury, I take refuge in my garage and turn the key in the ignition of my Miura </b>
                        <br><b>Ferruccio Lamborghini</b></p>    
                </div>
            </div>
            <div class="mySlides w3-display-container w3-center">
                <img src="img/2021-porsche-911-turbo-s-china-20th-anniversary-edition-1-1619079611.jpg" style="width:100%">
                <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
                    <h3>Porsche</h3>
                    <p><b>Good design should be honest </b>
                        <br>
                        <b>Ferdinand Porsche</b></p>    
                </div>
            </div>

            <!-- The Band Section -->
            <div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="band">
                <h2 class="w3-wide">THINH HYPERCAR</h2>
                <p class="w3-opacity"><i>We love music</i></p>
                <p class="w3-justify">Cornering is like bringing a woman to a climax. 
                    Both you and the car must work together. 
                    You start to enter the area of excitement at the corner,
                    you set up a pace which is right for the car and after you've told it it is coming along with you, 
                    you guide it along at a rhythm which has by now become natural.
                    Only after you've cleared the corner you can both take pleasure in knowing it's gone well.</p>
                <div class="w3-row w3-padding-32">
                    <div class="w3-third">
                        <p>Ferdinand Porsche</p>
                        <img src="img/438px-Ferdinand_Porsche.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:60%"style="height: 60%" >
                    </div>
                    <div class="w3-third">
                        <p>Enzo Ferrari</p>
                        <img src="img/enzo-ferrari.jpg" class="w3-round w3-margin-bottom" alt="Random Name" style="width:60%" style="height: 60%">
                    </div>
                    <div class="w3-third">
                        <p>Ferruccio Lamborghini</p>
                        <img src="img/Ferruccio_Lamborghini.jpg" class="w3-round" alt="Random Name" style="width:60%"style="height: 60%">
                    </div>
                </div>
            </div>

            <!-- The Tour Section -->
            <div class="w3-black" id="tour">
                <div class="w3-container w3-content w3-padding-64" style="max-width:800px">
                    <h2 class="w3-wide w3-center">HYPER CAR LIST</h2>
                    <p class="w3-opacity w3-center"><i>Remember to buy Car</i></p><br>
                    <div class="w3-bar w3-black w3-card">
                    <form class="example" action="search" method="post">
                        <input type="text" placeholder="Search.." name="search" value="" >
                        <button type="submit"><i class="fa fa-search"></i></button>
                    </form>
                    <div class="w3-dropdown-hover w3-hide-small">
                        <button class="w3-padding-large w3-button" title="More">CATEGORY <i class="fa fa-caret-down"></i></button>     
                        <div class="w3-dropdown-content w3-bar-block w3-card-4">
                            <ul class="w3-ul w3-border w3-white w3-text-grey">
                                <c:forEach items="${listC}" var="o">
                                    <li class="w3-padding" ><a href="category?cid=${o.cid}"> ${o.cname} </a></li>
                                    </c:forEach>
                            </ul>
                        </div>


                    </div>
                    <div class="w3-dropdown-hover w3-hide-small">
                        <button class="w3-padding-large w3-button" title="More">PRICE <i class="fa fa-caret-down"></i></button>     
                        <div class="w3-dropdown-content w3-bar-block w3-card-4">
                            <ul class="w3-ul w3-border w3-white w3-text-grey">
                                <form  action="select" method="post">
                                    <ul class="w3-ul w3-border w3-white w3-text-grey">
                                        <li class="w3-padding" style="background-color: black; color: white;"> <input type="submit" name="action" value="LOW"style="background-color: black; color: white;"></li>
                                       <li class="w3-padding" style="background-color: black; color: white;"><input type="submit" name="action" value="HIGH"style="background-color: black; color: white;"></li>
                                    </ul>
                                </form>

                        </div>


                    </div>
                    </div>

                    <div class="w3-row-padding w3-padding-32" style="margin:0 -16px">
                        <c:forEach items="${listP}" var="o">

                            <div class="w3-third w3-margin-bottom">
                                <form method="POST" action="CartController">
                                    <img src="${o.image}"  style="width:100%"  class="w3-hover-opacity"><input type="hidden" name="image" value="${o.image}"><br/>
                                    <div class="w3-container w3-white">
                                        ${o.name}<input type="hidden" name="description" value="${o.name}"><br/>

                                        Quantity:<input type="number" name="quantity" value="1"><br/> 
                                        Price: ${o.price}<input type="hidden" name="price" value="${o.price}"><br/>

                                        <input class="w3-button w3-black w3-margin-bottom"type="submit" name="action" value="Add To Cart">
                                    </div>
                                </form>

                            </div>
                        </c:forEach>

                    </div>
                </div>
            </div>




            <!-- The Contact Section -->
            <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="contact">
                <h2 class="w3-wide w3-center">CONTACT</h2>
                <p class="w3-opacity w3-center"><i>Fan? Drop a note!</i></p>
                <div class="w3-row w3-padding-32">
                    <div class="w3-col m6 w3-large w3-margin-bottom">
                        <i class="fa fa-map-marker" style="width:30px"></i> Chicago, US<br>
                        <i class="fa fa-phone" style="width:30px"></i> Phone: +00 151515<br>
                        <i class="fa fa-envelope" style="width:30px"> </i> Email: thinhvdhe150056@fpt.edu.vn<br>
                    </div>



                    <div class="w3-col m6">
                        
                        <form action="contact" target="_blank" method="post">
                            <p class="text-danger">${mess}</p>
                            <div class="w3-row-padding" style="margin:0 -16px 8px -16px">

                                <div class="w3-half">
                                    <input class="w3-input w3-border" type="text" placeholder="Email" required name="Email">
                                </div>
                            </div>
                            <input class="w3-input w3-border" type="text" placeholder="Message" required name="Message">
                            <button class="w3-button w3-black w3-section w3-right" type="submit">SEND</button>
                        </form>

                    </div>
                </div>
            </div>

            <!-- End Page Content -->
        </div>



        <!-- Footer -->
        <footer class="w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge">
            <i class="fa fa-facebook-official w3-hover-opacity"></i>
            <i class="fa fa-instagram w3-hover-opacity"></i>
            <i class="fa fa-snapchat w3-hover-opacity"></i>
            <i class="fa fa-pinterest-p w3-hover-opacity"></i>
            <i class="fa fa-twitter w3-hover-opacity"></i>
            <i class="fa fa-linkedin w3-hover-opacity"></i>
            <p class="w3-medium">Powered by <a href="https://www.facebook.com/fudo.yusei.393/" target="_blank">THINH</a></p>
        </footer>

        <script>
            // Automatic Slideshow - change image every 4 seconds
            var myIndex = 0;
            carousel();

            function carousel() {
                var i;
                var x = document.getElementsByClassName("mySlides");
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                myIndex++;
                if (myIndex > x.length) {
                    myIndex = 1
                }
                x[myIndex - 1].style.display = "block";
                setTimeout(carousel, 4000);
            }

            // Used to toggle the menu on small screens when clicking on the menu button
            function myFunction() {
                var x = document.getElementById("navDemo");
                if (x.className.indexOf("w3-show") == -1) {
                    x.className += " w3-show";
                } else {
                    x.className = x.className.replace(" w3-show", "");
                }
            }

            // When the user clicks anywhere outside of the modal, close it

        </script>

    </body>
</html>
