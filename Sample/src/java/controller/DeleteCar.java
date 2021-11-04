package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import model.*;

//import javax.servlet.annotation.WebServlet;
//@WebServlet(name = "TestServlet", urlPatterns = {"/test"})
public class DeleteCar extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String id = request.getParameter("carid");
        CarDAO cdao= new CarDAO();
        Car x = cdao.getCarById(id);
        if(x==null) {
           pr.println("<h2> A Car is not found</h2>");
           request.getRequestDispatcher("delete.html").include(request, response);
        }
        else {
           cdao.delete(id);
           response.sendRedirect("list");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String id = request.getParameter("carid");
        CarDAO cdao= new CarDAO();
        Car x = cdao.getCarById(id);
        if(x==null) {
           pr.println("<h2> A Car is not found</h2>");
           request.getRequestDispatcher("delete.html").include(request, response);
        }
        else {
           cdao.delete(id);
           response.sendRedirect("list");
        }

    }
}
