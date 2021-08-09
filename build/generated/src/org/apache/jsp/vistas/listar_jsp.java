package org.apache.jsp.vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import Modelo.Cliente;
import ModeloDAO.ClienteDAO;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container mt-4\">\n");
      out.write("    <div class=\"card\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("            <a href=\"Controlador?accion=add\" class=\"btn btn-primary\">Nuevo Cliente</a>\n");
      out.write("            <a href=\"Controlador?accion=listadodir\" class=\"btn btn-info\">Lista de Direcciones</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr style=\"background-color: black;color:white\">\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Telefono</th>\n");
      out.write("                        <th>Estado</th>\n");
      out.write("                        <th>Direcciones del Cliente</th>\n");
      out.write("                        <th>Acciones</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    ClienteDAO dao = new ClienteDAO();
                    List<Cliente> list = dao.listar();
                    Iterator<Cliente> iter = list.iterator();
                    Cliente clie = null;
                    while (iter.hasNext()) {
                        clie = iter.next();


                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr style=\"background-color:lightseagreen;color:black; text-height:  \">\n");
      out.write("                        <td>");
      out.print( clie.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( clie.getNom());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( clie.getTelefono());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( clie.getEstado());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--<input type=\"submit\" id=\"3\" value=\"3\" name=\"disksheet\" onclick=\"getId(this.id)\"/>-->\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "direcciones.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf( clie.getId()), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("                            ");
      out.write(" \n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a  href=\"Controlador?accion=Editar&id=");
      out.print( clie.getId());
      out.write("\" type=\"button\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#myModalEdit\" ><img src=\"Imagen/editar.png\" title=\"Modificar\"/></a>\n");
      out.write("                            <a href=\"Controlador?accion=eliminar&id=");
      out.print( clie.getId());
      out.write("\" class=\"btn btn-danger\" >      <img src=\"Imagen/delete.png\" title=\"Eliminar\"/></a>  \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <a href=\"Controlador?accion=eliminar&id=");
      out.print( clie.getId());
      out.write("\" class=\"btn btn-danger\" >      <img src=\"Imagen/lpdf.png\" title=\"Direcciones\"/></a>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
