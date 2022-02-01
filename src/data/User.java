package data;

import data.database.ConnectionDb;
import java.sql.ResultSet;
import java.sql.Date;

public class User {
    public int id;
    public String mail;
    public String name;
    public String username;
    public String password;
    public Date birthday;
    public int score;
    public int is_admin;

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }
    
    public ResultSet getById() {
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("SELECT * FROM users WHERE id = '%d' LIMIT 1;",
                    this.id);
            ResultSet response = conn.queryRegister(query);

            return response;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public ResultSet getAll() {
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("SELECT * FROM users;");
            ResultSet response = conn.queryRegister(query);

            return response;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public ResultSet login(){
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("SELECT * FROM users WHERE username = '%s' and password = '%s' LIMIT 1;",
                    this.username, this.password);
            ResultSet response = conn.queryRegister(query);

            return response;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public ResultSet currentUser() {
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("SELECT * FROM users WHERE username = '%s' LIMIT 1;",
                    this.username);
            ResultSet response = conn.queryRegister(query);

            return response;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public boolean CreateUser() {
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("INSERT INTO users (name, mail, username, password, birthday)"
                    + " VALUES ('%s', '%s', '%s', '%s', '%s');",
                    this.name, this.mail, this.username, this.password, this.birthday);
            conn.executeSQL(query);

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean UpdateUser() {
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("UPDATE users SET name='%s', mail='%s', username='%s', birthday='%s', is_admin=%d WHERE id=%d;",
                    this.name, this.mail, this.username, this.birthday, this.is_admin, this.id);
            conn.executeSQL(query);

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean DeleteUser(){
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("DELETE FROM users WHERE id=%d;", this.id);
            conn.executeSQL(query);

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean UpdateScore(){
        try {
            ConnectionDb conn = new ConnectionDb();
            String query = String.format("UPDATE users SET score=%d WHERE id=%d;",
                    this.score, this.id);
            conn.executeSQL(query);

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
}
