package com.scheduler.sbclinic.pages.login;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.scheduler.sbclinic.models.Account;


public class Login extends ActionSupport{
    
    private String error;
    private Account accountBean;
    private Account sessionAccount;
    
    public String execute() throws Exception{
        
        accountBean = getAccountBean();
        String returnValue;
       
         if(fetchToDB()){
            returnValue = SUCCESS;
        }else{
            returnValue = ERROR;
        }
        
        return returnValue;
    }
    
    private boolean fetchToDB() throws Exception{

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            String URL = "jdbc:mysql://localhost:3306/sbclinicdb?useTimezone=true&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, "root", "password123");

            if(connection != null){
                String user_sql = "SELECT * FROM users WHERE email_add = '"+accountBean.getEmail()+"' AND pass_word = '"+generateHashedPass(accountBean.getUserPassword())+"'";
                preparedStatement = connection.prepareStatement(user_sql);
                ResultSet rs = preparedStatement.executeQuery();

                if(rs.next()) {
                    sessionAccount = new Account();
                    sessionAccount.setEmail(rs.getString(2));
                    sessionAccount.setFirstName(rs.getString(4));
                    sessionAccount.setLastName(rs.getString(5));
                    sessionAccount.setContactInfo(rs.getString(6));
                    sessionAccount.setUserRole(rs.getString(7));
                    return true;
                }else{
                    setError("Invalid Email Address or Password...");
                    return false;
                }
                
            }else{
                setError("CONNECTION ERROR: Database Connection Failed");
                return false;
            }

        } catch (Exception e) {
            setError(e.toString());
            return false;
        }finally{
            if(preparedStatement != null) try {preparedStatement.close();} catch(SQLException ignore) {}
            if(connection != null) try { connection.close();} catch(SQLException ignore) {} 
        }   
    }

    public String generateHashedPass(String stringToHash) {
        String generated_password = null;

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] hash = md.digest(stringToHash.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
    
            for(int i = 0; i< hash.length; i++) {
                sb.append(Integer.toString((hash[i] & 0xff) + 0x100, 16).substring(1));
            }
            generated_password = sb.toString();
        } catch (NoSuchAlgorithmException  e) {
            e.printStackTrace();
        }

        return generated_password;
    } 

    public Account getAccountBean() {
        return accountBean;
    }
    
    public void setAccountBean(Account accountBean) {
        this.accountBean = accountBean;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Account getSessionAccount() {
        return sessionAccount;
    }

    public void setSessionAccount(Account sessionAccount) {
        this.sessionAccount = sessionAccount;
    }


}
