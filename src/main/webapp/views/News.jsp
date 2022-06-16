<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/includes/_header.jsp" />
	<header>
	    <s:include value="/includes/_navigation.jsp" />
	</header>
	<main>
		<div class="container mt-3">
			<s:form action="news" method="POST" class="col-md-7 mx-auto">
					<s:textfield class="form-control my-2" name="searchQuery" placeholder="Search for news categories" />
					<s:select headerKey="-1" headerValue="----Preferred Language----" list="languages"  name="languageQuery" class="form-control mb-2"/>
					<s:select headerKey="-1" headerValue="----Sort By----" list="sortByList"  name="sortQuery" class="form-control mb-2"/>
					<s:submit value="Search" class="btn btn-primary"/>
			</s:form>
		</div>
		<div class="container mt-3">
			
		</div>
	    <div class="container my-3 row mx-auto justify-content-evenly">
			<s:set var="error" value="error"/>
			<s:if test="%{error != 426 && newsResponse != null}">
				<s:iterator value="newsResponse.articles">
					<div class="card mt-3 mx-1 shadow-lg">
						<h5 class="card-header py-4"><span class="fw-bold">Published At: </span><s:property value="publishedAt"/></h5>
						<div class="card-body">
							<h5 class="card-title"><s:property value="title" /> by <span class="fw-bold"><s:property value="author" /></span></h5>
							<p class="card-text"><s:property value="description" /></p>
						</div>
						<div class="card-footer">
							<s:set var="url" value="url" />
							<p class="fw-bold">Read More: <s:a href="%{url}" class="card-link"><s:property value="url"/></s:a></p>
						</div>
					</div>
				</s:iterator>
			</s:if>
			<s:else>
				<h4 class="text-center text-secondary"><em>No articles to show... Please refresh the page</em></h4>
			</s:else>
		</div>
	</main>

<s:include value="/includes/_footer.jsp" />
