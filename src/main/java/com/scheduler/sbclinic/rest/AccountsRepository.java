package com.scheduler.sbclinic.rest;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.scheduler.sbclinic.models.Account;

public class AccountsRepository {
    private static Map<String, Account> map = new HashMap<String, Account>();
    
    public AccountsRepository(){}

    public Map<String, Account> findAllAccounts(){
        Connection conn = null;
        PreparedStatement prep = null;
       
        try {
            String URL = "jdbc:mysql://localhost:3306/sbclinicdb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "password123");
           
            if(conn != null){
                String sql = "SELECT * FROM users";
                prep = conn.prepareStatement(sql);
                ResultSet rs = prep.executeQuery();
                
                while(rs.next()){
                    Account account = new Account();
                    account.setId(rs.getString("userID"));
                    account.setEmail(rs.getString("email_add"));
                    account.setFirstName(rs.getString("first_name"));
                    account.setLastName(rs.getString("last_name"));
                    account.setContactInfo(rs.getString("contact_info"));
                    account.setUserRole(rs.getString("user_role"));
                    account.setUserStatus(rs.getString("user_status"));
                    map.put(rs.getString("userID"), account);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(prep != null) try { prep.close();} catch (SQLException ignore) {}
            if(conn != null) try { conn.close();} catch (SQLException ignore) {}
        }
            return map;
    }
    
    public boolean save(Account account) {
        Connection conn = null;
        Statement prep = null;
        
        try {
            String URL = "jdbc:mysql://localhost:3306/sbclinicdb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "password123");

            if(conn != null){
                prep = conn.createStatement();
                String sql = "INSERT INTO users (email_add, pass_word, first_name, last_name, contact_info, user_role, user_status) VALUES('"+account.getEmail()+"','"+account.getUserPassword()+"','"+account.getFirstName()+"', '"+account.getLastName()+"', '"+account.getContactInfo()+"', '"+account.getUserRole()+"','"+account.getUserStatus()+"')";
                prep.executeUpdate(sql);
               
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally{
            if(prep != null) try { prep.close();} catch (SQLException ignore) {}
            if(conn != null) try { conn.close();} catch (SQLException ignore) {}
        }
    }
}
