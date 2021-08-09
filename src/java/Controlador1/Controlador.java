/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador1;

import Modelo.Cliente;
import Modelo.Direcciones;
import ModeloDAO.ClienteDAO;
import ModeloDAO.DireccionDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    String listar = "vistas/listar.jsp";
    String listado = "vistas/listadodir.jsp";
    String add = "vistas/add.jsp";
    String addD = "vistas/addD.jsp";
    String edit = "vistas/edit.jsp";
    String editD= "vistas/editD.jsp";
    Cliente c = new Cliente();
    ClienteDAO dao = new ClienteDAO();
    Direcciones d=new Direcciones();
    DireccionDAO dad=new DireccionDAO();
    int id;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        }
        if (action.equalsIgnoreCase("listadodir")) {
            acceso = listado;
        }
        
        else if (action.equalsIgnoreCase("editD")) {
            request.setAttribute("idper", request.getParameter("id"));
            acceso = editD;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            id = Integer.parseInt(request.getParameter("txtid"));
            String dire = request.getParameter("txtDir");
            int clien = Integer.parseInt(request.getParameter("txtClie"));
            d.setId(id);
            d.setDireccion(dire);
            d.setClient_id(clien);
            dad.edit(d);
            acceso = listar;
        }
        
        else if (action.equalsIgnoreCase("addD")) {
            acceso = addD;
        } else if (action.equalsIgnoreCase("Agregar")) {
            String dire = request.getParameter("txtDire");
            int idc = Integer.parseInt(request.getParameter("txtClient"));
            d.setDireccion(dire);
            d.setClient_id(idc);
            dad.add(d);

            acceso = listado;
        }
        else if (action.equalsIgnoreCase("eliminar")) {
            id = Integer.parseInt(request.getParameter("id"));
            c.setId(id);
            dad.eliminar(id);
            acceso = listado;
        }
        
        
        
        
        else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            String nom = request.getParameter("txtNom");
            String tel = request.getParameter("txtTel");
            String Estado = request.getParameter("txtEst");
            c.setNom(nom);
            c.setTelefono(tel);
            c.setEstado(Estado);
            dao.add(c);

            acceso = listar;
        } else if (action.equalsIgnoreCase("eliminar")) {
            id = Integer.parseInt(request.getParameter("id"));
            c.setId(id);
            dao.eliminar(id);
            acceso = listar;
        } else if (action.equalsIgnoreCase("editar")) {
            request.setAttribute("idper", request.getParameter("id"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            Cliente clien=new Cliente();
               id = Integer.parseInt(request.getParameter("txtid"));
            String nom = request.getParameter("txtNom");
            String tel = request.getParameter("txtTel");
            String Estado = request.getParameter("txtEst");
            clien.setId(id);
            clien.setNom(nom);
            clien.setTelefono(tel);
            clien.setEstado(Estado);
            dao.edit(clien);
            acceso = listar;
        }

        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
