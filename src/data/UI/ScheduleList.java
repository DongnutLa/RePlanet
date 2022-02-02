package data.UI;

import data.CollectionSchedule;
import data.User;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ScheduleList extends javax.swing.JPanel {
    DefaultTableModel model;
    
    User currentUser = Login.currentUser;
    
    public ScheduleList() {
        initComponents();
        
        String[] titles = {"Fecha", "Usuario", "Ciudad", "Dirección", "Casa", 
            "R", "E", "J", "I", "L", "M", "H", "Comentarios"};
        model = new DefaultTableModel(null,titles);
        Table.setModel(model);
        
        this.showData();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Siglas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setModel(new javax.swing.table.DefaultTableModel(
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
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(Table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 640, 390));

        Siglas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Siglas.setText("R: Ropa | E: Electrónicos | J: Juguetes | I: Instrumentos | L: Libros | M: Muebles | H: Herramientas");
        add(Siglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 610, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    public void showData() {
        while(model.getRowCount()>0) {
            model.removeRow(0);
        }
        
        CollectionSchedule schedules = new CollectionSchedule();
        
        try {
            ResultSet rows = schedules.getData();
            while (rows.next()) {
                String date = rows.getString("date");
                int userId = rows.getInt("userId");
                String city = rows.getString("city");
                String address = rows.getString("address");
                String homeType = rows.getString("homeType");
                String clothes = rows.getString("clothes");
                String electronics = rows.getString("electronics");
                String toys = rows.getString("toys");
                String instruments = rows.getString("instruments");
                String books = rows.getString("books");
                String furnis = rows.getString("furnis");
                String tools = rows.getString("tools");
                String comments = rows.getString("comments");
                
                User user = new User();
                user.setId(userId);
                ResultSet userData = user.getById();
                if (currentUser.getIs_admin() != 1) {
                    if (userId == currentUser.getId()){
                        while(userData.next()){
                            String userName = userData.getString("username");
                            Object[] data = {date, userName, city, address, homeType, clothes, 
                                electronics, toys, instruments, books, furnis, tools, comments};
                            model.addRow(data);
                        }
                    }
                } else {
                    while(userData.next()){
                        String userName = userData.getString("username");
                        Object[] data = {date, userName, city, address, homeType, clothes, 
                            electronics, toys, instruments, books, furnis, tools, comments};
                        model.addRow(data);
                    }
                }
                
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Siglas;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
