

<%@page import="Modelo.Direcciones"%>
<%@page import="ModeloDAO.DireccionDAO"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
              <%
              DireccionDAO dao=new DireccionDAO();
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Direcciones c=(Direcciones)dao.list(id);
          %>
            <h1>Modificar Cliente</h1>
            <form action="Controlador">
                DIRECCION:<br>
                <input class="form-control" type="text" name="txtDir" value="<%= c.getDireccion()%>"><br>
                CLIENTE ID: <br>
                <input class="form-control" type="text" name="txtClie" value="<%= c.getClient_id()%>"><br>
                
                <input type="hidden" name="txtid" value="<%= c.getId() %>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador?accion=listadodir">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
