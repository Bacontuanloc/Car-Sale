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
            User x = (User) request.getAttribute("x1");
            if (x == null) {
                return;
            }
        %>    
        <h2> Update a User </h2>
        <form action="updateuser" method="POST">
            <table class="table table-striped">
             <input type="hidden" name="uname" value="<%= x.getName()%>">  
               <td>  Pass <p><input type="text" name="upass" value="<%= x.getPass()%>"> </td>
               <td>  Role<p><input type="text" name="urole" value="<%=x.getRole()%>">  </td>
             <td><input type="submit" value="Update">  </td>
            </table>
        </form>  
        <p><button onclick='window.history.go(-1);'>Back to previous page</button>
        <p><a href="list">Back to homepage</a>
            </center>
    </body>
</html>
