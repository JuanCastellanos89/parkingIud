package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.datos.OperacionesSql;
import com.iud.modelo.Ingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Berserk
 */
public class IngresoDao implements OperacionesSql {

    Conexion conexion = new Conexion();
    Ingreso ingreso = new Ingreso();

    @Override
    public boolean insertar(Object obj) {
        ingreso = (Ingreso) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO ingreso_vehiculo VALUES(?,?,?,?)";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, ingreso.getPlaca());
            stmt.setString(2, ingreso.getFechaIngreso());
            stmt.setString(3, ingreso.getHoraIngreso());
            stmt.setInt(4, ingreso.getCeldaId());

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
        ingreso = (Ingreso) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "DELETE FROM ingreso_vehiculo WHERE placa = ?";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, ingreso.getPlaca());
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
        ingreso = (Ingreso) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE ingreso_vehiculo set fecha_ingreso=?, hora_ingreso=?, celda=? WHERE placa=?";
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, ingreso.getFechaIngreso());
            stmt.setString(2, ingreso.getHoraIngreso());
            stmt.setInt(3, ingreso.getCeldaId());
            stmt.setString(4, ingreso.getPlaca());
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
        String SQL = "SELECT * FROM ingreso_vehiculo";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[4];
                for (int i = 0; i <= 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                data.add(fila);
            }

            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        } finally {
            return data;
        }
    }

    public Ingreso obtenerPorCedula(int cedula) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Ingreso ingreso = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM ingreso_vehiculo WHERE placa =?");
            rs = stmt.executeQuery();

            while (rs.next()) {
                ingreso = new Ingreso();                
                ingreso.setPlaca(rs.getString("placa"));
                ingreso.setFechaIngreso(rs.getString("fecha_ingreso"));
                ingreso.setHoraIngreso(rs.getString("hora_ingreso"));                
                ingreso.setCeldaId(rs.getInt("celda"));

            }
            return ingreso;

        } finally {
            if (conn != null) {
                Conexion.close(conn);
            }

            if (stmt != null) {
                Conexion.close(stmt);
            }
            if (rs != null) {
                Conexion.close(rs);
            }
        }
    }

}
