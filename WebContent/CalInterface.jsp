<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="JS/javascript.js"> </script>
</head>
<body>

	<form action="/assignment2/result.jsp" method="post">
	input the 1st number<input type = "text" id="num1" name = "num1"/><br/>
	input the 2nd number<input type = "text" id="num2" name = "num2"/><br/>
	
	input type<select name = "operator">
		<option value="+">+</option>
		<option value="-">-</option>
		<option value="*">*</option>
		<option value="/">/</option>
	</select>
	<br/>	
	
	<input type = "submit" onclick = "checkNum()" value = "compute"/>
	</form> 
	
</body>
</html>