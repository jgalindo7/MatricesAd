/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jgalindo7
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNdefila = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNdecolumnas = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutom = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperacion = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos iniciales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("N. de Fila");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        jPanel3.add(txtNdefila, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 30, -1));

        jLabel2.setText("N. de Columnas");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 20));
        jPanel3.add(txtNdecolumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 30, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 360, 90));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        cmdAutom.setText("Automatico");
        cmdAutom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomActionPerformed(evt);
            }
        });
        jPanel4.add(cmdAutom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 470, 80));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel3.setText("Operaciones con Matrices");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 400, 220));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 400, 220));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cant . Num Pares", "Numeros Pares", "Letra C", "Diagonal Principal", "Letra H" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        jPanel5.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 380, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1019, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        int nf, nc;
        DefaultTableModel tm, tm2;

        nf = Integer.parseInt(txtNdefila.getText());
        nc = Integer.parseInt(txtNdecolumnas.getText());

        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();

        tm.setRowCount(nf);
        tm.setColumnCount(nc);

        tm2.setRowCount(nf);
        tm2.setColumnCount(nc);


    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdAutomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomActionPerformed

        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nc; i++) {
            for (int j = 0; j < nf; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, j, i);
            }
        }


    }//GEN-LAST:event_cmdAutomActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        int nf, nc;

        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        DefaultTableModel tm, tm2;

        txtNdefila.setText("");
        txtNdecolumnas.setText("");
        txtNdefila.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
        txtResultado.setText("");

        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();

        tm.setRowCount(0);
        tm.setColumnCount(0);

        tm2.setRowCount(0);
        tm2.setColumnCount(0);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op, nf, nc, aux, cont=0;
        op = cmbOperacion.getSelectedIndex();

        nf = tblTablaInicial.getRowCount();
        nc = tblTablaResultado.getColumnCount();

        switch (op) {
            case 0:
                for (int i = 0; i < nc; i++) {
                    for (int j = 0; j < nf; j++) {
                        aux = (int) tblTablaInicial.getValueAt(i, j);
                        if (aux % 2 == 0) {
                            cont++;
                        }
                    }
                }
                txtResultado.setText("EL NUMERO DE ELEMENTOS PARES ES: " + cont);
                break;
            case 1:
                for (int i = 0; i < nc; i++) {
                    for (int j = 0; j < nf; j++) {
                        aux = (int) tblTablaInicial.getValueAt(i, j);
                        if (aux % 2 == 0) {
                            tblTablaResultado.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 2:
                 for (int i = 0; i < nc; i++) {
                    for (int j = 0; j < nf; j++) {
                        aux = (int) tblTablaInicial.getValueAt(i, j);
                        if (i == 0 || i== nf -1 || j == 0) {
                            tblTablaResultado.setValueAt(aux, i, j);
                        }
                    }
                }
            break;
            case 3:
                for (int i = 0; i < nc; i++) {
                    for (int j = 0; j < nf; j++) {
                        aux = (int) tblTablaInicial.getValueAt(i, j);
                        if (i == j) {
                            tblTablaResultado.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < nc; i++) {
                    for (int j = 0; j < nf; j++) {
                        aux = (int) tblTablaInicial.getValueAt(i, j);
                        if (j == 0 || j == nc-1 || i ==(nf-1)/2 ) {
                            tblTablaResultado.setValueAt(aux, i, j);
                        }
                    }
                }
                break;
        }

    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
      int nf,nc;
      double n;
        int sw, res;
        boolean aux=true;
        
        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaResultado.getRowCount();
        
        for (int i = 0; i < nf ; i++) {
            for (int j = 0; j < nc ; j++) 
            do {
                sw = 1;
                try {
                    n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posición ["+i+"]"+"["+j+"]"));
                    tblTablaInicial.setValueAt(n, i, j);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                    sw = 0;
                } catch (NullPointerException e) {
                   res= JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);
                   if(res == 0){
                    sw = 1;
                    i = nf;
                    j = nc;
                    aux = false;
                   }else{
                       sw =0;
                   }
                   
                }
            } while (sw == 0);
        }
    }//GEN-LAST:event_cmdManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperacion;
    private javax.swing.JButton cmdAutom;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNdecolumnas;
    private javax.swing.JTextField txtNdefila;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

}
