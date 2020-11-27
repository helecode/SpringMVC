<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../he/helloWorld?name='nameValue'" method="post">

<input type="submit" value="提交">
</form>

<h2><a href="../he/params?name='nameValue'&&age=10">params</a></h2>

<h2><a href="../he/asdsd/url?name='nameValue'&&age=10">url</a></h2>

<h2><a href="../he/pathVariable/nameValue,12">pathVariable</a></h2>
<h2><a href="../he/commonPublic?name='nameValue'&&age=12">commonPublic</a></h2>
</body>
</html>