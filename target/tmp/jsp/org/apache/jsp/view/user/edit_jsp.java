package org.apache.jsp.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Edit User</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.users.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(", Status:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.users.enable}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("\t<form action=\"user\" method=\"post\">\n");
      out.write("\t<input type=\"hidden\" name=\"ganti\">\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t<ul>\n");
      out.write("\t<li>Username: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.users.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("\t<li>Password <input type=\"text\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.users.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t<li>Enable <input type=\"text\" name=\"enable\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.users.enable}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t\n");
      out.write("\t<li><a href=\"user?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.users.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&tambahrole\">Tambah/Lihat Role</a></li>\n");
      out.write("\n");
      out.write("\t</ul>\n");
      out.write("\t<input type=\"submit\" value=\"Ganti\">\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("\t<form action=\"user\" method=\"post\">\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user1.users.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t<input type=\"hidden\" name=\"hapus\">\n");
      out.write("\t<input type=\"submit\" value=\"hapus\">\n");
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
