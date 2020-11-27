<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../servlet/servletAPI" method="post">
id:<input type="text" name="uid"><br/>
姓名:<input type="text" name="uname"><br/>
年龄:<input type="text" name="uage"><br/>
性别:<input type="text" name="usex"><br/>
省份:<input type="text" name="uaddress.province"><br/>
<input type="submit" value="提交">
</form>
</body>
</html>