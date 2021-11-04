package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;

public final class updateuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <title>Manager ThinhDepTrai</title>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        body {font-family: \"Lato\", sans-serif}\n");
      out.write("        .mySlides {display: none}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("        ");

            User x = (User) request.getAttribute("x1");
            if (x == null) {
                return;
            }
        
      out.write("    \n");
      out.write("        <h2> Update a User </h2>\n");
      out.write("        <form action=\"updateuser\" method=\"POST\">\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("             <input type=\"hidden\" name=\"uname\" value=\"");
      out.print( x.getName());
      out.write("\">  \n");
      out.write("               <td>  Pass <p><input type=\"text\" name=\"upass\" value=\"");
      out.print( x.getPass());
      out.write("\"> </td>\n");
      out.write("               <td>  Role<p><input type=\"text\" name=\"urole\" value=\"");
      out.print(x.getRole());
      out.write("\">  </td>\n");
      out.write("             <td><input type=\"submit\" value=\"Update\">  </td>\n");
      out.write("            </table>\n");
      out.write("        </form>  \n");
      out.write("        <p><button onclick='window.history.go(-1);'>Back to previous page</button>\n");
      out.write("        <p><a href=\"list\">Back to homepage</a>\n");
      out.write("            </center>\n");
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
}
