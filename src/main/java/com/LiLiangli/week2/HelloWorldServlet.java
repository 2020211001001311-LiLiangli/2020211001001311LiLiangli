package com.LiLiangli.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter writer = response.getWriter();
        writer.println("Name: LiLiangli");
        writer.println("ID: 2020211001001311");
        writer.println("Date and Time :Sun, 06 Mar 2022 22:30:45 GMT");

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}