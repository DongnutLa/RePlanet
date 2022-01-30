package data;

import data.database.ConnectionDb;
import java.util.*;
import java.sql.ResultSet;
import java.sql.Date;

public class CollectionSchedule {
    public int id;
    public int userId;
    public String city;
    public String address;
    public String homeType;
    List<Integer> quantity = new ArrayList<Integer>();  
    public String comments;
    public String payment;
    public Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public List<Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(List<Integer> quantity) {
        this.quantity = quantity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }   

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
       
    public boolean setSchedule() {
        try {
            ConnectionDb conn = new ConnectionDb();
            String querySQL = String.format("INSERT INTO schedule (userId, city, address, homeType, comments, payment, clothes, "
                    + "electronics, toys, instruments, books, furnis, tools, date) "
                    + "VALUES ('%d', '%s', '%s', '%s', '%s', '%s', '%d', '%d', '%d', '%d', '%d', '%d', '%d', '%s');",
                    this.userId, this.city, this.address, this.homeType, this.comments, this.payment, this.quantity.get(0), 
                    this.quantity.get(1), this.quantity.get(2), this.quantity.get(3), this.quantity.get(4), this.quantity.get(5), 
                    this.quantity.get(6), this.date);
            conn.executeSQL(querySQL);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public ResultSet getData() {
        try {
            ConnectionDb conn = new ConnectionDb();
            String querySQL = "SELECT * FROM schedule;";
            ResultSet response = conn.queryRegister(querySQL);
            return response;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
