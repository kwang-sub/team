package edu.kh.yeowoori.member.model.service;

import static edu.kh.yeowoori.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.yeowoori.member.model.dao.myPageDAO;
import edu.kh.yeowoori.member.model.vo.Member;
public class myPageService {
	myPageDAO dao = new myPageDAO();
	/**내가 작성한 여행글 가져오기
	 * @param loginMember
	 * @return
	 * @throws Exception
	 */
	public List<Member> getMyTrip(Member loginMember) throws Exception{
		Connection conn = getConnection();
		List<Member> myTrip = dao.getMyTrip(conn, loginMember);
		close(conn);
		return myTrip;
	}

}
