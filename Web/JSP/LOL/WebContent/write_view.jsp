<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdn.ckeditor.com/4.10.0/standard/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

	<center>
	<table cellpadding="0" cellspacing="0" border="1">
		<form action="write.do" method="post" enctype="multipart/form-data">
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="bName" size = "50"> </td>
			</tr>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" size = "50"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td>
					<!-- <textarea name="bContent" rows = "10"> </textarea> -->
					<textarea name="bContent" id="editor1" rows="10" cols="100">
                	This is my textarea to be replaced with CKEditor.
            		</textarea>
            		<script>
                	// Replace the <textarea id="editor1"> with a CKEditor
                	// instance, using default configuration.
                	CKEDITOR.replace( 'editor1' );
            		</script>
			</tr>
			<tr>
				<td>파일명 :</td>
				<td><input type="file" name="bFilename" value="${content_view.bFilename}"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력"> &nbsp;&nbsp;
					<a href="list.do">목록보기</a>
				</td>
			</tr>
		</form>
	</table>
	</center>

</body>
</html>