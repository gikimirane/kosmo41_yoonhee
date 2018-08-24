<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>loginOk</title>
</head>
<body>
    <%!
    	String id, pw, name;
    %>
    
    <%
    	request.setCharacterEncoding("UTF-8");	
    
    	id = request.getParameter("id");
    	pw = request.getParameter("pw");
    	name = request.getParameter("name");
    	
    	if(id.equals("abcde") && pw.equals("12345")) {
    		Cookie cookie = new Cookie("id", id);
    		cookie.setMaxAge(60);  //쿠키 유효기간을 설정
    		response.addCookie(cookie);
    		
    		Cookie cookie2 = new Cookie("name", name);
    		response.addCookie(cookie2);
    		
    		response.sendRedirect("welcome.jsp");
    	} else {
    		response.sendRedirect("login.html");
    	}
    	// 참고 365일로 설정(cookie.setMaxAge(365*24*60*60))
    %>
    
</body>
</html>