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
public class prject1 extends javax.swing.JFrame {

    /**
     * Creates new form prject1
     */
    public prject1() {
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

        try {
            buttonGroup1 =(javax.swing.ButtonGroup)java.beans.Beans.instantiate(getClass().getClassLoader(), "latihan1.prject1_buttonGroup1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        berat = new javax.swing.JLabel();
        tinggi = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        idnama = new javax.swing.JTextField();
        idberat = new javax.swing.JTextField();
        idtinggi = new javax.swing.JTextField();
        try {
            rdblaki =(javax.swing.JRadioButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "latihan1.prject1_rdblaki");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        try {
            rdbperempuan =(javax.swing.JRadioButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "latihan1.prject1_rdbperempuan");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        bthitung = new javax.swing.JButton();
        btulang = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        idideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idanalisa = new javax.swing.JTextField();
        idsaran = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK KESEHATAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 30, 80, 20);

        nama.setText("Nama");
        getContentPane().add(nama);
        nama.setBounds(60, 80, 27, 14);

        berat.setText("Berat Badan");
        getContentPane().add(berat);
        berat.setBounds(60, 110, 70, 20);

        tinggi.setText("Tinggi Badan");
        getContentPane().add(tinggi);
        tinggi.setBounds(60, 140, 70, 20);

        gender.setText("Jenis Kelamin");
        getContentPane().add(gender);
        gender.setBounds(60, 170, 80, 20);
        getContentPane().add(idnama);
        idnama.setBounds(140, 80, 170, 20);
        getContentPane().add(idberat);
        idberat.setBounds(140, 110, 140, 20);

        idtinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtinggiActionPerformed(evt);
            }
        });
        getContentPane().add(idtinggi);
        idtinggi.setBounds(140, 140, 140, 20);
        getContentPane().add(rdblaki);
        rdblaki.setBounds(140, 170, 65, 23);
        getContentPane().add(rdbperempuan);
        rdbperempuan.setBounds(230, 170, 79, 23);

        bthitung.setText("Hitung");
        bthitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthitungActionPerformed(evt);
            }
        });
        getContentPane().add(bthitung);
        bthitung.setBounds(60, 210, 63, 23);

        btulang.setText("Ulangi");
        btulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btulangActionPerformed(evt);
            }
        });
        getContentPane().add(btulang);
        btulang.setBounds(150, 210, 61, 23);

        btkeluar.setText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btkeluar);
        btkeluar.setBounds(240, 210, 63, 23);

        jLabel6.setText("Berat Badan Ideal Anda adalah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 260, 150, 20);
        getContentPane().add(idideal);
        idideal.setBounds(220, 260, 40, 20);

        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 260, 40, 20);

        jLabel8.setText("Hasil Analisa Kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 310, 120, 14);

        idanalisa.setText("?");
        getContentPane().add(idanalisa);
        idanalisa.setBounds(50, 330, 260, 20);

        idsaran.setText("Saran?");
        getContentPane().add(idsaran);
        idsaran.setBounds(50, 360, 260, 20);

        jLabel2.setText("kg");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 110, 40, 20);

        jLabel3.setText("cm");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 134, 40, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtinggiActionPerformed

    private void bthitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthitungActionPerformed
        // TODO add your handling code here:
        double t, b, h = 0;
        t = Double.valueOf(idtinggi.getText());
        b = Double.valueOf(idberat.getText());
        String nm = idnama.getText();
        
        if(rdblaki.isSelected()){
            h = (t-100);
        }else if (rdbperempuan.isSelected()){
            h = (t-104);
        }
        String temp = Double.toString(h);
        
        if(h<b){
            idideal.setText(temp);
            idanalisa.setText("Maaf" +nm+ "anda kekurangan berat badan");
            idsaran.setText("Makan yang banyak dan bergizi");
        }else if(h>b){
            idideal.setText(temp);
            idanalisa.setText("Maaf" +nm+ "anda kelebihan berat badan");
            idsaran.setText("Perbanyak olahraga dan atur pola makan");
        }else{
            idideal.setText(temp);
            idanalisa.setText("Berat ");
            idsaran.setText("Makan yang banyak dan bergizi");

            
        }
    }//GEN-LAST:event_bthitungActionPerformed

    private void btulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btulangActionPerformed
        // TODO add your handling code here:
        idnama.setText("");
        idberat.setText("");
        idtinggi.setText("");
        idsaran.setText("");
        idanalisa.setText("");
        
    }//GEN-LAST:event_btulangActionPerformed

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(prject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prject1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prject1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel berat;
    private javax.swing.JButton bthitung;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btulang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField idanalisa;
    private javax.swing.JTextField idberat;
    private javax.swing.JTextField idideal;
    private javax.swing.JTextField idnama;
    private javax.swing.JTextField idsaran;
    private javax.swing.JTextField idtinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nama;
    private javax.swing.JRadioButton rdblaki;
    private javax.swing.JRadioButton rdbperempuan;
    private javax.swing.JLabel tinggi;
    // End of variables declaration//GEN-END:variables
}
