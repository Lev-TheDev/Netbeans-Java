/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rogerlevino
 */
public class Frmcheckbox extends javax.swing.JFrame {

    /**
     * Creates new form Frmcheckbox
     */
    public Frmcheckbox() {
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

        lblprojeto = new javax.swing.JLabel();
        lblresposta = new javax.swing.JLabel();
        lblresposta1 = new javax.swing.JLabel();
        txtpreco = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ckborda = new javax.swing.JCheckBox();
        ckrefri = new javax.swing.JCheckBox();
        btncalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo CheckBox");

        lblprojeto.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        lblprojeto.setText("Exemplo CheckBox");

        lblresposta.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lblresposta.setText("Preço da Pizza:");

        lblresposta1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        lblresposta1.setText("Preço Total:");

        txtpreco.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        ckborda.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ckborda.setText("Borda recheada - R$ 2,00");

        ckrefri.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ckrefri.setText("Refrigerante Dolly - R$ 3,00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckborda)
                    .addComponent(ckrefri))
                .addGap(0, 301, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ckborda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckrefri)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btncalcular.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btncalcular.setText("Calcular");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(lblprojeto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblresposta)
                                    .addComponent(lblresposta1))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpreco)
                                    .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblprojeto)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresposta)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblresposta1)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // botão calcular
        double preco;
        
        
        preco = Double.parseDouble(txtpreco.getText());
        
        // verificando se a borda e refri foram selecionados - cenario 1
        if (ckborda.isSelected() && ckrefri.isSelected()) {
            preco += 5;            
        }
        // verificando se somente a borda foi selecionada
        else if (ckborda.isSelected()) {
            preco += 2;
        }
        // verificando se somente o refri foi selecionado
        else if (ckrefri.isSelected()) {
            preco += 3;
        }
        
        // exibindo valor final
        txttotal.setText(String.valueOf(preco));
        
    }//GEN-LAST:event_btncalcularActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmcheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmcheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmcheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmcheckbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmcheckbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalcular;
    private javax.swing.JCheckBox ckborda;
    private javax.swing.JCheckBox ckrefri;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblprojeto;
    private javax.swing.JLabel lblresposta;
    private javax.swing.JLabel lblresposta1;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
