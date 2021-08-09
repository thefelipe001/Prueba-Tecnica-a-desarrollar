/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interfaces.CRUD;
import Modelo.Cliente;
import Modelo.ClienteDire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();

    @Override
    public List listar() {
        ArrayList<Cliente> list = new ArrayList<>();
        String sql = "select * from cliente";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente clien = new Cliente();
                clien.setId(rs.getInt("Id"));
                clien.setNom(rs.getString("Nombre"));
                clien.setTelefono(rs.getString("Telefono"));
                clien.setEstado(rs.getString("Estado"));
                list.add(clien);

            }

        } catch (Exception e) {

        }
        return list;
    }

    public List<ClienteDire> Mostrar(int id) {

        ArrayList<ClienteDire> list = new ArrayList<>();
        String sql = "select d.Id,d.Direccion,d.Cliente_id from cliente c inner join Direcciones d ON c.Id=d.Cliente_id where d.Cliente_id=" + id;

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClienteDire clien = new ClienteDire();
                clien.setId(rs.getInt("Id"));
                clien.setDireccion(rs.getString("Direccion"));
                clien.setClient_Id(rs.getInt("cliente_id"));
                list.add(clien);

            }

        } catch (Exception e) {

        }
        return list;
    }

    @Override
    public Cliente list(int id) {
        String sql = "select * from Cliente where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                cli.setId(rs.getInt("Id"));
                cli.setNom(rs.getString("Nombre"));
                cli.setTelefono(rs.getString("Telefono"));
                cli.setEstado(rs.getString("Estado"));

            }
        } catch (Exception e) {
        }
        return cli;
    }

    @Override
    public boolean add(Cliente clien) {
        String sql = "insert into Cliente( Nombre,Telefono,Estado)values('" + clien.getNom() + "','" + clien.getTelefono() + "','" + clien.getEstado() + "')";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public boolean edit(Cliente clien) {
String sql="update Cliente set Id='"+clien.getId()+"',Nombre='"+clien.getNom()+"',Telefono='"+clien.getTelefono()+"',Estado='"+clien.getEstado()+"'where Id="+clien.getId();       
try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql = "delete from Cliente where Id=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
