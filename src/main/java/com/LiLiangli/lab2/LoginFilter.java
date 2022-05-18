package com.LiLiangli.lab2;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns={"/login.jsp","/welcome.jsp"})

public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        System.out.println("I am in LoginFilter-->inint()");
    }

    public void destroy() {
        System.out.println("I am in LoginFilter-->destory()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(request, response);
        System.out.println("I am in LoginFilter--doFilter-- request before chain");
        System.out.println("I am in LoginFilter--destory()-- response after chain");

        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals(username)&&password.equals(password)) {
            request.getRequestDispatcher("lab2/welcome.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }
}
