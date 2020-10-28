<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>간단한 방명록 만들기 Ver 1.0</h1>
	<hr>
	<a href="selectBoard.jsp">[방명록 보기]</a>
	<a href="insertBoard.jsp">[방명록 쓰기]</a>
	<a href="index.jsp">[홈으로]</a>
	<hr>
	<form action="BoardInsert.do" method="post">
		<table style="width:400px;" border="1">
			<tr>
				<th>작성자</th>
				<td><input type="text" name="name" value="jeon"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pass" value="1234"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="text" value="hello"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="2" cols="65" name="content">content1</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="등록"> <input
					type="reset" value="재작성"></td>
			</tr>
		</table>
	</form>
</body>
</html>