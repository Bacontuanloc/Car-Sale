<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.*" %>
<!DOCTYPE html>
<html>
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
    <center>

        <%
            Car x = (Car) request.getAttribute("x");
            if (x == null) {
                return;
            }

        %>    
        <h2> Update a student </h2>
        <form action="update" method="POST">
            <table class="table table-striped">
                <p><input type="hidden" name="xid" value="<%= x.getID()%>"> 
                <td> Name <p><input type="text" name="xname" value="<%= x.getName()%>"> <br></td>
                <td> Image <p><input type="text" name="ximage" value="<%= x.getImage()%>"> <br></td>
                <td>  Price <p><input type="text" name="xprice" value="<%= x.getPrice()%>"> <br></td>
                <td>  Title <p><input type="text" name="xtitle" value="<%= x.getTitle()%>"> <br></td>
                <td> Description <p><input type="text" name="xdescription" value="<%= x.getDescription()%>"> <br></td>
                <td> CateID <p><input type="text" name="xcateid" value="<%= x.getCateid()%>"> <br></td>


            </table>
            <p><input type="submit" value="Update">
        </form>  
        <p><button onclick='window.history.go(-1);'>Back to previous page</button>
        <p><a href="list">Back to homepage</a>
    </center>>
</body>
</html>
