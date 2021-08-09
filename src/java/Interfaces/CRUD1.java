/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Direcciones;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface CRUD1 {
      public List listar();
    public Direcciones list(int id);
    public boolean add(Direcciones clien);
    public boolean edit(Direcciones clien);
    public boolean eliminar(int id);
}
