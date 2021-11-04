package controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import model.*;
import java.util.*;

public class Insert extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        CarDAO u = new CarDAO();
        Car x;
        ArrayList<Car> list= u.getCar();
        String xName = request.getParameter("xname");
        if(xName==null || xName.trim().length()==0) {
           pr.print("<h3> The name must not be empty!");
           request.getRequestDispatcher("insert.html").include(request, response);
           return;
         }
         for (Car car : list) {
             if (car.getName().equals(xName)) {
            pr.print("<h3> The name is already exits!");
            request.getRequestDispatcher("insert.html").include(request, response);
            return;
              }
        }
        String ximage = request.getParameter("ximage");
        if(ximage==null || ximage.trim().length()==0) {
           pr.print("<h3> The image must not be empty!");
           request.getRequestDispatcher("insert.html").include(request, response);
           return;
         }
        String xPrice = request.getParameter("xprice");
        int sPrice=Integer.parseInt(xPrice);
        if(xPrice==null || xPrice.trim().length()==0) {
           pr.print("<h3> The price must not be empty!");
           request.getRequestDispatcher("insert.html").include(request, response);
           return;
         }
        if (sPrice<0) {
            pr.print("<h3> The price must not be negative!");
           request.getRequestDispatcher("insert.html").include(request, response);
           return;
        }
        String xtitle = request.getParameter("xtitle");
        if(xtitle==null || xtitle.trim().length()==0) {
           pr.print("<h3> The name must not be empty!");
           request.getRequestDispatcher("insert.html").include(request, response);
           return;
         }
        String xdescription = request.getParameter("xdescription");
        if(xdescription==null || xdescription.trim().length()==0) {
           pr.print("<h3> The name must not be empty!");
           request.getRequestDispatcher("insert.html").include(request, response);
           return;
         }
        String xcateid = request.getParameter("xcateid");

        int scateid=Integer.parseInt(xcateid);

        x= new Car(xName, ximage, sPrice, xtitle, xdescription, scateid);
        u.insertCar(x);
        
        response.sendRedirect("list");
    }
}
