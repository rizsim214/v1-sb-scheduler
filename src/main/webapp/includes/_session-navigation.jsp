<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-info py-4">
   <div class="container">
        <s:url var="home" action="index" /> 
        <s:a href="%{home}" class="navbar-brand">
            <i class="fa-solid fa-stethoscope"></i> CLINIC
        </s:a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto d-flex align-items-center">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        <span class="align-item-center"><i class="fas fa-user fs-5 me-2"></i> <s:property value="sessionAccount.email" /></span>
                    </a>
                   <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">View History</a></li>
                        <li><a class="dropdown-item" href="https://sbclinic.hub.loginradius.com/auth.aspx?profile.aspx">Update Account</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <s:url var="logout" action="logout" />
                        <li><s:a class="dropdown-item" href="https://sbclinic.hub.loginradius.com/auth.aspx?action=logout&return_url=http://localhost:8080/index">Sign Out</s:a></li>
                   </ul>
                </li>
            </ul>
        </div>
   </div>
</nav>

<!-- <s:url var="appointment" action="appointment" /> 
<s:a class="nav-link" href="%{appointment}">Appointments </s:a> -->