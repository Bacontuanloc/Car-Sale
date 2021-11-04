<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
       
    </style>

    <body>
        
   
        <center>
            <h2>Shopping Cart</h2>
            <a href="${pageContext.request.contextPath }/home" >Home</a> 
             <table class="table table-striped">
                <tr bgcolor="#CCCCCC">
                    <td>Description</td>
                    <td>Image</td>
                    <td>Quantity</td>
                    <td>Unit Price </td>
                    <td>Total</td>
                </tr>
                <jsp:useBean id="cart" scope="session" class="model.CartBean" />

                <c:if test="${cart.lineItemCount == 0}">
                    <tr> <td colspan="4">- Cart is currently empty -</td></tr>
                </c:if>

                <c:forEach var="cartItem" items="${cart.list}" varStatus="counter">
                    <form name="item" method="POST" action="CartController">
                        <tr>
                            <td><c:out value="${cartItem.description}"/><input type='hidden' name='name' value='${cartItem.description}'></td>
                            <td><img src="${cartItem.image}" height="100px" width="100px"></td>
                            <td>
                                <input type='hidden' name='stt' value='<c:out value="${counter.count}"/>'>
                                <input type='number' name="quantity" value='<c:out value="${cartItem.quantity}"/>'> 
                                <input type="submit" name="action" value="Update">
                                <input type="submit" name="action" value="Delete">
                            </td>
                            <td>$<c:out value="${cartItem.price}"/></td>
                            <td>$<c:out value="${cartItem.totalCost}"/></td>
                        </tr>
                    </form>
                </c:forEach>
                <!--Total-->
                <tr>
                    <td colspan="4"> </td>
                    <td> Subtotal: $<c:out value="${cart.total}"/></td>
                </tr>
            </table>
                    
                
               
        </center>
                
    </body>
</html>