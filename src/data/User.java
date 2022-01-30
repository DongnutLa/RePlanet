package data;

import data.database.ConnectionDb;
import java.sql.ResultSet;
import java.util.Date;

public class User {
    public int id;
    public String mail;
    public String name;
    public String username;
    public String password;
    public Date birthday;
    public String score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    
    public boolean login(){
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("SELECT * FROM users WHERE username = '%s' and password = '%s' LIMIT 1;",
                    this.username, this.password);
            ResultSet response = conn.queryRegister(query);

            return response.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
}
