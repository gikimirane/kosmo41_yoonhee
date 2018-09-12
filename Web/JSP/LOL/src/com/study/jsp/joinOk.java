package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class joinOk implements service {

	public joinOk() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			           throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("joinOk");
		
		PrintWriter writer = response.getWriter();
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO dto = new MemberDTO();
		HttpSession session = request.getSession();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String eMail = request.getParameter("eMail");
		String address = request.getParameter("address");
		
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.seteMail(eMail);
		dto.setAddress(address);
		
		dto.setrDate(new Timestamp(System.currentTimeMillis()));
		if(dao.confirmId(dto.getId()) == MemberDAO.MEMBER_EXISTENT) {
			
			writer.println("<script>\r\n" + 
					"		alert(\"아이디가 중복이야!\");\r\n" + 
					"		history.back();\r\n" + 
					"	</script>");
			writer.close();
			
		} else {
			int ri = dao.insertMember(dto);
			
			if(ri == MemberDAO.MEMBER_JOIN_SUCCESS) {
				session.setAttribute("id", dto.getId());
				
				writer.println("<script language=\"javascript\">\r\n" + 
						"		alert(\"회원가입 완료!\");\r\n" + 
						"		document.location.href=\"login.jsp\";\r\n" + 
						"	</script>");
				writer.close();
		} else {
			writer.println("<script language=\"javascript\">\r\n" + 
					"		alert(\"회원가입 실패야!\");\r\n" + 
					"		document.location.href=\"login.jsp\";\r\n" + 
					"	</script>");
			writer.close();
			}
		}

	}

}
