<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/includes/_header.jsp" />
	<header>
	    <s:include value="/includes/_navigation.jsp" />
	</header>
	<main>
	    <div class="container my-3 row mx-auto justify-content-evenly">
			<s:iterator value="newsResponse.articles">
				<div class="card col-md-5 mt-3 mr-2">
					<h5 class="card-header"><s:property value="source.name"/></h5>
					<div class="card-body">
						<h5 class="card-title"><s:property value="title" /></h5>
						<p class="card-text"><s:property value="content" /></p>
						<s:set var="url" value="url" />
						<s:a href="%{url}" class="btn btn-primary">Source</s:a>
					</div>
					<div class="card-footer">
						
							<p>Author: <span class="fw-bold"><s:property value="author" /></span></p>
							<p class="text-end"><em><s:property value="publishedAt" /></em></p>
						
					</div>
				</div>
			</s:iterator>
		</div>
	</main>

<s:include value="/includes/_footer.jsp" />
