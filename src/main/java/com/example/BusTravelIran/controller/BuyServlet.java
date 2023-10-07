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

public class BuyServlet extends HttpServlet {
    TicketServiceImpl ticketService = new TicketServiceImpl(new TicketRepositoryImpl());
    CustomerServiceImpl customerService = new CustomerServiceImpl(new CustomerRepositoryImpl());
    BusServiceImpl busService = new BusServiceImpl(new BusRepositoryImpl());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long busId = Long.parseLong(req.getParameter("busId"));
        Long customerId = Long.parseLong(req.getParameter("customerId"));
        String name=req.getParameter("name");
        String gender= req.getParameter("gender");
        Bus bus = busService.loadById(busId);
        Customer customer = customerService.loadById(customerId);
        System.out.println(busService.loadById(busId));
        System.out.println("-------------------------------");
        System.out.println(customerService.loadById(customerId));
        Ticket ticket = new Ticket();
        ticket.setBus(bus);
        ticket.setCustomer(customer);
        ticket.setGender(gender);
        ticket.setName(name);
        ticketService.save(ticket);
        req.getRequestDispatcher("Search.jsp").forward(req,resp);
        resp.sendRedirect("Search.jsp");
    }
}
