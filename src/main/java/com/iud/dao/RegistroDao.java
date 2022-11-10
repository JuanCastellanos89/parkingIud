package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.datos.OperacionesSql;
import com.iud.modelo.Registro;
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
public class RegistroDao implements OperacionesSql {
    Registro registro = new Registro();

    @Override
    public boolean insertar(Object obj) {
        registro = (Registro) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO registro VALUES(?,?,?,?,?,?,?)";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(2,registro.getFechaAno());
            stmt.setInt(3,registro.getFechaMes());
            stmt.setInt(4,registro.getFechaDia());
            stmt.setString(5, registro.getPlacaRegistro());
            stmt.setInt(6,registro.getCedulaRegistro());
            stmt.setInt(7,registro.getValorMensualidad());
           
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
        registro = (Registro) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "DELETE FROM registro WHERE id_registro = ?";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(1, registro.getIdRegistro());
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
        registro = (Registro) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE registro set fecha_ano=?, fecha_mes=?, fecha_dia=?, placa_registro=?, cedula_registro=?, valor_mensualidad=? WHERE id_registro=?";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(1,registro.getFechaAno());
            stmt.setInt(2,registro.getFechaMes());
            stmt.setInt(3,registro.getFechaDia());
            stmt.setString(4, registro.getPlacaRegistro());
            stmt.setInt(5,registro.getCedulaRegistro());
            stmt.setInt(6,registro.getValorMensualidad());
            stmt.setInt(7,registro.getIdRegistro());
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
        String SQL = "SELECT * FROM registro";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[7];
                for (int i = 0; i <= 6; i++) {
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
    

