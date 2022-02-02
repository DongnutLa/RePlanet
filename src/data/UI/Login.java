package data.UI;

import data.User;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    public static User currentUser;
    
    public Login() {
        initComponents();
    }

    public User RecoveryDataGUI(){
        User user = new User();
        String pwd = String.valueOf(formPassword.getPassword());
        user.setUsername(formUser.getText());
        user.setPassword(pwd);
        
        return user;
    }
    
    public User CurrentUser() {
        User user = RecoveryDataGUI();
        ResultSet result = user.currentUser();
        int score = 0;
        
        try {
            if (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String mail = result.getString("mail");
                if (result.getString("score") != null) {
                    score = Integer.parseInt(result.getString("score"));
                }
                int is_admin = result.getInt("is_admin");
                user.setId(id);
                user.setName(name);
                user.setMail(mail);
                user.setScore(score);
                user.setIs_admin(is_admin);
                
                currentUser = user;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return user;
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
        TopPanel = new javax.swing.JPanel();
        ClosePanel = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        txtLogin = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        formUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        formPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JPanel();
        txtEntrar = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Dongle", 0, 18)); // NOI18N
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TopPanel.setBackground(new java.awt.Color(204, 204, 204));
        TopPanel.setOpaque(false);
        TopPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopPanelMouseDragged(evt);
            }
        });
        TopPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopPanelMousePressed(evt);
            }
        });
        TopPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClosePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClosePanel.setOpaque(false);

        Close.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        Close.setForeground(new java.awt.Color(51, 51, 51));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setText("X");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ClosePanelLayout = new javax.swing.GroupLayout(ClosePanel);
        ClosePanel.setLayout(ClosePanelLayout);
        ClosePanelLayout.setHorizontalGroup(
            ClosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClosePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ClosePanelLayout.setVerticalGroup(
            ClosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClosePanelLayout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TopPanel.add(ClosePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 40));

        jPanel1.add(TopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));

        Background.setBackground(new java.awt.Color(181, 245, 82));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogin.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(51, 51, 51));
        txtLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogin.setText("INICIAR SESIÓN");
        Background.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 560, -1));

        txtPassword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(51, 51, 51));
        txtPassword.setText("CONTRASEÑA");
        Background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        txtUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(51, 51, 51));
        txtUser.setText("USUARIO");
        Background.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        formUser.setBackground(new java.awt.Color(181, 245, 82));
        formUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        formUser.setForeground(new java.awt.Color(102, 102, 102));
        formUser.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        formUser.setText("Ingrese su usuario");
        formUser.setBorder(null);
        formUser.setPreferredSize(new java.awt.Dimension(60, 40));
        formUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formUserMousePressed(evt);
            }
        });
        formUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formUserActionPerformed(evt);
            }
        });
        Background.add(formUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 380, 30));

        jSeparator1.setForeground(new java.awt.Color(128, 205, 12));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 380, 10));

        formPassword.setBackground(new java.awt.Color(181, 245, 82));
        formPassword.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        formPassword.setForeground(new java.awt.Color(102, 102, 102));
        formPassword.setText("Password");
        formPassword.setBorder(null);
        formPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formPasswordMousePressed(evt);
            }
        });
        formPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formPasswordActionPerformed(evt);
            }
        });
        Background.add(formPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 380, 30));

        jSeparator2.setForeground(new java.awt.Color(128, 205, 12));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 380, 10));

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));

        txtEntrar.setBackground(new java.awt.Color(204, 204, 204));
        txtEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEntrar.setForeground(new java.awt.Color(51, 51, 51));
        txtEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntrar.setText("ENTRAR");
        txtEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Background.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 120, 40));

        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 500));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/utils/RP-min.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 0, 218, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formUserActionPerformed

    private void TopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TopPanelMousePressed

    private void TopPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TopPanelMouseDragged

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        Close.setForeground(new java.awt.Color(181, 245, 82));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        Close.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_CloseMouseExited

    private void txtEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseEntered
        btnLogin.setBackground(new java.awt.Color(180, 180, 180));
    }//GEN-LAST:event_txtEntrarMouseEntered

    private void txtEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseExited
        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_txtEntrarMouseExited

    private void formPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formPasswordActionPerformed

    private void formUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formUserMousePressed
        if (formUser.getText().equals("Ingrese su usuario")) {
            formUser.setText("");
            formUser.setForeground(new java.awt.Color(51, 51, 51));
        }
        if (String.valueOf(formPassword.getPassword()).isEmpty()) {
            formPassword.setText("Password");
            formPassword.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_formUserMousePressed

    private void formPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formPasswordMousePressed
        if (String.valueOf(formPassword.getPassword()).equals("Password")) {
            formPassword.setText("");
            formPassword.setForeground(new java.awt.Color(51, 51, 51));
        }
        if (formUser.getText().isEmpty()) {
            formUser.setText("Ingrese su usuario");
            formUser.setForeground(new java.awt.Color(102, 102, 102));
        }
        
    }//GEN-LAST:event_formPasswordMousePressed

    private void txtEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseClicked
        User user = CurrentUser();
        ResultSet result = user.login();
            
        try {
            if (result.next()) {
                JOptionPane.showMessageDialog(null, "Gracias por iniciar sesión, "+user.getUsername()+"!");
                if (user.is_admin == 1) {
                    Login.setVisible(false);
                    MenuAdm.setVisible(true);
                    MenuAdm.setUserName(currentUser);
                } else {
                    Login.setVisible(false);
                    MenuUsr.setVisible(true);
                    MenuUsr.setUserName(currentUser);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "¡Usuario o clave incorrectos!", "Error", ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            
            System.out.println(e);
        }
    }//GEN-LAST:event_txtEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Close;
    private javax.swing.JPanel ClosePanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPasswordField formPassword;
    private javax.swing.JTextField formUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txtEntrar;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables

    public static Login Login = new Login();
    public static MenuAdm MenuAdm = new MenuAdm();
    public static MenuUsr MenuUsr = new MenuUsr();

}

