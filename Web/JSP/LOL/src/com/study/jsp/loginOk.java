package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginOk implements service {

	public loginOk() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest request,
            HttpServletResponse response)
             throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("'id'님 환영합니다.");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		                           
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO dto = dao.getMember(id);
		int checkNum = dao.userCheck(id, pw);
		
		PrintWriter writer = response.getWriter();
		
		if(checkNum == -1) {
			
			// html 출력
			writer.println("<script language=\"javascript\">\r\n" + 
					"		alert(\"아이디가 존재하지않아!\");\r\n" + 
					"		history.go(-1);\r\n" + 
					"	</script>");
			writer.close();
			
		} else if(checkNum == 0) {
			
			writer.println("<script language=\"javascript\">\r\n" + 
					"		alert(\"비밀번호가 맞지않아!\");\r\n" + 
					"		history.go(-1);\r\n" + 
					"	</script>");
			writer.close();
			
		} else if(checkNum == 1) {
			
			if(dto == null) {
				writer.println("<script language=\"javascript\">\r\n" + 
						"		alert(\"존재하지 않는 사람이야!\");\r\n" + 
						"		history.go(-1);\r\n" + 
						"	</script>");
				writer.close();
				
			} else {
				
				String name = dto.getName();
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				session.setAttribute("name", name);
				session.setAttribute("ValidMem", "yes");
				response.sendRedirect("main.jsp");
			}
		}

	}

}
