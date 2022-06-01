<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Welcome</title>
    <link href="<s:url value='../../../../assets/css/main.css' />" rel="stylesheet"
          type="text/css"/>
</head>

<body>
<h3>Commands</h3>
<ul>
    <s:url var="clinic" action="clinic"/>
    <li><s:a href="%{clinic}">Home</s:a></li>
    <s:url var="home" action="home"/>
    <li><s:a href="%{home}">other</s:a></li>
    <li><a href="<s:url action="Register"/>">Register</a></li>
</ul>

</body>
</html>
