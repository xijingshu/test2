<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>展示界面</title>
</head>
<body>

	姓名：
	<input type="text" name="username" value="${username}" />
	<br> 电话：
	<input type="text" name="tel" value="${tel}" />
	<br /> 性别：${(gender==0?"男":"女")}
	<br /> 地址：${address}
	<br/> 时间：${date}
	<br /> 爱好：
	<c:forEach items="${hobby}" var="h">
	${h}
	</c:forEach>
	
	<br />

</body>
</html>