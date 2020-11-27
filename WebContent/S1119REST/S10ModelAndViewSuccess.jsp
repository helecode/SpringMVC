<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>pageScope: ${pageScope.msg}</h5>
<h5>requestScope :  ${requestScope.msg}</h5>
<h5>sessionScope:   ${sessionScope.msg}</h5>
<h5>applicationScope:  ${applicationScope.msg}</h5>
<h2>07ServletSuccess07ServletSuccess07ServletSuccess</h2>
requestScope--user:${requestScope.user }<br/>
requestScope--uname:${requestScope.name }<br/>
requestmodelandview--date:${requestScope.date }<br/>
requestmodelandview--mapa:${requestScope.mapa }<br/>

sessionScope--user:${sessionScope.user  }<br/>
sessionScope--uname:${sessionScope.name }<br/>
sessionmodelandview--date:${sessionScope.date }<br/>
sessionmodelandview--mapa:${sessionScope.mapa }<br/>
</body>
</html>