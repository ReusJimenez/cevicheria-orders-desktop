package DAO;

import Modelo.CProveedor;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOProveedoresImpl extends Conexion implements DAOInterface<CProveedor> {
    @Override
    public boolean registrar(CProveedor prov) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO proveedor (Proveedor,Numero,refIngrediente) VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNombre());
            ps.setInt(2, prov.getTelefono());
            ps.setString(3, prov.ingr.getTipo());
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
    public boolean modificar(CProveedor prov) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE proveedor SET Proveedor=?,Numero=?,refIngrediente=? WHERE IdProveedor=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNombre());
            ps.setInt(2, prov.getTelefono());
            ps.setString(3, prov.ingr.getTipo());
            ps.setInt(4, prov.getId());
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
    public boolean eliminar(CProveedor prov) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM proveedor WHERE IdProveedor=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, prov.getId());
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
    public boolean buscar(CProveedor prov) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM proveedor WHERE Proveedor=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, prov.getNombre());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                prov.setId(Integer.parseInt(rs.getString("IdProveedor").trim()));
                prov.setNombre(rs.getString("Proveedor"));
                prov.setTelefono(Integer.parseInt(rs.getString("Numero").trim()));
                prov.ingr.setTipo(rs.getString("refIngrediente"));
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