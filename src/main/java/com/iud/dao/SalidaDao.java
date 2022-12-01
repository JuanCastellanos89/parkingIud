package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.datos.OperacionesSql;
import com.iud.modelo.Ingreso;
import com.iud.modelo.Salida;
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
public class SalidaDao implements OperacionesSql {

    Conexion conexion = new Conexion();
    Salida salida = new Salida();

    @Override
    public boolean insertar(Object obj) {
        salida = (Salida) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO salida_vehiculo VALUES(?,?,?)";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, salida.getPlaca());
            stmt.setString(2, salida.getFechaSalida());
            stmt.setString(3, salida.getHoraSalida());

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
        salida = (Salida) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "DELETE FROM salida_vehiculo WHERE placa = ?";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, salida.getPlaca());
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
        salida = (Salida) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE salida_vehiculo set fecha_salida=?, hora_salida=? WHERE placa=?";
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, salida.getFechaSalida());
            stmt.setString(2, salida.getHoraSalida());
            stmt.setString(3, salida.getPlaca());
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
        String SQL = "SELECT * FROM salida_vehiculo";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[3];
                for (int i = 0; i <= 2; i++) {
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
    
    

}
