package com.LiLiangli.week3.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = {"/register"})

public class RegisterServlet extends HttpServlet {
    Connection con=null;
    PreparedStatement sql=null;
    ResultSet res=null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer= response.getWriter();
        writer.println("这里是测试");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Id   =request.getParameter("Id");
        String user =request.getParameter("user");
        String password =request.getParameter("password");
        String Email =request.getParameter("Email");
        String sex =request.getParameter("sex");
        String Date=request.getParameter("Date");

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer= response.getWriter();


        //-----------------------
        //   插入数据
        try {
            sql= con.prepareStatement("insert into usertable values(?,?,?,?,?,?)");
            sql.setString(1,Id);
            sql.setString(2,user);
            sql.setString(3,password);
            sql.setString(4,Email);
            sql.setString(5,sex);
            sql.setString(6,Date);

            sql.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //----------------------

        try {
            sql=con.prepareStatement("SELECT * \n" +
                                      "FROM usertable");
            res=sql.executeQuery();


            writer.println("<html>\n" +
                    "<head>\n" +
                    "\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "             <table  border='1'>\n");

            while (res.next()){
                 Id=res.getString("Id");
                 user=res.getString("username");
                 password=res.getString("password");
                 Email=res.getString("email");
                 sex=res.getString("gender");
                 Date=res.getString("birthday");

                         writer.println("<tr>");
                         writer.println("<td>"+Id+"</td>\n");
                         writer.println("<td>"+user+"<td>\n");
                         writer.println("<td>"+password+"<td>\n");
                         writer.println("<td>"+Email+"<td>\n");
                         writer.println("<td>"+sex+"<td>\n");
                         writer.println("<td>"+Date+"<td>\n");
                        writer.println("</tr>");

            }

            writer.println(" </table>\n" +
                    "\n" +
                    "</body>\n" +
                    "\n" +
                    "\n" +
                    "</html>");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



//        writer.println("<br> user:"+user);
//        writer.println("<br> password:"+password);
//        writer.println("<br> Email:"+Email);
//        writer.println("<br> sex:"+sex);
//        writer.println("<br> Date:"+Date);

//        writer.close();
    }

    @Override
    public void init() throws ServletException {
        super.init();

        ServletContext context=getServletContext();
        String driver=context.getInitParameter("driver");
        String url=context.getInitParameter("url");
        String username=context.getInitParameter("username");
        String password=context.getInitParameter("password");
        try {
            Class.forName(driver);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("链接数据库成功");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
