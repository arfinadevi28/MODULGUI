/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ARVINA
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2() {
        initComponents();
    }

    Frame2(String nama, String absen, String kelas, String jurusan, String alamat) {
        initComponents();
        hasil1.setText(nama);
        hasil2.setText(absen);
        hasil3.setText(kelas);
        hasil4.setText(jurusan);
        hasil5.setText(alamat);
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
        hasil1 = new javax.swing.JLabel();
        hasil2 = new javax.swing.JLabel();
        hasil3 = new javax.swing.JLabel();
        hasil4 = new javax.swing.JLabel();
        hasil5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Hasil Biodata");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(149, 22, 90, 30);

        hasil1.setText("Hasil1");
        getContentPane().add(hasil1);
        hasil1.setBounds(22, 77, 60, 14);

        hasil2.setText("Hasil2");
        getContentPane().add(hasil2);
        hasil2.setBounds(22, 119, 80, 14);

        hasil3.setText("Hasil3");
        getContentPane().add(hasil3);
        hasil3.setBounds(22, 165, 70, 14);

        hasil4.setText("Hasil4");
        getContentPane().add(hasil4);
        hasil4.setBounds(22, 210, 70, 14);

        hasil5.setText("Hasil5");
        getContentPane().add(hasil5);
        hasil5.setBounds(22, 253, 70, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hasil1;
    private javax.swing.JLabel hasil2;
    private javax.swing.JLabel hasil3;
    private javax.swing.JLabel hasil4;
    private javax.swing.JLabel hasil5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
