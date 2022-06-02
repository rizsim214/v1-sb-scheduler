<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form action="signin/sign_in" class="mx-auto w-100">
    <s:textfield name="email"  class="form-control mb-2 mt-2" placeholder="Email Address"/>
    <span class="text-warning">Note: We'll make sure your credentials are secured...</span>
    <s:password name="password" class="form-control my-2" placeholder="Password"/>
    <s:submit type="button" name="submit" class="btn btn-outline-light my-2 w-100" />
</s:form>