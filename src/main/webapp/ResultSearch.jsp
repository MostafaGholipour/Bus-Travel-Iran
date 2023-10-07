<%@ page import="java.util.List" %>
<%@ page import="com.example.BusTravelIran.entity.Bus" %>
<%@ page import="java.io.PrintWriter" %><%--
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
    <div class="p-3 mb-2 bg-primary text-white rounded-pill">
        <div class="container" dir="rtl">
            <div class="row">
                <div class="col-sm-5 col-md-2 bg-white text-dark rounded-pill text-center"
                     style=": center"><%=request.getParameter("origin")%>
                </div>
                <div class="col-sm-5 col-md-1 text-center" dir="auto"><--Go To</div>
                <div class="col-sm-5 offset-sm-2 col-md-2 bg-white text-dark rounded-pill text-center"><%=request.getParameter("destination")%>
                </div>
                <div class="col-sm-5 col-md-1 text-center" dir="auto">: Move</div>
                <div class="col-sm-5 offset-sm-2 col-md-2 bg-white text-dark rounded-pill text-center"><%=request.getParameter("date")%>
                </div>
            </div>
        </div>
    </div>
    <input type="hidden" name="customerId" value="<%=request.getSession().getAttribute("customerId")%>">
    <ol class="list-group list-group-numbered">
        <% List<Bus> list = (List<Bus>) request.getSession().getAttribute("name");
            if (list != null) {
                for (Bus bus : list) {%>
        <form method="post" action="Ticket">
            <input type="hidden" name="busId" value="<%=bus.getId()%>">
            <li class="list-group-item d-flex justify-content-between align-items-start">
                <div class="ms-2 me-auto">
                    <div class="fw-bold"><%=bus.getTitle()%>
                    </div>
                    Time Move : <%=bus.getTimeMove()%>
                </div>
                <div class="ms-2 me-auto">
                    <div class="fw-bold">Travel ID
                        <%=bus.getId()%>
                    </div>
                </div>
                    <span class="badge bg-primary rounded-pill"> <%=bus.getCapacity() - bus.getTicketList().size() %></span>
                    <div class="btn-group col-md-2" role="group" aria-label="Basic outlined example">
                        <% if ((bus.getCapacity() - bus.getTicketList().size()) > 0) {
                        %>
                        <input type="hidden" name="customerId" value="<%=request.getSession().getAttribute("customerId")%>">
                        <button type="submit" class="btn btn-outline-primary">Buy</button>
                        <% } else { %>
                        <button type="submit" class="btn btn-outline-primary disabled">Completion capacity</button>
                        <% } %>
                    </div>
            </li>
        </form>
        <% } %>
    </ol>

    <%
    } else {
    %>
    <h1><p style="text-align: center">Nothing found </p></h1>
    <% } %>
    <%--  <p><%=request.getParameter("date")%></p>--%>
</div>
</body>
</html>
