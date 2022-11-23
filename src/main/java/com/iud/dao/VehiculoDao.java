package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.datos.OperacionesSql;
import com.iud.modelo.Vehiculo;
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
public class VehiculoDao implements OperacionesSql{
    
    Conexion conexion = new Conexion();
    Vehiculo vehiculo = new Vehiculo();

    @Override
    public boolean insertar(Object obj) {
        vehiculo = (Vehiculo) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO vehiculo VALUES(?,?,?,?,?)";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, vehiculo.getPlaca());            
            stmt.setString(2, vehiculo.getMarca());
            stmt.setString(3, vehiculo.getColor());
            stmt.setInt(4, vehiculo.getCedula());
            stmt.setString(5, vehiculo.getTipoVehiculo());
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
        vehiculo = (Vehiculo) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "DELETE FROM vehiculo WHERE placa = ?";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, vehiculo.getPlaca());
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
        vehiculo = (Vehiculo) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE vehiculo set marca=?, color=?, cedula=?, tipo_vehiculo=? WHERE placa=?";
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(1, vehiculo.getMarca());
            stmt.setString(2, vehiculo.getColor());
            stmt.setInt(3, vehiculo.getCedula());
            stmt.setString(4, vehiculo.getTipoVehiculo());
            stmt.setString(5, vehiculo.getPlaca());
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
        String SQL = "SELECT * FROM vehiculo";

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
