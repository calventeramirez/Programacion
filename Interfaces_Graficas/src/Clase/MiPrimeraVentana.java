package Clase;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class MiPrimeraVentana extends javax.swing.JFrame {

    /**
     * Creates new form MiPrimeraVentana
     */
    public MiPrimeraVentana() {
        initComponents();
        this.setLocationRelativeTo(null);//PAra poner la ventana siempre en el centro del dispositivo
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoInformativo = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        botonSalir = new javax.swing.JButton();
        botonSaludo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        textoInformativo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoInformativo.setForeground(new java.awt.Color(51, 51, 255));
        textoInformativo.setText("Introduce aqui tu nombre:");
        textoInformativo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                textoInformativoMouseMoved(evt);
            }
        });
        textoInformativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoInformativoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoInformativoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoInformativoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textoInformativoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textoInformativoMouseReleased(evt);
            }
        });

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campoNombre.setToolTipText("Holaaaaa");
        campoNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNombreFocusLost(evt);
            }
        });
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("Salir");
        botonSalir.setToolTipText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonSaludo.setForeground(new java.awt.Color(0, 0, 0));
        botonSaludo.setText("Saludar");
        botonSaludo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                botonSaludoStateChanged(evt);
            }
        });
        botonSaludo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                botonSaludoMouseDragged(evt);
            }
        });
        botonSaludo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSaludoMouseClicked(evt);
            }
        });
        botonSaludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaludoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(botonSaludo)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(textoInformativo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSaludo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        System.out.println("Chao pescado");
        //Para cerrar con el boton
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonSaludoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaludoActionPerformed
        // TODO add your handling code here:
        System.out.println("Action Performed");

    }//GEN-LAST:event_botonSaludoActionPerformed

    private void botonSaludoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_botonSaludoStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSaludoStateChanged

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
        System.out.println("Click en  el action performer");
    }//GEN-LAST:event_campoNombreActionPerformed

    private void textoInformativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoInformativoMouseClicked
        // TODO add your handling code here:
        System.out.println("Se ha hecho click en la etiqueta");
    }//GEN-LAST:event_textoInformativoMouseClicked

    private void textoInformativoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoInformativoMouseEntered
        // TODO add your handling code here:
        System.out.println("Se ha entrado en la etiqueta");
    }//GEN-LAST:event_textoInformativoMouseEntered

    private void textoInformativoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoInformativoMouseExited
        // TODO add your handling code here:
        System.out.println("Se ha salido de la etiqueta");
    }//GEN-LAST:event_textoInformativoMouseExited

    private void textoInformativoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoInformativoMouseMoved
        // TODO add your handling code here:
        System.out.println("Moviendo la etiqueta");
    }//GEN-LAST:event_textoInformativoMouseMoved

    private void textoInformativoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoInformativoMousePressed
        // TODO add your handling code here:
        System.out.println("bajando en la etiqueta");
    }//GEN-LAST:event_textoInformativoMousePressed

    private void textoInformativoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoInformativoMouseReleased
        // TODO add your handling code here:
        System.out.println("subiendo en la etiqueta");
    }//GEN-LAST:event_textoInformativoMouseReleased

    private void campoNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusLost
        // TODO add your handling code here:
        System.out.println("Foco Perdido");
    }//GEN-LAST:event_campoNombreFocusLost

    private void campoNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusGained
        // TODO add your handling code here:
        System.out.println("Gana el foco");
    }//GEN-LAST:event_campoNombreFocusGained

    private void campoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyTyped
        // TODO add your handling code here:
        System.out.println("Tecla pulsada");
    }//GEN-LAST:event_campoNombreKeyTyped

    private void campoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyPressed
        // TODO add your handling code here:
        System.out.println("Tecla presionada");
    }//GEN-LAST:event_campoNombreKeyPressed

    private void campoNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyReleased
        // TODO add your handling code here:
        System.out.println("Tecla soltada");
    }//GEN-LAST:event_campoNombreKeyReleased

    private void botonSaludoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSaludoMouseClicked
        // TODO add your handling code here:
        System.out.println("Soy el mouse click");
    }//GEN-LAST:event_botonSaludoMouseClicked

    private void botonSaludoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSaludoMouseDragged
        // TODO add your handling code here:
        System.out.println("Me muevo");
    }//GEN-LAST:event_botonSaludoMouseDragged

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
            java.util.logging.Logger.getLogger(MiPrimeraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiPrimeraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiPrimeraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiPrimeraVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiPrimeraVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonSaludo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel textoInformativo;
    // End of variables declaration//GEN-END:variables
}
