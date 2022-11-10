package com.iud.parqueadero;

import com.iud.dao.ClienteDAO;
import com.iud.vista.VistaCliente;
import com.iud.vista.VistaRegistro;
import com.iud.vista.VistaVehiculo;
import java.sql.SQLException;

/**
 *
 * @author Berserk
 */
public class Mavenproject1 {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World!");
        //VistaCliente vCliente = new VistaCliente();
        //vCliente.setVisible(true);
        
        //VistaVehiculo vVehiculo = new VistaVehiculo();
        //vVehiculo.setVisible(true);
        
        VistaRegistro vRegistro = new VistaRegistro();
        vRegistro.setVisible(true);
      
        
    }
}
