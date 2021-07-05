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
			int cp = request.getParameter("cp") == null ? 1 : Integer.parseInt(request.getParameter("cp"));
//			게시글 목록조회 controller
			if(command.equals("list")) {
				int area = request.getParameter("area") == null ? 0 : Integer.parseInt(request.getParameter("area"));
				int category = request.getParameter("category") == null ? 0 : Integer.parseInt(request.getParameter("category"));
				
				System.out.println(category);
				int boardType = Integer.parseInt(request.getParameter("type"));
				
				Pagination pagination = service.getPagination(cp,boardType,area,category);
				pagination.setLimit(6);
				List<Board> boardList= null;
				boardList = service.selectBoardList(pagination,area,category);
				request.setAttribute("pagination", pagination);
				request.setAttribute("boardList", boardList);
				path = "/WEB-INF/views/board/boardList.jsp";
				request.getRequestDispatcher(path).forward(request, response);
				
			}
			
// 			질문 게시판
			else if(command.equals("list2")) {
				int area = request.getParameter("area") == null ? 0 : Integer.parseInt(request.getParameter("area"));
				int category = request.getParameter("category") == null ? 0 : Integer.parseInt(request.getParameter("category"));
				
				int boardType = Integer.parseInt(request.getParameter("type"));
				
				Pagination pagination = service.getPagination(cp,boardType,area,category);
				pagination.setLimit(5);
				List<Board> boardList= null;
				boardList = service.selectBoardList(pagination,area,category);
				request.setAttribute("pagination", pagination);
				request.setAttribute("boardList", boardList);
				path = "/WEB-INF/views/board/boardList2.jsp";
				request.getRequestDispatcher(path).forward(request, response);
			}
			else if(command.equals("list/my")) {
				int memberNo = Integer.parseInt(request.getParameter("memberNo"));
				int boardType = Integer.parseInt(request.getParameter("type"));
				Pagination pagination = service.getMyPagination(cp,boardType,memberNo);
				pagination.setLimit(6);
				List<Board> boardList= service.selectBoardList(pagination,memberNo);
				request.setAttribute("pagination", pagination);
				request.setAttribute("boardList", boardList);
				path = "/WEB-INF/views/board/boardList.jsp";
				request.getRequestDispatcher(path).forward(request, response);
				
			}else if(command.equals("list4")) {
				Pagination pagination = service.getNoticePagination(cp);
				pagination.setLimit(7);
				List<Board> boardList= null;
				boardList = service.selectNoticeBoardList(cp,pagination);
				request.setAttribute("pagination", pagination);
				request.setAttribute("boardList", boardList);
				//for(Board board : boardList) {
				//		System.out.println(board);
				//}
				path = "/WEB-INF/views/board/boardList4.jsp";
				request.getRequestDispatcher(path).forward(request, response);
				
			}else if (command.equals("view")){
				int boardNo = Integer.parseInt(request.getParameter("no"));

				Board board = service.selectBoard(boardNo);
				
				request.setAttribute("board", board);
				path = "/WEB-INF/views/board/boardView.jsp";
				request.getRequestDispatcher(path).forward(request, response);
			}else if(command.equals("list/like")) {
				String like = request.getParameter("like");
				int memberNo = Integer.parseInt(request.getParameter("memberNo"));
				int boardType = Integer.parseInt(request.getParameter("type"));
				Pagination pagination = service.getLikePagination(cp,boardType,memberNo);
				pagination.setLimit(6);
				List<Board> boardList= service.selectBoardList(pagination,memberNo,like);
				request.setAttribute("like", like);
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
