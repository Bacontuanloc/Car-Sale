package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.*;
import java.util.*;

public class Register extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String xName,xPass,sRole; int xRole;
        xName = request.getParameter("name").trim();
        xPass=request.getParameter("pass").trim();
        UserDAO u = new UserDAO();
        User x = u.getUser(xName, xPass);
        if(x != null) {
          String  logResult =("<h3> The name " + xName + " already exists!");
           request.setAttribute("mess", logResult);
           request.getRequestDispatcher("/Register.jsp").include(request, response);
           return;
        }

        x = new User(xName,xPass,0);
        u.insert(x);
        String  logResult =("succesfully");
           request.setAttribute("mess", logResult);
           request.getRequestDispatcher("/Register.jsp").include(request, response);
    }
}
