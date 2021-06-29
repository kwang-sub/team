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

	/**게시글 목록 조회DAO
	 * @param conn
	 * @param pagination
	 * @return
	 * @throws Exception
	 */
	public List<Board> selectBoardList(Connection conn, Pagination pagination) throws Exception {
		List<Board> boardList = new ArrayList<Board>();
		String sql = prop.getProperty("selectBordList");
		
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
				board.setBoardtitle(rs.getString("BOARD_TITLE"));
				board.setMemberName(rs.getString("MEMBER_NM"));
				board.setCategoryName(rs.getString("CATEGORY_NM"));
				board.setAreaCategory(rs.getString("AREA_CATEGORY_NM"));
				board.setReadCount(rs.getInt("READ_COUNT"));
				board.setCreateDate(rs.getTimestamp("CREATE_DT"));
				
				List<String> filePath = new ArrayList<String>();
				List<String> fileName = new ArrayList<String>();
				
				filePath.add(rs.getString("FILE_PATH"));
				fileName.add(rs.getString("FILE_NM"));
				boardList.add(board);
			}
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return boardList;
	}

}
