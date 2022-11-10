package com.iud.dao;

import com.iud.datos.Conexion;
import com.iud.datos.OperacionesSql;
import com.iud.modelo.EstadoCuenta;
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
public class EstadoCuentaDao implements OperacionesSql{
    Conexion conexion = new Conexion();
    EstadoCuenta estadoCuenta = new EstadoCuenta(); 


    @Override
    public boolean insertar(Object obj) {
        estadoCuenta = (EstadoCuenta) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "INSERT INTO estado_cuenta VALUES(?,?,?,?)";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(2, estadoCuenta.getAnoPagado());
            stmt.setInt(3, estadoCuenta.getMesPagado());
            stmt.setInt(4, estadoCuenta.getIdRegistro());

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
        estadoCuenta = (EstadoCuenta) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "DELETE FROM estado_cuenta WHERE id_estado = ?";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(1, estadoCuenta.getIdEstado());
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
        estadoCuenta = (EstadoCuenta) obj;
        Connection conn = null;
        PreparedStatement stmt = null;
        String SQL = "UPDATE vehiculo set ano_pagado=?, mes_pagado=?, id_registro=? WHERE id_estado=?";
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            stmt.setInt(1, estadoCuenta.getAnoPagado());
            stmt.setInt(2, estadoCuenta.getMesPagado());
            stmt.setInt(3, estadoCuenta.getIdRegistro());
            stmt.setInt(4, estadoCuenta.getIdEstado());
           
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
        String SQL = "SELECT * FROM estado_cuenta";

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
            
        }finally{
            return data;
        }
    }
}
