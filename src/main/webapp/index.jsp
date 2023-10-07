<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
            crossorigin="anonymous"></script>
    <link type="text/css" href="login.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
<div class="body"></div>
<div class="grad"></div>
<!-- Image and text -->
<nav class="navbar navbar-light bg-white">
    <a class="navbar-brand" href="#">
        <img src="admin.png" width="30" height="30" class="d-inline-block align-top" alt="">
        Login Admin
    </a>
    <a class="navbar-brand" href="#">
        <img src="drivers.png" width="30" height="30" class="d-inline-block align-top" alt="">
        Login Driver
    </a>
</nav>
<div class="header">
    <div><span>LOGIN</span></div>
</div>
<br>
<div class="login">
    <form name="form" method="post" action="Login" onsubmit="return validateForm();">
    <input type="text" placeholder="username" name="user"><br>
    <input type="password" placeholder="password" name="pass"><br>
    <input type="submit" value="LOGIN">
        <a href="register.jsp" style="font-size: large ;    width: 260px;  height: 35px;">Register</a>
    </form>
</div>
<script>
    function validateForm() {
        var user = document.forms["form"]["user"].value;
        var pass = document.forms["form"]["pass"].value;
        if (user == "") {
            alert("user must be filled out");
            return false;
        }
        if (pass == "") {
            alert("pass must be filled out");
            return false}
    }
</script>
</body>
</html>