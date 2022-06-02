<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/WEB-INF/includes/_header.jsp" />
	<header>
	    <s:include value="/WEB-INF/includes/_navigation.jsp" />
	</header>
	<main>
	    <s:url var="doctor" value="../../../../assets/images/doctor.svg" />
	    <img src="${doctor}" border="0" alt="Home">
	</main>

<s:include value="/WEB-INF/includes/_footer.jsp" />
