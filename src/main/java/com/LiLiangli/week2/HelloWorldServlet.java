package com.LiLiangli.week2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
        writer.println("Date and Time :Sun, 06 Mar 2022 11:30:40 GMT");
        System.out.println("i am in HelloWorldServlet->doGet()");

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}