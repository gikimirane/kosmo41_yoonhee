<%@page import= "com.study.jsp.MemberDTO"%>
<%@page import= "java.util.ArrayList"%>
<%@page import= "com.study.jsp.BDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

	<%
		BDao memberDAO = new BDao();
		ArrayList<MemberDTO> dtos = memberDAO.memberSelect();
		
		for(int i=0; i<dtos.size(); i++) {
			MemberDTO dto = dtos.get(i);
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			String phone = dto.getPhone();
			String gender = dto.getGender();
			
		out.println("아이디 : " + id +
					", 비밀번호 : " + pw +
					", 이름 : " + name +
					", 연락처 : " + phone +
					", 성별 : " + gender + "<br>" );
					
		}
	%>

</body>
</html>