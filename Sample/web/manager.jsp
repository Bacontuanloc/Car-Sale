<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="model.*"%> 
<!DOCTYPE html>
<html lang="en">
    <title>Manager ThinhDepTrai</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body {font-family: "Lato", sans-serif}
        .mySlides {display: none}
    </style>

    <body>
        <div class="w3-top">
            <div class="w3-bar w3-black w3-card">
                <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
                <a href="list" class="w3-bar-item w3-button w3-padding-large">HOME</a>
                <a href="#car" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CAR</a>
                <a href="#user" class="w3-bar-item w3-button w3-padding-large w3-hide-small">USER</a>
                <a href="#contact" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
                <a href="#order" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ORDER</a>
                <a href="#detail" class="w3-bar-item w3-button w3-padding-large w3-hide-small">DETAIL</a>
                <a href="home" class="w3-bar-item w3-button w3-padding-large w3-hide-small">TEMPLATE</a>
                <a href="logout" class="w3-padding-large w3-hover-red w3-hide-small w3-right">Logout</a>
            </div>
        </div>

        <!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->
        <div id="navDemo" class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top:46px">
            <a href="#car" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">CAR</a>
            <a href="#user" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">USER</a>
            <a href="#contact" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">CONTACT</a>
        </div>
        <div class="w3-content" style="max-width:2000px;margin-top:46px">
            <div class="w3-container w3-content w3-center w3-padding-64" style="max-width:800px" id="car">
                <h2> List of Cars </h2>
                <table class="table table-striped">
                    <tr>
                        <td> Id </td>
                        <td> Name </td>
                        <td> Image </td>
                        <td> Price</td>
                        <td> Title</td>
                        <td> Description</td>
                        <td> CateID</td>
                        <td colspan="3" align="center"> <a href="insert.html"> Insert </a> </td>
                    </tr>
                    <c:forEach var="x" items="${listP}">  
                        <tr>  
                            <td> ${x.ID} </td>
                            <td> ${x.name} </td>
                            <td> <img src="${x.image}" height="100px" width="100px"> </td>
                            <td> ${x.price} </td> 
                            <td> ${x.title} </td>
                            <td> ${x.description} </td>
                            <td> ${x.cateid} </td>

                            <td><a href="update?carid=${x.ID}">  Edit </a> </td>
                            <td><a href="delete?carid=${x.ID}">  Delete </a> </td>
                        </tr>  
                    </c:forEach>  
                </table>     
            </div>
            <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="user">
                <h2> List of User </h2>
                <table class="table table-striped">
                    <tr>
                        <td> ID </td>
                        <td> USER </td>
                        <td> PASS </td>
                        <td> ADMIN </td>
                        
                       
                    </tr>
                    <c:forEach var="x" items="${listU}">  
                        <tr>  
                            <td> ${x.id} </td>
                            <td> ${x.name} </td>
                            <td> ${x.pass} </td>
                            <td> ${x.role} </td>
                            

                            <td><a href="updateuser?uname=${x.name}">  Edit </a> </td>
                            <td><a href="deleteuser?uname=${x.name}">  Delete </a> </td>
                        </tr>  
                    </c:forEach>  
                </table>     
            </div>
            <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="contact">
                <h2> List of Contact </h2>
                <table class="table table-striped">
                    <tr>
                        <td> ID </td>
                        <td> USER </td>
                        <td> EMAIL </td>
                        <td> MESS </td>


                    </tr>
                    <c:forEach var="x" items="${listC}">  
                        <tr>  
                            <td> ${x.id} </td>
                            <td> ${x.user} </td>
                            <td> ${x.email} </td>
                            <td> ${x.mess} </td>



                        </tr>  
                    </c:forEach>  
                </table>     
            </div>
            
             <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="order">
                <h2> List of Orders </h2>
                <table class="table table-striped">
                    <tr>
                        <td> ID </td>
                        <td> USER </td>
                        <td> MONEY </td>
                        
                       
                    </tr>
                    <c:forEach var="x" items="${listO}">  
                        <tr>  
                            <td> ${x.id} </td>
                            <td> ${x.user} </td>                           
                            <td> ${x.total} </td>       
                        </tr>  
                    </c:forEach>  
                </table>     
            </div>
            <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="detail">
                <h2> List of Detail </h2>
                <table class="table table-striped">
                    <tr>
                        <td> ID </td>
                        <td> USER </td>
                        <td> NAME </td>
                        <td> QUANTITY </td>
                        
                       
                    </tr>
                    <c:forEach var="x" items="${listD}">  
                        <tr>  
                            <td> ${x.oid} </td>
                            <td> ${x.user} </td>
                            <td> ${x.name} </td>
                            <td> ${x.quantity} </td>
                            

                            
                        </tr>  
                    </c:forEach>  
                </table>     
            </div>
           
            
        </div>
        
    </body>
</html>
