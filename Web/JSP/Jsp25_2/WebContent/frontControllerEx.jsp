<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

	<a href="join.do">join</a>
	<hr />
	<a href="http://localhost:8081<%=request.getContextPath()%>/login.do">login</a>
	<hr />
	<a href="http://localhost:8081/Jsp25_1/modify.do">modify</a>
	<hr />
	<a href="<%=request.getContextPath()%>/logout.do">logout</a>
	
</body>
</html>