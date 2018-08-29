<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!
    	Connection con;
    	Statement stmt;
    	ResultSet resultSet;
    	
    	String driver = "oracle.jdbc.driver.OracleDriver";
    	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    	String uid = "scott";
    	String upw = "tiger";
    	String query = "select * from member";
    	
    	String name, id, pw, phone1, phone2, phone3, gender;
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery.js"></script>
<title>수정</title>

	<script>
	var queryString;
	
	function form_check() {
		
		submit_ajax();
	}
	
	function submit_ajax() {
		queryString = $('#LoginProcess').serialize();
		alert(queryString);
		
		$.ajax({
			/* 가져오고자하는 서버페이지 주소를 넣는다. */
			url : '/Jsp19_2/ModifyProcess',
			/* 데이터를 서버로 전송하게 된다. */
			type : 'POST',
			/* 아이디를 넣으면 해당 데이터를 보내준다. */
			data : queryString,
			dataType : 'json',
			success : function(json) {
				/* alert(json); */
				var result = eval(json);
				 /* alert(result[0].result + ":" +result[0].desc);*/
				if (result[0].result=="ok") {
					alert("로그인 됐어.")
					window.location.replace("LoginResult.jsp");
				} else {
					alert("로그인 다시해.")
					alert(results[0].desc);
				}
			}
		});
	}
	</script>
	
</head>
<body>

	<%
		id = (String)session.getAttribute("id");
	
		if(id == null) {
			response.sendRedirect("Login.jsp");
			} else {
	
				String query = "select * from member where id = '" + id + "'";
				
				Class.forName(driver);
				con = DriverManager.getConnection(url, uid, upw);
				stmt = con.createStatement();
				resultSet = stmt.executeQuery(query);
				
				String phone = "";
				while(resultSet.next()) {
					name = resultSet.getString("name");
					pw = resultSet.getString("pw");
					phone = resultSet.getString("phone");
					gender = resultSet.getString("gender");
			}
		
			phone1 = phone.substring(0, 3);
			phone2 = phone.substring(4, 8);
			phone3 = phone.substring(9, 13);
		
	%>
	
	<form name="ModifyProcess" id="ModifyProcess">
		아이디 : <%=id %><br>
		비밀번호 : <input type="text" name="pw" size="10"><br>
		이름 : <input type="text" name="name" size="10" value=<%=name %>><br>
		전화번호 : <select name= "phone1">
			<option value="010">010</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="019">019</option>
			<option value="011">011</option>
			<option value="02">02</option>
		</select> -
		<input type="text" name="phone2" size="5" value=<%=phone2 %>> -
		<input type="text" name="phone3" size="5" value=<%=phone3 %>> <br>
		<%
			if(gender.equals("man")) {
		%>
		성별구분 : <input type="radio" name="gender" value="man" checked="checked">남 &nbsp;
				   <input type="radio" name="gender" value="woman">여 <br>
		<%
			} else {
		%>
		성별구분 : <input type="radio" name="gender" value="man">남 &nbsp;
				   <input type="radio" name="gender" value="woman" checked="checked">여 <br>
		<%
				}
			}
		%>
		<input type="button" value="정보수정" onclick="form_check()" />
	</form>
</body>
</html>