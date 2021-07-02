package edu.kh.yeowoori.board.model.dao;
import static edu.kh.yeowoori.common.JDBCTemplate.*;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import edu.kh.yeowoori.board.model.vo.Board;

public class HomeBoardDAO {

	//자주 사용하는 JDBC 객체 참조 변수 선언
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//외부 xml 파일에 작성된 SQL 구문 읽어와 저장할 Properties 객체 참조 변수 선언
	private Properties prop = null;
	
	//기본 생성자를 이용한 DAO 객체 생성시 외부 xml 파일을 읽어와 prop에 저장
	public HomeBoardDAO() {
		
		//member-query.xml 파일의 경로 얻어오기
		String filePath = SelectBoardDAO.class.getResource("/edu/kh/yeowoori/sql/board/selectHomeBoard-query.xml").getPath();
		
		try {
			prop = new Properties();
			
			//filePath 변수에 저장된 경로로부터 xml파일을 읽어와 prop에 저장
			prop.loadFromXML(new FileInputStream(filePath));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	
	/**
	 *  홈보드 게시글 목록 조회 DAO
	 * @param area
	 * @param conn
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> selectHomeBoard(int area, Connection conn) throws Exception {

		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("selectHomeBoard");
		try {
			
		}finally {
			
		}
		
		
		
		return null;
	}

}
