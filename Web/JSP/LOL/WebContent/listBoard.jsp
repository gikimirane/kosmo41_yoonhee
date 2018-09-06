<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<a href="list.do">게시물 등록</a>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<form action="listBoard.do" method="post">
	<input type="hidden" name="searchflag" value="true">
	<select name="keyField">
		<option value="title">글제목</option>
		<option value="content">글내용</option>
		<option value="writer">작성자</option>
	</select>
	<input type="text" name="keyWord">
	<input type="submit" value="검색">
</form>
</body>
</html>