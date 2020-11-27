<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../dataOperate/dataValidate" method="post">
	<input type="text" value="${employee.id }" name="id"><br/>
	<input type="text" value="${employee.lastName}" name="name"><br/>
	<input type="text" value="${employee.email }" name="email"><br/>
	<input type="text" value="${employee.date }" name="date"><br/>
	<input type="text" value="${employee.total }" name="total"><br/>
	<input type="text" value="${employee.discount }" name="discount"><br/>
	<input type="text" value="${employee.money }" name="money"><br/>
	<input type="submit" value="提交">
</form>

</body>
</html>