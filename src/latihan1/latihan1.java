/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author Faras
 */
public class latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form latihan1
     */
    public latihan1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bilangan1 = new javax.swing.JTextField();
        Bilangan2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonBagi = new javax.swing.JButton();
        buttonKali = new javax.swing.JButton();
        buttonKurang = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setText("Kalkulator Sederhana");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(289, 41, 102, 66);
        jPanel1.add(Bilangan1);
        Bilangan1.setBounds(250, 130, 150, 20);

        Bilangan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bilangan2ActionPerformed(evt);
            }
        });
        jPanel1.add(Bilangan2);
        Bilangan2.setBounds(250, 160, 150, 20);

        jLabel3.setText("Bilangan 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 150, 80, 40);

        jLabel4.setText("Bilangan 1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 120, 80, 40);

        buttonBagi.setText("/");
        jPanel1.add(buttonBagi);
        buttonBagi.setBounds(400, 220, 80, 70);

        buttonKali.setText("x");
        jPanel1.add(buttonKali);
        buttonKali.setBounds(320, 220, 70, 70);

        buttonKurang.setText("-");
        jPanel1.add(buttonKurang);
        buttonKurang.setBounds(240, 220, 70, 70);

        buttonTambah.setText("+");
        jPanel1.add(buttonTambah);
        buttonTambah.setBounds(160, 220, 70, 70);

        jLabel2.setText("Hasil");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 310, 22, 14);
        jPanel1.add(hasil);
        hasil.setBounds(270, 330, 120, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 650, 400);

        setBounds(0, 0, 670, 446);
    }// </editor-fold>//GEN-END:initComponents

    private void Bilangan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bilangan2ActionPerformed
        // TODO add your handling code here:=
        
    }//GEN-LAST:event_Bilangan2ActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt){
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasil = bil1+bil2;
        
        Hasil.setInt(String.valueOf(hasil));
    }
        private void buttonKurangActionPerformed(java.awt.event.ActionEvent evt){
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasil = bil1-bil2;
        
        Hasil.setInt(String.valueOf(hasil));
        }
        private void buttonKaliActionPerformed(java.awt.event.ActionEvent evt){
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int aasil = bil1*bil2;
        
        Hasil.setInt(String.valueOf(aasil));
        }
        private void buttonBagiActionPerformed(java.awt.event.ActionEvent evt){
        int bil1 = Integer.parseInt(Bilangan1.getText());
        int bil2 = Integer.parseInt(Bilangan2.getText());
        int hasil = bil1/bil2;
        
        Hasil.setInt(String.valueOf(hasil));
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
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bilangan1;
    private javax.swing.JTextField Bilangan2;
    private javax.swing.JButton buttonBagi;
    private javax.swing.JButton buttonKali;
    private javax.swing.JButton buttonKurang;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
