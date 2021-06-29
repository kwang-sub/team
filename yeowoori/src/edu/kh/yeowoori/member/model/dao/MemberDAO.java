package edu.kh.yeowoori.member.model.dao;


import static edu.kh.yeowoori.common.JDBCTemplate.close;
import static edu.kh.yeowoori.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import edu.kh.yeowoori.member.model.vo.Member;


public class MemberDAO {

	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private Properties prop = null;
	public MemberDAO() {
		String filePath = MemberDAO.class.getResource("/edu/kh/yeowoori/sql/member/member-query.xml").getPath();
		try {
			prop = new Properties();
			prop.loadFromXML(new FileInputStream(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/** 로그인 DAO
	 * @param conn
	 * @param inputId
	 * @param inputPw
	 * @return loginMember
	 */
	public Member login(Connection conn, String inputId, String inputPw) throws Exception {
		Member loginMember = null;
		try {
			String sql = prop.getProperty("login");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inputId);
			pstmt.setString(2, inputPw);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				int memberNo = rs.getInt("MEMBER_NO");        
			    String memberId = rs.getString("MEMBER_ID");      
			    String memberName = rs.getString("MEMBER_NM");    
			    String memberEmail = rs.getString("MEMBER_EMAIL"); 
			    String memberContent = rs.getNString("MEMBER_CONTENT");
			    String memberNickname = rs.getString("MEMBER_NICKNAME");
			    Date enrollDate = rs.getDate("ENROLL_DATE");  
			    String memberStatus = rs.getString("MEMBER_STATUS");   
			    String memberGrade = rs.getString("MEMBER_GRADE"); 
			    
			    loginMember = new Member(memberNo, memberId, memberName, memberEmail, memberContent, memberNickname, enrollDate, memberStatus, memberGrade);
			}
			
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return loginMember;
	}
	
	
	/** 비밀번호 변경 결과 DAO
	 * @param conn
	 * @param currentPwd
	 * @param newPwd1
	 * @param memberNo
	 * @return result
	 * @throws Exception
	 */
	public int changePwd(Connection conn, String currentPwd, String newPwd1, int memberNo) throws Exception {
int result = 0;
		
		String sql = prop.getProperty("changePwd");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, newPwd1 );
			pstmt.setInt(2, memberNo);
			pstmt.setString(3, currentPwd);
			
			result = pstmt.executeUpdate();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
}
