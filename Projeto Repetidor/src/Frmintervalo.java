/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rogerlevino
 */
public class Frmintervalo extends javax.swing.JFrame {

    /**
     * Creates new form Frmintervalo
     */
    public Frmintervalo() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtinicio = new javax.swing.JTextField();
        txtfim = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlista = new javax.swing.JTextArea();
        btnwhile = new javax.swing.JButton();
        btndowhile = new javax.swing.JButton();
        btnfor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("IMPRIMIR INTERVALO");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Início:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Fim:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Lista:");

        txtinicio.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtfim.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtlista.setColumns(20);
        txtlista.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        txtlista.setRows(5);
        jScrollPane1.setViewportView(txtlista);

        btnwhile.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnwhile.setText("While");
        btnwhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwhileActionPerformed(evt);
            }
        });

        btndowhile.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btndowhile.setText("Do While");
        btndowhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndowhileActionPerformed(evt);
            }
        });

        btnfor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        btnfor.setText("For");
        btnfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnforActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtinicio)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfim, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnwhile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndowhile)
                .addGap(33, 33, 33)
                .addComponent(btnfor)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnwhile)
                    .addComponent(btndowhile)
                    .addComponent(btnfor))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnwhileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwhileActionPerformed
        // TODO add your handling code here:
        txtlista.setText(null);
        
        int inicio, fim;
                
        inicio = Integer.parseInt(txtinicio.getText());
        fim    = Integer.parseInt(txtfim.getText());
        
        while (inicio <= fim){
            txtlista.append(String.valueOf(inicio) + "\n");
            inicio++;
        }
        // validar valor maior e menor e atriuir às variáveis
    }//GEN-LAST:event_btnwhileActionPerformed

    private void btndowhileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndowhileActionPerformed
        // TODO add your handling code here:
        txtlista.setText(null);
        
        int inicio, fim;
        
        inicio = Integer.parseInt(txtinicio.getText());
        fim    = Integer.parseInt(txtfim.getText());
        
        do {
            txtlista.append(String.valueOf(inicio) + "\n");
            inicio++;            
        } while (inicio <= fim);
        
        
    }//GEN-LAST:event_btndowhileActionPerformed

    private void btnforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnforActionPerformed
        // TODO add your handling code here:
        int inicio, fim;
        
        txtlista.setText(null);
        
        inicio = Integer.parseInt(txtinicio.getText());
        fim    = Integer.parseInt(txtfim.getText());
        
        for (int i = inicio; i <= fim; i++ ){
            txtlista.append(String.valueOf(i) + "\n");
        }
        
        
    }//GEN-LAST:event_btnforActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmintervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmintervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmintervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmintervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmintervalo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndowhile;
    private javax.swing.JButton btnfor;
    private javax.swing.JButton btnwhile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfim;
    private javax.swing.JTextField txtinicio;
    private javax.swing.JTextArea txtlista;
    // End of variables declaration//GEN-END:variables
}
