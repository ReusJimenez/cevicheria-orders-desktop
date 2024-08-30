package DAO;

import Modelo.CInventario;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOInventarioImpl extends Conexion implements DAOInterface<CInventario> {
    @Override
    public boolean registrar(CInventario inv) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO inventario (Cantidad,FechaEntrada,refIngrediente) VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, inv.cant.getCantidad());
            ps.setString(2, inv.getFechaentrada());
            ps.setString(3, inv.getTipo());
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
    public boolean modificar(CInventario inv) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE inventario SET refIngrediente=?, Cantidad=?,FechaEntrada=? WHERE IdIngrediente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inv.getTipo());
            ps.setInt(2, inv.cant.getCantidad());
            ps.setString(3, inv.getFechaentrada());
            ps.setInt(4, inv.getId());
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
    public boolean eliminar(CInventario inv) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM inventario WHERE IdIngrediente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, inv.getId());
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
    public boolean buscar(CInventario inv) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM inventario WHERE refIngrediente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inv.getTipo());
            rs = ps.executeQuery();

            if (rs.next()) {
                inv.setId(Integer.parseInt(rs.getString("IdIngrediente").trim()));
                inv.cant.setCantidad(Integer.parseInt(rs.getString("Cantidad").trim()));
                inv.setFechaentrada(rs.getString("FechaEntrada"));
                inv.setTipo(rs.getString("refIngrediente"));
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