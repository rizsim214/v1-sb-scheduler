<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/includes/_header.jsp" />
	<header>
	    <s:include value="/includes/_navigation.jsp" />
	</header>
	<main>
		
			<h2 class="text-center mt-3">Appointment Calendar</h2>
			<s:include value="/includes/appointment/_calendar.jsp"/>
		
	</main>

<s:include value="/includes/_footer.jsp" />
