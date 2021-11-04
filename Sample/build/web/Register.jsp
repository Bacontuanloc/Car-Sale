
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body {font-family: Arial, Helvetica, sans-serif;
                  background-image: url('img/g63.jpg');
                  background-size: 100%;
            }


            input[type=text], input[type=password] {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }

            button {
                background-color: #04AA6D;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            button:hover {
                opacity: 0.8;
            }

            .cancelbtn {
                width: auto;
                padding: 10px 18px;
                background-color: #f44336;
            }

            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
            }



            .container {
                padding: 16px;
            }

            span.psw {
                float: right;
                padding-top: 16px;
            }
            .container{
                float: left;
                width: 30%;
                color:white;
                background-color: black;
            }

            /* Change styles for span and cancel button on extra small screens */
            @media screen and (max-width: 300px) {
                span.psw {
                    display: block;
                    float: none;
                }
                .cancelbtn {
                    width: 100%;
                }
            }
        </style>
    </head>
    <body>

        <h2>Register Form</h2>
        <form action="register" method="post">




            <div class="container">
                <p class="text-danger">${mess}</p>
                <label for="name"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="name" required>

                <label for="pass"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="pass" required>
                <a href="Login.jsp" class="w3-button" style="color: white; ">Login</a>
                <button type="Submit" value=register" >Register</button>

            </div>



        </div>
    </form>

</body>
</html>