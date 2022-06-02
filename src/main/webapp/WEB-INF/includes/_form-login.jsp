<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form action="login" class="mx-auto w-100">
    <p class="text-light text-center">Note: We'll make sure your credentials are secured...</p>
    <s:textfield name="accountBean.email" class="form-control mb-2 mt-2" placeholder="Email Address"/>
    <s:password name="accountBean.userPassword" class="form-control my-2" placeholder="Password"/>
    <s:submit value="Sign In" class="btn btn-light my-2 py-1 w-100" />
</s:form>