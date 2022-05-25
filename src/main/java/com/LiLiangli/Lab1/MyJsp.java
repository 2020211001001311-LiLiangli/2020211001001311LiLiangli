package com.LiLiangli.lab1;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;


class LifeCycleServlet extends HttpServlet {

    private int count=0;
    public void init() throws ServletException {


        System.out.println("i am in init()-->LifeCycleServlet-->");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        count++;
        PrintWriter out = response.getWriter();
        System.out.println("i am in service() -->doGet()");
        out.println("Since loading,this servlet has been accessed "+count+" times");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service() -->doPost()");
    }


    public void destroy() {
        System.out.println("i am in destroy()");

    }
}