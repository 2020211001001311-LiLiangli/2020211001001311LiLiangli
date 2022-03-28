package com.LiLiangli.week5.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        System.err.println(userName+";"+password);
        String myUser = "lll";
        String myPwd = "password";
        if(userName.equals(myUser)&&password.equals(myPwd)) {
            response.sendRedirect(request.getContextPath()+"hello.jsp userName="+userName);
        }else {
            request.setAttribute("message", "账密错误，请重新登录<br>");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

}


