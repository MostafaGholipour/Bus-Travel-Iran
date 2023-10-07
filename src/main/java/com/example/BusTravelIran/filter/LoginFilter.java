package com.example.BusTravelIran.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("/Login")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String user = httpServletRequest.getParameter("user");

        if(user != null && user.contains("@")){
            httpServletResponse.sendRedirect("index.jsp");
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
//        if(b=false){
//            filterChain.doFilter(servletRequest,servletResponse);
//            filterChain.doFilter("Search.jsp");
//
//        }


    @Override
    public void destroy() {

    }
}
