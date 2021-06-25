package edu.kh.yeowoori.member.model.service;
import static edu.kh.yeowoori.common.JDBCTemplate.*;

import java.sql.Connection;

import edu.kh.yeowoori.member.model.dao.MemberDAO;
import edu.kh.yeowoori.member.model.vo.Member;
public class MemberService {
	private MemberDAO dao = new MemberDAO();

	/** 로그인 Service
	 * @param inputId
	 * @param inputPw
	 * @return
	 * @throws Exception
	 */
	public Member login(String inputId, String inputPw) throws Exception {
		Connection conn = getConnection();
		Member loginMember = dao.login(conn, inputId, inputPw);
		close(conn);
		
		return loginMember;
	}

}
