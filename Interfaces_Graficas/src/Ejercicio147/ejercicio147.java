package Ejercicio147;

import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class ejercicio147 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio147
     */
    private boolean pres;
    //private ImageIcon iconoGuardado;
    private int numBoton, numCarta;

    public ejercicio147() {
        initComponents();
        this.setLocationRelativeTo(null);
        pres = false;
        numCarta = -1;
        numBoton = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1001, 411));

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new java.awt.BorderLayout());

        labelTitulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Juegos de Cartas");
        jPanel1.add(labelTitulo, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(new java.awt.GridLayout(4, 4));

        boton1.setBackground(new java.awt.Color(153, 255, 204));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        jPanel2.add(boton1);

        boton2.setBackground(new java.awt.Color(153, 255, 204));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        jPanel2.add(boton2);

        boton3.setBackground(new java.awt.Color(153, 255, 204));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        jPanel2.add(boton3);

        boton4.setBackground(new java.awt.Color(153, 255, 204));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        jPanel2.add(boton4);

        boton5.setBackground(new java.awt.Color(153, 255, 204));
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        jPanel2.add(boton5);

        boton6.setBackground(new java.awt.Color(153, 255, 204));
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        jPanel2.add(boton6);

        boton7.setBackground(new java.awt.Color(153, 255, 204));
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        jPanel2.add(boton7);

        boton8.setBackground(new java.awt.Color(153, 255, 204));
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        jPanel2.add(boton8);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/1.PNG");
        boton1.setIcon(icono);
        if (!pres) {
            numCarta = 1;
            pres = true;
            numBoton = 1;
        } else if (pres && numBoton != 1) {
            if (1 != numCarta) {
                boton1.setIcon(null);
                switch (numBoton) {
                    case 2:
                        boton2.setIcon(null);
                        break;
                    case 3:
                        boton3.setIcon(null);
                        break;
                    case 4:
                        boton4.setIcon(null);
                        break;
                    case 5:
                        boton5.setIcon(null);
                        break;
                    case 6:
                        boton6.setIcon(null);
                        break;
                    case 7:
                        boton7.setIcon(null);
                        break;
                    case 8:
                        boton8.setIcon(null);
                        break;
                }

            } else {
                boton1.setEnabled(false);
                boton1.setVisible(false);
                switch (numBoton) {
                    case 2:
                        boton2.setEnabled(false);
                        boton2.setVisible(false);
                        break;
                    case 3:
                        boton3.setEnabled(false);
                        boton3.setVisible(false);
                        break;
                    case 4:
                        boton4.setVisible(false);
                        boton4.setEnabled(false);
                        break;
                    case 5:
                        boton5.setEnabled(false);
                        boton5.setVisible(false);
                        break;
                    case 6:
                        boton6.setEnabled(false);
                        boton6.setVisible(false);
                        break;
                    case 7:
                        boton7.setEnabled(false);
                        boton7.setVisible(false);
                        break;
                    case 8:
                        boton8.setEnabled(false);
                        boton8.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }

    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/4.PNG");
        boton2.setIcon(icono);
        if (!pres) {
            numCarta = 4;
            pres = true;
            numBoton = 2;
        } else if (pres && numBoton != 2) {
            if (4 != numCarta) {
                boton2.setIcon(null);
                switch (numBoton) {
                    case 1:
                        boton1.setIcon(null);
                        break;
                    case 3:
                        boton3.setIcon(null);
                        break;
                    case 4:
                        boton4.setIcon(null);
                        break;
                    case 5:
                        boton5.setIcon(null);
                        break;
                    case 6:
                        boton6.setIcon(null);
                        break;
                    case 7:
                        boton7.setIcon(null);
                        break;
                    case 8:
                        boton8.setIcon(null);
                        break;
                }

            } else {
                boton2.setEnabled(false);
                boton2.setVisible(false);
                switch (numBoton) {
                    case 1:
                        boton1.setEnabled(false);
                        boton1.setVisible(false);
                        break;
                    case 3:
                        boton3.setEnabled(false);
                        boton3.setVisible(false);
                        break;
                    case 4:
                        boton4.setVisible(false);
                        boton4.setEnabled(false);
                        break;
                    case 5:
                        boton5.setEnabled(false);
                        boton5.setVisible(false);
                        break;
                    case 6:
                        boton6.setEnabled(false);
                        boton6.setVisible(false);
                        break;
                    case 7:
                        boton7.setEnabled(false);
                        boton7.setVisible(false);
                        break;
                    case 8:
                        boton8.setEnabled(false);
                        boton8.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/1.PNG");
        boton3.setIcon(icono);
        if (!pres) {
            numCarta = 1;
            pres = true;
            numBoton = 3;
        } else if (pres && numBoton != 3) {
            if (1 != numCarta) {
                boton3.setIcon(null);
                switch (numBoton) {
                    case 1:
                        boton1.setIcon(null);
                        break;
                    case 2:
                        boton2.setIcon(null);
                        break;
                    case 4:
                        boton4.setIcon(null);
                        break;
                    case 5:
                        boton5.setIcon(null);
                        break;
                    case 6:
                        boton6.setIcon(null);
                        break;
                    case 7:
                        boton7.setIcon(null);
                        break;
                    case 8:
                        boton8.setIcon(null);
                        break;
                }

            } else {
                boton3.setEnabled(false);
                boton3.setVisible(false);
                switch (numBoton) {
                    case 2:
                        boton2.setEnabled(false);
                        boton2.setVisible(false);
                        break;
                    case 1:
                        boton1.setEnabled(false);
                        boton1.setVisible(false);
                        break;
                    case 4:
                        System.out.println("Entre aqui");
                        boton4.setVisible(false);
                        boton4.setEnabled(false);
                        break;
                    case 5:
                        boton5.setEnabled(false);
                        boton5.setVisible(false);
                        break;
                    case 6:
                        boton6.setEnabled(false);
                        boton6.setVisible(false);
                        break;
                    case 7:
                        boton7.setEnabled(false);
                        boton7.setVisible(false);
                        break;
                    case 8:
                        boton8.setEnabled(false);
                        boton8.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/3.PNG");
        boton4.setIcon(icono);
        if (!pres) {
            numCarta = 3;
            pres = true;
            numBoton = 4;
        } else if (pres && numBoton != 4) {
            if (3 != numCarta) {
                boton4.setIcon(null);
                switch (numBoton) {
                    case 1:
                        boton1.setIcon(null);
                        break;
                    case 2:
                        boton2.setIcon(null);
                        break;
                    case 3:
                        boton3.setIcon(null);
                        break;
                    case 5:
                        boton5.setIcon(null);
                        break;
                    case 6:
                        boton6.setIcon(null);
                        break;
                    case 7:
                        boton7.setIcon(null);
                        break;
                    case 8:
                        boton8.setIcon(null);
                        break;
                }

            } else {
                boton4.setEnabled(false);
                boton4.setVisible(false);
                switch (numBoton) {
                    case 2:
                        boton2.setEnabled(false);
                        boton2.setVisible(false);
                        break;
                    case 3:
                        boton3.setEnabled(false);
                        boton3.setVisible(false);
                        break;
                    case 1:
                        boton1.setVisible(false);
                        boton1.setEnabled(false);
                        break;
                    case 5:
                        boton5.setEnabled(false);
                        boton5.setVisible(false);
                        break;
                    case 6:
                        boton6.setEnabled(false);
                        boton6.setVisible(false);
                        break;
                    case 7:
                        boton7.setEnabled(false);
                        boton7.setVisible(false);
                        break;
                    case 8:
                        boton8.setEnabled(false);
                        boton8.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/2.PNG");
        boton5.setIcon(icono);
        if (!pres) {
            numCarta = 2;
            pres = true;
            numBoton = 5;
        } else if (pres && numBoton != 5) {
            if (2 != numCarta) {
                boton5.setIcon(null);
                switch (numBoton) {
                    case 1:
                        boton1.setIcon(null);
                        break;
                    case 2:
                        boton2.setIcon(null);
                        break;
                    case 4:
                        boton4.setIcon(null);
                        break;
                    case 3:
                        boton3.setIcon(null);
                        break;
                    case 6:
                        boton6.setIcon(null);
                        break;
                    case 7:
                        boton7.setIcon(null);
                        break;
                    case 8:
                        boton8.setIcon(null);
                        break;
                }

            } else {
                boton5.setEnabled(false);
                boton5.setVisible(false);
                switch (numBoton) {
                    case 2:
                        boton2.setEnabled(false);
                        boton2.setVisible(false);
                        break;
                    case 3:
                        boton3.setEnabled(false);
                        boton3.setVisible(false);
                        break;
                    case 4:
                        boton4.setVisible(false);
                        boton4.setEnabled(false);
                        break;
                    case 1:
                        boton1.setEnabled(false);
                        boton1.setVisible(false);
                        break;
                    case 6:
                        boton6.setEnabled(false);
                        boton6.setVisible(false);
                        break;
                    case 7:
                        boton7.setEnabled(false);
                        boton7.setVisible(false);
                        break;
                    case 8:
                        boton8.setEnabled(false);
                        boton8.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/3.PNG");
        boton6.setIcon(icono);
        if (!pres) {
            numCarta = 3;
            pres = true;
            numBoton = 6;
        } else if (pres && numBoton != 6) {
            if (3 != numCarta) {
                boton6.setIcon(null);
                switch (numBoton) {
                    case 1:
                        boton1.setIcon(null);
                        break;
                    case 2:
                        boton2.setIcon(null);
                        break;
                    case 4:
                        boton4.setIcon(null);
                        break;
                    case 5:
                        boton5.setIcon(null);
                        break;
                    case 3:
                        boton3.setIcon(null);
                        break;
                    case 7:
                        boton7.setIcon(null);
                        break;
                    case 8:
                        boton8.setIcon(null);
                        break;
                }

            } else {
                boton6.setEnabled(false);
                boton6.setVisible(false);
                switch (numBoton) {
                    case 2:
                        boton2.setEnabled(false);
                        boton2.setVisible(false);
                        break;
                    case 3:
                        boton3.setEnabled(false);
                        boton3.setVisible(false);
                        break;
                    case 4:
                        boton4.setVisible(false);
                        boton4.setEnabled(false);
                        break;
                    case 5:
                        boton5.setEnabled(false);
                        boton5.setVisible(false);
                        break;
                    case 1:
                        boton1.setEnabled(false);
                        boton1.setVisible(false);
                        break;
                    case 7:
                        boton7.setEnabled(false);
                        boton7.setVisible(false);
                        break;
                    case 8:
                        boton8.setEnabled(false);
                        boton8.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/4.PNG");
        boton7.setIcon(icono);
        if (!pres) {
            numCarta = 4;
            pres = true;
            numBoton = 8;
        } else if (pres && numBoton != 7) {
            if (4 != numCarta) {
                boton7.setIcon(null);
                switch (numBoton) {
                    case 1:
                        boton1.setIcon(null);
                        break;
                    case 2:
                        boton2.setIcon(null);
                        break;
                    case 4:
                        boton4.setIcon(null);
                        break;
                    case 5:
                        boton5.setIcon(null);
                        break;
                    case 6:
                        boton6.setIcon(null);
                        break;
                    case 3:
                        boton3.setIcon(null);
                        break;
                    case 8:
                        boton8.setIcon(null);
                        break;
                }

            } else {
                boton7.setEnabled(false);
                boton7.setVisible(false);
                switch (numBoton) {
                    case 2:
                        boton2.setEnabled(false);
                        boton2.setVisible(false);
                        break;
                    case 3:
                        boton3.setEnabled(false);
                        boton3.setVisible(false);
                        break;
                    case 4:
                        boton4.setVisible(false);
                        boton4.setEnabled(false);
                        break;
                    case 5:
                        boton5.setEnabled(false);
                        boton5.setVisible(false);
                        break;
                    case 6:
                        boton6.setEnabled(false);
                        boton6.setVisible(false);
                        break;
                    case 1:
                        boton1.setEnabled(false);
                        boton1.setVisible(false);
                        break;
                    case 8:
                        boton8.setEnabled(false);
                        boton8.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        // TODO add your handling code here:
        ImageIcon icono = new ImageIcon("src/Ejercicio147/img/3.PNG");
        boton8.setIcon(icono);
        if (!pres) {
            numCarta = 3;
            pres = true;
            numBoton = 3;
        } else if (pres && numBoton != 8) {
            if (3 != numCarta) {
                boton8.setIcon(null);
                switch (numBoton) {
                    case 1:
                        boton1.setIcon(null);
                        break;
                    case 2:
                        boton2.setIcon(null);
                        break;
                    case 4:
                        boton4.setIcon(null);
                        break;
                    case 5:
                        boton5.setIcon(null);
                        break;
                    case 6:
                        boton6.setIcon(null);
                        break;
                    case 7:
                        boton7.setIcon(null);
                        break;
                    case 3:
                        boton3.setIcon(null);
                        break;
                }

            } else {
                boton8.setEnabled(false);
                boton8.setVisible(false);
                switch (numBoton) {
                    case 2:
                        boton2.setEnabled(false);
                        boton2.setVisible(false);
                        break;
                    case 3:
                        boton3.setEnabled(false);
                        boton3.setVisible(false);
                        break;
                    case 4:
                        boton4.setVisible(false);
                        boton4.setEnabled(false);
                        break;
                    case 5:
                        boton5.setEnabled(false);
                        boton5.setVisible(false);
                        break;
                    case 6:
                        boton6.setEnabled(false);
                        boton6.setVisible(false);
                        break;
                    case 7:
                        boton7.setEnabled(false);
                        boton7.setVisible(false);
                        break;
                    case 1:
                        boton1.setEnabled(false);
                        boton1.setVisible(false);
                        break;
                }
            }
            pres = false;
            numBoton = -1;
        }
    }//GEN-LAST:event_boton8ActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio147.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio147.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio147.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio147.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio147().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
