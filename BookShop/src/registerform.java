
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public registerform() {
        initComponents();
          this.setLocationRelativeTo(null);  //center to the screen
        scaleimage();
        //this.setOpacity(0.8f);
    }

    public void scaleimage() {

        ImageIcon icon = new ImageIcon("F:\\New folder\\12.jpg");

        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(cover1.getWidth(), cover1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        cover1.setIcon(scaledIcon);
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
        jLabelFn = new javax.swing.JLabel();
        jLabelFn1 = new javax.swing.JLabel();
        jLabelFn2 = new javax.swing.JLabel();
        jLabelFn3 = new javax.swing.JLabel();
        jLabelFn4 = new javax.swing.JLabel();
        FN = new javax.swing.JTextField();
        LN = new javax.swing.JTextField();
        User = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        clicklogin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        repass = new javax.swing.JPasswordField();
        jLabelFn5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        pno = new javax.swing.JTextField();
        cover1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(940, 494));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 490));
        jPanel1.setLayout(null);

        jLabelFn.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabelFn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFn.setText("Re-Type Pass :");
        jPanel1.add(jLabelFn);
        jLabelFn.setBounds(176, 290, 100, 20);

        jLabelFn1.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabelFn1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFn1.setText("First Name :");
        jPanel1.add(jLabelFn1);
        jLabelFn1.setBounds(190, 140, 80, 20);

        jLabelFn2.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabelFn2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFn2.setText("Last Name :");
        jPanel1.add(jLabelFn2);
        jLabelFn2.setBounds(190, 180, 80, 20);

        jLabelFn3.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabelFn3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFn3.setText("Phone:");
        jPanel1.add(jLabelFn3);
        jLabelFn3.setBounds(190, 330, 70, 20);

        jLabelFn4.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabelFn4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFn4.setText("Password :");
        jPanel1.add(jLabelFn4);
        jLabelFn4.setBounds(190, 250, 80, 20);

        FN.setBackground(new java.awt.Color(18, 0, 0));
        FN.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        FN.setForeground(new java.awt.Color(255, 255, 255));
        FN.setBorder(null);
        FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNActionPerformed(evt);
            }
        });
        jPanel1.add(FN);
        FN.setBounds(280, 140, 170, 20);

        LN.setBackground(new java.awt.Color(18, 0, 0));
        LN.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        LN.setForeground(new java.awt.Color(255, 255, 255));
        LN.setBorder(null);
        LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNActionPerformed(evt);
            }
        });
        jPanel1.add(LN);
        LN.setBounds(280, 180, 170, 20);

        User.setBackground(new java.awt.Color(18, 0, 0));
        User.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setBorder(null);
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jPanel1.add(User);
        User.setBounds(280, 220, 170, 20);

        pass.setBackground(new java.awt.Color(18, 0, 0));
        pass.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(280, 250, 170, 20);

        register.setBackground(new java.awt.Color(0, 0, 0));
        register.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(370, 390, 83, 29);

        clicklogin.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        clicklogin.setForeground(new java.awt.Color(255, 255, 255));
        clicklogin.setText("Click Here To Login");
        clicklogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clicklogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickloginMouseClicked(evt);
            }
        });
        jPanel1.add(clicklogin);
        clicklogin.setBounds(280, 430, 130, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 390, 80, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(280, 160, 170, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(280, 200, 170, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(280, 240, 170, 10);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(280, 310, 170, 10);

        jLabel1.setFont(new java.awt.Font("Sitka Display", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create An Account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 80, 210, 50);

        repass.setBackground(new java.awt.Color(18, 0, 0));
        repass.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        repass.setForeground(new java.awt.Color(255, 255, 255));
        repass.setBorder(null);
        repass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repassActionPerformed(evt);
            }
        });
        jPanel1.add(repass);
        repass.setBounds(280, 290, 170, 20);

        jLabelFn5.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabelFn5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFn5.setText("Username :");
        jPanel1.add(jLabelFn5);
        jLabelFn5.setBounds(190, 220, 70, 20);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(280, 350, 170, 20);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(280, 272, 170, 10);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(270, 450, 130, 2);

        pno.setBackground(new java.awt.Color(18, 0, 0));
        pno.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        pno.setForeground(new java.awt.Color(255, 255, 255));
        pno.setBorder(null);
        jPanel1.add(pno);
        pno.setBounds(280, 330, 170, 19);

        cover1.setText("cover1");
        cover1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cover1MouseDragged(evt);
            }
        });
        cover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cover1MousePressed(evt);
            }
        });
        jPanel1.add(cover1);
        cover1.setBounds(0, 0, 940, 494);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickloginMouseClicked

        login lg = new login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_clickloginMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String fname = FN.getText();
        String lname = LN.getText();
        String uname = User.getText();
        String phone = pno.getText();
        String password = String.valueOf(pass.getPassword());
        String re_pass = String.valueOf(repass.getPassword());

        if ((fname.equals("")) || (lname.equals("")) ||(phone.equals("")) || (uname.equals("")) || (password.equals(""))) {
            JOptionPane.showMessageDialog(null, "Some Field Missing");
        } else if (!password.equals(re_pass)) {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match");
        } else if (CheckUserName(uname)) {
            JOptionPane.showMessageDialog(null, "This User Name Already Exist");
        } else {

            PreparedStatement ps;
            String query = "INSERT INTO `register`(`FirstN`, `LastN`, `Phone`,`Username`, `Password`) VALUES (?,?,?,?,?)";
            try {
                ps = MyConnection.getConnection().prepareStatement(query);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, phone);
                ps.setString(4, uname);
                ps.setString(5, password);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New User Add");
                    FN.setText("");
                    LN.setText("");
                    User.setText("");
                    pass.setText("");
                    pno.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Failed to Add");
                }

            } catch (SQLException ex) {
                Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_registerActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNActionPerformed

    private void LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNActionPerformed
    private int xMouse, yMouse;
    private void cover1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cover1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_cover1MousePressed

    private void cover1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cover1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_cover1MouseDragged

    private void repassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repassActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed
// Function to Check Duplicate Username

    public boolean CheckUserName(String username) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `register` WHERE `Username`=?";

        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();

            if (rs.next()) {

                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(registerform.class.getName()).log(Level.SEVERE, null, ex);
        }

        return checkUser;

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FN;
    private javax.swing.JTextField LN;
    private javax.swing.JTextField User;
    private javax.swing.JLabel clicklogin;
    private javax.swing.JLabel cover1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFn;
    private javax.swing.JLabel jLabelFn1;
    private javax.swing.JLabel jLabelFn2;
    private javax.swing.JLabel jLabelFn3;
    private javax.swing.JLabel jLabelFn4;
    private javax.swing.JLabel jLabelFn5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField pno;
    private javax.swing.JButton register;
    private javax.swing.JPasswordField repass;
    // End of variables declaration//GEN-END:variables
}