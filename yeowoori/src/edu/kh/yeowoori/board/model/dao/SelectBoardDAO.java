package edu.kh.yeowoori.board.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import static edu.kh.yeowoori.common.JDBCTemplate.*;
import edu.kh.yeowoori.board.model.dao.SelectBoardDAO;
import edu.kh.yeowoori.board.model.vo.Attachment;
import edu.kh.yeowoori.board.model.vo.Board;
import edu.kh.yeowoori.board.model.vo.Pagination;

public class SelectBoardDAO {
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Properties prop = null;
	
	
	public SelectBoardDAO() {
//		member-query.xml 파일의 경로 얻어오기
		String filePath = SelectBoardDAO.class.getResource("/edu/kh/yeowoori/sql/board/selectBoard-query.xml").getPath();
		try {
			prop = new Properties();
//			filePath 변수에 저장된 경로로 부터 Xml 파일을 읽어와 prop에 저장
			prop.loadFromXML(new FileInputStream(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**전체 게시글 수 + 게시판 이름 조회 DAO
	 * @param conn
	 * @param cp
	 * @param boardType
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getListCount(Connection conn, int cp, int boardType) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String sql = prop.getProperty("getListCount");
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardType);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				map.put("listCount", rs.getInt(1));
				map.put("boardName", rs.getString(2));
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return map;
	}
	
	/**지역 게시글 조회오기 DAO
	 * @param conn
	 * @param cp
	 * @param boardType
	 * @param area
	 * @return
	 */
	public Map<String, Object> getListCount(Connection conn, int cp, int boardType, int area) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String sql = prop.getProperty("areaGetListCount");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardType);
			pstmt.setInt(2, area);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				map.put("listCount", rs.getInt(1));
				map.put("boardName", rs.getString(2));
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return map;
	}
	
	/**	카테고리에 따른 게시글수 조회
	 * @param cp
	 * @param conn
	 * @param boardType
	 * @param category
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getListCount(int cp, Connection conn, int boardType, int category) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		String sql = prop.getProperty("categoryGetListCount");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardType);
			pstmt.setInt(2, category);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				map.put("listCount", rs.getInt(1));
				map.put("boardName", rs.getString(2));
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return map;
	}
	
	
	/**지역 카테고리 둘 다있을경우
	 * @param cp
	 * @param conn
	 * @param boardType
	 * @param category
	 * @param area
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getListCount(int cp, Connection conn, int boardType, int category, int area) throws Exception {

		Map<String, Object> map = new HashMap<String, Object>();
		String sql = prop.getProperty("categoryAreaGetListCount");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardType);
			pstmt.setInt(2, category);
			pstmt.setInt(3, area);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				map.put("listCount", rs.getInt(1));
				map.put("boardName", rs.getString(2));
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return map;
	}
	
	
	/**내가작성한 게시글 수 카운트
	 * @param conn
	 * @param cp
	 * @param boardType
	 * @param memberNo
	 * @return
	 */
	public Map<String, Object> getMyListCount(Connection conn, int cp, int boardType, int memberNo) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		String sql = prop.getProperty("GetMyListCount");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardType);
			pstmt.setInt(2, memberNo);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				map.put("listCount", rs.getInt(1));
				map.put("boardName", rs.getString(2));
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return map;
	}



	/**게시글 목록 조회DAO
	 * @param conn
	 * @param pagination
	 * @return
	 * @throws Exception
	 */
	public List<Board> selectBoardList(Connection conn, Pagination pagination) throws Exception {
		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("selectBoardList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pagination.getBoardType());
			// 조회할 범위를 지정할 변수 선언
			
			int startRow = (pagination.getCurrentPage()-1)*pagination.getLimit()+1;
			int endRow = startRow + pagination.getLimit() -1;
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setMemberNickname(rs.getString("MEMBER_NICKNAME"));
				board.setCategoryName(rs.getString("CATEGORY_NM"));
				board.setAreaCategory(rs.getString("AREA_CATEGORY_NM"));
				board.setReadCount(rs.getInt("READ_COUNT"));
				board.setCreateDate(rs.getTimestamp("CREATE_DT"));
				board.setBoardContent(rs.getString("BOARD_CONTENT"));
				board.setMemberContent(rs.getString("MEMBER_CONTENT"));
				board.setMemberProfile(rs.getString("MEMBER_PROFILE"));
				board.setCommentCount(rs.getInt("COMMENT_COUNT"));
				board.setLikeCount(rs.getInt("LIKE_COUNT"));
				
				
				List<String> filePath = new ArrayList<String>();
				List<String> fileName = new ArrayList<String>();
				
				filePath.add(rs.getString("FILE_PATH"));
				fileName.add(rs.getString("FILE_NM"));
				board.setFilePath(filePath);
				board.setFileName(fileName);
				boardList.add(board);
				
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return boardList;
	}

	/**지역만있는 boardList DAO
	 * @param conn
	 * @param area
	 * @param pagination
	 * @return
	 */
	public List<Board> selectBoardList(Connection conn, int area, Pagination pagination) throws Exception {
		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("areaSelectBoardList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pagination.getBoardType());
			// 조회할 범위를 지정할 변수 선언
			
			int startRow = (pagination.getCurrentPage()-1)*pagination.getLimit()+1;
			int endRow = startRow + pagination.getLimit() -1;
			pstmt.setInt(2, area);
			pstmt.setInt(3, startRow);
			pstmt.setInt(4, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setMemberNickname(rs.getString("MEMBER_NICKNAME"));
				board.setCategoryName(rs.getString("CATEGORY_NM"));
				board.setAreaCategory(rs.getString("AREA_CATEGORY_NM"));
				board.setReadCount(rs.getInt("READ_COUNT"));
				board.setCreateDate(rs.getTimestamp("CREATE_DT"));
				board.setBoardContent(rs.getString("BOARD_CONTENT"));
				board.setMemberContent(rs.getString("MEMBER_CONTENT"));
				board.setMemberProfile(rs.getString("MEMBER_PROFILE"));
				
				List<String> filePath = new ArrayList<String>();
				List<String> fileName = new ArrayList<String>();
				
				filePath.add(rs.getString("FILE_PATH"));
				fileName.add(rs.getString("FILE_NM"));
				board.setFilePath(filePath);
				board.setFileName(fileName);
				boardList.add(board);
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return boardList;
	}

	/**카테고리에 따른 게시글 조회
	 * @param category
	 * @param conn
	 * @param pagination
	 * @return
	 * @throws Exception
	 */
	public List<Board> selectBoardList(int category, Connection conn, Pagination pagination) throws Exception {
		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("categorySelectBoardList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pagination.getBoardType());
			// 조회할 범위를 지정할 변수 선언
			
			int startRow = (pagination.getCurrentPage()-1)*pagination.getLimit()+1;
			int endRow = startRow + pagination.getLimit() -1;
			pstmt.setInt(2, category);
			pstmt.setInt(3, startRow);
			pstmt.setInt(4, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setMemberNickname(rs.getString("MEMBER_NICKNAME"));
				board.setCategoryName(rs.getString("CATEGORY_NM"));
				board.setAreaCategory(rs.getString("AREA_CATEGORY_NM"));
				board.setReadCount(rs.getInt("READ_COUNT"));
				board.setCreateDate(rs.getTimestamp("CREATE_DT"));
				board.setBoardContent(rs.getString("BOARD_CONTENT"));
				board.setMemberContent(rs.getString("MEMBER_CONTENT"));
				board.setMemberProfile(rs.getString("MEMBER_PROFILE"));
				
				List<String> filePath = new ArrayList<String>();
				List<String> fileName = new ArrayList<String>();
				
				filePath.add(rs.getString("FILE_PATH"));
				fileName.add(rs.getString("FILE_NM"));
				board.setFilePath(filePath);
				board.setFileName(fileName);
				boardList.add(board);
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return boardList;
	}

	/**카테고리 지역 둘다있는 보드리스트 조회
	 * @param category
	 * @param conn
	 * @param pagination
	 * @param area
	 * @return
	 * @throws Exception
	 */
	public List<Board> selectBoardList(int category, Connection conn, Pagination pagination, int area) throws Exception{
		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("areaCategorySelectBoardList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pagination.getBoardType());
			// 조회할 범위를 지정할 변수 선언
			
			int startRow = (pagination.getCurrentPage()-1)*pagination.getLimit()+1;
			int endRow = startRow + pagination.getLimit() -1;
			pstmt.setInt(2, category);
			pstmt.setInt(3, area);
			pstmt.setInt(4, startRow);
			pstmt.setInt(5, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setMemberNickname(rs.getString("MEMBER_NICKNAME"));
				board.setCategoryName(rs.getString("CATEGORY_NM"));
				board.setAreaCategory(rs.getString("AREA_CATEGORY_NM"));
				board.setReadCount(rs.getInt("READ_COUNT"));
				board.setCreateDate(rs.getTimestamp("CREATE_DT"));
				board.setBoardContent(rs.getString("BOARD_CONTENT"));
				board.setMemberContent(rs.getString("MEMBER_CONTENT"));
				board.setMemberProfile(rs.getString("MEMBER_PROFILE"));
				
				List<String> filePath = new ArrayList<String>();
				List<String> fileName = new ArrayList<String>();
				
				filePath.add(rs.getString("FILE_PATH"));
				fileName.add(rs.getString("FILE_NM"));
				board.setFilePath(filePath);
				board.setFileName(fileName);
				boardList.add(board);
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return boardList;
	}

	/** 내가 작성한 게시글 목록조회
	 * @param conn
	 * @param pagination
	 * @param memberNo
	 * @return
	 * @throws Exception
	 */
	public List<Board> selectBoardList(Connection conn, Pagination pagination, int memberNo) throws Exception {
		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("selectMyBoardList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pagination.getBoardType());
			// 조회할 범위를 지정할 변수 선언
			
			int startRow = (pagination.getCurrentPage()-1)*pagination.getLimit()+1;
			int endRow = startRow + pagination.getLimit() -1;
			pstmt.setInt(2, memberNo);
			pstmt.setInt(3, startRow);
			pstmt.setInt(4, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				
				board.setBoardNo(rs.getInt("BOARD_NO"));
				board.setBoardTitle(rs.getString("BOARD_TITLE"));
				board.setMemberNickname(rs.getString("MEMBER_NICKNAME"));
				board.setCategoryName(rs.getString("CATEGORY_NM"));
				board.setAreaCategory(rs.getString("AREA_CATEGORY_NM"));
				board.setReadCount(rs.getInt("READ_COUNT"));
				board.setCreateDate(rs.getTimestamp("CREATE_DT"));
				board.setBoardContent(rs.getString("BOARD_CONTENT"));
				board.setMemberContent(rs.getString("MEMBER_CONTENT"));
				board.setMemberProfile(rs.getString("MEMBER_PROFILE"));
				board.setCommentCount(rs.getInt("COMMENT_COUNT"));
				board.setLikeCount(rs.getInt("LIKE_COUNT"));
				
				
				List<String> filePath = new ArrayList<String>();
				List<String> fileName = new ArrayList<String>();
				
				filePath.add(rs.getString("FILE_PATH"));
				fileName.add(rs.getString("FILE_NM"));
				board.setFilePath(filePath);
				board.setFileName(fileName);
				boardList.add(board);
				
				
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return boardList;
	}

	/**
	 * 게시글 상세조회 DAO
	 * @param conn
	 * @param boardNo
	 * @return board
	 * @throws Exception
	 */
	public Board selectBoard(Connection conn, int boardNo) throws Exception {
		
		Board board = null;
		String sql = prop.getProperty("selectBoard");
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			
			board = new Board();
			board.setAtList(new ArrayList<Attachment>());
			
			boolean flag = true;
			
			while(rs.next()) {
				
				if (flag) {
					board.setBoardNo(rs.getInt("BOARD_NO"));
					board.setBoardTitle(rs.getString("BOARD_TITLE"));
					board.setMemberNickname(rs.getString("MEMBER_NICKNAME"));
					board.setCategoryName(rs.getString("CATEGORY_NM"));
					board.setAreaCategory(rs.getString("AREA_CATEGORY_NM"));
					board.setReadCount(rs.getInt("READ_COUNT"));
					board.setCreateDate(rs.getTimestamp("CREATE_DT"));
					board.setModifyDate(rs.getTimestamp("MODIFY_DT"));
					board.setBoardContent(rs.getString("BOARD_CONTENT"));
					board.setMemberProfile(rs.getString("MEMBER_PROFILE"));
					board.setCommentCount(rs.getInt("COMMENT_COUNT"));
					board.setLikeCount(rs.getInt("LIKE_COUNT"));
					board.setCategoryCode(rs.getInt("CATEGORY_CD"));
					board.setMemberNo(rs.getInt("MEMBER_NO"));
					
					flag =false;
				}
					Attachment at = new Attachment();
					at.setFileLevel(rs.getInt("FILE_LEVEL"));
					at.setFileNm(rs.getString("FILE_NM"));
					at.setFilePath(rs.getString("FILE_PATH"));
					
					board.getAtList().add(at);
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		return board;
	}

	/**notice 갯수  dao
	 * @param conn
	 * @return
	 * @throws Exception
	 */
	public int getNoticePagination(Connection conn) throws Exception {
		int listCount = 0;
		String sql = prop.getProperty("getNoticePagination");
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				listCount = rs.getInt("COUNT(*)");
				
			}
		}finally {
			close(rs);
			close(stmt);
		}
		return listCount;
	}

	/**공지사항 리스트 DAO
	 * @param pagination
	 * @param conn
	 * @param cp
	 * @return
	 * @throws Exception
	 */
	public List<Board> selectNoticeBoardList(Pagination pagination, Connection conn, int cp) throws Exception {
		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("selectNoticeBoardList");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pagination.getBoardType());
			// 조회할 범위를 지정할 변수 선언
			
			int startRow = (pagination.getCurrentPage()-1)*pagination.getLimit()+1;
			int endRow = startRow + pagination.getLimit() -1;
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setBoardTitle(rs.getString("NOTICE_TITLE"));
				board.setBoardContent(rs.getString("NOTICE_CONTENT"));
				board.setCreateDate(rs.getTimestamp("CREATE_DT"));
				boardList.add(board);
				
			}	
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return boardList;
	}

	/**
	 * 게시글 조회수 증가 DAO
	 * @param conn
	 * @param boardNo
	 * @return result
	 * @throws Exception
	 */
	public int increaseReadCount(Connection conn, int boardNo) throws Exception{
		int result = 0;
		String sql = prop.getProperty("increaseReadCount");
		
		try {
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}

	


	
	

}
