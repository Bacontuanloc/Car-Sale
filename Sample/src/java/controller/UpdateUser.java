package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.*;

public class UpdateUser extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String uname = request.getParameter("uname");
        UserDAO udao = new UserDAO();
        
        User x = udao.getUserByName(uname);
        if (x == null) {
            pr.println("<h2> User is not found</h2>");
            request.getRequestDispatcher("updateuser.html").include(request, response);
        } else {
            request.setAttribute("x1", x);
            request.getRequestDispatcher("updateuser.jsp").forward(request, response);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String xname = request.getParameter("uname");
        UserDAO udao = new UserDAO();
        User x1;

        boolean isOk = true;
       
        String xpass = request.getParameter("upass");
        
        String xrole = request.getParameter("urole");
        int srole = Integer.parseInt(xrole);
        if (xrole == null || xrole.trim().length() == 0) {
            isOk = false;
            return;
        }
        if (srole < 0||srole>1) {
            isOk = false;
            return;
        }

        x1 = new User(xname, xpass, srole);

        if (!isOk) {
            request.setAttribute("x1", x1);
            request.getRequestDispatcher("updateuser.jsp").forward(request, response);
            return;
        }

        udao.updateByName(x1);
        response.sendRedirect("list");
    }
}
