<%@ page import="com.example.BusTravelIran.entity.Customer" %>
<%@ page import="com.example.BusTravelIran.entity.Ticket" %>
<%@ page import="com.example.BusTravelIran.entity.Bus" %><%--
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
<body dir="ltr">
<h1>
</h1>
<div class="body"></div>
<div class="grad"></div>
<div class="parent-div"></div>
<form dir="ltr">
  <table  width="100%">
  <%
    Customer customer = (Customer) request.getSession().getAttribute("customer");
    Ticket  ticket= (Ticket) request.getSession().getAttribute("ticket");
    Bus bus= (Bus) request.getSession().getAttribute("bus");
  %>
  <input type="hidden" name="customerId" value="<%=request.getSession().getAttribute("customerId")%>">

  <input type="hidden" name="busId" value="<%=request.getSession().getAttribute("busId")%>">

    <tr ><td style="width: 50%"> <div dir="ltr" style="font-size: large; margin-top: 5%;"> ID Ticket  :    </div></td>
      <td style="width: 50%"><div dir="rtl" style="font-size: large; margin-top: 5%;">  <%=ticket.getId()%></div></td></tr>



  <tr ><td style="width: 50%"> <div dir="ltr" style="font-size: large; margin-top: 5%;"> name  :         </div></td>
      <td style="width: 50%"><div dir="rtl" style="font-size: large; margin-top: 5%;"><%=customer.getName()%></div></td></tr>
  <tr ><td style="width: 50%"> <div dir="ltr" style="font-size: large; margin-top: 5%;"> Gender  :       </div></td>
      <td style="width: 50%"><div dir="rtl" style="font-size: large; margin-top: 5%;"><%=ticket.getGender()%></div></td></tr>
  <tr ><td style="width: 50%"> <div dir="ltr" style="font-size: large; margin-top: 5%;"> Origin  :       </div></td>
      <td style="width: 50%"><div dir="rtl" style="font-size: large; margin-top: 5%;"><%=bus.getOrigin()%></div></td></tr>
  <tr ><td style="width: 50%"> <div dir="ltr" style="font-size: large; margin-top: 5%;"> Destination  :  </div></td>
      <td style="width: 50%"><div dir="rtl" style="font-size: large; margin-top: 5%;"><%=bus.getDestination()%></div></td></tr>
  <tr ><td style="width: 50%"> <div dir="ltr" style="font-size: large; margin-top: 5%;"> DateMove  :     </div></td>
      <td style="width: 50%"><div dir="rtl" style="font-size: large; margin-top: 5%;"><%=bus.getDateMove()%></div></td></tr>
  <tr ><td style="width: 50%"> <div dir="ltr" style="font-size: large; margin-top: 5%;"> TimeMove  :     </div></td>
      <td style="width: 50%"><div dir="rtl" style="font-size: large; margin-top: 5%;"><%=bus.getTimeMove()%></div></td></tr>
    <tr ><td style="width: 100% ;">
    <button type="submit" class="btn btn-primary px-4 w-20%" style="margin-top: 10%; margin-left: -5%; width: 80%;">Cancel tickets</button>
    </td></tr></div>

  </table>
</form>
</body>
</html>