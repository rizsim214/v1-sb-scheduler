package com.scheduler.sbclinic.rest;

import java.util.Map;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import com.opensymphony.xwork2.ModelDriven;
import com.scheduler.sbclinic.models.Account;

public class AccountsController implements ModelDriven<Object> {
    // private static final long serialVersionUID = 1L; 
    private Object model;
    private AccountsRepository accountRepository = new AccountsRepository();
    private Account account = new Account();
    private static Map<String, Account> map;
    {
        map = accountRepository.findAllAccounts();
    }

    public HttpHeaders index() {
        model = map;
        return new DefaultHttpHeaders("index").disableCaching();
    }    
    
    public HttpHeaders create() {
        accountRepository.save(account);
        return new DefaultHttpHeaders("create");
    }
    @Override
	public Object getModel() {
		return (model != null ? model : account);
	}
}