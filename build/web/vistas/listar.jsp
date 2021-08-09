<%-- 
    Document   : listar
    Created on : 08/08/2021, 10:38:51 AM
    Author     : LENOVO
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<div class="container mt-4">
    <div class="card">
        <div class="card-header">
            <a href="Controlador?accion=add" class="btn btn-primary">Nuevo Cliente</a>
            <a href="Controlador?accion=listadodir" class="btn btn-info">Lista de Direcciones</a>

        </div>

        <div class="card-body">
            <table class="table table-hover">
                <thead>
                    <tr style="background-color: black;color:white">
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Telefono</th>
                        <th>Estado</th>
                        <th>Direcciones del Cliente</th>
                        <th>Acciones</th>


                    </tr>
                </thead>
                <%
                    ClienteDAO dao = new ClienteDAO();
                    List<Cliente> list = dao.listar();
                    Iterator<Cliente> iter = list.iterator();
                    Cliente clie = null;
                    while (iter.hasNext()) {
                        clie = iter.next();


                %>
                <tbody>
                    <tr style="background-color:lightseagreen;color:black; text-height:  ">
                        <td><%= clie.getId()%></td>
                        <td><%= clie.getNom()%></td>
                        <td><%= clie.getTelefono()%></td>
                        <td><%= clie.getEstado()%></td>
                        <td>


                            <!--<input type="submit" id="3" value="3" name="disksheet" onclick="getId(this.id)"/>-->
                            <jsp:include page="direcciones.jsp">
                                <jsp:param name="Id" value="<%= clie.getId()%>"/>
                            </jsp:include>
                            <%--<jsp:forward page="direccion.jsp" />--%> 

                        </td>

                        <td>



                            <a  href="Controlador?accion=Editar&id=<%= clie.getId()%>" type="button" class="btn btn-info" data-toggle="modal" data-target="#myModalEdit" ><img src="Imagen/editar.png" title="Modificar"/></a>
                            <a href="Controlador?accion=eliminar&id=<%= clie.getId()%>" class="btn btn-danger" >      <img src="Imagen/delete.png" title="Eliminar"/></a>  


                            <a href="Controlador?accion=eliminar&id=<%= clie.getId()%>" class="btn btn-warning" >      <img src="Imagen/li.png" title="Direcciones"/></a>  




                        </td>



                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </div>
</div>


</body>
</html>
