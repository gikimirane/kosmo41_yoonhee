package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinProcess")
public class JoinProcess extends HttpServlet {
	
	private Connection con;
	private PreparedStatement pstmt;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String upw = "tiger";
	
	private String id, pw, name, phone1, phone2, phone3, gender;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// 내가 뭘하든 URL에 다 표시가 되는 것
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		// URL에 다 표시 안됨
		System.out.println("doPost");
		actionDo(request, response);
	}
		
	private void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");
		
		// member 테이블에 이런 형식으로 넣을거야.
		String query = "insert into member values(?, ?, ?, ?, ?)";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, uid, upw);
			// 최초의 한번만 무결성을 검사를 하고 정상이면 이제 검사 안하고 바로바로 넣어서 과부화를 막는다.
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, phone1 + "-" + phone2 + "-" + phone3);
			pstmt.setString(5, gender);
			
			int updateCount = pstmt.executeUpdate();
		
			PrintWriter writer = response.getWriter();
			
			// 한사람이 가입하니까 1명
			if(updateCount == 1) {
				System.out.println("insert success");
				
				// result가 ok이면 desc를 보여준다.
				// 역슬래시는 json으로 보겠다 라는 뜻이다.
				// ok이가 아니면 catch로 넘어가서 다 실패!
				writer.println("[{\"result\":\"ok\",\"desc\":\"none\"}]" );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			response.setContentType("text/html; charset=UTF-8");
			System.out.println("insert fail");
			
			PrintWriter writer = response.getWriter();
			writer.println("[{\"result\":\"fail\",\"desc\":\":\" 이미 사용중이야.\"}]");
			
			writer.close();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
				
			} catch (Exception e2) {}
		}
	}
}
