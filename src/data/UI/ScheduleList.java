package data.UI;

import data.CollectionSchedule;
import data.User;
import data.database.ConnectionDb;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class ScheduleList extends javax.swing.JPanel {
    DefaultTableModel model;
    
    public ScheduleList() {
        initComponents();
        
        String[] titles = {"id", "Fecha", "Usuario", "Ciudad", "Dirección", "Casa", 
            "R", "E", "J", "I", "L", "M", "H", "Comentarios"};
        model = new DefaultTableModel(null,titles);
        Table.setModel(model);
        
        this.showData();
        //this.clean();
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
        jScrollPane1.setViewportView(Table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 640, 390));

        Siglas.setFont(new java.awt.Font("Dongle Light", 0, 18)); // NOI18N
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
                String id = rows.getString("id");
                String date = rows.getString("date");
                String userId = rows.getString("userId");
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
                user.setId(Integer.parseInt(id));
                ResultSet userData = user.getById();
                while(userData.next()){
                    String userName = userData.getString("username");
                    Object[] data = {id, date, userName, city, address, homeType, clothes, 
                        electronics, toys, instruments, books, furnis, tools, comments};
                    model.addRow(data);
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
