package controller;

import java.io.*;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import model.*;

public class UpdateCar extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        String xid = request.getParameter("carid");
        CarDAO u = new CarDAO();
        Car x = u.getCarById(xid);
        if(x==null) {
           pr.println("<h2> A Car is not found</h2>");
           request.getRequestDispatcher("update.html").include(request, response);
        }
        else {
           request.setAttribute("x", x);
           request.getRequestDispatcher("update.jsp").forward(request, response);
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        CarDAO u = new CarDAO();
        String xid= request.getParameter("xid");
        Car x1;
        
         boolean isOk = true;
        String xName = request.getParameter("xname");
        Car x= u.CheckCar(xName);
        if(xName==null || xName.trim().length()==0) {
           isOk=false;
           return;
         }
       
        
        String ximage = request.getParameter("ximage");
        if(ximage==null || ximage.trim().length()==0) {
           isOk=false;
           return;
         }
        String xPrice = request.getParameter("xprice");
        int sPrice=Integer.parseInt(xPrice);
        if(xPrice==null || xPrice.trim().length()==0) {
           isOk=false;
           return;
         }
        if (sPrice<0) {
           isOk=false;
           return;
        }
        String xtitle = request.getParameter("xtitle");
        if(xtitle==null || xtitle.trim().length()==0) {
           isOk=false;
           return;
         }
        String xdescription = request.getParameter("xdescription");
        if(xdescription==null || xdescription.trim().length()==0) {
           isOk=false;
           return;
         }
        String xcateid = request.getParameter("xcateid");
         if(xcateid==null || xcateid.trim().length()==0) {
           isOk=false;
           return;
         }
        int scateid=Integer.parseInt(xcateid);
         if(scateid>3||scateid<1) {
           isOk=false;
           return;
         }
        
        x1= new Car(xName, ximage, sPrice, xtitle, xdescription, scateid);
        
        if(!isOk) {
          request.setAttribute("x", x1);
          request.getRequestDispatcher("update.jsp").forward(request, response);
          return;
        }
        
        u.update(xid, x1);
        response.sendRedirect("list");
  }
}
