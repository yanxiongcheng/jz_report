<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
</head>
<body>
	<table width="100%" border="1px solid black" cellpadding="0"
		cellspacing="0">
		<thead>
			<tr>
				<td>id</td>
				<td>用户名</td>
				<td>密码</td>
				<td>手机号码</td>
				<td>性别</td>
				<td>年龄</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${userList }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.userName }</td>
					<td>${user.password }</td>
					<td>${user.mobile }</td>
					<td><c:if test="${user.sex == '0'}">男</c:if><c:if test="${user.sex == '1'}">女</c:if></td>
					<td>${user.age }</td>
					<td><a href="${pageContext.request.contextPath}/user/toEdit?id=${user.id}">修改</a> <a href="${pageContext.request.contextPath}/user/delete?id=${user.id}">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="${pageContext.request.contextPath}/user/toAdd">新增用户</a>
</body>
</html>