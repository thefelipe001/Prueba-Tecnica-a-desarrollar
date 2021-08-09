<%-- 
    Document   : listadodir
    Created on : 08/08/2021, 10:16:52 PM
    Author     : LENOVO
--%>


<%@page import="Modelo.Direcciones"%>
<%@page import="ModeloDAO.DireccionDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

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
            <h1>Lista de Direcciones</h1>
            <a class="btn btn-success" href="Controlador?accion=addD">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr style="background-color: black;color:white">
                        <th class="text-center">ID</th>
                        <th class="text-center">DIRECCION</th>
                        <th class="text-center">ID CLIENTE</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    DireccionDAO dao=new DireccionDAO();
                    List<Direcciones>list=dao.listar();
                    Iterator<Direcciones>iter=list.iterator();
                    Direcciones per=null;
                    while(iter.hasNext()){
                        per=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getId() %></td>
                        <td class="text-center"><%= per.getDireccion() %></td>
                        <td><%= per.getClient_id() %></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editD&id=<%= per.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= per.getId()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
                    <a href="Controlador?accion=listar">Regresar</a>

        </div>
    </body>
</html>

