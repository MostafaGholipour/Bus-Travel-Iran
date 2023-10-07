package com.example.BusTravelIran.controller;

import com.example.BusTravelIran.entity.Customer;
import com.example.BusTravelIran.repository.customer.CustomerRepositoryImpl;
import com.example.BusTravelIran.service.customer.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class RegisterServlet extends HttpServlet {
    CustomerServiceImpl customerService = new CustomerServiceImpl(new CustomerRepositoryImpl());
    @Override
public void init() throws ServletException {

}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        long nationalcode= Long.parseLong(req.getParameter("nationalcode"));
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        LocalDate date = LocalDate.parse(req.getParameter("age"));

        Customer customer= new Customer();
        customer.setNationalCode(nationalcode);
        customer.setName(name);
        customer.setAge(date);
        customer.setUsername(username);
        customer.setPassword(password);
        customerService.save(customer);
        resp.sendRedirect("index.jsp");
    }


}
