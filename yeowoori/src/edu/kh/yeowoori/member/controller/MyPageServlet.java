package edu.kh.yeowoori.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.kh.yeowoori.member.model.service.myPageService;
import edu.kh.yeowoori.member.model.vo.Member;


@WebServlet("/member/myPage")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		myPageService service = new myPageService();
		HttpSession session = request.getSession();
		
				
		Member loginMember = (Member)session.getAttribute("loginMember"); 
		
		try {
			List<Member> myTrip =  service.getMyTrip(loginMember);
			request.setAttribute("myTrip", myTrip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = "/WEB-INF/views/member/myPage.jsp";
		RequestDispatcher view = request.getRequestDispatcher(path);
		view.forward(request, response);
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
