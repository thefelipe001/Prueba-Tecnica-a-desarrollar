<%-- 
    Document   : direcciones
    Created on : 08/08/2021, 11:11:56 AM
    Author     : LENOVO
--%>

<%@page import="Modelo.ClienteDire"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>
        
        
    
    
  
        
        
        
        
        
        
           <div class="card border-primary mb-3" style="max-width: 18rem;">
 
               <div class="card-body text-warning" style="background-color:black">
            <%

                int id = Integer.parseInt(request.getParameter("Id").toString());
//            String response= request.getParameter("Id").toString();
//             int response =Integer.parseInt(request.getAttribute("id").toString());
//            int id=Integer.parseInt(request.getParameter("Id"));
//                int id =Integer.parseInt(request.getAttribute("id").toString());
                ClienteDAO dao = new ClienteDAO();
                Cliente neg = new Cliente();

                List<ClienteDire> list = dao.Mostrar(id);
                Iterator<ClienteDire> iter = list.iterator();
                ClienteDire clie = null;
                while (iter.hasNext()) {
                    clie = iter.next();


            %>

              


          
                    <p class="card-text">
                        
                        <%= clie.getDirrecion()%>
                    </p>
              
           
        <%}%>
     </div>
</div>
        

</body>

</html>


