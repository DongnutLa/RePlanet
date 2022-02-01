package data.UI;

import data.User;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Menu() {
        initComponents();
        
        Principal principal = new Principal();
        principal.setSize(680, 500);
        principal.setLocation(0, 0);
        
        content.removeAll();
        content.add(principal, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TopPanel = new javax.swing.JPanel();
        ClosePanel = new javax.swing.JPanel();
        txtClose = new javax.swing.JLabel();
        txtSlogan = new javax.swing.JLabel();
        MenuBar = new javax.swing.JPanel();
        scheduleMenu = new javax.swing.JPanel();
        txtSchedule = new javax.swing.JLabel();
        ScheduleListMenu = new javax.swing.JPanel();
        txtScheduleList = new javax.swing.JLabel();
        ProductListMenu = new javax.swing.JPanel();
        txtProductList = new javax.swing.JLabel();
        UserListMenu = new javax.swing.JPanel();
        txtUserList = new javax.swing.JLabel();
        LogoutMenu = new javax.swing.JPanel();
        SeparatorRePlanet = new javax.swing.JSeparator();
        RePlanet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        SeparatorRePlanet1 = new javax.swing.JSeparator();
        TitlePanel = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        ClosePanel.setOpaque(false);

        txtClose.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        txtClose.setForeground(new java.awt.Color(51, 51, 51));
        txtClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClose.setText("X");
        txtClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ClosePanelLayout = new javax.swing.GroupLayout(ClosePanel);
        ClosePanel.setLayout(ClosePanelLayout);
        ClosePanelLayout.setHorizontalGroup(
            ClosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtClose, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        ClosePanelLayout.setVerticalGroup(
            ClosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClosePanelLayout.createSequentialGroup()
                .addComponent(txtClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        TopPanel.add(ClosePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

        txtSlogan.setFont(new java.awt.Font("Dongle", 2, 18)); // NOI18N
        txtSlogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSlogan.setText("Centro de recolección de residuos \\ RePlanet");
        TopPanel.add(txtSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 680, 40));

        jPanel1.add(TopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        MenuBar.setBackground(new java.awt.Color(181, 245, 82));
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scheduleMenu.setOpaque(false);

        txtSchedule.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        txtSchedule.setForeground(new java.awt.Color(51, 51, 51));
        txtSchedule.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/utils/cita.png"))); // NOI18N
        txtSchedule.setText("Agendar cita");
        txtSchedule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSchedule.setIconTextGap(16);
        txtSchedule.setInheritsPopupMenu(false);
        txtSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtScheduleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtScheduleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout scheduleMenuLayout = new javax.swing.GroupLayout(scheduleMenu);
        scheduleMenu.setLayout(scheduleMenuLayout);
        scheduleMenuLayout.setHorizontalGroup(
            scheduleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        scheduleMenuLayout.setVerticalGroup(
            scheduleMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MenuBar.add(scheduleMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 40));

        ScheduleListMenu.setBackground(new java.awt.Color(204, 204, 204));
        ScheduleListMenu.setOpaque(false);

        txtScheduleList.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        txtScheduleList.setForeground(new java.awt.Color(51, 51, 51));
        txtScheduleList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtScheduleList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/utils/ListaCitas.png"))); // NOI18N
        txtScheduleList.setText("Lista de citas");
        txtScheduleList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtScheduleList.setIconTextGap(16);
        txtScheduleList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtScheduleListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ScheduleListMenuLayout = new javax.swing.GroupLayout(ScheduleListMenu);
        ScheduleListMenu.setLayout(ScheduleListMenuLayout);
        ScheduleListMenuLayout.setHorizontalGroup(
            ScheduleListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ScheduleListMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtScheduleList, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        ScheduleListMenuLayout.setVerticalGroup(
            ScheduleListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtScheduleList, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MenuBar.add(ScheduleListMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 40));

        ProductListMenu.setOpaque(false);

        txtProductList.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        txtProductList.setForeground(new java.awt.Color(51, 51, 51));
        txtProductList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtProductList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/utils/Productos.png"))); // NOI18N
        txtProductList.setText("Lista de productos");
        txtProductList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtProductList.setIconTextGap(16);
        txtProductList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProductListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProductListMenuLayout = new javax.swing.GroupLayout(ProductListMenu);
        ProductListMenu.setLayout(ProductListMenuLayout);
        ProductListMenuLayout.setHorizontalGroup(
            ProductListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductListMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtProductList, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        ProductListMenuLayout.setVerticalGroup(
            ProductListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtProductList, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MenuBar.add(ProductListMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 40));

        UserListMenu.setBackground(new java.awt.Color(204, 204, 204));
        UserListMenu.setOpaque(false);

        txtUserList.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        txtUserList.setForeground(new java.awt.Color(51, 51, 51));
        txtUserList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtUserList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/utils/usuarios.png"))); // NOI18N
        txtUserList.setText("Usuarios");
        txtUserList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUserList.setIconTextGap(16);
        txtUserList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UserListMenuLayout = new javax.swing.GroupLayout(UserListMenu);
        UserListMenu.setLayout(UserListMenuLayout);
        UserListMenuLayout.setHorizontalGroup(
            UserListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserListMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUserList, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
        );
        UserListMenuLayout.setVerticalGroup(
            UserListMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtUserList, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        MenuBar.add(UserListMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 220, 40));

        LogoutMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutMenu.setOpaque(false);
        LogoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LogoutMenuLayout = new javax.swing.GroupLayout(LogoutMenu);
        LogoutMenu.setLayout(LogoutMenuLayout);
        LogoutMenuLayout.setHorizontalGroup(
            LogoutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        LogoutMenuLayout.setVerticalGroup(
            LogoutMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        MenuBar.add(LogoutMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 220, 40));

        SeparatorRePlanet.setBackground(new java.awt.Color(181, 245, 82));
        SeparatorRePlanet.setForeground(new java.awt.Color(51, 51, 51));
        MenuBar.add(SeparatorRePlanet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 180, 10));

        RePlanet.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        RePlanet.setForeground(new java.awt.Color(51, 51, 51));
        RePlanet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RePlanet.setText("RePlanet");
        MenuBar.add(RePlanet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 50));

        jLabel1.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/utils/logout.png"))); // NOI18N
        jLabel1.setText("Cerrar sesión");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setIconTextGap(16);
        MenuBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 210, 40));

        userName.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userName.setText("User");
        MenuBar.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 200, -1));

        SeparatorRePlanet1.setBackground(new java.awt.Color(181, 245, 82));
        SeparatorRePlanet1.setForeground(new java.awt.Color(51, 51, 51));
        MenuBar.add(SeparatorRePlanet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 10));

        jPanel1.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        TitlePanel.setBackground(new java.awt.Color(196, 248, 118));

        txtTitle.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(51, 51, 51));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTitle.setText("Menú Principal");

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(TitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 680, 60));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 680, 500));

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

    private void txtCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtCloseMouseClicked

    private void txtCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseEntered
        txtClose.setForeground(new java.awt.Color(181, 245, 82));
    }//GEN-LAST:event_txtCloseMouseEntered

    private void txtCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseExited
        txtClose.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_txtCloseMouseExited

    private void TopPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TopPanelMouseDragged

    private void TopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TopPanelMousePressed

    private void txtScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtScheduleMouseClicked
        
    }//GEN-LAST:event_txtScheduleMouseClicked

    private void txtScheduleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtScheduleMousePressed
        Schedule schedule = new Schedule();
        schedule.setSize(680, 500);
        schedule.setLocation(0, 0);
        
        content.removeAll();
        content.add(schedule, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        txtTitle.setText("Agendar Cita");
    }//GEN-LAST:event_txtScheduleMousePressed

    private void txtScheduleListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtScheduleListMouseClicked
        ScheduleList scheduleList = new ScheduleList();
        scheduleList.setSize(680, 500);
        scheduleList.setLocation(0, 0);
        
        content.removeAll();
        content.add(scheduleList, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        txtTitle.setText("Lista de citas");
    }//GEN-LAST:event_txtScheduleListMouseClicked

    private void txtUserListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserListMouseClicked
        Users users = new Users();
        users.setSize(680, 500);
        users.setLocation(0, 0);
        
        content.removeAll();
        content.add(users, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        txtTitle.setText("Lista de usuarios");
    }//GEN-LAST:event_txtUserListMouseClicked

    private void txtProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductListMouseClicked
        // TODO add your handling code here:
        ProductsList prdList = new ProductsList();
        prdList.setSize(680, 500);
        prdList.setLocation(0, 0);
        
        content.removeAll();
        content.add(prdList, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        txtTitle.setText("Lista de productos en stock");
    }//GEN-LAST:event_txtProductListMouseClicked

    private void LogoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMenuMouseClicked
        // TODO add your handling code here:
        try {
            JOptionPane.showMessageDialog(null, "Has cerrado sesión.\n¡Vuelve pronto!");
            Menu.setVisible(false);
            Menu.dispose();
            Login.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Hubo un error!", "Error", ERROR_MESSAGE);
            System.out.println(e);
        }
    }//GEN-LAST:event_LogoutMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClosePanel;
    private javax.swing.JPanel LogoutMenu;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel ProductListMenu;
    private javax.swing.JLabel RePlanet;
    private javax.swing.JPanel ScheduleListMenu;
    private javax.swing.JSeparator SeparatorRePlanet;
    private javax.swing.JSeparator SeparatorRePlanet1;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel UserListMenu;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel scheduleMenu;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtProductList;
    private javax.swing.JLabel txtSchedule;
    private javax.swing.JLabel txtScheduleList;
    private javax.swing.JLabel txtSlogan;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtUserList;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
    public void setUserName(User user){
        this.userName.setText(user.username);
    }
    public static Login Login = new Login();
    public static Menu Menu = new Menu();
}
