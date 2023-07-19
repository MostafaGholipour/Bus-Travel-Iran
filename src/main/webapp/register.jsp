<%--
  Created by IntelliJ IDEA.
  User: MORTEZA
  Date: 7/16/2023
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
            crossorigin="anonymous"></script>
    <title>login panel</title>
    <link rel="stylesheet" href="search/Search.css">

</head>
<body>
<div class="body"></div>
<div class="grad"></div>
<div class="parent-div">
    <form name="form" action="register" method="post" onsubmit="return validateForm()">
        <div class="mb-3 my-3">
            <label for="InputFrom" class="form-label">Name :</label>
            <!--            <input  class="form-control" id="InputFrom" dir="rtl">-->
            <input class="form-control" id="InputFrom" dir="rtl" name="name">
        </div>
        <div class="mb-3 my-3"><label for="nationalcode" class="form-label">NationalCode : </label>
            <input class="form-control" dir="rtl" id="nationalcode" name="nationalcode" placeholder="NationalCode">
        </div>
        <div class="mb-3 my-3"><label for="age" class="form-label"> Date of birth :</label>
            <input type="date" class="form-control" id="age" dir="rtl" name="age" placeholder="تاریخ تولد ">
        </div>
        <div class="mb-3 my-3">
            <label for="username" class="form-label">Username and Password</label>
            <input class="form-control" dir="rtl" name="username" placeholder="Username" id="username">
        </div>
        <div class="mb-3 my-3">
            <input class="form-control" dir="rtl" name="password" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-primary px-4 w-">Register</button>
    </form>
    <script>
        function validateForm() {
            var name = document.forms["form"]["name"].value;
            var nationalcode = document.forms["form"]["nationalcode"].value;
            var age = document.forms["form"]["age"].value;
            var Username = document.forms["form"]["username"].value;
            var password = document.forms["form"]["password"].value;

            if (name == "") {
                alert("name must be filled out");
                return false;
            }
            if (nationalcode == "") {
                alert("nationalcode must be filled out");
                return false;
            }
            if (age == "") {
                alert("age must be filled out");
                return false;
            }
            if (Username == "") {
                alert("Username must be filled out");
                return false;
            }
            if (password == "") {
                alert("password must be filled out");
                return false;
            }
        }
    </script>

</div>
</body>
</html>