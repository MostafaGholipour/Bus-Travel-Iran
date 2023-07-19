<%--
  Created by IntelliJ IDEA.
  User: MORTEZA
  Date: 7/17/2023
  Time: 1:27 PM
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
  <link rel="stylesheet" href="ticket.css">

</head>
<body>
<h1>
</h1>
<div class="body"></div>
<div class="grad"></div>
<div class="parent-div"></div>
<form action="Buy" method="post">
  <input type="hidden" name="customerId" value="<%=request.getSession().getAttribute("customerId")%>">

  <input type="hidden" name="busId" value="<%=request.getSession().getAttribute("busId")%>">

  <div dir="rtl" style="font-size: x-large; margin-top: 5%;"> name  :</div>
  <div style="margin-top: 5%; margin-left: 10%; width: 80%;"><input type="text" class="form-control" id="date" name="name"></div>

  <div dir="rtl" style="font-size: x-large; margin-top: 5%;"> gender  :</div>
  <div class="form-check" style="font-size: x-large; text-align: center; margin-left: -5%;">
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="woman">
      <label class="form-check-label" for="inlineRadio1">woman</label>
    </div>
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="Man">
      <label class="form-check-label" for="inlineRadio2">Man</label>
    </div><br>
<%--    <input type="hidden" name="busid" value="<% request.getSession().getAttribute("busid"); %>">--%>
<%--    <input type="hidden" name="customerid" value="<% request.getSession().getAttribute("customerId"); %>">--%>
    <button type="submit" class="btn btn-primary px-4 w-20%" style="margin-top: 10%; margin-left: -5%; width: 80%;">Buy</button>
  </div>
</form>
</body>
</html>