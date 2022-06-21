<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/includes/_header.jsp" />
	<header>
	    <s:include value="/includes/_session-navigation.jsp" />
	</header>
	<main>
	   <h3>HELLO USER!</h3>
	   <s:a href="https://sbclinic.hub.loginradius.com/auth.aspx?profile.aspx">Profile</s:a>
	</main>

<s:include value="/includes/_footer.jsp" />
