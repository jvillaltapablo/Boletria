
package sistemaboleteria;

import javax.swing.table.DefaultTableModel;


public class frmSistemaBoleteria extends javax.swing.JFrame {
    Tiempo time = new Tiempo();
   
    public frmSistemaBoleteria() {
       
        initComponents();
        mostrarTiempo();
        
        this.tabladetalles.setModel(modelo);
        this.modelo.addColumn("NOMBRE");
        this.modelo.addColumn("CEDULA");
        this.modelo.addColumn("FECHA");
        this.modelo.addColumn("TIPO DE BOLETO");
        this.modelo.addColumn("CANTIDAD");
        this.modelo.addColumn("PRECIO DE BOLETO");
        this.modelo.addColumn("IVA");
        this.modelo.addColumn("TOTAL A PAGAR");
        
    }
    
   
    
    public final void mostrarTiempo(){
    
    lbnFecha.setText(time.fechacomp);
    lbnHora.setText(time.horacomp);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboTipodeboleto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnGenerarcompra = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbnFecha = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbnHora = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladetalles = new javax.swing.JTable();
        btnLimpiartabla = new javax.swing.JButton();
        btnQuitarcompra = new javax.swing.JButton();
        btnNetoapagar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNetoapagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 3, 14)); // NOI18N
        jLabel1.setText("Sistema Boleteria ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("REALIZAR COMPRA "));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Cedula:");

        jLabel4.setText("Tipo de boleto");

        cboTipodeboleto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Gradería sombra", "Palco" }));
        cboTipodeboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipodeboletoActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio de boleto");

        jLabel6.setText("Cantidad");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel7.setText("Total:");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnGenerarcompra.setText("Generar Compra");
        btnGenerarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarcompraActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel9.setText("IVA:");

        txtIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAActionPerformed(evt);
            }
        });

        jLabel10.setText("Fecha:");

        lbnFecha.setText("   /     /     ");

        jLabel12.setText("Hora:");

        lbnHora.setText("    :     ");

        txtPrecio.setText(" ");
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnLimpiar)
                                    .addGap(302, 302, 302))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(89, 89, 89)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPrecio)
                                                .addComponent(jLabel5)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(lbnHora)))
                                            .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(57, 57, 57)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbnFecha)
                                .addGap(45, 45, 45))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cboTipodeboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(79, 79, 79))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnGenerarcompra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel10)))
                .addContainerGap(529, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula)
                            .addComponent(jLabel3)
                            .addComponent(cboTipodeboleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lbnFecha)
                            .addComponent(jLabel12)
                            .addComponent(lbnHora))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarcompra)
                    .addComponent(btnLimpiar)))
        );

        txtIVA.getAccessibleContext().setAccessibleName("txtIVA");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de Compras"));

        tabladetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladetalles);

        btnLimpiartabla.setText("Limpiar Tabla");
        btnLimpiartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiartablaActionPerformed(evt);
            }
        });

        btnQuitarcompra.setText("Quitar Compra");
        btnQuitarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarcompraActionPerformed(evt);
            }
        });

        btnNetoapagar.setText("Neto a Pagar");
        btnNetoapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetoapagarActionPerformed(evt);
            }
        });

        jLabel8.setText("Neto a Pagar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnLimpiartabla)
                .addGap(18, 18, 18)
                .addComponent(btnQuitarcompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNetoapagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNetoapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiartabla)
                            .addComponent(btnQuitarcompra)
                            .addComponent(btnNetoapagar)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNetoapagar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultTableModel modelo= new DefaultTableModel();
    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed
    
    public void boletos(){
        double cantidad,precio, iva1,total, iva=0.13;
    
        if(cboTipodeboleto.getSelectedIndex()==1){
            cantidad= Double.parseDouble(this.txtCantidad.getText());
            precio= Double.parseDouble(this.txtPrecio.getText());
            iva1= (precio*cantidad)*iva;
            this.txtIVA.setText(String.valueOf(iva1));
            total= ((precio*cantidad)+ iva1);
            this.txtTotal.setText(String.valueOf(total));
        }
        
        if(cboTipodeboleto.getSelectedIndex()==2){
            cantidad= Double.parseDouble(this.txtCantidad.getText());
            precio= Double.parseDouble(this.txtPrecio.getText());
            iva1= (precio*cantidad)*iva;
            this.txtIVA.setText(String.valueOf(iva1));
            total= ((precio*cantidad)+ iva1);
            this.txtTotal.setText(String.valueOf(total)); 
        }
        
    }
    

    
        
    
    
    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnQuitarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarcompraActionPerformed
        modelo.removeRow(this.tabladetalles.getSelectedRow());
    }//GEN-LAST:event_btnQuitarcompraActionPerformed

    private void btnLimpiartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiartablaActionPerformed
        int x=this.modelo.getRowCount();
        for (int y = 0; y <= x; y++){
            this.modelo.removeRow(0); 
        }
        this.txtNetoapagar.setText(" ");
    }//GEN-LAST:event_btnLimpiartablaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtNombre.setText("");
        this.txtCedula.setText("");
        this.cboTipodeboleto.setSelectedIndex(0);
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");
        this.txtIVA.setText("");
        //this.jTextField1.setText("");
        //this.jTextField1.setText("");
        this.txtTotal.setText("");
        this.txtNetoapagar.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGenerarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarcompraActionPerformed
        
        boletos();
       
        
        if(cboTipodeboleto.isShowing()){
            this.modelo.addRow(new Object[]{this.txtNombre.getText(), this.txtCedula.getText(), 
            this.lbnFecha.getText(),this.cboTipodeboleto.getSelectedItem(),
            this.txtCantidad.getText(),this.txtPrecio.getText(),this.txtIVA.getText(),
            this.txtTotal.getText()});
        }
                
        
    }//GEN-LAST:event_btnGenerarcompraActionPerformed

    private void txtIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAActionPerformed

    private void cboTipodeboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipodeboletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipodeboletoActionPerformed

    private void btnNetoapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetoapagarActionPerformed
        double sumatoria;
        double sumatoria1=0;
        int totalrow=tabladetalles.getRowCount();
        totalrow-=1;
        for (int i =0; i<=(totalrow);i++){
            sumatoria=Double.parseDouble(String.valueOf(tabladetalles.getValueAt(i, 7))); //SIGNO
            sumatoria1+= sumatoria;
        }
        txtNetoapagar.setText("₡ "+String.valueOf(sumatoria1));
    }//GEN-LAST:event_btnNetoapagarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed


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
            java.util.logging.Logger.getLogger(frmSistemaBoleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSistemaBoleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSistemaBoleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSistemaBoleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSistemaBoleteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarcompra;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiartabla;
    private javax.swing.JButton btnNetoapagar;
    private javax.swing.JButton btnQuitarcompra;
    private javax.swing.JComboBox<String> cboTipodeboleto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbnFecha;
    private javax.swing.JLabel lbnHora;
    private javax.swing.JTable tabladetalles;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtNetoapagar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
