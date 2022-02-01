package data.UI;

import data.User;
import java.sql.ResultSet;
import java.text.ParseException;
//import java.util.Date;
import java.sql.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Users extends javax.swing.JPanel {

    DefaultTableModel model;
    
    public Users() {
        initComponents();
        
        String[] titles = {"id", "Nombre", "Correo", "Usuario", "Fecha de nacimiento", "Puntos", "Admin"};
        model = new DefaultTableModel(null,titles);
        tableUsr.setModel(model);
        
        this.showData();
        this.clean();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        nameForm = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        usernameLabel = new javax.swing.JLabel();
        usernameForm = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        mailLabel = new javax.swing.JLabel();
        birthdayForm = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        passwordForm = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        birthdayLabel = new javax.swing.JLabel();
        idForm = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        adminLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsr = new javax.swing.JTable();
        mailForm = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        idLabel1 = new javax.swing.JLabel();
        adminForm = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        nameLabel.setText("Nombre");
        add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 120, 30));

        nameForm.setBackground(new java.awt.Color(200, 200, 200));
        nameForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        nameForm.setForeground(new java.awt.Color(51, 51, 51));
        nameForm.setBorder(null);
        nameForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFormActionPerformed(evt);
            }
        });
        add(nameForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 180, 30));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator4.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 180, 10));

        usernameLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        usernameLabel.setText("Usuario");
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 120, 30));

        usernameForm.setBackground(new java.awt.Color(200, 200, 200));
        usernameForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        usernameForm.setForeground(new java.awt.Color(51, 51, 51));
        usernameForm.setBorder(null);
        usernameForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFormActionPerformed(evt);
            }
        });
        add(usernameForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 180, 30));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator5.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 180, 10));

        mailLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        mailLabel.setText("Correo");
        add(mailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 120, 30));

        birthdayForm.setBackground(new java.awt.Color(200, 200, 200));
        birthdayForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        birthdayForm.setForeground(new java.awt.Color(51, 51, 51));
        birthdayForm.setText("yyyy-MM-dd");
        birthdayForm.setBorder(null);
        birthdayForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayFormActionPerformed(evt);
            }
        });
        add(birthdayForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 180, 30));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator6.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, 10));

        passwordLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        passwordLabel.setText("Contraseña");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 30));

        passwordForm.setBackground(new java.awt.Color(200, 200, 200));
        passwordForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        passwordForm.setForeground(new java.awt.Color(51, 51, 51));
        passwordForm.setBorder(null);
        passwordForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFormActionPerformed(evt);
            }
        });
        add(passwordForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 180, 30));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator7.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, 10));

        birthdayLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        birthdayLabel.setText("Fecha de nacimiento");
        add(birthdayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 160, 30));

        idForm.setEditable(false);
        idForm.setBackground(new java.awt.Color(200, 200, 200));
        idForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        idForm.setForeground(new java.awt.Color(51, 51, 51));
        idForm.setBorder(null);
        idForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFormActionPerformed(evt);
            }
        });
        add(idForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, 30));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator8.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 180, 10));

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator9.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 80, 10));

        adminLabel.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        adminLabel.setText("Admin");
        add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, 30));

        tableUsr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableUsr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsrMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableUsr);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 660, 270));

        mailForm.setBackground(new java.awt.Color(200, 200, 200));
        mailForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        mailForm.setForeground(new java.awt.Color(51, 51, 51));
        mailForm.setBorder(null);
        mailForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailFormActionPerformed(evt);
            }
        });
        add(mailForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 180, 30));

        btnDelete.setBackground(new java.awt.Color(181, 245, 82));
        btnDelete.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        btnDelete.setText("Borrar");
        btnDelete.setBorder(null);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 100, 40));

        btnCreate.setBackground(new java.awt.Color(181, 245, 82));
        btnCreate.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        btnCreate.setText("Crear");
        btnCreate.setBorder(null);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, 40));

        btnEdit.setBackground(new java.awt.Color(181, 245, 82));
        btnEdit.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 40));

        btnCancel.setBackground(new java.awt.Color(181, 245, 82));
        btnCancel.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 100, 40));

        idLabel1.setFont(new java.awt.Font("Dongle", 0, 24)); // NOI18N
        idLabel1.setText("ID");
        add(idLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 30));

        adminForm.setBackground(new java.awt.Color(200, 200, 200));
        adminForm.setFont(new java.awt.Font("Dongle", 0, 20)); // NOI18N
        adminForm.setForeground(new java.awt.Color(51, 51, 51));
        adminForm.setBorder(null);
        adminForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminFormActionPerformed(evt);
            }
        });
        add(adminForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 80, 30));

        jSeparator10.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator10.setForeground(new java.awt.Color(181, 245, 82));
        jSeparator10.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 80, 10));
    }// </editor-fold>//GEN-END:initComponents

    public void showData() {
        while(model.getRowCount()>0) {
            model.removeRow(0);
        }
        
        User users = new User();
        
        try {
            ResultSet usersList = users.getAll();
            while (usersList.next()) {
                String id = usersList.getString("id");
                String name = usersList.getString("name");
                String mail = usersList.getString("mail");
                String username = usersList.getString("username");
                String birthday = usersList.getString("birthday");
                String score = usersList.getString("score");
                int admin = usersList.getInt("is_admin");
                boolean is_admin = false;
                if (admin == 1) is_admin = true;
                
                Object[] data = {id, name, mail, username, birthday, score, is_admin};
                model.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
    
    public void clean(){
        idForm.setText("");
        nameForm.setText("");
        usernameForm.setText("");
        mailForm.setText("");
        passwordForm.setText("");
        birthdayForm.setText("");
        adminForm.setText("");
        
        btnCreate.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        
        passwordForm.setEditable(true);
    }
    
    public User recoveryDataGUI() throws ParseException {
        User user = new User();
        
        int id = (idForm.getText().isEmpty()) ? 0 : Integer.parseInt(idForm.getText());
        user.setId(id);
        user.setName(nameForm.getText());
        user.setUsername(usernameForm.getText());
        user.setMail(mailForm.getText());
        String password = (passwordForm.getText().isEmpty()) ? null : passwordForm.getText();
        user.setPassword(password);
        Date birthday = Date.valueOf(birthdayForm.getText());
        user.setBirthday(birthday);
        int admin;
        if (adminForm.getText().contains("true")) {
            admin = 1;
        } else {
            admin = 0;
        }
        user.setIs_admin(admin);
        return user;
    }
    
    private void nameFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFormActionPerformed

    private void usernameFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFormActionPerformed

    private void birthdayFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayFormActionPerformed

    private void passwordFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFormActionPerformed

    private void idFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFormActionPerformed

    private void mailFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailFormActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            User user = recoveryDataGUI();
            user.DeleteUser();
            this.showData();
            this.clean();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        try {
            User user = recoveryDataGUI();
            user.CreateUser();
            this.showData();
            this.clean();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            User user = recoveryDataGUI();
            user.UpdateUser();
            this.showData();
            this.clean();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tableUsrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsrMouseClicked
        if(evt.getClickCount() == 1){
            JTable receptor = (JTable)evt.getSource();
            idForm.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 0).toString() );
            nameForm.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 1).toString() );
            mailForm.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString() );
            usernameForm.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 3).toString() );
            birthdayForm.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 4).toString() );
            adminForm.setText( receptor.getModel().getValueAt(receptor.getSelectedRow(), 6).toString() );
            passwordForm.setEditable(false);
        }
        btnCreate.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tableUsrMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.clean();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void adminFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminForm;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JTextField birthdayForm;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JTextField idForm;
    private javax.swing.JLabel idLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField mailForm;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JTextField nameForm;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField passwordForm;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTable tableUsr;
    private javax.swing.JTextField usernameForm;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
