<%@page import="Modelo.Direcciones"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.DireccionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="csss/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                
                
                
                <h1>Agregar Direccion</h1>
                <form action="Controlador" >
                    DIRECCION:<br>
                    <input class="form-control" type="text" name="txtDire"><br>
                    ID CLIENTE: <br>
                    <input class="form-control" type="text" name="txtClient"><br>
                    
                   


                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listadodir">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>