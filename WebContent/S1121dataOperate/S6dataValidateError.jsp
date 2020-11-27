<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="../dataOperate/dataValidate" method="post">
错误信息
<c:if test="${employee.id == null }">
			<!-- path 属性对应 html 表单标签的 name 属性值 -->
			LastName: <form:input path="lastName"/>
			<form:errors path="lastName"></form:errors>
		</c:if>
</form:form>
</body>
</html>