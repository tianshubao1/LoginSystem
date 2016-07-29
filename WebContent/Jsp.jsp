<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"
    import="java.util.*"
    import="java.net.*" 
    errorPage="/WEB-INF/err1.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% 
		int k = 9/0;
		out.println(new java.util.Date());
		%>
	<table border=1>
		<tr><td>apple</td><td>melon</td><td>dada</td></tr>
</body>
</html>