/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the tempdlate in the editor.
 */
package library_management_system;

/**
 *
 * @author akm
 */
public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
    /**
     * this is the home frame of library management system 
     * this frame show when both user and admin run the program
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_admin_login = new javax.swing.JButton();
        btn_member_Login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\naymyoaung\\Pictures\\Library management system\\App logo.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 360, 250));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Please Choose::");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 150, 30));

        btn_admin_login.setBackground(new java.awt.Color(209, 101, 24));
        btn_admin_login.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_admin_login.setText("Admin Login");
        btn_admin_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_admin_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_admin_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_admin_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 140, 40));

        btn_member_Login.setBackground(new java.awt.Color(209, 101, 24));
        btn_member_Login.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn_member_Login.setText("Member Login");
        btn_member_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_member_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_member_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_member_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 140, 40));

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel3.setText("Welcome To The Library Management System");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel4.setBackground(new java.awt.Color(102, 204, 0));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_admin_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_admin_loginActionPerformed
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_admin_loginActionPerformed

    private void btn_member_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_member_LoginActionPerformed
        setVisible(false);
        new UserLogin().setVisible(true);
    }//GEN-LAST:event_btn_member_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_admin_login;
    private javax.swing.JButton btn_member_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
