package edu.kh.yeowoori.board.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import edu.kh.yeowoori.board.model.service.BoardService;
import edu.kh.yeowoori.board.model.service.SelectBoardService;
import edu.kh.yeowoori.board.model.vo.Board;
import edu.kh.yeowoori.board.model.vo.Category;


@WebServlet("/board2/*")
public class Board2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uri = request.getRequestURI(); //요청 주소 				 
		String contextPath = request.getContextPath();  //최상위 주소	 
		
		String command = uri.substring( (contextPath + "/board2/" ).length() ); 
		//uri 에서 contextPath + "/board2/" 만큼을 앞에서부터 잘라낸 나머지를 command에 저장
		
		String path = null; //응답화면 주소 또는 경로
		RequestDispatcher view = null; //요청 위임 객체 저장 참조 변수
		
		String icon =null;
		String title = null;
		String text = null;
		
		SelectBoardService service = new SelectBoardService();
		
		try {
	
			int cp = request.getParameter("cp") == null ? 1 : Integer.parseInt(request.getParameter("cp"));
			int type = request.getParameter("type") == null ? 1 : Integer.parseInt(request.getParameter("type"));
			if(request.getParameter("area")!=null) {
				int area = Integer.parseInt(request.getParameter("area"));
			}
		
			// 게시글 수정 화면 전환 Controller
			if(command.equals("updateForm")) {
				
				List<Category> category = service.selectCategoryList();
				int boardNo = Integer.parseInt(request.getParameter("boardNo")); //상세 조회할 게시글 번호
				Board board =service.selectBoard(boardNo);
				
				// 게시글 내용에 있는 <br> -> /r/n으로 변경 (원래는 service에 작성하는게 좋음!)
				board.setBoardContent(board.getBoardContent().replaceAll("<br>", "\r\n"));
				
				request.setAttribute("category", category);
				request.setAttribute("board", board);
				
				path = "/WEB-INF/views/board/boardUpdate.jsp";
				view = request.getRequestDispatcher(path);
				view.forward(request, response);
				
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
