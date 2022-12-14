package com.iud.datos;

import com.iud.modelo.Registros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Berserk
 */
public class CbHelper {

    public void consultarCedula(JComboBox cmbCedula) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT cedula FROM cliente";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            cmbCedula.removeAllItems();
            cmbCedula.addItem("Seleccione una opcion");
            while (rs.next()) {
                cmbCedula.addItem(rs.getInt("cedula"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }

    }

    public void consultarTipo(JComboBox cmbTipo) {
        cmbTipo.removeAllItems();
        cmbTipo.addItem("Automovil");
        cmbTipo.addItem("Motocicleta");
    }

    public void consultarPlaca(JComboBox cmbPlaca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT placa FROM vehiculo";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            cmbPlaca.removeAllItems();
            cmbPlaca.addItem("Seleccione una opcion");
            while (rs.next()) {
                cmbPlaca.addItem(rs.getString("placa"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }
    }

    public void consultarCelda(JComboBox cmbCelda) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM celda WHERE esta_libre = 1";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            cmbCelda.removeAllItems();
            cmbCelda.addItem("Seleccione una opcion");
            while (rs.next()) {
                cmbCelda.addItem(rs.getInt("id"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }
    }
    
    public void consultarPlacaIngreso(JComboBox cmbPlaca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT placa FROM ingreso_vehiculo";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            cmbPlaca.removeAllItems();
            cmbPlaca.addItem("Seleccione una opcion");
            while (rs.next()) {
                cmbPlaca.addItem(rs.getString("placa"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }
    }
    
    public void consultarCeldaSalir(JTextField jtf, String placaAux) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT celda FROM ingreso_vehiculo WHERE placa ='"+placaAux+"'";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            jtf.setText("");
            while (rs.next()) {
                jtf.setText(rs.getString("celda"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }
    }
    
    public void consultarNombre(JTextField jtf, JTextField jtf1, int cedulaAux) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT nombres,apellidos apellidos FROM cliente WHERE cedula ='"+cedulaAux+"'";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            jtf.setText("");
            while (rs.next()) {
                jtf.setText(rs.getString("nombres"));
                jtf1.setText(rs.getString("Apellidos"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }
    }
    
    public void consultarPlacaSalida(JComboBox cmbPlaca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT placa FROM salida_vehiculo";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            cmbPlaca.removeAllItems();
            cmbPlaca.addItem("Seleccione una opcion");
            while (rs.next()) {
                cmbPlaca.addItem(rs.getString("placa"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }
    }
    
    public void consultarRegistrosPago(JTextField jtf,JTextField jtf2, String placaAux) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String SQL = "SELECT * FROM registros WHERE placa ='"+placaAux+"'";

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL);
            rs = stmt.executeQuery();
            jtf.setText("");
            while (rs.next()) {
                jtf.setText(rs.getString("hora_ingreso"));
                jtf2.setText(rs.getString("hora_salida"));
            }
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrion un error: " + e.getMessage());

        }
    }
    
}
