package edu.kh.yeowoori.member.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import edu.kh.yeowoori.member.model.vo.Member;

import static edu.kh.yeowoori.common.JDBCTemplate.*;

public class myPageDAO {

	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private Properties prop = null;
	public myPageDAO() {
		String filePath = MemberDAO.class.getResource("/edu/kh/yeowoori/sql/member/myPage-query.xml").getPath();
		try {
			prop = new Properties();
			prop.loadFromXML(new FileInputStream(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**내가작성한게시글 사진 vo
	 * @param conn
	 * @param loginMember
	 * @return
	 * @throws Exception
	 */
	public List<Member> getMyTrip(Connection conn, Member loginMember) throws Exception {
		List<Member> myTrip = new ArrayList<Member>();
		String sql = prop.getProperty("getMyTrip");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,loginMember.getMemberNo());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member mem = new Member();
				mem.setFilePath(rs.getString("FILE_PATH"));
				mem.setFileNm(rs.getString("FILE_NM"));
				myTrip.add(mem);
			}
			
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return myTrip;
	}
}
