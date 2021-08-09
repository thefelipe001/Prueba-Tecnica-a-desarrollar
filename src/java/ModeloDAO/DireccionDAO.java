/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD1;
import Modelo.Direcciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DireccionDAO implements CRUD1 {

      Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Direcciones cli = new Direcciones();
    
    
    
    @Override
    public List listar() {
      ArrayList<Direcciones> list = new ArrayList<>();
        String sql = "select * from Direcciones";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Direcciones Dire = new Direcciones();
                Dire.setId(rs.getInt("Id"));
                Dire.setDireccion(rs.getString("Direccion"));
                Dire.setClient_id(rs.getInt("Cliente_id"));
                list.add(Dire);

            }

        } catch (Exception e) {

        }
        return list;
        
        
        
    }

    @Override
    public Direcciones list(int id) {
         String sql = "select * from Direcciones where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cli.setId(rs.getInt("Id"));
                cli.setDireccion(rs.getString("Direccion"));
                cli.setClient_id(rs.getInt("Cliente_id"));
             

            }
        } catch (Exception e) {
        }
        return cli;
    }

    @Override
    public boolean add(Direcciones clien) {
             String sql = "insert into Direcciones( Direccion,Cliente_id)values('" + clien.getDireccion()+ "','" + clien.getClient_id()+ "')";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean edit(Direcciones clien) {
          String sql="update Direcciones set Direccion='"+clien.getDireccion()+"',Cliente_id='"+clien.getClient_id()+"'where Id="+clien.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from Direcciones where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
