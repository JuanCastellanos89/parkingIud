package com.iud.vista;

import com.iud.dao.VehiculoDao;
import com.iud.datos.CbHelper;
import com.iud.modelo.Vehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Berserk
 */
public class VehiculoVista extends javax.swing.JFrame {
    
    final String seleccione = "Seleccione una opcion";
    String columnas[] = {"PLACA", "MARCA", "COLOR", "CEDULA PROPIETARIO", "TIPO DE VEHICULO"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    VehiculoDao vehiculoDao = new VehiculoDao();
    ArrayList<Object[]> data = new ArrayList<>();
    CbHelper cb = new CbHelper();

    public VehiculoVista() {
        initComponents();
        cargar();
        cb.consultarTipo(cbxTipo);
        cb.consultarCedula(cbxCedula);
    }

    private void cargar() {
        this.data = vehiculoDao.consultar();
        modelo.setNumRows(0);
        for (Object[] dato : this.data) {
            this.modelo.addRow(dato);
        }
        tblVehiculo.setModel(modelo);
    }
    private void limpiarCampos(){
        txtPlaca.setText("");        
        txtMarca.setText("");
        txtColor.setText("");        
        cbxCedula.setSelectedItem(cbxCedula.getItemAt(0));
        cbxTipo.setSelectedItem(cbxTipo.getItemAt(0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();
        txtMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtColor = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        cbxCedula = new javax.swing.JComboBox<>();
        txtNombreAux = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtApellidoAux = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVehiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVehiculo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 297, 840, 390));
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CEDULA PROPIETARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PLACA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MARCA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COLOR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TIPO DE VEHICULO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 190, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 190, -1));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, -1, -1));

        btnEditar.setText("EDITAR");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, -1));

        cbxCedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCedulaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 190, -1));

        txtNombreAux.setEditable(false);
        jPanel1.add(txtNombreAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 190, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE PROPIETARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        txtApellidoAux.setEditable(false);
        txtApellidoAux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAuxActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellidoAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 190, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRO DE VEHICULO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addContainerGap(548, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        String selTipo=(String)cbxTipo.getSelectedItem();
        Integer selCedula=(Integer) cbxCedula.getSelectedItem();
        
        Vehiculo vehiculo = new Vehiculo(txtPlaca.getText(),                                      
                                      txtMarca.getText(),
                                      txtColor.getText(),                                      
                                      selCedula,
                                      selTipo.toString());
        if(vehiculoDao.insertar(vehiculo)){
            JOptionPane.showMessageDialog(this, "Se a agregado correcatamente!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al agregar...");
        }
        cargar();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        String selTipo=(String)cbxTipo.getSelectedItem();
        Integer selCedula=(Integer) cbxCedula.getSelectedItem();
        
        Vehiculo vehiculo = new Vehiculo(txtPlaca.getText(),                                      
                                      txtMarca.getText(),
                                      txtColor.getText(),                                      
                                      selCedula,
                                      selTipo.toString());
        if(vehiculoDao.modificar(vehiculo)){
            JOptionPane.showMessageDialog(this, "Se a Modificado correcatamente!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al Modificar...");
        }
        cargar();
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        String selTipo=(String)cbxTipo.getSelectedItem();
        Integer selCedula=(Integer) cbxCedula.getSelectedItem();
        
        Vehiculo vehiculo = new Vehiculo(txtPlaca.getText(),                                      
                                      txtMarca.getText(),
                                      txtColor.getText(),                                      
                                      selCedula,
                                      selTipo.toString());
        if(vehiculoDao.eliminar(vehiculo)){
            JOptionPane.showMessageDialog(this, "Se a Eliminado correcatamente!!!");
        }else{
            JOptionPane.showMessageDialog(this, "Error al Eliminar...");
        }
        cargar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void tblVehiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculoMouseClicked
        txtPlaca.setText(tblVehiculo.getValueAt(tblVehiculo.getSelectedRow(), 0).toString());        
        txtMarca.setText(tblVehiculo.getValueAt(tblVehiculo.getSelectedRow(), 1).toString());
        txtColor.setText(tblVehiculo.getValueAt(tblVehiculo.getSelectedRow(), 2).toString());        
        cbxCedula.setSelectedItem(tblVehiculo.getValueAt(tblVehiculo.getSelectedRow(), 3));
        cbxTipo.setSelectedItem(tblVehiculo.getValueAt(tblVehiculo.getSelectedRow(), 4));
    }//GEN-LAST:event_tblVehiculoMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void cbxCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCedulaActionPerformed
        int cedulaElegida;
        if (cbxCedula.getSelectedItem() != null) {
            if (cbxCedula.getSelectedItem() != seleccione) {
                cedulaElegida = Integer.parseInt(cbxCedula.getSelectedItem().toString());
                cb.consultarNombre(txtNombreAux, txtApellidoAux, cedulaElegida);
            }
        }
    }//GEN-LAST:event_cbxCedulaActionPerformed

    private void txtApellidoAuxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAuxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAuxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VehiculoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehiculoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehiculoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehiculoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehiculoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxCedula;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVehiculo;
    private javax.swing.JTextField txtApellidoAux;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombreAux;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
