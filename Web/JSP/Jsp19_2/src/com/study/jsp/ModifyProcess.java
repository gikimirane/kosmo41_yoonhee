package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ModifyProcess")
public class ModifyProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection con;
	private PreparedStatement pstmt;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String upw = "tiger";
	
	private String id, pw, name, phone1, phone2, phone3, gender;
	
	HttpSession session;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		actionDo(request, response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		session = request.getSession();
		
		id = (String)session.getAttribute("id");
		
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");
		
		if (pwConfirm()) {
			System.out.println("OK");
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, uid, upw);
				
				String query = "update member set name = ?, phone = ?, gender = ? where id = ?";
				pstmt = con.prepareStatement(query);
				pstmt.setString(1, name);
				pstmt.setString(2, phone1 + "-" + phone2 + "-" + phone3);
				pstmt.setString(3, gender);
				pstmt.setString(4, id);
				int updateCount = pstmt.executeUpdate();
				
				PrintWriter writer = response.getWriter();
				
				if(updateCount == 1) {
					System.out.println("insert success");
					/*response.sendRedirect("ModifyResult.jsp");*/
					writer.println("[{\"result\":\"ok\",\"desc\":\"none\"}]" );
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				response.setContentType("text/html; charset=UTF-8");
				System.out.println("insert fail");
				
				PrintWriter writer = response.getWriter();
				writer.println("[{\"result\":\"fail\",\"desc\":\":\" 패스워드가 안맞아!!\"}]");
				
				/*response.sendRedirect("Modify.jsp");*/
				
				writer.close();
			} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
					
				} catch (Exception e2) {}
			}
		}
	}
	
	//비밀번호까지 똑같아야 정보수정 가능한 메소드
	private boolean pwConfirm() {
		boolean rs = false;
		
		String sessionPw = (String)session.getAttribute("pw");
		
		if(sessionPw.equals(pw)) {
			rs =true;
		} else {
			rs = false;
		}
		
		return rs;
	}
}