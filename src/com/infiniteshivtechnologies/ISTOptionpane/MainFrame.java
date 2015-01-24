
package com.infiniteshivtechnologies.ISTOptionpane;

import javax.swing.ImageIcon;


public class MainFrame extends javax.swing.JFrame {

 public static boolean option = false;
 ISTOptionpane ist = new ISTOptionpane();
    public MainFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        title_lab = new javax.swing.JLabel();
        question_lab = new javax.swing.JLabel();
        ok_but_lab = new javax.swing.JLabel();
        bkg = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        title_lab.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        title_lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_lab.setText("Configuration");
        getContentPane().add(title_lab);
        title_lab.setBounds(0, 0, 400, 20);

        question_lab.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        question_lab.setText("Do you want to save?");
        getContentPane().add(question_lab);
        question_lab.setBounds(50, 40, 330, 40);

        ok_but_lab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_but_labMouseClicked(evt);
            }
        });
        getContentPane().add(ok_but_lab);
        ok_but_lab.setBounds(125, 145, 150, 25);

        bkg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/infiniteshivtechnologies/ISTOptionpane/message_bkg_okk.png"))); // NOI18N
        getContentPane().add(bkg);
        bkg.setBounds(0, 0, 400, 200);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ok_but_labMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_but_labMouseClicked

        this.dispose();
    }//GEN-LAST:event_ok_but_labMouseClicked

    
    
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel ok_but_lab;
    public static javax.swing.JLabel question_lab;
    public static javax.swing.JLabel title_lab;
    // End of variables declaration//GEN-END:variables
}
