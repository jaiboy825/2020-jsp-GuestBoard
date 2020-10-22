package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// URI 가져와서 path 골라내서 출력
		String uri = req.getRequestURI();
		System.out.println(uri);
		String contextPath = req.getContextPath();
		// /GuestBoard/insertBoard.do
		// /GuestBoard/selectBoard.do 에서 /~.do 선택하는 방법
		String path = uri.substring(contextPath.length());
		if (path.equals("/insertBoard.do")) {
			// 글쓰기 서비스 제공
			System.out.println(path);
			// 컨트롤러
			
		} else if (path.equals("/selectBoard.do")) {
			// 글보기 서비스 제공
			System.out.println(path);
		} else {
			System.out.println("처리불가");
		}

	}
}
