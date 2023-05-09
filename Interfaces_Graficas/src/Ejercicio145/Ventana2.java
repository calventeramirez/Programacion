package Ejercicio145;

/**
 *
 * @author usuario
 */
public class Ventana2 extends javax.swing.JDialog {

    /**
     * Creates new form Ventana2
     */
    public Ventana2(java.awt.Frame parent, boolean modal, int numeroJugador, int numeroMaquina, int paresNones) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        if (paresNones == 0) {
            if ((numeroJugador + numeroMaquina) % 2 == 0) {
                jTextArea1.setText("El jugador ha sacado un: " + numeroJugador + ". La maquina ha sacado un: " + numeroMaquina + ". Ha ganado el jugador.");
            } else {
                jTextArea1.setText("El jugador ha sacado un: " + numeroJugador + ". La maquina ha sacado un: " + numeroMaquina + ". Ha ganado la maquina.");
            }
        } else if(paresNones == 1){
            if ((numeroJugador + numeroMaquina) % 2 != 0) {
                jTextArea1.setText("El jugador ha sacado un: " + numeroJugador + ". La maquina ha sacado un: " + numeroMaquina + ". Ha ganado el jugador.");
            } else {
                jTextArea1.setText("El jugador ha sacado un: " + numeroJugador + ". La maquina ha sacado un: " + numeroMaquina + ". Ha ganado la maquina.");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
