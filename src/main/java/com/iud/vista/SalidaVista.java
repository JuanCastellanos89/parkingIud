package com.iud.vista;

import com.iud.dao.CeldaDao;
import com.iud.dao.IngresoDao;
import com.iud.dao.RegistrosDao;
import com.iud.dao.SalidaDao;
import com.iud.datos.CbHelper;
import com.iud.modelo.Celda;
import com.iud.modelo.Ingreso;
import com.iud.modelo.Registros;
import com.iud.modelo.Salida;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Berserk
 */
public class SalidaVista extends javax.swing.JFrame {
    
    final String seleccione = "Seleccione una opcion";
    CeldaDao celdaDao = new CeldaDao();
    IngresoDao ingresoDao = new IngresoDao();
    SalidaDao salidaDao = new SalidaDao();
    RegistrosDao registrosDao = new RegistrosDao();
    
    CbHelper cb = new CbHelper();
    private ArrayList<Object[]> data;
    
    public SalidaVista() {
        initComponents();
        txtPlaca.setVisible(false);
        cb.consultarPlacaIngreso(cbxPlacaIngreso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        cbxPlacaIngreso = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        selFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        txtCeldaAux = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("AGREGAR");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        cbxPlacaIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPlacaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPlacaIngresoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxPlacaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PLACA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FECHA DE SALIDA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        selFecha.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(selFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HORA DE SALIDA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 90, -1));

        txtCeldaAux.setEditable(false);
        jPanel1.add(txtCeldaAux, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 70, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CELDA OCUPADA #");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jButton1.setText("PAGAR");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SALIDA DE VEHICULO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxPlacaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPlacaIngresoActionPerformed
        String placaElegida;

        if (cbxPlacaIngreso.getSelectedItem() != null) {
            if (cbxPlacaIngreso.getSelectedItem() != seleccione) {
                placaElegida = cbxPlacaIngreso.getSelectedItem().toString();
                txtPlaca.setText(placaElegida);
                cb.consultarCeldaSalir(txtCeldaAux, placaElegida);
            }
        }
    }//GEN-LAST:event_cbxPlacaIngresoActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateFecha = sdf.format(selFecha.getDate());       
        SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
        String time = sf.format(jSpinner1.getValue());
        System.out.println("***** "+ time);     
        
        Salida salida = new Salida(txtPlaca.getText(),
                                                dateFecha, 
                                                time                                     
                                                );
        if(salidaDao.insertar(salida)){
            JOptionPane.showMessageDialog(this, "El vehiculo a salido y la celda ahora esta vacia");
            
        }else{
            JOptionPane.showMessageDialog(this, "Error al agregar...");           
        }
        
        Celda celda = new Celda(Integer.parseInt(txtCeldaAux.getText()),
                                                               1);
        if (celdaDao.modificar(celda)) {
            //JOptionPane.showMessageDialog(this, "Se a utilizado la celda correcatamente!!!");
        } else {
            JOptionPane.showMessageDialog(this, "Error al Modificar...");
        }
        
        
        Registros registros = new Registros(txtPlaca.getText(),                                      
                                      dateFecha,
                                      time);
        
        if (registrosDao.actualizarRegistros(registros)) {
            //JOptionPane.showMessageDialog(this, "Se a utilizado la celda correcatamente!!!");
        } else {
            JOptionPane.showMessageDialog(this, "Error al Modificar la salidaaaa...");
        }
        
        Ingreso ingreso = new Ingreso(txtPlaca.getText());
        if (ingresoDao.eliminar(ingreso));
        
        
        
        cb.consultarPlacaIngreso(cbxPlacaIngreso);
    }//GEN-LAST:event_btnAgregarMouseClicked

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
            java.util.logging.Logger.getLogger(SalidaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalidaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalidaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalidaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalidaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cbxPlacaIngreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private Date date = new Date();
    private com.toedter.calendar.JDateChooser selFecha;
    private javax.swing.JTextField txtCeldaAux;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
