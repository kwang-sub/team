package edu.kh.yeowoori.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.yeowoori.board.model.service.SelectBoardService;
import edu.kh.yeowoori.board.model.vo.Board;
import edu.kh.yeowoori.board.model.vo.Pagination;

@WebServlet("/board/*")
public class SelectBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();//요청주소
		String contextPath = request.getContextPath();//최상위 주소
		String command = uri.substring((contextPath+"/board/").length());
		
		String path = null;//응답화면 경로
		RequestDispatcher view = null; // 요청 위임 객체 저장 참조변수
		
		
//		스윗얼럿 사용할건지 상의해야됨
//		String icon = null;
//		String title = null;
//		String text = null;
		
		try {
			SelectBoardService service = new SelectBoardService();
			int cp = request.getParameter("cp")==null ? 1 : Integer.parseInt(request.getParameter("cp"));
			
//			게시글 목록조회 controller
			if(command.equals("list")) {
				
				
				int boardType = Integer.parseInt(request.getParameter("type"));
				
//				페이징 처리
				Pagination pagination = service.getPagination(cp,boardType);
//				System.out.println(pagination);
				List<Board> boardList = service.selectBoardList(pagination);
				request.setAttribute("pagination", pagination);
				request.setAttribute("boardList", boardList);
				path = "/WEB-INF/views/board/boardList.jsp";
				request.getRequestDispatcher(path).forward(request, response);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
