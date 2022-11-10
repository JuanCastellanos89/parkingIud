package com.iud.datos;

import com.iud.modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
    public void consultarTipo(JComboBox cmbTipo){
        cmbTipo.removeAllItems();
        cmbTipo.addItem("Seleccione una opcion");
        cmbTipo.addItem("Automovil");
        cmbTipo.addItem("Camioneta");
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
}