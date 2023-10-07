package com.example.hw23.controller;

import com.example.hw23.entity.Customer;
import com.example.hw23.entity.Ticket;
import com.example.hw23.repository.customer.CustomerRepositoryImpl;
import com.example.hw23.service.customer.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class MyTicketServlet extends HttpServlet {
    CustomerServiceImpl customerService = new CustomerServiceImpl(new CustomerRepositoryImpl());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long customerId = Long.parseLong(req.getParameter("customerId"));
        Customer customer = customerService.loadById(customerId);
        List<Ticket> tickets=customer.getTickets();
        req.getSession().setAttribute("tickets",tickets);
        req.getSession().setAttribute("customer",customer);
        req.getRequestDispatcher("MyTickets.jsp").forward(req,resp);
        resp.sendRedirect("MyTickets.jsp");
    }
}
