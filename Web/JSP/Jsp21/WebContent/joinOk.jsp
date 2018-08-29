<%@ page import="java.sql.Timestamp" %>
<%@ page import="com.study.jsp.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dto" class="com.study.jsp.MemberDTO" />
<jsp:setProperty property="*" name="dto"/>
<%
	dto.setrDate(new Timestamp(System.currentTimeMillis()));
	BDao dao = BDao.getInstance();
	if(dao.confirmId(dto.getId()) == BDao.MEMBER_EXISTENT) {
%>

	<script>
		alert("아이디가 중복이야!");
		history.back();
	</script>
	
<%
		} else {
		int ri = dao.insertMember(dto);
		if(ri == BDao.MEMBER_JOIN_SUCCESS) {
			session.setAttribute("id", dto.getId());
	%>
	<script language="javascript">
		alert("회원가입 완료!");
		document.location.href="login.jsp";
	</script>

<%
		} else {
%>

	<script language="javascript">
		alert("회원가입 실패야!");
		document.location.href="login.jsp";
	</script>
	
<%
		}
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