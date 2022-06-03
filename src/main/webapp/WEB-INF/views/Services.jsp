<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/WEB-INF/includes/_header.jsp" />
	<header>
	    <s:include value="/WEB-INF/includes/_navigation.jsp" />
	</header>
	<main>
		<div class="container-fluid my-4">
			<h4 class="text-center display-4 mt-3"><i class="fa-solid fa-flask-vial text-info me-2"></i> Laboratory Services</h4>
			<div class="row text-center">
				<div class="my-2 col">
					<s:include value="/WEB-INF/includes/services/_chemistry_card.jsp" />
				</div>
				<div class="my-2 col">
					<s:include value="/WEB-INF/includes/services/_clinic_micro_card.jsp" />
				</div>
				<div class="my-2 col-12">
					<s:include value="/WEB-INF/includes/services/_hematology_card.jsp" />
				</div>
				<div class="my-2 col">
					<s:include value="/WEB-INF/includes/services/_serology_card.jsp" />
				</div>
				<div class="my-2 col">
					<s:include value="/WEB-INF/includes/services/_special_card.jsp" />
				</div>
			</div>
		</div>	
	</main>

<s:include value="/WEB-INF/includes/_footer.jsp" />
