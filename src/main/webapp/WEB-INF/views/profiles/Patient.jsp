<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/WEB-INF/includes/_header.jsp" />
	<header>
	    <s:include value="/WEB-INF/includes/_session-navigation.jsp" />
	</header>
	<main>
	    <h3><s:property value="sessionAccount.email" /></h3>
	</main>

<s:include value="/WEB-INF/includes/_footer.jsp" />
