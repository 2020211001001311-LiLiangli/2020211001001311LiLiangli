package com.LiLiangli.week4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = {"/config"},
        initParams = {
        @WebInitParam(name = "name",value = "LiLiangli"),
        @WebInitParam(name="Id",value = "2020211001001311")
        }

)

public class ConfigDemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletConfig config = getServletConfig();
        PrintWriter writer = response.getWriter();

        String name=config.getInitParameter("name");
        String Id=config.getInitParameter("Id");
        writer.println("name: "+name);
        writer.println("Id: "+Id);
        writer.close();


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
