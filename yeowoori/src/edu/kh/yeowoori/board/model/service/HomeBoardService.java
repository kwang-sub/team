package edu.kh.yeowoori.board.model.service;

import static edu.kh.yeowoori.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.yeowoori.board.model.dao.HomeBoardDAO;
import edu.kh.yeowoori.board.model.vo.Board;

public class HomeBoardService {

	HomeBoardDAO dao = new HomeBoardDAO();

	/**
	 * 홈보드 게시글 목록 조회 Service
	 * @param area
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> selectHomeBoard(int area) throws Exception {
		
		Connection conn = getConnection();
		List<Board> boardList = dao.selectHomeBoard(area,conn);
		close(conn);
		
		return boardList;
	}
	
	
}
