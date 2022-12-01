package com.iud.vista;

import com.iud.dao.CeldaDao;
import com.iud.dao.IngresoDao;
import com.iud.dao.RegistrosDao;
import com.iud.datos.CbHelper;
import com.iud.modelo.Celda;
import com.iud.modelo.Ingreso;
import com.iud.modelo.Registros;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Berserk
 */
public class IngresoVista extends javax.swing.JFrame {

    final String seleccione = "Seleccione una opcion";
    String columnas[] = {"PLACA", "FECHA DE INGRESO", "HORA DE INGRESO", "# DE CELDA"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    CeldaDao celdaDao = new CeldaDao();
    IngresoDao ingresoDao = new IngresoDao();
    RegistrosDao registrosDao = new RegistrosDao();
    CbHelper cb = new CbHelper();
    private ArrayList<Object[]> data;

    public IngresoVista() {
        initComponents();
        cargar();
        txtCelda.setVisible(false);
        txtPlaca.setVisible(false);
        cb.consultarCelda(cbxCelda);
        cb.consultarPlaca(cbxPlaca);

    }
    
    private void cargar() {
        this.data = ingresoDao.consultar();

        modelo.setNumRows(0);
        for (Object[] dato : this.data) {
            this.modelo.addRow(dato);
        }
        tblIngreso.setModel(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngreso = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCelda = new javax.swing.JTextField();
        cbxCelda = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbxPlaca = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        selFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        txtPlaca = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblIngreso.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblIngreso);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 670, 240));

        jLabel1.setText("CELDA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        jPanel1.add(txtCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 30, -1));

        cbxCelda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCeldaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxCelda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 200, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        jLabel2.setText("PLACA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        cbxPlaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPlacaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, -1));

        jLabel3.setText("FECHA DE INGRESO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        selFecha.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(selFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, -1));

        jLabel4.setText("HORA DE INGRESO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 100, -1));
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        btnEditar.setText("EDITAR");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCeldaActionPerformed
        String celdaElegida;
        
        if (cbxCelda.getSelectedItem() != null) {
            if (cbxCelda.getSelectedItem() != seleccione) {
                celdaElegida = cbxCelda.getSelectedItem().toString();
                System.out.println("celda: " + celdaElegida);
                txtCelda.setText(celdaElegida);
            }
        }
    }//GEN-LAST:event_cbxCeldaActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void cbxPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPlacaActionPerformed
        String placaElegida;

        if (cbxPlaca.getSelectedItem() != null) {
            if (cbxPlaca.getSelectedItem() != seleccione) {
                placaElegida = cbxPlaca.getSelectedItem().toString();
                System.out.println("celda: " + placaElegida);
                txtPlaca.setText(placaElegida);
            }
        }
    }//GEN-LAST:event_cbxPlacaActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFecha = sdf.format(selFecha.getDate());   
        SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
        String time = sf.format(jSpinner1.getValue());
        System.out.println("***** "+ time);

        Ingreso ingreso = new Ingreso(txtPlaca.getText(),
                                                dateFecha, 
                                                time,                                     
                                                Integer.parseInt(txtCelda.getText()));
        if(ingresoDao.insertar(ingreso)){
            JOptionPane.showMessageDialog(this, "Se a agregado correcatamente!!!");
            
        }else{
            JOptionPane.showMessageDialog(this, "Error al agregar...");           
        }
        
        Celda celda = new Celda(Integer.parseInt(txtCelda.getText()),
                                                               0);
        if (celdaDao.modificar(celda)) {
            //JOptionPane.showMessageDialog(this, "Se a utilizado la celda correcatamente!!!");
        } else {
            JOptionPane.showMessageDialog(this, "Error al Modificar...");
        }
        
        Registros registros = new Registros(    txtPlaca.getText(),
                                                dateFecha, 
                                                time,
                                                "",
                                                "");
        if(registrosDao.insertar(registros)){
            
        }else{
                      
        }
        
        cb.consultarCelda(cbxCelda);
        cb.consultarPlaca(cbxPlaca);
        cargar();
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

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
            java.util.logging.Logger.getLogger(IngresoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxCelda;
    private javax.swing.JComboBox<String> cbxPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private Date date = new Date();
    private com.toedter.calendar.JDateChooser selFecha;
    private javax.swing.JTable tblIngreso;
    private javax.swing.JTextField txtCelda;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
