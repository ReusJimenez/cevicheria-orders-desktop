package DAO;

import Modelo.CCliente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOBebidaImpl extends Conexion implements DAOInterface<CCliente> {
    @Override
    public boolean registrar(CCliente client) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO bebidaxcliente (Nombre,refBebida,Tamanho,Cantidad,Precio) VALUES (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombre());
            ps.setString(2, client.pedido2.getNombre());
            ps.setString(3, client.pedido2.getTamanho());
            ps.setInt(4, client.pedido2.getCantidad());
            ps.setDouble(5, client.pedido2.getPrecio());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    @Override
    public boolean modificar(CCliente client) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE bebidaxcliente SET Nombre=?,refBebida=?,Tamanho=?,Cantidad=?,Precio=? WHERE IdCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombre());
            ps.setString(2, client.pedido2.getNombre());
            ps.setString(3, client.pedido2.getTamanho());
            ps.setInt(4, client.pedido2.getCantidad());
            ps.setDouble(5, client.pedido2.getPrecio());
            ps.setInt(6, client.pedido2.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    @Override
    public boolean eliminar(CCliente client) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM bebidaxcliente WHERE IdCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, client.pedido2.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    @Override
    public boolean buscar(CCliente client) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM bebidaxcliente WHERE Nombre=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {
                client.pedido2.setId(Integer.parseInt(rs.getString("IdCliente").trim()));
                client.setNombre(rs.getString("Nombre"));
                client.pedido2.setNombre(rs.getString("refBebida"));
                client.pedido2.setTamanho(rs.getString("Tamanho"));
                client.pedido2.setCantidad(Integer.parseInt(rs.getString("Cantidad").trim()));
                client.pedido2.setPrecio(Double.parseDouble(rs.getString("Precio").trim()));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}