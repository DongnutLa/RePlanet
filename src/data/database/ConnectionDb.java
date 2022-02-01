package data.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionDb {
    private static Connection conn;
    //private static final String driver = "com.mysql.jdbc.Driver";
    //private static final String user = "root";
    //private static final String pass = "password";
    //private static final String db = "user_db";
    //private static final String url = "jdbc:mysql://localhost/"+db+"";
    
    private static final String driver = "org.sqlite.JDBC"; 
    private static final String url = "jdbc:sqlite:./db.db";
    
    public ConnectionDb() {
        if ( conn == null) {
            try {
                Class.forName(driver);
                //conn = DriverManager.getConnection(url, user, pass);
                conn = DriverManager.getConnection(url);
                System.out.println("Conexión establecida");
            } catch (Exception e) {
                System.out.println("Error de conexión... "+e);
            }
        }
        //conn = null;
    }
    
    public boolean executeSQL(String strSentenciaSQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    
    public ResultSet queryRegister(String strSentenciaSQL) {
        try {
          PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
          ResultSet response = pstm.executeQuery();
          return response;
          
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
