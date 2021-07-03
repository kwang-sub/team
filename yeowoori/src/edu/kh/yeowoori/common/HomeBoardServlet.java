package edu.kh.yeowoori.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.yeowoori.board.model.service.HomeBoardService;
import edu.kh.yeowoori.board.model.vo.Attachment;
import edu.kh.yeowoori.board.model.vo.Board;

@WebServlet("/homeBoard")
public class HomeBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI(); //요청 주소 				 
		String contextPath = request.getContextPath();  //최상위 주소	 
		
		String path = null; //응답화면 주소 또는 경로
		RequestDispatcher view = null; //요청 위임 객체 저장 참조 변수
		
		HomeBoardService service = new HomeBoardService();
		
		try {
			int area = Integer.parseInt(request.getParameter("area"));
			
			List<Board> boardList = service.selectHomeBoard(area);
			
			if(boardList !=null) {
				request.getSession().setAttribute("boardList", boardList);
				request.getSession().setAttribute("area", area);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		view = request.getRequestDispatcher("/WEB-INF/views/board/homeBoard.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
