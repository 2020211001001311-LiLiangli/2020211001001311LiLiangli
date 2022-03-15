package com.LiLiangli.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user =request.getParameter("user");
        String password =request.getParameter("password");
        String Email =request.getParameter("Email");
        String sex =request.getParameter("sex");
        String Date=request.getParameter("Date");


        PrintWriter writer= response.getWriter();
        writer.println("<br> user:"+user);
        writer.println("<br> password:"+password);
        writer.println("<br> Email:"+Email);
        writer.println("<br> sex:"+sex);
        writer.println("<br> Date:"+Date);

        writer.close();
    }
}
