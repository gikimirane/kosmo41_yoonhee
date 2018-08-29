<%@page import="com.study.jsp.BDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="dto" class="com.study.jsp.MemberDTO" scope="page" />
<jsp:setProperty property="*" name="dto" />

<%
	String id = (String)session.getAttribute("id");
	dto.setId(id);
	
	BDao dao = BDao.getInstance();
	int ri = dao.updateMember(dto);
	
	if(ri == 1) {
%>
	<script language="javascript">
		alert("정보 수정했어!");
		document.location.href="main.jsp";
	</script>
<%
	} else {
%>
	<script language="javascript">
		alert("정보 수정 실패야!");
		history.go(-1);
	</script>
<%
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

</body>
</html>