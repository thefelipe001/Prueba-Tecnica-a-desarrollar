

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
              ClienteDAO dao=new ClienteDAO();
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Cliente c=(Cliente)dao.list(id);
          %>
            <h1>MODIFICAR CLIENTE</h1>
            <form action="Controlador">
                NOMBRE:<br>
                <input class="form-control" type="text" name="txtNom" value="<%= c.getNom()%>"><br>
                TELEFONO: <br>
                <input class="form-control" type="text" name="txtTel" value="<%= c.getTelefono()%>"><br>
                
                  ESTADO: <br>
                <input class="form-control" type="text" name="txtEst" value="<%= c.getEstado() %>"><br>
                
                <input type="hidden" name="txtid" value="<%= c.getId() %>">
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
                <a href="Controlador?accion=litar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
</html>
