package data.UI;

import data.CollectionSchedule;
import data.User;
import java.sql.ResultSet;

public class ProductsList extends javax.swing.JPanel {

    public int clothes, electronics, toys, instruments, books, furnis, tools = 0;
    User currentUser = Login.currentUser;
    
    public ProductsList() {
        initComponents();
        if (currentUser.getIs_admin() != 1){
            title.setText("Productos que he entregado para recolección");
        }
        
        getData();
    }

    public void getData() {
        CollectionSchedule schedules = new CollectionSchedule();
        
        try {
            ResultSet schedule = schedules.getData();
            while (schedule.next()){
                if (currentUser.getIs_admin() == 1){
                    clothes += schedule.getInt("clothes");
                    electronics += schedule.getInt("electronics");
                    toys += schedule.getInt("toys");
                    instruments += schedule.getInt("instruments");
                    books += schedule.getInt("books");
                    furnis += schedule.getInt("furnis");
                    tools += schedule.getInt("tools");
                } else if (currentUser.getId() == schedule.getInt("userId")){   
                    clothes += schedule.getInt("clothes");
                    electronics += schedule.getInt("electronics");
                    toys += schedule.getInt("toys");
                    instruments += schedule.getInt("instruments");
                    books += schedule.getInt("books");
                    furnis += schedule.getInt("furnis");
                    tools += schedule.getInt("tools");
                }
                
            }
            
            clothesTxt.setText(Integer.toString(clothes));
            electronicsTxt.setText(Integer.toString(electronics));
            toysTxt.setText(Integer.toString(toys));
            instrumentsTxt.setText(Integer.toString(instruments));
            booksTxt.setText(Integer.toString(books));
            furnisTxt.setText(Integer.toString(furnis));
            toolsTxt.setText(Integer.toString(tools));

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        toolsTxt = new javax.swing.JLabel();
        furnisTxt = new javax.swing.JLabel();
        booksTxt = new javax.swing.JLabel();
        instrumentsTxt = new javax.swing.JLabel();
        toysTxt = new javax.swing.JLabel();
        electronicsTxt = new javax.swing.JLabel();
        clothesTxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        title.setForeground(new java.awt.Color(51, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Acá se muestra la cantidad de productos por categoría");
        add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 570, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 146, 430, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 430, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 430, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 430, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 430, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 430, 10));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 430, 10));

        jPanel1.setBackground(new java.awt.Color(181, 245, 82));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Ropa y calzado");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Didpositivos Electrónicos");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Juguetes");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Instrumentos musicales");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Libros");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Muebles");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Herramientas");

        toolsTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        toolsTxt.setForeground(new java.awt.Color(51, 51, 51));
        toolsTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toolsTxt.setText("0");

        furnisTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        furnisTxt.setForeground(new java.awt.Color(51, 51, 51));
        furnisTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        furnisTxt.setText("0");

        booksTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        booksTxt.setForeground(new java.awt.Color(51, 51, 51));
        booksTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        booksTxt.setText("0");

        instrumentsTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        instrumentsTxt.setForeground(new java.awt.Color(51, 51, 51));
        instrumentsTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        instrumentsTxt.setText("0");

        toysTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        toysTxt.setForeground(new java.awt.Color(51, 51, 51));
        toysTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toysTxt.setText("0");

        electronicsTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        electronicsTxt.setForeground(new java.awt.Color(51, 51, 51));
        electronicsTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        electronicsTxt.setText("0");

        clothesTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clothesTxt.setForeground(new java.awt.Color(51, 51, 51));
        clothesTxt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        clothesTxt.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(clothesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(electronicsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(toysTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(instrumentsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(booksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(furnisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(toolsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(clothesTxt))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3))
                    .addComponent(electronicsTxt))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(toysTxt))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(instrumentsTxt))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(booksTxt))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(furnisTxt))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(toolsTxt))
                .addGap(27, 27, 27))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 460, 320));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel booksTxt;
    private javax.swing.JLabel clothesTxt;
    private javax.swing.JLabel electronicsTxt;
    private javax.swing.JLabel furnisTxt;
    private javax.swing.JLabel instrumentsTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel title;
    private javax.swing.JLabel toolsTxt;
    private javax.swing.JLabel toysTxt;
    // End of variables declaration//GEN-END:variables
}
