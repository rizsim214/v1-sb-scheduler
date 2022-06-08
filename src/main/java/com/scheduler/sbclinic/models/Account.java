package com.scheduler.sbclinic.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Account {
    
    private String id, email,userPassword, firstName, lastName, contactInfo, userRole, userStatus;
    
    public Account(){};
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public String getUserRole() {
        return userRole;
    }
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
    public String getUserStatus() {
        return userStatus;
    }
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Account rhs = (Account) obj;

        return new EqualsBuilder() 
                .append(this.firstName, rhs.firstName)
                .append(this.lastName, rhs.lastName)
                .append(this.contactInfo, rhs.contactInfo)
                .append(this.email, rhs.email)
                .append(this.userPassword, rhs.userPassword)
                .append(this.userRole, rhs.userRole)
                .append(this.userStatus, rhs.userStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder() 
                .append(firstName)
                .append(lastName)
                .append(contactInfo)
                .append(email)
                .append(userPassword)
                .append(userRole)
                .append(userStatus)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this) 
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("contactInfo",contactInfo)
                .append("email", email)
                .append("userPassword", userPassword)
                .append("userRole", userRole)
                .append("userStatus", userStatus)
                .toString();
    }



}
