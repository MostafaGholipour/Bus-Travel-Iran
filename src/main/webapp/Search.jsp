<%--
  Created by IntelliJ IDEA.
  User: MORTEZA
  Date: 7/16/2023
  Time: 5:17 PM
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
<h1>
</h1>
<div class="body"></div>
<div class="grad"></div>
<div class="parent-div">
<form class="form" method="post" action="MyTicketServlet" style="width: 100%; height: 8%; margin-left: 0% ; margin-top: 0%;" dir="ltr">
    <button type="submit" class="btn btn-warning" style="width: 10%; margin-top: 20%; margin-left: 0%">MY tickets</button>
    <div> <input type="hidden" name="customerId" value="<%=request.getSession().getAttribute("customerId")%>"></div>
</form>
    <form class="form" name="form" action="BusResult" method="post" onsubmit="return validateForm()">
        <input type="hidden" name="customerId" value="<%=request.getSession().getAttribute("customerId")%>">
        <p class="title">Buy tickets online</p>
        <p class="text">Search among all terminals and passenger companies</p>
        <div class="mb-3 my-3">
            <label for="InputFrom" class="form-label">Start City</label>
            <!--            <input  class="form-control" id="InputFrom" dir="rtl">-->
            <select class="form-select" aria-label="Default select example" id="InputFrom" dir="rtl" name="origin">
                <option selected>please Select</option>
                <option value="Tehran">Tehran</option>
                <option value="Mashhad">Mashhad</option>
                <option value="Tabriz">Tabriz</option>
            </select>

        </div>

        <div class="mb-3 my-3">
            <label for="InputDestination" class="form-label">Destination city</label>
            <select class="form-select" aria-label="Default select example" id="InputDestination" dir="rtl"
                    name="destination">
                <option selected>please Select</option>
                <option value="Tehran">Tehran</option>
                <option value="Mashhad">Mashhad</option>
                <option value="Tabriz">Tabriz</option>
            </select>
        </div>
        <div class="mb-3 my-3">
            <label for="date" class="form-label">Move</label>
            <input type="date" class="form-control" id="date" name="date">
        </div>
        <button type="submit" class="btn btn-primary px-4 w-">Search</button>
    </form>
    <script>
        function validateForm() {
            var origin = document.forms["form"]["origin"].value;
            var destination = document.forms["form"]["destination"].value;
            var date = document.forms["form"]["date"].value;

            if (origin == "please Select") {
                alert("origin must be filled out");
                return false;
            }
            if (destination == "please Select") {
                alert("destination must be filled out");
                return false;
            }
            if (date == "") {
                alert("date must be filled out");
                return false;
            }
        }
    </script>
</div>
</body>
</html>
