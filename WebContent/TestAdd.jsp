<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="webroot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>测试类</title>
</head>
<body>
	<h1 align="center">测试添加</h1>
	<div style="border: 1px solid red; margin-left: 35%;">
		<br />
		<form action="${webroot}/mng/testadd" method="post">
			姓名：<input type="text" name="username" /> <br /> <br /> 电话：<input
				type="text" name="tel" /> <br /> <br /> <br /> 性别：<input
				type="radio" name="gender" id="gender0" value="0" />男 <input
				type="radio" name="gender" id="gender1" value="1" />女 <br /> <br />
			兴趣：<input type="checkbox" name="hobby" id="hobby1" value="打篮球" />打篮球
		<br /> <input type="checkbox" name="hobby" id="hobby2"
				value="唱歌" />唱歌 
			<input type="checkbox" name="hobby" id="hobby3" value="跳舞" />跳舞 <br />
			<br /> 地址：<select name="address">
				<option value="河西区">河西区</option>
				<option value="河东区">河东区</option>
				<option value="南开区">南开区</option>
				<option value="和平区">和平区</option>
				<option value="西青区">西青区</option>


			</select> <br /> <br />
			日期：<input type="text" name="date1" /> <br /> <br />
			 <input type="reset" id="ret" /> 
			
			<input
				type="submit" style="margin-left: 35%;" id="sub" />

		</form>
	</div>


</body>
</html>