package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import model.*;

//import javax.servlet.annotation.WebServlet;
//@WebServlet(name = "TestServlet", urlPatterns = {"/test"})
public class Search extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String xname = request.getParameter("search");
        CarDAO u = new CarDAO();     
         ArrayList<Car> list = u.getCarByName(xname);
        if(list==null) {
           pr.println("<h2>Car is not found</h2>");
           request.getRequestDispatcher("newjsp.jsp").include(request, response);
        }
        else {
           request.setAttribute("listP", list);
           request.getRequestDispatcher("newjsp.jsp").forward(request, response);
        }
         

    }
}
