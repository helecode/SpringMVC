<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/WEB-INF/c.tld"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Department</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr> 
			<c:forEach items="${employeeList}" var="employee">
			
			<tr>

				<td>${employee.id }</td>
				<td>${employee.lastName }</td>
				<td>${employee.email }</td>
				<td>${employee.gender }</td>
				<td>${employee.department.departmentName }</td>
				<td><a href="../employee/selectEmployee?id=${ employee.id }">修改</a></td>
				<td><a href="../employee/deleteEmployee?id=${ employee.id }">删除</a></td>
			</tr></c:forEach>
</table>
<form action="../employee/updateEmployee" method="post">
	<input type="text" value="${employee.id }" name="id"><br/>
	<input type="text" value="${employee.lastName}" name="lastName"><br/>
	<input type="text" value="${employee.email }" name="email"><br/>
	<input type="text" value="${employee.gender }" name="gender"><br/>
	<input type="text" value="${employee.department.departmentName }" name="department.departmentName"><br/>
	<input type="submit" value="提交">
</form>
</body>
</html>