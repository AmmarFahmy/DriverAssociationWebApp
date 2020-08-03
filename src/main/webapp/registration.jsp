<%-- 
    Document   : registration
    Created on : Aug 3, 2020, 12:59:01 AM
    Author     : ammar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <img class="avatar" src="img/register.png">
                
                <h1>Register Account</h1>
                
                <form action="registerServlet" method="post">
                    
                    <p>Full Name</p>
                    <input type="text" placeholder="Full Name Here" name="fullname" required>
                    
                    <p>E-Mail</p>
                    <input type="text" placeholder="E-Mail" name="email" required>
                    
                    <p>Address</p>
                    <input type="text" placeholder="Address" name="address" required>
                    
                    <p>Date of Birth</p>
                    <input type="text" name="dob" required>
                    
                    <p>Date of Registration</p>
                    <input type="text" name="register">
<!--                    <input type="date" name="register" id="theDate" readonly>-->
                    
                    <p>Password</p>
                    <input type="password" placeholder="Password" name="password" required>
                    
                    <input type="submit" value="Register">
                    
                    <a href="index.jsp">Already have Account?</a>
                </form>
            </div>
        </div>
        
        
<!--    to pick the current date for registration date -->
        <script>
            var date = new Date();

            var day = date.getDate();
            var month = date.getMonth() + 1;
            var year = date.getFullYear();

            if (month < 10) month = "0" + month;
            if (day < 10) day = "0" + day;

            var today = year + "-" + month + "-" + day;       
            document.getElementById("theDate").value = today;
        </script>
    </body>
</html>
