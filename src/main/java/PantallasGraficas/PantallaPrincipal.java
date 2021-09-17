/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasGraficas;

import MetodosCrud.InterfacePrincipalImplement;
import Modelos.ModeloPrincipal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carrillo
 */
public class PantallaPrincipal extends javax.swing.JFrame {

     ModeloPrincipal ag = new ModeloPrincipal();

     /**
      * Creates new form PantallaPrincipal
      */
     public PantallaPrincipal() {
          initComponents();
          this.setLocationRelativeTo(null);
     }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEnero = new javax.swing.JTextField();
        txtFebrero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtMarzo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedor = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ENERO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FEBRERO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MARZO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        txtEnero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEneroActionPerformed(evt);
            }
        });
        jPanel1.add(txtEnero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 324, -1));

        txtFebrero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFebreroActionPerformed(evt);
            }
        });
        jPanel1.add(txtFebrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 324, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 200, -1));

        txtMarzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarzoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMarzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 324, -1));

        contenedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(contenedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 301, 470, 198));

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 233, -1, -1));

        btnEditar.setBackground(new java.awt.Color(0, 0, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 233, -1, -1));

        btnConsultar.setBackground(new java.awt.Color(0, 0, 0));
        btnConsultar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 233, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 233, -1, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CODIGO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        fondo.setLabelFor(this);
        fondo.setToolTipText("");
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          ModeloPrincipal modelo = new ModeloPrincipal();

          modelo.setNombre(txtNombre.getText());
          modelo.setEnero(Integer.valueOf(txtEnero.getText()));
          modelo.setFebrero(Integer.valueOf(txtFebrero.getText()));
          modelo.setMarzo(Integer.valueOf(txtMarzo.getText()));

          if (metodos.registrar(modelo) == true) {

               JOptionPane.showMessageDialog(null, "Registro Agregado Exitosamente");
          }

          BorrarCampos();
     }//GEN-LAST:event_btnRegistrarActionPerformed

     private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          ModeloPrincipal modelo = new ModeloPrincipal();

          modelo.setCodigo(Integer.valueOf(txtCodigo.getText()));

          if (metodos.eliminar(modelo) == true) {
               JOptionPane.showMessageDialog(null, "El registro con el codigo " + txtCodigo.getText() + " Se elimino correctamente");
          }

          BorrarCampos();
     }//GEN-LAST:event_btnEliminarActionPerformed

     private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
           InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          ModeloPrincipal modelo = new ModeloPrincipal();

          modelo.setNombre(txtNombre.getText());
          modelo.setEnero(Integer.valueOf(txtEnero.getText()));
          modelo.setFebrero(Integer.valueOf(txtFebrero.getText()));
          modelo.setMarzo(Integer.valueOf(txtMarzo.getText()));
          modelo.setCodigo(Integer.valueOf(txtCodigo.getText()));

          if (metodos.actualizar(modelo) == true) {
               JOptionPane.showMessageDialog(null, "El registro fue modificadado exitosamente");
          }
          BorrarCampos();

     }//GEN-LAST:event_btnEditarActionPerformed

     private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();

          metodos.obtener(contenedor);

     }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtMarzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarzoActionPerformed

    private void txtFebreroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFebreroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFebreroActionPerformed

    private void txtEneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEneroActionPerformed

     public void BorrarCampos() {
          txtNombre.setText(null);
          txtEnero.setText(null);
          txtFebrero.setText(null);
          txtMarzo.setText(null);
          txtCodigo.setText(null);
     }

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
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new PantallaPrincipal().setVisible(true);
               }
          });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JTable contenedor;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEnero;
    private javax.swing.JTextField txtFebrero;
    private javax.swing.JTextField txtMarzo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
