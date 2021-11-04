package controller;

import model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lonely
 */
public class CartController extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pr = response.getWriter();
        String iAction = request.getParameter("action");

        if (iAction != null && !iAction.equals("")) {
            if (iAction.equals("Add To Cart")) {
                addToCart(request);
            } else if (iAction.equals("Update")) {
                updateCart(request);
            } else if (iAction.equals("Delete")) {
                deleteCart(request);
            } else if (iAction.equals("Order")) {
                Order(request);
            }
        }
        response.sendRedirect("ShoppingCart.jsp");
    }

    protected void deleteCart(HttpServletRequest request) {
        HttpSession session = request.getSession();

        String iSTT = request.getParameter("stt");
        String name = request.getParameter("name");
        CartBean cartBean = null;

        Object iObject = session.getAttribute("cart");
        if (iObject != null) {
            cartBean = (CartBean) iObject;
        } else {
            cartBean = new CartBean();
        }
        cartBean.deleteCart(iSTT);
       
    }

    protected void Order(HttpServletRequest request) {
        HttpSession session = request.getSession();
        OrdersDAO u = new OrdersDAO();
        OrderDetailDAO odd= new OrderDetailDAO();
        CartBean cartBean = null;
        String total = request.getParameter("total");
        int itotal=Integer.parseInt(total);       
        User user = (User) session.getAttribute("currUser");
        orders x= new orders(user.getName(), itotal);
        u.insertOrders(x);
        String oid = u.getOrder();
        Object objCartBean = session.getAttribute("cart");
        cartBean = (CartBean) objCartBean;
        ArrayList<CartItemBean> list = cartBean.getList();
        
        for (CartItemBean cart : list) {
            String iDescription = cart.getDescription();
            int iQuantity = cart.getQuantity();
            String number=Integer.toString(iQuantity);
          odd.insertOrderDetail(oid, user.getName(), iDescription, number);
        }

        String logResult = "ORDER SUCCESSFULLY";
        request.setAttribute("mess", logResult);
        request.getRequestDispatcher("/Login.jsp");
        session.removeAttribute("cart");
    }

    protected void updateCart(HttpServletRequest request) {
        HttpSession session = request.getSession();

        String iQuantity = request.getParameter("quantity");
        String iSTT = request.getParameter("stt");
        String name = request.getParameter("name");

        CartBean cartBean = null;

        Object objCartBean = session.getAttribute("cart");
        if (objCartBean != null) {
            cartBean = (CartBean) objCartBean;
        } else {
            cartBean = new CartBean();
        }
        cartBean.updateCart(iSTT, iQuantity);

    }

    protected void addToCart(HttpServletRequest request) {
        HttpSession session = request.getSession();

        String iDescription = request.getParameter("description");
        String iImage = request.getParameter("image");
        String iPrice = request.getParameter("price");
        String iQuantity = request.getParameter("quantity");

        CartBean cartBean = null;

        Object objCartBean = session.getAttribute("cart");

        if (objCartBean != null) {
            cartBean = (CartBean) objCartBean;
            ArrayList<CartItemBean> list = cartBean.getList();
            for (CartItemBean cart : list) {
                if (cart.getDescription().equals(iDescription)) {
                    return;
                }
            }
        } else {
            cartBean = new CartBean();
            session.setAttribute("cart", cartBean);
        }

        cartBean.addCart(iDescription, iImage, iPrice, iQuantity);

    }
}
