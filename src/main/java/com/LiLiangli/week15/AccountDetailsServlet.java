package com.LiLiangli.week15;

import com.LiLiangli.dao.UserDao;
import com.LiLiangli.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "AccountDetailsServlet", value = "/accountDetails")
public class AccountDetailsServlet<OrderDao> extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException {
        con=(Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession(false);
        if(session!=null && session.getAttribute("User")!=null){
            User user= (User) session.getAttribute("user");
            int id=user.getId();
            UserDao dao=new UserDao();

            try {
                user=dao.findById(con,id);
                request.setAttribute("user",user);
                request.getRequestDispatcher("WEB-INF/views/accountDetails.jsp").forward(request,response);


            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else {
            response.sendRedirect("login");
        }


    }


}
