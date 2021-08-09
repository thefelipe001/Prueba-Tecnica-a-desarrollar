/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Cliente;
import java.util.List;


public interface CRUD {
    //Interface para Realizar el Crud
    public List listar();
    public Cliente list(int id);
    public boolean add(Cliente clien);
    public boolean edit(Cliente clien);
    public boolean eliminar(int id);
}
