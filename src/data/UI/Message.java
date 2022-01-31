package data.UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Message extends javax.swing.JPanel {

    List<String> messages = new ArrayList<String>();
    String m1 = "Si supiera que el mundo se acaba mañana, yo, hoy todavía, plantaría un árbol";
    String m2 = "La Tierra no es nuestro planeta, es nuestro hogar";
    String m3 = "Si te gusta el canto de los pájaros no compres jaulas, planta árboles";
    String m4 = "Planta un árbol y estarás sembrando conciencia";
    String m5 = "Un mundo mejor es posible con un pensamiento verde";
    String m6 = "Una sola bellota puede crear mil bosques";
    String m7 = "Se pueden cortar todas las flores, pero nunca se podrá detener la primavera";
    String m8 = "Si conservamos el agua, conservamos la vida";
    String m9 = "Enseñar a cuidar el medio ambiente es enseñar a valorar la vida";
    String m10 = "Si amas tu vida, empieza por amar la del planeta. ¡Cuídalo!";
    String m11 = "Los árboles dan sombra hasta al leñador que los tala.";
    String m12 = "Si amas la Tierra, recicla y conserva";
    String m13 = "Si sirves a la naturaleza, la naturaleza te va a servir";
    
    public Message() {
        initComponents();
        
        messaging();
    }

    public int random() {
        Random rand = new Random();
        int upperbound = 13;
        return rand.nextInt(upperbound);
    }
    
    public void messaging () {
        messages.addAll(Arrays.asList(m1, m2, m3, m4, m5, m6, m7,
                m8, m9, m10, m11, m12, m13));
        
        int random = random();
        TxtMessage.setText(messages.get(random));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(200, 200, 200));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtMessage.setBackground(new java.awt.Color(51, 102, 0));
        TxtMessage.setFont(new java.awt.Font("Dongle Light", 1, 24)); // NOI18N
        TxtMessage.setForeground(new java.awt.Color(51, 102, 0));
        TxtMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtMessage.setText("\"Si supiera que el mundo se acaba mañana, yo, hoy todavía, plantaría un árbol\"");
        TxtMessage.setToolTipText("");
        add(TxtMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TxtMessage;
    // End of variables declaration//GEN-END:variables
}
