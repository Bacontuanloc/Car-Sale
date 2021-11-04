package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <title>ThinhDepTrai</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <style>\n");
      out.write("        body {font-family: \"Lato\", sans-serif}\n");
      out.write("        .mySlides {display: none}\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <body>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <div class=\"w3-top\">\n");
      out.write("            <div class=\"w3-bar w3-black w3-card\">\n");
      out.write("                <a class=\"w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right\" href=\"javascript:void(0)\" onclick=\"myFunction()\" title=\"Toggle Navigation Menu\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <a href=\"home\" class=\"w3-bar-item w3-button w3-padding-large\">HOME</a>\n");
      out.write("                <a href=\"#band\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">ABOUT US</a>\n");
      out.write("                <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CAR</a>\n");
      out.write("                <a href=\"#contact\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CONTACT</a>\n");
      out.write("                <a href=\"logout\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\" style=\"text-decoration: none;\">LOGOUT</a>\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/ShoppingCart.jsp\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\" >CART</a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->\n");
      out.write("        <div id=\"navDemo\" class=\"w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top\" style=\"margin-top:46px\">\n");
      out.write("            <a href=\"#band\" class=\"w3-bar-item w3-button w3-padding-large\" onclick=\"myFunction()\">BAND</a>\n");
      out.write("            <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large\" onclick=\"myFunction()\">TOUR</a>\n");
      out.write("            <a href=\"#contact\" class=\"w3-bar-item w3-button w3-padding-large\" onclick=\"myFunction()\">CONTACT</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Page content -->\n");
      out.write("        <div class=\"w3-content\" style=\"max-width:2000px;margin-top:46px\">\n");
      out.write("\n");
      out.write("            <!-- Automatic Slideshow Images -->\n");
      out.write("            <div class=\"mySlides w3-display-container w3-center\">\n");
      out.write("                <img src=\"img/2020_ferrari_f8_spider_orhy.jpg\" style=\"width:100%\">\n");
      out.write("                <div class=\"w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small\">\n");
      out.write("                    <h3>Ferrari</h3>\n");
      out.write("                    <p><b>A car is like a daughter, when it wins a race I feel like a father who knows that his daughter got\n");
      out.write("                            top grades at school.</b>\n");
      out.write("                        <br>\n");
      out.write("                        <b>Enzo Ferrari</b></p>   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mySlides w3-display-container w3-center\">\n");
      out.write("                <img src=\"img/lamborghini-sian-roadster-VNE-9_1594277287.jpg\" style=\"width:100%\">\n");
      out.write("                <div class=\"w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small\">\n");
      out.write("                    <h3>Lamborghini</h3>\n");
      out.write("                    <p><b> When I miss the sound and the fury, I take refuge in my garage and turn the key in the ignition of my Miura </b>\n");
      out.write("                        <br><b>Ferruccio Lamborghini</b></p>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mySlides w3-display-container w3-center\">\n");
      out.write("                <img src=\"img/2021-porsche-911-turbo-s-china-20th-anniversary-edition-1-1619079611.jpg\" style=\"width:100%\">\n");
      out.write("                <div class=\"w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small\">\n");
      out.write("                    <h3>Porsche</h3>\n");
      out.write("                    <p><b>Good design should be honest </b>\n");
      out.write("                        <br>\n");
      out.write("                        <b>Ferdinand Porsche</b></p>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- The Band Section -->\n");
      out.write("            <div class=\"w3-container w3-content w3-center w3-padding-64\" style=\"max-width:800px\" id=\"band\">\n");
      out.write("                <h2 class=\"w3-wide\">THINH HYPERCAR</h2>\n");
      out.write("                <p class=\"w3-opacity\"><i>We love music</i></p>\n");
      out.write("                <p class=\"w3-justify\">Cornering is like bringing a woman to a climax. \n");
      out.write("                    Both you and the car must work together. \n");
      out.write("                    You start to enter the area of excitement at the corner,\n");
      out.write("                    you set up a pace which is right for the car and after you've told it it is coming along with you, \n");
      out.write("                    you guide it along at a rhythm which has by now become natural.\n");
      out.write("                    Only after you've cleared the corner you can both take pleasure in knowing it's gone well.</p>\n");
      out.write("                <div class=\"w3-row w3-padding-32\">\n");
      out.write("                    <div class=\"w3-third\">\n");
      out.write("                        <p>Ferdinand Porsche</p>\n");
      out.write("                        <img src=\"img/438px-Ferdinand_Porsche.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:60%\"style=\"height: 60%\" >\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-third\">\n");
      out.write("                        <p>Enzo Ferrari</p>\n");
      out.write("                        <img src=\"img/enzo-ferrari.jpg\" class=\"w3-round w3-margin-bottom\" alt=\"Random Name\" style=\"width:60%\" style=\"height: 60%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-third\">\n");
      out.write("                        <p>Ferruccio Lamborghini</p>\n");
      out.write("                        <img src=\"img/Ferruccio_Lamborghini.jpg\" class=\"w3-round\" alt=\"Random Name\" style=\"width:60%\"style=\"height: 60%\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- The Tour Section -->\n");
      out.write("            <div class=\"w3-black\" id=\"tour\">\n");
      out.write("                <div class=\"w3-container w3-content w3-padding-64\" style=\"max-width:800px\">\n");
      out.write("                    <h2 class=\"w3-wide w3-center\">HYPER CAR LIST</h2>\n");
      out.write("                    <p class=\"w3-opacity w3-center\"><i>Remember to buy Car</i></p><br>\n");
      out.write("                    <div class=\"w3-bar w3-black w3-card\">\n");
      out.write("                    <form class=\"example\" action=\"search\" method=\"post\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Search..\" name=\"search\" value=\"\" >\n");
      out.write("                        <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("                        <button class=\"w3-padding-large w3-button\" title=\"More\">CATEGORY <i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("                        <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\n");
      out.write("                            <ul class=\"w3-ul w3-border w3-white w3-text-grey\">\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("                        <button class=\"w3-padding-large w3-button\" title=\"More\">PRICE <i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("                        <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\n");
      out.write("                            <ul class=\"w3-ul w3-border w3-white w3-text-grey\">\n");
      out.write("                                <form  action=\"select\" method=\"post\">\n");
      out.write("                                    <ul class=\"w3-ul w3-border w3-white w3-text-grey\">\n");
      out.write("                                        <li class=\"w3-padding\" style=\"background-color: black; color: white;\"> <input type=\"submit\" name=\"action\" value=\"LOW\"style=\"background-color: black; color: white;\"></li>\n");
      out.write("                                       <li class=\"w3-padding\" style=\"background-color: black; color: white;\"><input type=\"submit\" name=\"action\" value=\"HIGH\"style=\"background-color: black; color: white;\"></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"w3-row-padding w3-padding-32\" style=\"margin:0 -16px\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- The Contact Section -->\n");
      out.write("            <div class=\"w3-container w3-content w3-padding-64\" style=\"max-width:800px\" id=\"contact\">\n");
      out.write("                <h2 class=\"w3-wide w3-center\">CONTACT</h2>\n");
      out.write("                <p class=\"w3-opacity w3-center\"><i>Fan? Drop a note!</i></p>\n");
      out.write("                <div class=\"w3-row w3-padding-32\">\n");
      out.write("                    <div class=\"w3-col m6 w3-large w3-margin-bottom\">\n");
      out.write("                        <i class=\"fa fa-map-marker\" style=\"width:30px\"></i> Chicago, US<br>\n");
      out.write("                        <i class=\"fa fa-phone\" style=\"width:30px\"></i> Phone: +00 151515<br>\n");
      out.write("                        <i class=\"fa fa-envelope\" style=\"width:30px\"> </i> Email: thinhvdhe150056@fpt.edu.vn<br>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"w3-col m6\">\n");
      out.write("                        \n");
      out.write("                        <form action=\"contact\" target=\"_blank\" method=\"post\">\n");
      out.write("                            <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <div class=\"w3-row-padding\" style=\"margin:0 -16px 8px -16px\">\n");
      out.write("\n");
      out.write("                                <div class=\"w3-half\">\n");
      out.write("                                    <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Email\" required name=\"Email\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Message\" required name=\"Message\">\n");
      out.write("                            <button class=\"w3-button w3-black w3-section w3-right\" type=\"submit\">SEND</button>\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- End Page Content -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge\">\n");
      out.write("            <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("            <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("            <p class=\"w3-medium\">Powered by <a href=\"https://www.facebook.com/fudo.yusei.393/\" target=\"_blank\">THINH</a></p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            // Automatic Slideshow - change image every 4 seconds\n");
      out.write("            var myIndex = 0;\n");
      out.write("            carousel();\n");
      out.write("\n");
      out.write("            function carousel() {\n");
      out.write("                var i;\n");
      out.write("                var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                for (i = 0; i < x.length; i++) {\n");
      out.write("                    x[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                myIndex++;\n");
      out.write("                if (myIndex > x.length) {\n");
      out.write("                    myIndex = 1\n");
      out.write("                }\n");
      out.write("                x[myIndex - 1].style.display = \"block\";\n");
      out.write("                setTimeout(carousel, 4000);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Used to toggle the menu on small screens when clicking on the menu button\n");
      out.write("            function myFunction() {\n");
      out.write("                var x = document.getElementById(\"navDemo\");\n");
      out.write("                if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("                    x.className += \" w3-show\";\n");
      out.write("                } else {\n");
      out.write("                    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <li class=\"w3-padding\" ><a href=\"category?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </a></li>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                            <div class=\"w3-third w3-margin-bottom\">\n");
          out.write("                                <form method=\"POST\" action=\"CartController\">\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  style=\"width:100%\"  class=\"w3-hover-opacity\"><input type=\"hidden\" name=\"image\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\n");
          out.write("                                    <div class=\"w3-container w3-white\">\n");
          out.write("                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<input type=\"hidden\" name=\"description\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\n");
          out.write("\n");
          out.write("                                        Quantity:<input type=\"number\" name=\"quantity\" value=\"1\"><br/> \n");
          out.write("                                        Price: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<input type=\"hidden\" name=\"price\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><br/>\n");
          out.write("\n");
          out.write("                                        <input class=\"w3-button w3-black w3-margin-bottom\"type=\"submit\" name=\"action\" value=\"Add To Cart\">\n");
          out.write("                                    </div>\n");
          out.write("                                </form>\n");
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
