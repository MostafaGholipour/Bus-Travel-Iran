package com.example.BusTravelIran.controller;

import com.example.BusTravelIran.repository.bus.BusRepositoryImpl;
import com.example.BusTravelIran.service.bus.BusServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TicketServlet extends HttpServlet {
    BusServiceImpl busService = new BusServiceImpl(new BusRepositoryImpl());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerId=req.getParameter("customerId");
        String busId=req.getParameter("busId");
        req.getSession().setAttribute("customerId",customerId);
        req.getSession().setAttribute("busId",busId);
        req.getRequestDispatcher("ticket.jsp").forward(req,resp);
        resp.sendRedirect("ticket.jsp");
    }
}
