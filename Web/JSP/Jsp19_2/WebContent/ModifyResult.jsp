<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery.js"></script>
<title>수정</title>
</head>
<body>

<%
	String id = (String)session.getAttribute("id");

	if(id == null) {
		response.sendRedirect("Login.jsp");
		}
%>

<%= session.getAttribute("name") %>야 수정됐어 야호.<br><p>

<a href="Logout.jsp">로그아웃</a> &nbsp;&nbsp;
<a href="Modify.jsp">정보수정</a>

</body>
</html>