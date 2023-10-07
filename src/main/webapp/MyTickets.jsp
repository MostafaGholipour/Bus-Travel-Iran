<%@ page import="java.util.List" %>
<%@ page import="com.example.hw23.entity.Bus" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.example.hw23.entity.Ticket" %>
<%@ page import="com.example.hw23.service.bus.BusService" %>
<%@ page import="com.example.hw23.service.bus.BusServiceImpl" %>
<%@ page import="com.example.hw23.repository.bus.BusRepositoryImpl" %><%--
  Created by IntelliJ IDEA.
  User: MORTEZA
  Date: 7/16/2023
  Time: 5:22 PM
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
    <link rel="stylesheet" href="resultSearch/Result.css">

</head>
<body>

<div class="body"></div>
<div class="grad"></div>
<div class="form">
    <ol class="list-group list-group-numbered">
        <% List<Ticket> list = (List<Ticket>) request.getSession().getAttribute("tickets");
            BusService busService=new BusServiceImpl(new BusRepositoryImpl());
            if (list.size()>0) {
                for (Ticket ticket : list) {
                    Bus bus = busService.loadById(ticket.getBus().getId());
        %>
        <form method="post" action="ShowTicket">
            <input type="hidden" name="ticketid" value="<%=ticket.getId()%>">
            <li class="list-group-item d-flex justify-content-between align-items-start">
                <div class="ms-2 me-auto">
                    <div class="fw-bold">DateMove :<%=bus.getDateMove()%>
                    </div>
                     <%=bus.getOrigin()%>     ------>    <%=bus.getDestination()%>
                </div>
                <div class="ms-2 me-auto">
                    <div class="fw-bold">Travel ID
                        <%=ticket.getId()%>
                    </div>
                </div>
                    <div class="btn-group col-md-2" role="group" aria-label="Basic outlined example">
                        <button type="submit" class="btn btn-outline-primary">Show Ticket</button>
                    </div>
            </li>

        </form>
        <% } %>
    </ol>

    <%
    } else {
    %>
    <h1><p style="text-align: center"> Nothing found </p></h1>
    <% } %>
    <%--  <p><%=request.getParameter("date")%></p>--%>
</div>
</body>
</html>
