package controller;

import model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        request.getRequestDispatcher("/Login.jsp").include(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String xName = request.getParameter("name");
        String xPass = request.getParameter("pass");
        User x = null;
        UserDAO t = new UserDAO();
        x = t.getUser(xName, xPass);
        request.getSession().setAttribute("currUser", x);
        String logResult = "";
        if (x == null) {
            logResult = "Sorry, username and/or password are/is invalid!";
            request.setAttribute("mess", logResult);
            request.getRequestDispatcher("/Login.jsp").include(request, response);
            return;
        } else if (x.getRole() == 0) {

            request.getRequestDispatcher("home").include(request, response);
            return;
        }

        request.getRequestDispatcher("list").include(request, response);

    }
}
