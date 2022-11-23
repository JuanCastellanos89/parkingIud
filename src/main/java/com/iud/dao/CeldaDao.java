package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.modelo.Celda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Berserk
 */
public class CeldaDao {
    Conexion conexion = new Conexion();
    Celda celda = new Celda();
    
    public boolean modificar(Object obj) {
        celda= (Celda) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE celda SET esta_libre=? WHERE id = ?";
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);          
            stmt.setInt(1, celda.getEsta_libre());
            stmt.setInt(2, celda.getId());
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
    
    public void actulizar(int id, Celda celda) throws SQLException{
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("UPDATE celda SET esta_libre=? WHERE id = ?");            
            stmt.setInt(1, celda.getId());
            stmt.setInt(2, celda.getEsta_libre());
            stmt.executeUpdate();
        } finally {
            if (conn != null) {
                Conexion.close(conn);

            }
            if (stmt != null) {
                Conexion.close(stmt);
            }
        }
    }
    
}
