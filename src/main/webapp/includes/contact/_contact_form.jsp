<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form action="send_message" class="mx-auto w-100 px-2">
    <h6 class="text-light text-center">We'll get in touch with you right away...</h6>
    <s:textfield name="contactBean.email" class="form-control mb-2 mt-2" placeholder="Email Address"/>
    <s:textfield name="contactBean.contactInfo" class="form-control mb-2 mt-2" placeholder="Mobile Number"/>
    <s:textfield name="contactBean.title" class="form-control mb-2 mt-2" placeholder="Message Title"/>
    <s:textarea name="contactBean.message" class="form-control mb-2 mt-2" cols="30" rows="4" placeholder="How can we be of service?"/>
    <s:submit value="Send Message" class="btn btn-light my-2 py-1 w-100" />
</s:form>