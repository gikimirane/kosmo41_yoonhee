package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class infomodifyOk implements service {

	public infomodifyOk() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			             throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		System.out.println("modifyOk");
		PrintWriter writer = response.getWriter();
		
		String id = (String)session.getAttribute("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String address = request.getParameter("address");
		String eMail = request.getParameter("eMail");
		
		MemberDTO dto = new MemberDTO(id,pw,name,eMail,address);
		
		MemberDAO dao = MemberDAO.getInstance();
		

		
		System.out.println(dto.getId() + "bbbb");
		int ri = dao.updateMember(dto);
		
		if(ri == 1) {
			writer.println("<script language=\"javascript\">\r\n" + 
					"		alert(\"정보 수정했어!\");\r\n" + 
					"		document.location.href=\"main.jsp\";\r\n" + 
					"	</script>");
			writer.close();
			
		} else {
			writer.println("<script language=\"javascript\">\r\n" + 
					"		alert(\"정보 수정 실패야!\");\r\n" + 
					"		history.go(-1);\r\n" + 
					"	</script>");
		}

	}

}
