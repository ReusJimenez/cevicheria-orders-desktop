package DAO;

import Modelo.CCliente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOComidaImpl extends Conexion implements DAOInterface<CCliente> {
    @Override
    public boolean registrar(CCliente client) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO comidaxcliente (Nombre,refProducto,Cantidad,Precio) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombre());
            ps.setString(2, client.pedido.getNombre());
            ps.setInt(3, client.pedido.getCantidad());
            ps.setDouble(4, client.pedido.getPrecio());
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

        String sql = "UPDATE comidaxcliente SET Nombre=?,refProducto=?,Cantidad=?,Precio=? WHERE IdCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombre());
            ps.setString(2, client.pedido.getNombre());
            ps.setInt(3, client.pedido.getCantidad());
            ps.setDouble(4, client.pedido.getPrecio());
            ps.setInt(5, client.pedido.getId());
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

        String sql = "DELETE FROM comidaxcliente WHERE IdCliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, client.pedido.getId());
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

        String sql = "SELECT * FROM comidaxcliente WHERE Nombre=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, client.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {
                client.pedido.setId(Integer.parseInt(rs.getString("IdCliente").trim()));
                client.setNombre(rs.getString("Nombre"));
                client.pedido.setNombre(rs.getString("refProducto"));
                client.pedido.setCantidad(Integer.parseInt(rs.getString("Cantidad").trim()));
                client.pedido.setPrecio(Double.parseDouble(rs.getString("Precio").trim()));
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