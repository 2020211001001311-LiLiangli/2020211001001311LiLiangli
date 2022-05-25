package com.LiLiangli.Lab1;

import com.LiLiangli.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

public class DisplaysAllParameter {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ID=request.getParameter("ID");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String Email=request.getParameter("Email");
        String Gender=request.getParameter("Gender");
        Date birthday= Date.valueOf(request.getParameter("birthday"));

        User preUser=(User) request.getSession().getAttribute("user");
        preUser.setPassword(password);
        preUser.setUsername(username);
        preUser.setGender(Gender);
        preUser.setBirthDate(birthday);
        preUser.setEmail(Email);}
}
