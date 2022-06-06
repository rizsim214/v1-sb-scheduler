<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/WEB-INF/includes/_header.jsp" />
	<header>
	    <s:include value="/WEB-INF/includes/_navigation.jsp" />
	</header>
	<main>
		<div class="col-md-4 mx-auto my-5 bg-info py-5 px-4 rounded" >
			<s:set var="error" value="error"/>
			<s:if test="%{#error != null}">
				<p class="text-danger h5 bg-light text-center py-1 rounded">Invalid Email or Password</p>
			</s:if>
			<h3 class="text-center text-light">WELCOME GUEST!</h3>
	    	<s:include value="/WEB-INF/includes/_form-login.jsp" />
			<p class="text-primary text-center mt-2">No scheduled date yet?  <s:a href="#" class="text-light text-decoration-none h5">Request Appointment</s:a></p>
		</div>
	</main>

<s:include value="/WEB-INF/includes/_footer.jsp" />
