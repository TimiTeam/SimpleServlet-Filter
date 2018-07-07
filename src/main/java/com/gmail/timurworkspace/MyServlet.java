package com.gmail.timurworkspace;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/service")
public class MyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = null;
        int age = 0;
        int id = 0;

        try {
            name = req.getParameter("name");
            age = Integer.parseInt(req.getParameter("age"));
            id = Integer.parseInt(req.getParameter("id"));
        }catch (Exception e){
            e.getMessage();
        }


        if(name != null && age != 0){
            req.setAttribute("name",name);
            req.setAttribute("age",age);

            req.getRequestDispatcher("result.jsp")
            .forward(req,resp);
        }
        else {
            req.getRequestDispatcher("error.jsp").
                    forward(req, resp);
        }
    }
}
