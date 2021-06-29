package edu.kh.yeowoori.member.model.service;
import static edu.kh.yeowoori.common.JDBCTemplate.close;
import static edu.kh.yeowoori.common.JDBCTemplate.commit;
import static edu.kh.yeowoori.common.JDBCTemplate.getConnection;
import static edu.kh.yeowoori.common.JDBCTemplate.rollback;
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

	/** 비밀번호 변경 결과 Service
	 * @param currentPwd
	 * @param newPwd1
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int changePwd(String currentPwd, String newPwd1, int memberNo) throws Exception{
		
		Connection conn = getConnection();
		
		int result = dao.changePwd(conn, currentPwd, newPwd1, memberNo);
		
		if(result > 0)  commit(conn);
		else 			rollback(conn);
		
		close(conn);
		
		return result;
		
	}

}
