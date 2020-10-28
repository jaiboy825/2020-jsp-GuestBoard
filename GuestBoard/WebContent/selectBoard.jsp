<%@page import="java.util.ArrayList"%>
<%@page import="board.BoardVO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
<%@ include file="header.jsp" %>
   <%-- <% // 공유된 자료 가져올때 타입 - 파라미터, 오브젝트, getAttrribute("list");
   ArrayList<BoardVO> list = (ArrayList<BoardVO>)request.getAttribute("list"); 
      for (int i = 0; i < list.size(); i++) {
         BoardVO vo = list.get(i);
   %>
   <hr style="border:2 solid">
   <%= vo.getBoardNum() %>번째 글 &nbsp;&nbsp; 작성날짜 <%= vo.getWriteDate() %><br>
   작성자 : <%= vo.getName() %><br>
   제목 : <%= vo.getTitle() %><br>
   내용 : <%= vo.getContent() %><br>
   <a href="updateForm.jsp?boardNum=<%= vo.getBoardNum() %>">글 수정</a>
   <%
      }
   %> --%>
   <hr style="border:2 solid">
   <c:forEach var="board" items="${list}">
   ${board.boardNum} 번째 글 &nbsp;&nbsp;&nbsp; 작성날짜 : ${board.writeDate}<br>
   작성자 : ${board.name}<br>
   제목 : ${board.title}<br>
   내용 : ${board.content}<br>
   <%-- <a href="BoardRead.do?boardNum=${board.boardNum}">글 수정</a>&nbsp;&nbsp;
   <a href="BoardDelete.jsp?boardNum=${board.boardNum}">글 삭제</a> --%>
   <hr style="border:solid 2px">
   </c:forEach>
<jsp:include page="footer.jsp" />