package com.example.hw23.controller;

import com.example.hw23.entity.Bus;
import com.example.hw23.repository.bus.BusRepositoryImpl;
import com.example.hw23.service.bus.BusService;
import com.example.hw23.service.bus.BusServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class BusServlet extends HttpServlet {
    BusService busService=new BusServiceImpl(new BusRepositoryImpl());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String origin =req.getParameter("origin");
        String destination =req.getParameter("destination");
        LocalDate date = LocalDate.parse(req.getParameter("date"));
        List<Bus> list = busService.SearchBus(origin, destination, date);
        req.setAttribute("listbus",list );
        req.setAttribute("origin",origin );
        req.setAttribute("destination",destination );
        req.getSession().setAttribute("date",date);
        req.getSession().setAttribute("name",list);
        String customerId=req.getParameter("customerId");
        req.getSession().setAttribute("customerId",customerId);
        req.getRequestDispatcher("ResultSearch.jsp").forward(req,resp);
        resp.sendRedirect("ResultSearch.jsp");
    }

    @Override
    public void init() throws ServletException {

    }
}
