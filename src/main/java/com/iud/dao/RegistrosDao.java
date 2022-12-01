package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.datos.OperacionesSql;
import com.iud.modelo.Registros;
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
public class RegistrosDao implements OperacionesSql {
    Conexion conexion = new Conexion();
    Registros registros = new Registros();

    @Override
    public boolean insertar(Object obj) {
        registros = (Registros) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO registros VALUES(?,?,?,?,?,?)";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setString(2, registros.getPlaca());
            stmt.setString(3, registros.getFechaIngreso());
            stmt.setString(4, registros.getHoraIngreso());
            stmt.setString(5, registros.getFechaSalida());
            stmt.setString(6, registros.getHoraSalida());

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Object obj) {
        registros = (Registros) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE registros SET placa = ?, fecha_ingreso=?, hora_ingreso=? WHERE id_registro=?";
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);            
            stmt.setString(1, registros.getPlaca());
            stmt.setString(2, registros.getFechaIngreso());
            stmt.setString(3, registros.getHoraIngreso());
            stmt.setInt(4, registros.getIdRegistro());
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
    
    public boolean actualizarRegistros(Object obj) {        
        registros = (Registros) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL= "UPDATE registros SET fecha_salida= ?, hora_salida= ?  WHERE placa= ?";
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);            
            
            stmt.setString(1, registros.getFechaSalida());
            stmt.setString(2, registros.getHoraSalida());
            stmt.setString(3, registros.getPlaca());
            
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
}
