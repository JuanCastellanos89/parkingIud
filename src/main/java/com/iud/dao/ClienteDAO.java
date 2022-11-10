package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.datos.OperacionesSql;
import com.iud.modelo.Cliente;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Berserk
 */
public class ClienteDAO implements OperacionesSql {

    Conexion conexion = new Conexion();
    Cliente clien = new Cliente();

    @Override
    public boolean insertar(Object obj) {
        clien = (Cliente) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO cliente VALUES(?,?,?,?,?)";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(1, clien.getCedula());
            stmt.setString(2, clien.getNombre());
            stmt.setString(3, clien.getApellidos());
            stmt.setString(4, clien.getDireccion());
            stmt.setInt(5, clien.getCelular());
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                Conexion.close(stmt);
                Conexion.close(conn);
                return true;
            } else {
                Conexion.close(stmt);
                Conexion.close(conn);
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        clien = (Cliente) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "DELETE FROM cliente WHERE cedula = ?";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(1, clien.getCedula());
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                Conexion.close(stmt);
                Conexion.close(conn);
                return true;
            } else {
                Conexion.close(stmt);
                Conexion.close(conn);
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        clien = (Cliente) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE cliente set nombres=?, apellidos=?, direccion=?, celular=? WHERE cedula = ?";
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, clien.getNombre());
            stmt.setString(2, clien.getApellidos());
            stmt.setString(3, clien.getDireccion());
            stmt.setInt(4, clien.getCelular());
            stmt.setInt(5, clien.getCedula());
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                Conexion.close(stmt);
                Conexion.close(conn);
                return true;
            } else {
                Conexion.close(stmt);
                Conexion.close(conn);
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());
            return false;
        }

    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM cliente";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[5];
                for (int i = 0; i <= 4; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                data.add(fila);
            }

            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());
            
        }finally{
            return data;
        }
    }
}
