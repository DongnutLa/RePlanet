package data.UI;

import data.CollectionSchedule;
import data.User;
import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Schedule extends javax.swing.JPanel {

    User currentUser = Login.currentUser;

    public Schedule() {
        initComponents();
    }

    public boolean sendData(){
        int clothes = Integer.parseInt(clothesForm.getText());
        int electronics = Integer.parseInt(electronicsForm.getText());
        int toys = Integer.parseInt(toysForm.getText());
        int instruments = Integer.parseInt(instrumentsForm.getText());
        int books = Integer.parseInt(booksForm.getText());
        int furnis = Integer.parseInt(furnisForm.getText());
        int tools = Integer.parseInt(toolsForm.getText());
        
        List<Integer> quantity = new ArrayList<Integer>();
        quantity.addAll(Arrays.asList(clothes, electronics, toys, instruments, books, furnis, tools));
        
        CollectionSchedule schedule = new CollectionSchedule();
        
        schedule.setCity(cityForm.getText());
        schedule.setAddress(addressForm.getText());
        schedule.setHomeType(homeTypeForm.getText());
        schedule.setPayment(payForm.getText());
        schedule.setComments(commentsForm.getText());
        schedule.setQuantity(quantity);
        schedule.setUserId(currentUser.id);
        
        boolean res = schedule.setSchedule();
        return res;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeTypeForm = new javax.swing.JTextField();
        clothesForm = new javax.swing.JTextField();
        addressForm = new javax.swing.JTextField();
        homeTypeLabel = new javax.swing.JLabel();
        ElectronicsLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cityForm = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        electronicsForm = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        toysForm = new javax.swing.JTextField();
        instrumentsForm = new javax.swing.JTextField();
        booksForm = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        furnisForm = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        toolsForm = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        CommentsLabel = new javax.swing.JLabel();
        InstrumentsLabel = new javax.swing.JLabel();
        ToolsLabel = new javax.swing.JLabel();
        ToysLabel = new javax.swing.JLabel();
        ClothesLabel = new javax.swing.JLabel();
        BooksLabel = new javax.swing.JLabel();
        FurnisLabel = new javax.swing.JLabel();
        commentsForm = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        infoLabel = new javax.swing.JLabel();
        PayLabel = new javax.swing.JLabel();
        payForm = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        BtnSchedule = new javax.swing.JPanel();
        txtBtnSchedule = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        cityLabel11 = new javax.swing.JLabel();
        quantityLabel1 = new javax.swing.JLabel();
        MessagePanel = new javax.swing.JPanel();
        TxtMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(680, 500));
        setPreferredSize(new java.awt.Dimension(680, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeTypeForm.setBackground(new java.awt.Color(200, 200, 200));
        homeTypeForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        homeTypeForm.setForeground(new java.awt.Color(51, 51, 51));
        homeTypeForm.setBorder(null);
        homeTypeForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeTypeFormActionPerformed(evt);
            }
        });
        add(homeTypeForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 180, 30));

        clothesForm.setBackground(new java.awt.Color(200, 200, 200));
        clothesForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        clothesForm.setForeground(new java.awt.Color(51, 51, 51));
        clothesForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clothesForm.setText("0");
        clothesForm.setBorder(null);
        clothesForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clothesFormActionPerformed(evt);
            }
        });
        clothesForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clothesFormKeyTyped(evt);
            }
        });
        add(clothesForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 40, 30));

        addressForm.setBackground(new java.awt.Color(200, 200, 200));
        addressForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        addressForm.setForeground(new java.awt.Color(51, 51, 51));
        addressForm.setBorder(null);
        addressForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFormActionPerformed(evt);
            }
        });
        add(addressForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 180, 30));

        homeTypeLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        homeTypeLabel.setText("Tipo de casa");
        add(homeTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 120, 30));

        ElectronicsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ElectronicsLabel.setText("Electrónicos");
        add(ElectronicsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, 30));

        addressLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        addressLabel.setText("Dirección");
        add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, 30));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator1.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 180, 10));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator2.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 40, 10));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator3.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 10));

        cityForm.setBackground(new java.awt.Color(200, 200, 200));
        cityForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        cityForm.setForeground(new java.awt.Color(51, 51, 51));
        cityForm.setBorder(null);
        cityForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFormActionPerformed(evt);
            }
        });
        add(cityForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 180, 30));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator4.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 180, 10));

        electronicsForm.setBackground(new java.awt.Color(200, 200, 200));
        electronicsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        electronicsForm.setForeground(new java.awt.Color(51, 51, 51));
        electronicsForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        electronicsForm.setText("0");
        electronicsForm.setBorder(null);
        electronicsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electronicsFormActionPerformed(evt);
            }
        });
        electronicsForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                electronicsFormKeyTyped(evt);
            }
        });
        add(electronicsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 40, 30));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator5.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 40, 10));

        toysForm.setBackground(new java.awt.Color(200, 200, 200));
        toysForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        toysForm.setForeground(new java.awt.Color(51, 51, 51));
        toysForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toysForm.setText("0");
        toysForm.setBorder(null);
        toysForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toysFormActionPerformed(evt);
            }
        });
        toysForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toysFormKeyTyped(evt);
            }
        });
        add(toysForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 40, 30));

        instrumentsForm.setBackground(new java.awt.Color(200, 200, 200));
        instrumentsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        instrumentsForm.setForeground(new java.awt.Color(51, 51, 51));
        instrumentsForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        instrumentsForm.setText("0");
        instrumentsForm.setBorder(null);
        instrumentsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instrumentsFormActionPerformed(evt);
            }
        });
        instrumentsForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                instrumentsFormKeyTyped(evt);
            }
        });
        add(instrumentsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 40, 30));

        booksForm.setBackground(new java.awt.Color(200, 200, 200));
        booksForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        booksForm.setForeground(new java.awt.Color(51, 51, 51));
        booksForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        booksForm.setText("0");
        booksForm.setBorder(null);
        booksForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksFormActionPerformed(evt);
            }
        });
        booksForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                booksFormKeyTyped(evt);
            }
        });
        add(booksForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 40, 30));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator6.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 40, 10));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator7.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 40, 10));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator8.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 40, 10));

        furnisForm.setBackground(new java.awt.Color(200, 200, 200));
        furnisForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        furnisForm.setForeground(new java.awt.Color(51, 51, 51));
        furnisForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        furnisForm.setText("0");
        furnisForm.setBorder(null);
        furnisForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furnisFormActionPerformed(evt);
            }
        });
        furnisForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                furnisFormKeyTyped(evt);
            }
        });
        add(furnisForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 40, 30));

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator9.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 40, 10));

        toolsForm.setBackground(new java.awt.Color(200, 200, 200));
        toolsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        toolsForm.setForeground(new java.awt.Color(51, 51, 51));
        toolsForm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toolsForm.setText("0");
        toolsForm.setBorder(null);
        toolsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolsFormActionPerformed(evt);
            }
        });
        toolsForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toolsFormKeyTyped(evt);
            }
        });
        add(toolsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 40, 30));

        jSeparator11.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator11.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator11.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 40, 10));

        CommentsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        CommentsLabel.setText("Observaciones");
        add(CommentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 120, 30));

        InstrumentsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        InstrumentsLabel.setText("Instrumentos");
        add(InstrumentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, 30));

        ToolsLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ToolsLabel.setText("Herramientas");
        add(ToolsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 100, 30));

        ToysLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ToysLabel.setText("Juguetes");
        add(ToysLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 90, 30));

        ClothesLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        ClothesLabel.setText("Ropa/Calzado");
        add(ClothesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, 30));

        BooksLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        BooksLabel.setText("Libros");
        add(BooksLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 90, 30));

        FurnisLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        FurnisLabel.setText("Muebles");
        add(FurnisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 90, 30));

        commentsForm.setBackground(new java.awt.Color(200, 200, 200));
        commentsForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        commentsForm.setForeground(new java.awt.Color(51, 51, 51));
        commentsForm.setBorder(null);
        commentsForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsFormActionPerformed(evt);
            }
        });
        add(commentsForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 400, 30));

        jSeparator10.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator10.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator10.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 400, 10));

        infoLabel.setFont(new java.awt.Font("Dongle", 1, 28)); // NOI18N
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Información");
        add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 440, 30));

        PayLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        PayLabel.setText("Medio de pago");
        add(PayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 30));

        payForm.setBackground(new java.awt.Color(200, 200, 200));
        payForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        payForm.setForeground(new java.awt.Color(51, 51, 51));
        payForm.setBorder(null);
        payForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payFormActionPerformed(evt);
            }
        });
        add(payForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 180, 30));

        jSeparator12.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator12.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator12.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 180, 10));

        BtnSchedule.setBackground(new java.awt.Color(181, 245, 82));

        txtBtnSchedule.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        txtBtnSchedule.setForeground(new java.awt.Color(51, 51, 51));
        txtBtnSchedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBtnSchedule.setText("Agendar cita");
        txtBtnSchedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBtnScheduleMouseClicked(evt);
            }
        });

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

        add(BtnSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 40));

        jSeparator13.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator13.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 10, 370));

        cityLabel11.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        cityLabel11.setText("Ciudad");
        add(cityLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 120, 30));

        quantityLabel1.setFont(new java.awt.Font("Dongle", 1, 28)); // NOI18N
        quantityLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityLabel1.setText("Cantidades");
        add(quantityLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 30));

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

        add(MessagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 660, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void homeTypeFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeTypeFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeTypeFormActionPerformed

    private void clothesFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clothesFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clothesFormActionPerformed

    private void addressFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFormActionPerformed

    private void cityFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFormActionPerformed

    private void electronicsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electronicsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_electronicsFormActionPerformed

    private void toysFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toysFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toysFormActionPerformed

    private void instrumentsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instrumentsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_instrumentsFormActionPerformed

    private void booksFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booksFormActionPerformed

    private void furnisFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_furnisFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_furnisFormActionPerformed

    private void toolsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolsFormActionPerformed

    private void commentsFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentsFormActionPerformed

    private void payFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payFormActionPerformed

    private void clothesFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clothesFormKeyTyped
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (int)evt.getKeyChar() == 8){
            clothesForm.setEditable(true);
        } else {
            clothesForm.setEditable(false);
        }
    }//GEN-LAST:event_clothesFormKeyTyped

    private void electronicsFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_electronicsFormKeyTyped
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (int)evt.getKeyChar() == 8){
            electronicsForm.setEditable(true);
        } else {
            electronicsForm.setEditable(false);
        }
    }//GEN-LAST:event_electronicsFormKeyTyped

    private void toysFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toysFormKeyTyped
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (int)evt.getKeyChar() == 8){
            toysForm.setEditable(true);
        } else {
            toysForm.setEditable(false);
        }
    }//GEN-LAST:event_toysFormKeyTyped

    private void instrumentsFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_instrumentsFormKeyTyped
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (int)evt.getKeyChar() == 8){
            instrumentsForm.setEditable(true);
        } else {
            instrumentsForm.setEditable(false);
        }
    }//GEN-LAST:event_instrumentsFormKeyTyped

    private void booksFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_booksFormKeyTyped
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (int)evt.getKeyChar() == 8){
            booksForm.setEditable(true);
        } else {
            booksForm.setEditable(false);
        }
    }//GEN-LAST:event_booksFormKeyTyped

    private void furnisFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_furnisFormKeyTyped
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (int)evt.getKeyChar() == 8){
            furnisForm.setEditable(true);
        } else {
            furnisForm.setEditable(false);
        }
    }//GEN-LAST:event_furnisFormKeyTyped

    private void toolsFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toolsFormKeyTyped
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') || (int)evt.getKeyChar() == 8){
            toolsForm.setEditable(true);
        } else {
            toolsForm.setEditable(false);
        }
    }//GEN-LAST:event_toolsFormKeyTyped

    private void txtBtnScheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBtnScheduleMouseClicked
        // TODO add your handling code here:
        boolean res = sendData();
        if (res) {
            JOptionPane.showMessageDialog(null, "Cita agendada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agendar la cita", "Error", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtBtnScheduleMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BooksLabel;
    private javax.swing.JPanel BtnSchedule;
    private javax.swing.JLabel ClothesLabel;
    private javax.swing.JLabel CommentsLabel;
    private javax.swing.JLabel ElectronicsLabel;
    private javax.swing.JLabel FurnisLabel;
    private javax.swing.JLabel InstrumentsLabel;
    private javax.swing.JPanel MessagePanel;
    private javax.swing.JLabel PayLabel;
    private javax.swing.JLabel ToolsLabel;
    private javax.swing.JLabel ToysLabel;
    private javax.swing.JLabel TxtMessage;
    private javax.swing.JTextField addressForm;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField booksForm;
    private javax.swing.JTextField cityForm;
    private javax.swing.JLabel cityLabel11;
    private javax.swing.JTextField clothesForm;
    private javax.swing.JTextField commentsForm;
    private javax.swing.JTextField electronicsForm;
    private javax.swing.JTextField furnisForm;
    private javax.swing.JTextField homeTypeForm;
    private javax.swing.JLabel homeTypeLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JTextField instrumentsForm;
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
    private javax.swing.JTextField payForm;
    private javax.swing.JLabel quantityLabel1;
    private javax.swing.JTextField toolsForm;
    private javax.swing.JTextField toysForm;
    private javax.swing.JLabel txtBtnSchedule;
    // End of variables declaration//GEN-END:variables
       
    }
