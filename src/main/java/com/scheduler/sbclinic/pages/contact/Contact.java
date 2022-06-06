package com.scheduler.sbclinic.pages.contact;

import com.opensymphony.xwork2.ActionSupport;
import com.scheduler.sbclinic.models.Message;

public class Contact extends ActionSupport{

    Message contactBean;

    public Message getContactBean() {
        return contactBean;
    }

    public void setContactBean(Message contactBean) {
        this.contactBean = contactBean;
    }

    @Override
    public String execute() throws Exception{
        
        return INPUT;
    }

    public String sendMessage() throws Exception {
        contactBean = getContactBean();
        System.out.println(contactBean);
        return SUCCESS;
    }


    
}
