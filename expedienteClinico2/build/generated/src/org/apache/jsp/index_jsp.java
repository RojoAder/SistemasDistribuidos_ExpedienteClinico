package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title> Login del IMSS </title>    \r\n");
      out.write("        \r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Nunito&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Overpass&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- Link hacia el archivo de estilos css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"contenedor\">\r\n");
      out.write("            <div id=\"central\">\r\n");
      out.write("                <div id=\"login\">\r\n");
      out.write("                    <div class=\"titulo\">\r\n");
      out.write("                        Bienvenido al Login\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form id=\"loginform\" action=\"consultarUsuario\" method=\"post\"> \r\n");
      out.write("                        <input type=\"text\" name=\"correo\" placeholder=\"Correo\" required>\r\n");
      out.write("                        <input type=\"password\" placeholder=\"Contrase??a\" name=\"password\" required>   \r\n");
      out.write("                        <button type=\"submit\" title=\"Ingresar\" name=\"Ingresar\">Login</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <div class=\"pie-form\">\r\n");
      out.write("                        <a href=\"#\">??Perdiste tu contrase??a?</a>\r\n");
      out.write("                        <a href=\"registrarse.jsp\">??No tienes Cuenta? Registrate</a>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
