package org.apache.jsp.view.barang;

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
      out.write("<title>Masukkan Nama Barang</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>Masukkan Nama Barang</h1>\n");
      out.write("\t<form action=\"barang\" method=\"post\">\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${barang1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t<input type=\"hidden\" name=\"ganti\">\n");
      out.write("\t<ul>\n");
      out.write("\t<li>Part No: <input type=\"text\" name=\"partno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${barang1.partno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t<li>Part Name <input type=\"text\" name=\"partname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${barang1.partname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></li>\n");
      out.write("\t</ul>\n");
      out.write("\t<input type=\"submit\" value=\"ganti\">\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("\t<form action=\"barang\" method=\"post\">\n");
      out.write("\t<input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${barang1.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t<input type=\"hidden\" name=\"hapus\">\n");
      out.write("\t<input type=\"submit\" value=\"hapus\">\n");
      out.write("\t</form>\n");
      out.write("\t<a href=\"barang\">Kembali ke List Barang</a>\n");
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
