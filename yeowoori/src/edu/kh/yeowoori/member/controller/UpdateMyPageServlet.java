package edu.kh.yeowoori.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.kh.yeowoori.member.model.service.MemberService;
import edu.kh.yeowoori.member.model.vo.Member;


@WebServlet("/member/updateMyPage")
public class UpdateMyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/updateMyPage.jsp");
		view.forward(request, response);
		request.setCharacterEncoding("UTF-8");

				
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Member loginMember = (Member)session.getAttribute("loginMember");
		int memberNo = loginMember.getMemberNo(); // 회원 번호 
		String memberNickname = request.getParameter("nickname");
		String memberProfile = request.getParameter("img0");
		String memberContent = request.getParameter("intro");
		
	
		
		Member member = new Member(memberNo, memberNickname, memberProfile, memberContent);
		try {
			int result = new MemberService().memberUpdate(member) ;
			
			
			String icon = null;
			String title = null;
			String text = null;
			
			
			if(result > 0) { // 회원 가입 성공
				icon = "success";
				title = "회원 정보 수정 성공";
				text = "회원 정보가 수정되었습니다.";
			
				loginMember.setMemberNickname(memberNickname);
				loginMember.setMemberProfile(memberProfile);
				loginMember.setMemberContent(memberContent);
				
				
			}else { 
				icon = "error";
				title = "회원 정보 수정 실패";
				text = "회원 정보 수정 중 문제가 발생했습니다.\n문제가 지속될 경우 고객센터 문의 바랍니다.";
			}
			
			session.setAttribute("icon", icon);
			session.setAttribute("title", title);
			session.setAttribute("text", text);
			
			
			
			
			response.sendRedirect("myPage");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			request.setAttribute("errorMsg", "회원 정보 수정 과정에서 오류 발생");
			
			RequestDispatcher view 
				= request.getRequestDispatcher("WEB-INF/views/common/error.jsp");
			
			view.forward(request, response);
		}
	}

}
