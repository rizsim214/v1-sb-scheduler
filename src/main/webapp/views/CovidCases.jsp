<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/includes/_header.jsp" />
	<header>
	    <s:include value="/includes/_navigation.jsp" />
	</header>
	<main>
		<div class="container my-3">
			<div class="col-md-10 mx-auto">
				<h5>Total Cases: <span class="text-secondary fw-bold"><s:property value="covidCases.data.total"/></span> recorded cases in the philippines as of <s:property value="covidCases.last_update"/></h5>
				<h5>The <span class="text-danger fw-bold">Fatality Rate</span> for covid 19 in the philippines - <span class="text-danger fw-bold"><s:property value="covidCases.data.fatality_rate"/></span> </h5>
				<h5>The <span class="text-success fw-bold">Recovery Rate</span> for covid 19 in the philippines - <span class="text-success fw-bold"><s:property value="covidCases.data.recovery_rate"/></span></h5>
				<s:set var="totalCases" value="covidCases.data.total"/>
				<s:set var="recoveries" value="covidCases.data.recoveries"/>
				<s:set var="deaths" value="covidCases.data.deaths"/>
				<s:set var="active" value="covidCases.data.active_cases"/>
				<br>
				<h6>Recoveries</h6>
				<div class="progress my-2">
					<div class="progress-bar bg-success" role="progressbar" style="width: 80%" aria-valuenow="%{recoveries}" aria-valuemin="0" aria-valuemax="%{totalCases}"><s:property value="covidCases.data.recoveries"/></div>
				</div>
				<h6>Deaths</h6>
				<div class="progress my-2">
					<div class="progress-bar bg-danger" role="progressbar" style="width: 10%" aria-valuenow="%{deaths}" aria-valuemin="0" aria-valuemax="%{totalCases}"><s:property value="covidCases.data.deaths"/></div>
				</div>
				<h6>Active cases</h6>
				<div class="progress my-2 ">
					<div class="progress-bar bg-warning" role="progressbar" style="width: 20%" aria-valuenow="%{active}" aria-valuemin="0" aria-valuemax="%{totalCases}"><s:property value="covidCases.data.active_cases"/></div>
				</div>
			</div>
		</div>
		<div class="container row mx-auto justify-content-evenly">
			
			<s:iterator value="covidRegion.data">
				<div class="card mt-3 col-md-4  shadow-lg">
					<h5 class="card-header py-4 text-uppercase">RGN: <span class="fw-bold"><s:property value="region"/></span></h5>
					<div class="card-body">
						<h5 class="card-title">Cases: <span class="text-secondary fw-bold"><s:property value="cases"/></span></h5>
						<h5 class="card-title">Recovered: <span class="text-success fw-bold"><s:property value="recovered"/></span></h5>
						<h5 class="card-title">Deaths: <span class="text-danger fw-bold"><s:property value="deaths"/></span></h5>
					</div>
					<div class="card-footer">
						<h6>Last Updated on <s:property value="covidRegion.last_update"/></h6>
					</div>
				</div>
			</s:iterator>
		</div>
	</main>

<s:include value="/includes/_footer.jsp" />
