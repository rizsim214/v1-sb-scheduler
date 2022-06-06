<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/WEB-INF/includes/_header.jsp" />
	<header>
	    <s:include value="/WEB-INF/includes/_navigation.jsp" />
	</header>
	<main>
		<div class="container">
			<div class="col-md-5 mx-auto bg-info px-3 py-5 my-5 rounded">
				<h3 class="text-center text-light">Contact Us</h3>
	    		<s:include value="/WEB-INF/includes/contact/_contact_form.jsp"/>
			</div>
		</div>
	</main>

<s:include value="/WEB-INF/includes/_footer.jsp" />
