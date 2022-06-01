<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<nav class="navbar navbar-expand-lg navbar-dark bg-info py-4">
   <div class="container">
        <s:url var="home" action="clinic" /> 
        <s:a href="%{home}" class="navbar-brand">
            <i class="fa-solid fa-stethoscope"></i> CLINIC
        </s:a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav ms-auto d-flex align-items-center">
                <li class="nav-item">
                    <s:url var="appointment" action="appointment" /> 
                    <s:a class="nav-link" href="%{appointment}">Appointment </s:a>
                </li>
                <li class="nav-item">
                    <s:url var="services" action="services" /> 
                    <s:a class="nav-link" href="%{services}">Clinical Services </s:a>
                </li>
                <li class="nav-item">
                    <s:url var="contact" action="contact" /> 
                    <s:a class="nav-link" href="%{contact}">Contact Us </s:a>
                </li>
                <li class="nav-item">
                    <s:url var="login" action="login" /> 
                    <s:a class="btn btn-outline-light ms-3" href="%{login}">Sign In </s:a>
                </li>
            </ul>
        </div>
   </div>
</nav>
