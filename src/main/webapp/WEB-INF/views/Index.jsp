<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/WEB-INF/includes/_header.jsp" />
	<header>
	    <s:include value="/WEB-INF/includes/_navigation.jsp" />
	</header>
	<main>
		<div class="container row mx-auto my-5">
			<div class="col-md-6 bg-silver px-4 py-3 rounded">
				<p class="display-4 text-center text-secondary">Your <span class="text-info">Health</span> is Our <span class="text-warning">Priority</span></p>
				<p class="text-dark fs-5 lh-md desc fw-light">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Cupiditate fugit, pariatur, incidunt praesentium laboriosam nihil impedit officia, delectus enim doloribus voluptate ipsam? Perspiciatis quas commodi exercitationem, praesentium consequuntur qui quidem.</p>
				<div class="d-flex justify-content-center mt-4 mb-2">
					<s:url var="appointment" action="appointment" />
					<s:a href="%{#appointment}" class="btn btn-info mx-auto px-5 py-2 fs-4 text-light">Set Appointment Now</s:a>
				</div>
			</div>
			<div class="col-md-6 pt-3">
				<s:url var="doctor" value="../../../../assets/images/doctor.svg" />
				<img src="${doctor}" class="img-fluid text-center" alt="Home">
			</div>
		</div>

	</main>

<s:include value="/WEB-INF/includes/_footer.jsp" />
