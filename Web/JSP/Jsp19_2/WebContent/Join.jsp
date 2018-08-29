<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery.js"></script>
<title>회원가입</title>

	<script>
	var queryString;
	
	function form_check() {
		submit_ajax();
	}
	
	function submit_ajax() {
		
		//id를 가져오기때문에 name과 id를 같은 것을 쓴다.
		queryString = $('#JoinProcess').serialize();
		alert(queryString);
		
		$.ajax({
			/* 가져오고자하는 서버페이지 주소를 넣는다. */
			url : '/Jsp19_2/JoinProcess',
			/* 데이터를 서버로 전송하게 된다. */
			type : 'POST',
			/* 아이디를 넣으면 해당 데이터를 보내준다. */
			data : queryString,
			dataType : 'json',
			success : function(json) {
				/* alert(json); */
				var result = eval(json);
				/* alert(result[0].result + ":" +result[0].desc); */
				if (result[0].result=="ok") {
					alert("축하해 가입했어!")
					window.location.replace("Login.jsp");
				} else {
					alert("가입 실패야, 어째.")
					alert(results[0].desc);
				}
			}
		});
	}
	</script>

</head>
<body>

	<form name="JoinProcess" id="JoinProcess">  
		아이디 : <input type="text" name="id" size="10"><br>
		비밀번호 : <input type="text" name="pw" size="10"><br>
		이름 : <input type="text" name="name" size="10"><br>
		전화번호 : <select name="phone1">
			<option value="010">010</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="019">019</option>
			<option value="011">011</option>
			<option value="02">02</option>
		</select> -
		<input type="text" name="phone2" size="5"> -
		<input type="text" name="phone3" size="5"> <br>
		성별구분 : <input type="radio" name="gender" value="man">남 &nbsp;
				   <input type="radio" name="gender" value="man">여 <br>
		<input type="button" value="회원가입" onclick="form_check()" />
	</form>
</body>
</html>


