<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>---1.get方式---</h4>
<h2><a href="../REST/rest/1">get</a></h2>
<h4>---2.post方式---</h4>
<form action="../REST/rest" method="post">
	<input type="submit" value="提交">
</form>
<h4>---3.put方式---</h4>
<form action="../REST/rest/1" method="post">
	<input type="hidden" name="_method" value="PUT"> 
	<input type="submit" value="提交">
</form>
<h4>---delete方式---</h4>
<form action="../REST/rest/1" method="post">
	<input type="hidden" name="_method" value="DELETE"> 
	<input type="submit" value="提交">
</form>
</body>
</html>