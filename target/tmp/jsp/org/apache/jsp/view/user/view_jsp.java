package org.apache.jsp.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Masukkan User Baru</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>Masukkan User Baru</h1>\n");
      out.write("\t<form action=\"user\" method=\"post\">\n");
      out.write("\t<input type=\"hidden\" name=\"tambah\">\n");
      out.write("\t<ul>\n");
      out.write("\t<li>Username <input type=\"text\" name=\"username\"></li>\n");
      out.write("\t<li>Password <input type=\"text\" name=\"password\"></li>\n");
      out.write("\t<li>Role: <select name=\"role\">\n");
      out.write("\t\t\t\t\t<option value=\"ROLE_USER\">User</option>\n");
      out.write("\t\t\t\t\t<option value=\"ROLE_ADMIN\">Admin</option>\n");
      out.write("\t\t\t</select>\n");
      out.write("\t</li>\n");
      out.write("\t<li> Status\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<input type=\"radio\" name=\"enable\" value=\"TRUE\" checked>Aktif\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<input type=\"radio\" name=\"enable\" value=\"FALSE\">Tidak\n");
      out.write("\t\t\n");
      out.write("\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t<input type=\"submit\" value=\"tambah\">\n");
      out.write("\t</form>\n");
      out.write("\t<a href=\"user\">Kembali ke List User</a>\n");
      out.write("</body>\n");
      out.write("</html>");
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
