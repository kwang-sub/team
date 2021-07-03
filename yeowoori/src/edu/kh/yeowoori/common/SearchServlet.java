package edu.kh.yeowoori.common;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.kh.yeowoori.board.model.service.SearchService;
import edu.kh.yeowoori.board.model.vo.Board;

@WebServlet("/homeBoard/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String search = request.getParameter("search");
		
		int area = request.getParameter("area") == null ? 0: Integer.parseInt(request.getParameter("area")) ;
		
		RequestDispatcher view = null;
		
		int type = 0;
		int maxBoardNum = 0;
		
		SearchService service = new SearchService();
		
		try {
			List<Board> tripBoardList = null;
			List<Board> qBoardList = null;
			List<Board> withBoardList = null;
			
			if(area ==0) {
				maxBoardNum = 6;
				type = 1;
				tripBoardList = service.searchBoard(type, maxBoardNum, search);
				
				maxBoardNum = 5;
				type= 2;
				qBoardList = service.searchBoard(type, maxBoardNum, search);
				
				maxBoardNum = 5;
				type= 3;
				withBoardList = service.searchBoard(type, maxBoardNum, search);
				
			}else {
				maxBoardNum = 6;
				type =1;
				tripBoardList= service.searchAreaBoard(area, type, maxBoardNum, search);
				
				maxBoardNum = 5;
				type =2;
				qBoardList = service.searchAreaBoard(area, type, maxBoardNum, search);
				
				maxBoardNum = 5;
				type =3;
				withBoardList = service.searchAreaBoard(area, type, maxBoardNum, search);
			}
			
			HttpSession session = request.getSession();
			session.setAttribute("tripBoardList", tripBoardList);
			session.setAttribute("qBoardList", qBoardList);
			session.setAttribute("withBoardList", withBoardList);
			
			view = request.getRequestDispatcher("/WEB-INF/views/board/search.jsp");
			view.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
