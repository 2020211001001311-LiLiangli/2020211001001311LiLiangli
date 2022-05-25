package com.LiLiangli.Lab1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServletLifeCycle {

    public void init() throws ServletException {


        System.out.println("i am in init()-->LifeCycleServlet-->");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service() -->doGet()");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service() -->doPost()");
    }


    public void destroy() {
        System.out.println("i am in destroy()");

    }
    static class NoteBook{

        NoteBook(){
            System.out.println("I Am Default constructor");
        }
        public void mymethod()
        {
            System.out.println("Void method of the class");
        }
        public static void main(String args[]){

            NoteBook obj = new NoteBook();
            obj.mymethod();
        }
    }
}
