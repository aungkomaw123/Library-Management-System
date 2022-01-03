
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management_system;

import java.awt.Color;
import java.sql.*;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import project.ConnectionProvider;

/**
 *
 * @author akm
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
        initComponents();
        addPlaceholderStyle(b_price);
    }

    public void addPlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);//setting font color
    }

    public void removePlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);//setting font color
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b_name = new javax.swing.JTextField();
        pub = new javax.swing.JTextField();
        b_price = new javax.swing.JTextField();
        b_publish_year = new javax.swing.JTextField();
        b_edition = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        l_name = new javax.swing.JLabel();
        l_publisher = new javax.swing.JLabel();
        l_price = new javax.swing.JLabel();
        l_publish_year = new javax.swing.JLabel();
        l_edition = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 201, 237));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Add Book");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Publisher:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Price:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Publish Year:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Edition:");

        b_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b_nameKeyReleased(evt);
            }
        });

        pub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pubKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pubKeyReleased(evt);
            }
        });

        b_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_price.setText("price in MMK");
        b_price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                b_priceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                b_priceFocusLost(evt);
            }
        });
        b_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_priceActionPerformed(evt);
            }
        });
        b_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b_priceKeyReleased(evt);
            }
        });

        b_publish_year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_publish_year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b_publish_yearKeyReleased(evt);
            }
        });

        b_edition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_edition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b_editionKeyReleased(evt);
            }
        });

        btn_save.setBackground(new java.awt.Color(209, 101, 24));
        btn_save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorder(null);
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(209, 101, 24));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(null);
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(209, 101, 24));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        l_name.setBackground(new java.awt.Color(0, 0, 0,80)
        );
        l_name.setForeground(new java.awt.Color(102, 102, 102));

        l_publisher.setBackground(new java.awt.Color(0, 0, 0));
        l_publisher.setForeground(new java.awt.Color(102, 102, 102));

        l_price.setBackground(new java.awt.Color(0, 0, 0));
        l_price.setForeground(new java.awt.Color(102, 102, 102));

        l_publish_year.setBackground(new java.awt.Color(0, 0, 0));
        l_publish_year.setForeground(new java.awt.Color(102, 102, 102));

        l_edition.setBackground(new java.awt.Color(0, 0, 0));
        l_edition.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_publish_year, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_price, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pub, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_name, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_edition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(l_publish_year, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_publisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(l_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(l_price, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_publish_year, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(b_publish_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_edition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(l_edition, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 470, 400));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection con;
    PreparedStatement pst;
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        String book_name = b_name.getText();
        String publisher = pub.getText();
        String price = b_price.getText();
        String publish_year = b_publish_year.getText();
        String edition = b_edition.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            if (book_name.trim().length() == 0 || book_name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Name cannot be empty");
            } else if (publisher.trim().length() == 0 || publisher.trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Publisher name cannot be empty");
            } else if (price.trim().length() == 0 || price.trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Price cannot be empty");
            } else if (publish_year.trim().length() == 0 || publish_year.trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Publish_year cannot be empty");
            } else if (edition.trim().length() == 0 || edition.trim().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Edition cannot be empty");
            } else {

                pst = con.prepareStatement("insert into book(book_name,publisher,price,publish_year,edition)values(?,?,?,?,?)");
                pst.setString(1, book_name);
                pst.setString(2, publisher);
                pst.setString(3, price);
                pst.setString(4, publish_year);
                pst.setString(5, edition);
                int k = pst.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "Successfully Added! ");

                    b_name.setText("");
                    pub.setText("");
                    b_price.setText("");
                    b_publish_year.setText("");
                    b_edition.setText("");

                } else {
                    JOptionPane.showMessageDialog(this, "Error");
                }

                setVisible(false);
                new AddBook().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error");

        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:

        b_name.setText("");
        pub.setText("");
        b_price.setText("");
        b_publish_year.setText("");
        b_edition.setText("");

    }//GEN-LAST:event_btn_cancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Main().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void b_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_nameKeyReleased
        // TODO add your handling code here:
//        String PATTERN ="^[A-Za-z]\\w{5,29}";
//        Pattern patt = Pattern.compile(PATTERN);
//        Matcher match = patt.matcher(b_name.getText());
//        if(!match.matches()){
//            l_name.setText("Incorect!");
//        }
//        else{
//            l_name.setText(null);
//        }
    }//GEN-LAST:event_b_nameKeyReleased

    private void pubKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pubKeyReleased
        // TODO add your handling code here:
//        String PATTERN ="^[A-Za-z]\\w{5,29}$";
//        Pattern patt = Pattern.compile(PATTERN);
//        Matcher match = patt.matcher(pub.getText());
//        if(!match.matches()){
//            l_publisher.setText("Incorect!");
//        }
//        else{
//            l_publisher.setText(null);
//        }
    }//GEN-LAST:event_pubKeyReleased

    private void b_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_nameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            b_name.setEditable(true);
            l_name.setText("Correct");
        } else {
            b_name.setEditable(false);
            l_name.setText("InCorrect");
        }
    }//GEN-LAST:event_b_nameKeyPressed

    private void pubKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pubKeyPressed
        // code ofr jTextfield that accet letter whitespace and delete backsapce key only
        char c = evt.getKeyChar();
        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            //iso control for edit operation (delete key and backspace key allow)
            //if endter character is letter, space and isocontrol char than allow to edit
            pub.setEditable(true);
            l_publisher.setText("Correct");
        } else {
            pub.setEditable(false);
            l_publisher.setText("InCorrect");
    }//GEN-LAST:event_pubKeyPressed
    }
    private void b_publish_yearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_publish_yearKeyReleased
        // TODO add your handling code here:
        String PATTERN = "[0-9]{0,12}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(b_publish_year.getText());
        if (!match.matches()) {
            l_publish_year.setText("Incorect!");
        } else {
            l_publish_year.setText(null);
        }
    }//GEN-LAST:event_b_publish_yearKeyReleased

    private void b_editionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_editionKeyReleased
        // TODO add your handling code here:
        String PATTERN = "[0-6]$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(b_edition.getText());
        if (!match.matches()) {
            l_edition.setText("Incorect!");
        } else {
            l_edition.setText(null);
        }
    }//GEN-LAST:event_b_editionKeyReleased

    private void b_priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_priceKeyReleased
        // TODO add your handling code here:
        String PATTERN = "[0-9]{0,10}[M]{1}[M]{1}[K}]{1}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(b_price.getText());
        if (!match.matches()) {
            l_price.setText("Incorect!");
        } else {
            l_price.setText(null);
        }
    }//GEN-LAST:event_b_priceKeyReleased

    private void b_priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b_priceFocusGained
        // TODO add your handling code here:
        if (b_price.getText().equals("Price In MMK")) {
            b_price.setText(null);
            b_price.requestFocus();
            removePlaceholderStyle(b_price);
        }
    }//GEN-LAST:event_b_priceFocusGained

    private void b_priceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_b_priceFocusLost
        // TODO add your handling code here:
        if (b_price.getText().length() == 0) {
            addPlaceholderStyle(b_price);
            b_price.setText("Price In MMK");
        }
    }//GEN-LAST:event_b_priceFocusLost

    private void b_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_priceActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b_edition;
    private javax.swing.JTextField b_name;
    private javax.swing.JTextField b_price;
    private javax.swing.JTextField b_publish_year;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_edition;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel l_price;
    private javax.swing.JLabel l_publish_year;
    private javax.swing.JLabel l_publisher;
    private javax.swing.JTextField pub;
    // End of variables declaration//GEN-END:variables
}
