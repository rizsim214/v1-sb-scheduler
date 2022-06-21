package com.scheduler.sbclinic.pages;

import com.opensymphony.xwork2.ActionSupport;

public class Patient extends ActionSupport{
    private String token = "";    
    
    public String execute() throws Exception {
        String returnVal;
        if(token != "") {
            returnVal = SUCCESS;
        }else{
            returnVal = ERROR;
        }
        return returnVal;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    
}
