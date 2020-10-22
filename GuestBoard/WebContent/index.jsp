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
   <a href="selectBoard.do">[방명록 보기]</a>&nbsp;&nbsp;&nbsp;
   <a href="insertBoard.do">[방명록 쓰기]</a>&nbsp;&nbsp;&nbsp;
<hr>
		<form action="BoardInsert.do" method="post">
		
		<table border="1" style="width:400">
			<tr><th>작성자</th><td><input type="text" name="name" value="ahn" required></td></tr>
			<tr><th>비밀번호</th><td><input type="password" name="pass" value="1234" required></td></tr>
			<tr><th>제목</th><td><input type="text" name="title" required></td></tr>
			<tr><th>내용</th><td><textarea name="content" rows="2" cols="65">content1</textarea></td></tr>
			<tr><td colspan = "2" align = "center">
				<input type = "submit" value = "등록">
				<input type = "reset" value = "재작성">
			    </td>
		    </tr>
		</table>
		
		</form>
</body>
</html>