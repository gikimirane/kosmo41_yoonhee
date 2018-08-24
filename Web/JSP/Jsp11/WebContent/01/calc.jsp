<%@ page import="java.util.Arrays" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>calc</title>
</head>
<body>

<%!
    String f, s, calc;
%>

<%
	String sType = request.getMethod();    
	request.setCharacterEncoding("UTF-8");

	f = request.getParameter("f");
	s = request.getParameter("s");
	calc = request.getParameter("calc");
	
	int result = 0;
	int A = Integer.parseInt(f);
	int B = Integer.parseInt(s);
%>

<%
    //get과 post의 차이로 답이 달라진다.
	if(sType.equals("POST")) {
%>

<%
    if (calc.equals("+")) {
    	result = A + B;
    }

	if (calc.equals("-")) {
		result = A - B;
	}
	
	if (calc.equals("*")) {
		result = A * B;
	}
	
	if (calc.equals("/")) {
		result = A / B;
	}
%>

<%
	out.println("첫번째 수 : " + A + "<br>");
	out.println("두번째 수 : " + B + "<br>");
	out.println(A + " " + calc + " " + B + "=" + result + "입니다.");
%>
<%
    } else {
%>

<h1>허용된 요청 방식이 아닙니다.</h1>

<%
    }
%>

</body>
</html>