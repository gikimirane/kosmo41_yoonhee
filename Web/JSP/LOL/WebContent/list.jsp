<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>list</title>
	<meta charset="UTF-8">

	<!-- Required meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

<style>

	.table { background-color: white; }
	.table { font-weight: bold; }
	
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light .table-dark">
  <a class="navbar-brand" href="#">KOSMO41</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="home.do">Home<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="list.do">Notice Board</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Contact
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">PhoneBook</a>
          <a class="dropdown-item" href="#">Conversation</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">☎02-1234-5678</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <button class="btn btn-sm btn-outline-secondary" type="submit"
      	onclick="javascript:window.location='login.jsp'; return false;">로그인</button> &nbsp;
      <button class="btn btn-sm btn-outline-secondary" type="submit"
      	onclick="javascript:window.location='join.jsp';">회원가입</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </form>
  </div>
</nav>
 	
 	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

	<div style="text-align:center">
	<table width="1000" class="table table-striped">
		<thead class="thead-dark">
		<tr>
			<th scope="col">번호</th>
      		<th scope="col">이름</th>
      		<th scope="col">제목</th>
      		<th scope="col">날짜</th>
      		<th scope="col">히트</th>
      		<th scope="col">파일</th>
		</tr>
		</thead>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.bId}</td>
			<td>${dto.bName}</td>
			<td>
				<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
				<!-- 옛날 방식이라고 함 -->
				<a href="content_view.do?bId=${dto.bId}">${dto.bTitle}</a></td>
			<td>${dto.bDate}</td>
			<td>${dto.bHit}</td>
			<td>${dto.bFilename}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
      		<div id="searchform" align="center">
      			<form action="list.do" method="get">
      				<select name="listselect" class="btn btn-sm btn-outline-secondary">
      					<option value="jm">제목</option>
      					<option value="ny">내용</option>
      				</select>
      				<input class="btn btn-sm btn-outline-secondary" type="text" name="listname" placeholder="Search" aria-label="Search" />
      				<button class="btn btn-sm btn-outline-secondary" type="submit">검색</button>
      				<button class="btn btn-sm btn-outline-secondary" type="submit"><a href="write_view.do">글작성</a></button></td>
      			</form>
      		</div>
		</tr>
		<tr>
			<td colspan="5">
			
			<!-- 처음 -->
			<c:choose>
			<c:when test="${(page.curPage - 1) < 1}">    <!-- 참이면 실행이 되는 것 -->
				[ &lt;&lt; ]
			</c:when>
			<c:otherwise>
				<a href="list.do?page=1">[ &lt;&lt; ]</a>
			</c:otherwise>
			</c:choose>
			
			<!-- 이전 -->
			<c:choose>
			<c:when test="${(page.curPage - 1) < 1}">
				[ &lt; ]	
			</c:when>
			<c:otherwise>
				<a href="list.do?page=${page.curPage - 1}">[ &lt; ]</a>
			</c:otherwise>
			</c:choose>
			
			<!-- 개별 페이지 -->
			<c:forEach var="fEach" begin="${page.startPage}" end="${page.endPage}" step="1">
				<c:choose>
				<c:when test="${page.curPage == fEach}">
					[ ${fEach} ] &nbsp;	
				</c:when>
				<c:otherwise>
					<a href="list.do?page=${fEach}">[${fEach} ]</a> &nbsp;
				</c:otherwise>
				</c:choose>
			</c:forEach>
			
			<!-- 다음 -->
			<c:choose>
			<c:when test="${(page.curPage + 1) > page.totalPage}">
				[ &gt; ]	
			</c:when>
			<c:otherwise>
				<a href="list.do?page=${page.curPage + 1}">[ &gt; ]</a>
			</c:otherwise>
			</c:choose>
			
			<!-- 끝 -->
			<c:choose>
			<c:when test="${page.curPage == page.totalPage}">    <!-- 내 현재 페이지가 마지막 페이지랑 같을 때 -->
				[ &gt;&gt; ]	
			</c:when>
			<c:otherwise>
				<a href="list.do?page=${page.totalPage}">[ &gt;&gt; ]</a>
			</c:otherwise>
			</c:choose>
			</td>
		</tr>
	</table>
	
	totalCount : ${page.totalCount}<br>
	listCount : ${page.listCount}<br>
	totalPage : ${page.totalPage}<br>
	curPage : ${page.curPage}<br>
	pageCount : ${page.pageCount}<br>
	startPage : ${page.startPage}<br>
	endPage : ${page.endPage}<br>
	</div>

</body>
</html>