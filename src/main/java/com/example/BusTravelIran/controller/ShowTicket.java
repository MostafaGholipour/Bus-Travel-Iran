package com.example.BusTravelIran.controller;

import com.example.BusTravelIran.entity.Bus;
import com.example.BusTravelIran.entity.Customer;
import com.example.BusTravelIran.entity.Ticket;
import com.example.BusTravelIran.repository.bus.BusRepositoryImpl;
import com.example.BusTravelIran.repository.customer.CustomerRepositoryImpl;
import com.example.BusTravelIran.repository.ticket.TicketRepositoryImpl;
import com.example.BusTravelIran.service.bus.BusServiceImpl;
import com.example.BusTravelIran.service.customer.CustomerServiceImpl;
import com.example.BusTravelIran.service.ticket.TicketServiceImpl;

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
