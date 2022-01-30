package data.UI;

public class Schedule extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Schedule() {
        initComponents();
        Menu.setVisible(false);
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
        TitlePanel = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        homeTypeForm = new javax.swing.JTextField();
        ClothesForm = new javax.swing.JTextField();
        addressForm = new javax.swing.JTextField();
        homeTypeLabel = new javax.swing.JLabel();
        ElectronicsLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cityForm2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        ElectronicsForm = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        ToysForm = new javax.swing.JTextField();
        InstrumentsForm = new javax.swing.JTextField();
        BooksForm = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        FurnisForm = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        ToolsForm = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        ObservationsLabel = new javax.swing.JLabel();
        InstrumentsLabel = new javax.swing.JLabel();
        ToolsLabel = new javax.swing.JLabel();
        ToysLabel = new javax.swing.JLabel();
        ClothesLabel = new javax.swing.JLabel();
        BooksLabel = new javax.swing.JLabel();
        FurnisLabel = new javax.swing.JLabel();
        ObservationsForm = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        infoLabel = new javax.swing.JLabel();
        PayLabel = new javax.swing.JLabel();
        PayForm = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        BtnSchedule = new javax.swing.JPanel();
        txtBtnSchedule = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        cityLabel11 = new javax.swing.JLabel();
        quantityLabel1 = new javax.swing.JLabel();
        MessagePanel = new javax.swing.JPanel();
        TxtMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 900, 600));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
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

        LogoutMenu.setOpaque(false);

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
        MenuBar.add(SeparatorRePlanet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, -1));

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

        jPanel1.add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 600));

        TitlePanel.setBackground(new java.awt.Color(196, 248, 118));

        txtTitle.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(51, 51, 51));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTitle.setText("Agendar cita");

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

        homeTypeForm.setBackground(new java.awt.Color(200, 200, 200));
        homeTypeForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        homeTypeForm.setForeground(new java.awt.Color(51, 51, 51));
        homeTypeForm.setBorder(null);
        homeTypeForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeTypeFormActionPerformed(evt);
            }
        });
        jPanel1.add(homeTypeForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 180, 30));

        ClothesForm.setBackground(new java.awt.Color(200, 200, 200));
        ClothesForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        ClothesForm.setForeground(new java.awt.Color(51, 51, 51));
        ClothesForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ClothesForm.setText("0");
        ClothesForm.setBorder(null);
        ClothesForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClothesFormActionPerformed(evt);
            }
        });
        jPanel1.add(ClothesForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 40, 30));

        addressForm.setBackground(new java.awt.Color(200, 200, 200));
        addressForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        addressForm.setForeground(new java.awt.Color(51, 51, 51));
        addressForm.setBorder(null);
        addressForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFormActionPerformed(evt);
            }
        });
        jPanel1.add(addressForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 180, 30));

        homeTypeLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        homeTypeLabel.setText("Tipo de casa");
        jPanel1.add(homeTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 120, 30));

        ElectronicsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ElectronicsLabel.setText("Electrónicos");
        jPanel1.add(ElectronicsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 90, 30));

        addressLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        addressLabel.setText("Dirección");
        jPanel1.add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 120, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator1.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 180, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator2.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 10));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator3.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 180, 10));

        cityForm2.setBackground(new java.awt.Color(200, 200, 200));
        cityForm2.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        cityForm2.setForeground(new java.awt.Color(51, 51, 51));
        cityForm2.setBorder(null);
        cityForm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityForm2ActionPerformed(evt);
            }
        });
        jPanel1.add(cityForm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 180, 30));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator4.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 180, 10));

        ElectronicsForm.setBackground(new java.awt.Color(200, 200, 200));
        ElectronicsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        ElectronicsForm.setForeground(new java.awt.Color(51, 51, 51));
        ElectronicsForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ElectronicsForm.setText("0");
        ElectronicsForm.setBorder(null);
        ElectronicsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectronicsFormActionPerformed(evt);
            }
        });
        jPanel1.add(ElectronicsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 40, 30));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator5.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 40, 10));

        ToysForm.setBackground(new java.awt.Color(200, 200, 200));
        ToysForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        ToysForm.setForeground(new java.awt.Color(51, 51, 51));
        ToysForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ToysForm.setText("0");
        ToysForm.setBorder(null);
        ToysForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToysFormActionPerformed(evt);
            }
        });
        jPanel1.add(ToysForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 40, 30));

        InstrumentsForm.setBackground(new java.awt.Color(200, 200, 200));
        InstrumentsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        InstrumentsForm.setForeground(new java.awt.Color(51, 51, 51));
        InstrumentsForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InstrumentsForm.setText("0");
        InstrumentsForm.setBorder(null);
        InstrumentsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstrumentsFormActionPerformed(evt);
            }
        });
        jPanel1.add(InstrumentsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 40, 30));

        BooksForm.setBackground(new java.awt.Color(200, 200, 200));
        BooksForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        BooksForm.setForeground(new java.awt.Color(51, 51, 51));
        BooksForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BooksForm.setText("0");
        BooksForm.setBorder(null);
        BooksForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooksFormActionPerformed(evt);
            }
        });
        jPanel1.add(BooksForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 40, 30));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator6.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 40, 10));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator7.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 40, 10));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator8.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 40, 10));

        FurnisForm.setBackground(new java.awt.Color(200, 200, 200));
        FurnisForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        FurnisForm.setForeground(new java.awt.Color(51, 51, 51));
        FurnisForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FurnisForm.setText("0");
        FurnisForm.setBorder(null);
        FurnisForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FurnisFormActionPerformed(evt);
            }
        });
        jPanel1.add(FurnisForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 40, 30));

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator9.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 40, 10));

        ToolsForm.setBackground(new java.awt.Color(200, 200, 200));
        ToolsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        ToolsForm.setForeground(new java.awt.Color(51, 51, 51));
        ToolsForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ToolsForm.setText("0");
        ToolsForm.setBorder(null);
        ToolsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToolsFormActionPerformed(evt);
            }
        });
        jPanel1.add(ToolsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 40, 30));

        jSeparator11.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator11.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator11.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 40, 10));

        ObservationsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ObservationsLabel.setText("Observaciones");
        jPanel1.add(ObservationsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 120, 30));

        InstrumentsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        InstrumentsLabel.setText("Instrumentos");
        jPanel1.add(InstrumentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 110, 30));

        ToolsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ToolsLabel.setText("Herramientas");
        jPanel1.add(ToolsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 100, 30));

        ToysLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ToysLabel.setText("Juguetes");
        jPanel1.add(ToysLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 90, 30));

        ClothesLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ClothesLabel.setText("Ropa/Calzado");
        jPanel1.add(ClothesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 110, 30));

        BooksLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        BooksLabel.setText("Libros");
        jPanel1.add(BooksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 90, 30));

        FurnisLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        FurnisLabel.setText("Muebles");
        jPanel1.add(FurnisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 90, 30));

        ObservationsForm.setBackground(new java.awt.Color(200, 200, 200));
        ObservationsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        ObservationsForm.setForeground(new java.awt.Color(51, 51, 51));
        ObservationsForm.setBorder(null);
        ObservationsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObservationsFormActionPerformed(evt);
            }
        });
        jPanel1.add(ObservationsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 400, 30));

        jSeparator10.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator10.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator10.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 400, 10));

        infoLabel.setFont(new java.awt.Font("Dongle", 1, 28)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Información");
        jPanel1.add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 440, 30));

        PayLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        PayLabel.setText("Medio de pago");
        jPanel1.add(PayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 120, 30));

        PayForm.setBackground(new java.awt.Color(200, 200, 200));
        PayForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        PayForm.setForeground(new java.awt.Color(51, 51, 51));
        PayForm.setBorder(null);
        PayForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayFormActionPerformed(evt);
            }
        });
        jPanel1.add(PayForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 180, 30));

        jSeparator12.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator12.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator12.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 180, 10));

        BtnSchedule.setBackground(new java.awt.Color(181, 245, 82));

        txtBtnSchedule.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        txtBtnSchedule.setForeground(new java.awt.Color(51, 51, 51));
        txtBtnSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBtnSchedule.setText("Agendar cita");

        javax.swing.GroupLayout BtnScheduleLayout = new javax.swing.GroupLayout(BtnSchedule);
        BtnSchedule.setLayout(BtnScheduleLayout);
        BtnScheduleLayout.setHorizontalGroup(
            BtnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBtnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        BtnScheduleLayout.setVerticalGroup(
            BtnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnScheduleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtBtnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(BtnSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 160, 40));

        jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator13.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 10, 370));

        cityLabel11.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        cityLabel11.setText("Ciudad");
        jPanel1.add(cityLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 30));

        quantityLabel1.setFont(new java.awt.Font("Dongle", 1, 28)); // NOI18N
        quantityLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityLabel1.setText("Cantidades");
        jPanel1.add(quantityLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 180, 30));

        MessagePanel.setBackground(new java.awt.Color(200, 200, 200));

        TxtMessage.setBackground(new java.awt.Color(51, 102, 0));
        TxtMessage.setFont(new java.awt.Font("Dongle Light", 1, 24)); // NOI18N
        TxtMessage.setForeground(new java.awt.Color(51, 102, 0));
        TxtMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtMessage.setText("\"Si supiera que el mundo se acaba mañana, yo, hoy todavía, plantaría un árbol\"");

        javax.swing.GroupLayout MessagePanelLayout = new javax.swing.GroupLayout(MessagePanel);
        MessagePanel.setLayout(MessagePanelLayout);
        MessagePanelLayout.setHorizontalGroup(
            MessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MessagePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TxtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MessagePanelLayout.setVerticalGroup(
            MessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(MessagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 660, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeTypeFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeTypeFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeTypeFormActionPerformed

    private void ClothesFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClothesFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClothesFormActionPerformed

    private void addressFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFormActionPerformed

    private void cityForm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityForm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityForm2ActionPerformed

    private void ElectronicsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectronicsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectronicsFormActionPerformed

    private void ToysFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToysFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToysFormActionPerformed

    private void InstrumentsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstrumentsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InstrumentsFormActionPerformed

    private void BooksFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooksFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BooksFormActionPerformed

    private void FurnisFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FurnisFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FurnisFormActionPerformed

    private void ToolsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToolsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToolsFormActionPerformed

    private void ObservationsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObservationsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ObservationsFormActionPerformed

    private void PayFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayFormActionPerformed

    private void TopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TopPanelMousePressed

    private void TopPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TopPanelMouseDragged

    private void txtCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtCloseMouseClicked

    private void txtCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseEntered
        txtClose.setForeground(new java.awt.Color(181, 245, 82));
    }//GEN-LAST:event_txtCloseMouseEntered

    private void txtCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCloseMouseExited
        txtClose.setForeground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_txtCloseMouseExited

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
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Schedule.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BooksForm;
    private javax.swing.JLabel BooksLabel;
    private javax.swing.JPanel BtnSchedule;
    private javax.swing.JPanel ClosePanel;
    private javax.swing.JTextField ClothesForm;
    private javax.swing.JLabel ClothesLabel;
    private javax.swing.JTextField ElectronicsForm;
    private javax.swing.JLabel ElectronicsLabel;
    private javax.swing.JTextField FurnisForm;
    private javax.swing.JLabel FurnisLabel;
    private javax.swing.JTextField InstrumentsForm;
    private javax.swing.JLabel InstrumentsLabel;
    private javax.swing.JPanel LogoutMenu;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel MessagePanel;
    private javax.swing.JTextField ObservationsForm;
    private javax.swing.JLabel ObservationsLabel;
    private javax.swing.JTextField PayForm;
    private javax.swing.JLabel PayLabel;
    private javax.swing.JPanel ProductListMenu;
    private javax.swing.JLabel RePlanet;
    private javax.swing.JPanel ScheduleListMenu;
    private javax.swing.JSeparator SeparatorRePlanet;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JTextField ToolsForm;
    private javax.swing.JLabel ToolsLabel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JTextField ToysForm;
    private javax.swing.JLabel ToysLabel;
    private javax.swing.JLabel TxtMessage;
    private javax.swing.JPanel UserListMenu;
    private javax.swing.JTextField addressForm;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField cityForm2;
    private javax.swing.JLabel cityLabel11;
    private javax.swing.JTextField homeTypeForm;
    private javax.swing.JLabel homeTypeLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel quantityLabel1;
    private javax.swing.JPanel scheduleMenu;
    private javax.swing.JLabel txtBtnSchedule;
    private javax.swing.JLabel txtClose;
    private javax.swing.JLabel txtProductList;
    private javax.swing.JLabel txtSchedule;
    private javax.swing.JLabel txtScheduleList;
    private javax.swing.JLabel txtSlogan;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtUserList;
    // End of variables declaration//GEN-END:variables
    
    public static Menu Menu = new Menu();
    public static Schedule Schedule = new Schedule();

}
