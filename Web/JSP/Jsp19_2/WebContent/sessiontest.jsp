<%@page import = "java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
</head>
<body>

    <%
    request.setCharacterEncoding("UTF-8");
    
    Enumeration enumeration = session.getAttributeNames();
    int i = 0;
    while(enumeration.hasMoreElements()) {
    	
    	String sName = enumeration.nextElement().toString();
    	String sValue = session.getAttribute(sName).toString();
    	
    	out.println(sName + ":" + sValue + "<br>");
    	i++;
    }
    
    if(i == 0)
    	out.println("해당 세션이 삭제 되었습니다.");
    
    %>
    
</body>
</html>