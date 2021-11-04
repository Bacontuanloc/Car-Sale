package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Search result</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("     ");

      Car x = (Car) request.getAttribute("x");
      if(x==null) return;
      
     
      out.write("    \n");
      out.write("     <h2> Update a student </h2>\n");
      out.write("     <form action=\"update\" method=\"POST\">\n");
      out.write("            <p><input type=\"hidden\" name=\"xid\" value=\"");
      out.print( x.getID() );
      out.write("\"> \n");
      out.write("                Name <p><input type=\"text\" name=\"xname\" value=\"");
      out.print( x.getName() );
      out.write("\"> <br>\n");
      out.write("           Image <p><input type=\"text\" name=\"ximage\" value=\"");
      out.print( x.getImage() );
      out.write("\"> <br>\n");
      out.write("           Price <p><input type=\"text\" name=\"xprice\" value=\"");
      out.print( x.getPrice() );
      out.write("\"> <br>\n");
      out.write("           Title <p><input type=\"text\" name=\"xtitle\" value=\"");
      out.print( x.getTitle() );
      out.write("\"> <br>\n");
      out.write("           Description <p><input type=\"text\" name=\"xdescription\" value=\"");
      out.print( x.getDescription() );
      out.write("\"> <br>\n");
      out.write("           CateID <p><input type=\"text\" name=\"xcateid\" value=\"");
      out.print( x.getCateid() );
      out.write("\"> \n");
      out.write("        <p><input type=\"submit\" value=\"Update\"> \n");
      out.write("     </form>  \n");
      out.write("     <p><button onclick='window.history.go(-1);'>Back to previous page</button>\n");
      out.write("     <p><a href=\"index.html\">Back to homepage</a>\n");
      out.write("  </body>\n");
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
