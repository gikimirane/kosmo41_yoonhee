package com.study.jsp;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("*.do")
public class FrontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FrontCon() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		System.out.println("doPost");
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		System.out.println("actionDo");
		
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		String conPath = request.getContextPath();
		System.out.println("conPath : " + conPath);
		String command = uri.substring(conPath.length());
		System.out.println("command : " + command);
		
		if (command.equals("/joinOk.do")) {
			joinOk(request, response);
			
		} else if (command.equals("/loginOk.do")) {
			loginOk(request, response);
			
		} else if (command.equals("/modifyOk.do")) {
			modifyOk(request, response);
		}
	}
	
	public void joinOk (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("joinOk");
		
		PrintWriter writer = response.getWriter();
		MemberDAO dao = MemberDAO.getInstance();
		MemberDTO dto = new MemberDTO();
		HttpSession session = request.getSession();
		
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
	
	public void loginOk (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("loginOk");
		
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
	
	public void modifyOk (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		
		System.out.println("modifyOk");
		
		PrintWriter writer = response.getWriter();
		MemberDTO dto = new MemberDTO();
		MemberDAO dao = MemberDAO.getInstance();
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("id");
		dto.setId(id);
		
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
	
	public void logoutOk (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html; charset=UTF-8");
		
		HttpSession session = request.getSession();
		
		session.invalidate();
		response.sendRedirect("loginOk");
	}
}
