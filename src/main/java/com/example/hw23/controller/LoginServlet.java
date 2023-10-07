package com.example.hw23.controller;
import com.example.hw23.entity.Customer;
import com.example.hw23.repository.customer.CustomerRepositoryImpl;
import com.example.hw23.service.customer.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
            out.println("<h1>" +" NOT " + "</h1>");
            out.println("</body></html>");
        }else {
//            String s= String.valueOf(login.getId());
//            req.setAttribute("customerId","ssssss");
            req.getSession().setAttribute("customerId",login.getId());
            req.getRequestDispatcher("Search.jsp").forward(req,resp);
            Cookie user1 =new Cookie("user",user);
            resp.addCookie(user1);
            Cookie pass1 =new Cookie("pass",pass);
            resp.addCookie(pass1);
//            resp.sendRedirect("Search.jsp");
        }
    }
}
