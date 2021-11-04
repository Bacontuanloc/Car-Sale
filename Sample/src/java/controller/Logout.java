package controller;

import model.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Logout extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter pr = response.getWriter();   
     request.getSession().invalidate();
     pr.print("You have been loggod out!");  
     request.getRequestDispatcher("/Login.jsp").include(request, response);  
     return;
  }

}
