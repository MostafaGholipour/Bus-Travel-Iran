package com.example.hw23.controller;

import com.example.hw23.entity.Bus;
import com.example.hw23.entity.Customer;
import com.example.hw23.entity.Ticket;
import com.example.hw23.repository.bus.BusRepositoryImpl;
import com.example.hw23.repository.customer.CustomerRepositoryImpl;
import com.example.hw23.repository.ticket.TicketRepositoryImpl;
import com.example.hw23.service.bus.BusServiceImpl;
import com.example.hw23.service.customer.CustomerServiceImpl;
import com.example.hw23.service.ticket.TicketServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ShowTicket extends HttpServlet {
    TicketServiceImpl ticketService = new TicketServiceImpl(new TicketRepositoryImpl());
    CustomerServiceImpl customerService = new CustomerServiceImpl(new CustomerRepositoryImpl());
    BusServiceImpl busService = new BusServiceImpl(new BusRepositoryImpl());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long ticketid = Long.parseLong(req.getParameter("ticketid"));
        Ticket ticket = ticketService.loadById(ticketid);
        Bus bus = busService.loadById(ticket.getBus().getId());
        Customer customer = customerService.loadById(ticket.getCustomer().getId());
        req.getSession().setAttribute("ticket",ticket);
        req.getSession().setAttribute("bus",bus);
        req.getSession().setAttribute("customer",customer);
        req.getRequestDispatcher("ShowTicket.jsp");
        resp.sendRedirect("ShowTicket.jsp");
    }
}
