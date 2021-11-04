package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import model.*;

//import javax.servlet.annotation.WebServlet;
//@WebServlet(name = "TestServlet", urlPatterns = {"/test"})
public class DeleteUser extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        UserDAO u = new UserDAO();
        User x = u.getUserByName(uname);
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("currUser");
        if (x == null) {
            out.println("<h2> A User is not found</h2>");
            request.getRequestDispatcher("deleteuser.html").include(request, response);
        } else if (uname.equals(user.getName())) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('you cant delete yourself');");
            out.println("location='list';");
            out.println("</script>");
        } else {
            u.deleteByName(uname);
            response.sendRedirect("list");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        UserDAO u = new UserDAO();
        User x = u.getUserByName(uname);
        if (x == null) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('User is not found');");
            out.println("location='list';");
            out.println("</script>");
                     
        } else {
            u.deleteByName(uname);
            response.sendRedirect("list");
        }

    }
}
