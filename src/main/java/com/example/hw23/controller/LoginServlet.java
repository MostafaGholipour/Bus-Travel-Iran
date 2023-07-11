package com.example.hw23.controller;

import com.example.hw23.entity.Customer;
import com.example.hw23.repository.customer.CustomerRepositoryImpl;
import com.example.hw23.service.customer.CustomerServiceImpl;
import com.sun.deploy.nativesandbox.comm.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "Login" ,value = "/Login")
public class LoginServlet extends HttpServlet {
    CustomerServiceImpl customerService =new CustomerServiceImpl(new CustomerRepositoryImpl());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user=req.getParameter("user");
        String pass=req.getParameter("pass");
        Customer login = customerService.Login(user, pass);
        if(login==null){
            PrintWriter out = resp.getWriter();
            out.println("<html><body>");
            out.println("<h1>" +" NOT Found " + "</h1>");
            out.println("</body></html>");
        }else {
            resp.sendRedirect("http://localhost:63342/HW23/src/main/webapp/Search.html?_ijt=vmmb0m29bajmgdhi3ps3u2ls29&_ij_reload=RELOAD_ON_SAVE");
        }
    }
}
