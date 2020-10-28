package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardVO;
@WebServlet("/BoardInsert.do")
public class BoardInsertController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doProcess(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doProcess(req, resp);
}
public void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	//한글 인코딩처리
	req.setCharacterEncoding("utf-8");
	//파라미터 가져오기
	String name = req.getParameter("name");
	String pass = req.getParameter("pass");
	String title = req.getParameter("title");
	String content = req.getParameter("content");
	// vo 객체 생성 -> 담기 -> DAO에서 메서드 처리
	BoardDAO instance = BoardDAO.getInstance();
	int boardNum = instance.getBoardNum();
	String writeDate = instance.getDate();
	BoardVO vo = new BoardVO(boardNum, name, pass, title, content, writeDate);
	instance.insertBoard(vo);
	// 화면 출력 -> JSP 의 역할 (view 역할 -> view 페이지로 )
	RequestDispatcher rd = req.getRequestDispatcher("/BoardList.do");
	rd.forward(req, resp);
}
}
