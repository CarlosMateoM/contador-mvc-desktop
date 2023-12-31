package contador.mvc.vista;

import java.awt.event.ActionListener;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }
    
    public void mostrarContador(int numero){
        contadorLb.setText("" + numero);
    }

    public void setActionListener(ActionListener actionListener) {
        incrementarBtn.addActionListener(actionListener);
        decrementarBtn.addActionListener(actionListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contadorLb = new javax.swing.JLabel();
        incrementarBtn = new javax.swing.JButton();
        decrementarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador");

        contadorLb.setFont(new java.awt.Font("Segoe UI", 0, 58)); // NOI18N
        contadorLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contadorLb.setText("0");

        incrementarBtn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        incrementarBtn.setText("+");

        decrementarBtn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        decrementarBtn.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contadorLb, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incrementarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decrementarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(incrementarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(decrementarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contadorLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contadorLb;
    private javax.swing.JButton decrementarBtn;
    private javax.swing.JButton incrementarBtn;
    // End of variables declaration//GEN-END:variables

}
