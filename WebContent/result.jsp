<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	String oper = request.getParameter("operator");
	
	double d1 = Double.parseDouble(num1);
	double d2 = Double.parseDouble(num2);
	
	double res = 0;
	if(oper.equals("+")){
		res = d1 + d2;
	}
	else if(oper.equals("-")){
		res = d1 - d2;
	}
	else if(oper.equals("*")){
		res = d1 * d2;		
	}
	else if(oper.equals("/")){
		res = d1 / d2;		
	}
	
	out.println("result is " +res);
%>
</body>
</html>