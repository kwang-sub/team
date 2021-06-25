package edu.kh.yeowoori.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.kh.yeowoori.member.model.service.MemberService;
import edu.kh.yeowoori.member.model.vo.Member;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String inputId = request.getParameter("inputId");
		String inputPw = request.getParameter("inputPw");
		HttpSession session = request.getSession();
		String path = null;
		try {
			Member loginMember = new MemberService().login(inputId, inputPw);
			
			if(loginMember != null) {
				
				session.setAttribute("loginMember", loginMember);
				session.setMaxInactiveInterval(1800);
				System.out.println(loginMember);
				path = request.getContextPath();
				
			}else {
				path = "login";
			}
			response.sendRedirect(path);
			
			
		} catch (Exception e) {

		}
	}

}
