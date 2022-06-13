package com.scheduler.sbclinic.rest;

import java.util.Map;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import com.opensymphony.xwork2.ModelDriven;
import com.scheduler.sbclinic.models.Account;

public class AccountsController implements ModelDriven<Object> {
    // private static final long serialVersionUID = 1L; 
    private String id;
    private Object model;
    private AccountsRepository accountRepository = new AccountsRepository();
    private Account account = new Account();
    private static Map<String, Account> map;
    {
        map = null;
        map = accountRepository.findAllAccounts();
    }

    public HttpHeaders index() throws Exception{
        model = map;
        return new DefaultHttpHeaders("index");
    }    
    
    public HttpHeaders create() throws Exception{
        accountRepository.saveAccount(account);
        return new DefaultHttpHeaders("create");
    }

    //GET accounts/id/
    public HttpHeaders show() throws Exception{
        model = accountRepository.findAccountById(getId());
        return new DefaultHttpHeaders("show");
    }

    public HttpHeaders update() throws Exception{
        account = map.get(getId());
        System.out.println(account.toString());
        accountRepository.updateAccount(getId(), account);
        return new DefaultHttpHeaders("update").disableCaching();
    }

    public HttpHeaders destroy() throws Exception{
        accountRepository.deleteAccount(getId());
        return new DefaultHttpHeaders("destroy");
    }
    @Override
	public Object getModel() {
		return (model != null ? model : account);
	}

    public String getId() {
		return id;
	}
	public void setId(String id) {
		model = accountRepository.findAccountById(id);
		this.id = id;
	}
}