<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery.js"></script>
<title>로그인</title>

<script>
	var queryString;
	
	function form_check() {
	
		submit_ajax();
	}
	
	function submit_ajax() {
		
		queryString = $('#LoginProcess').serialize();
		alert(queryString);
		
		$.ajax({
			url : '/Jsp19_2/LoginProcess',
			type : 'POST',
			data : queryString,
			dataType : 'json',
			success : function(json) {
				alert(json); 
				var results = eval(json);
					// alert(result[0].result + ":" +result[0].desc); 
				if (results[0].result=="ok") {
					alert("로그인 완료야.")
					window.location.replace("LoginResult.jsp");
				} else {
					alert("로그인 안됐어, 다시해.")
					alert(results[0].desc);
				}
			}
		});
	}
	</script>
	
</head>
<body>

<form name="LoginProcess" id="LoginProcess">
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="text" name="pw"><br>
	<input type="button" value="로그인" onclick="form_check()" />
</form>

</body>
</html>