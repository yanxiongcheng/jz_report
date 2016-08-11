<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户新增</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/add" method="post">
		用户名：<input type="text" name="userName"/><br />
		密    码：<input type="text" name="password"/><br />
		手机号：<input type="text" name="mobile"/><br />
		性    别：<input type="radio" name="sex" value="0"/>男&nbsp;<input type="radio" name="sex" value="1"/>女<br />
		年    龄：<input type="text" name="age"/><br />
		<input type="submit" value="提交"/><br />
	</form>
</body>
</html>