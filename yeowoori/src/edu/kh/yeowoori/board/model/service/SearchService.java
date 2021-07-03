package edu.kh.yeowoori.board.model.service;

import static edu.kh.yeowoori.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.yeowoori.board.model.dao.HomeBoardDAO;
import edu.kh.yeowoori.board.model.dao.SearchDAO;
import edu.kh.yeowoori.board.model.vo.Board;
import edu.kh.yeowoori.board.model.vo.Notice;

public class SearchService {

	SearchDAO dao = new SearchDAO();

	/**
	 * 전체 검색 Service
	 * @param type
	 * @param maxBoardNum
	 * @param search 
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> searchBoard(int type, int maxBoardNum, String search) throws Exception {
		
		Connection conn = getConnection();
		List<Board> boardList = dao.searchBoard(conn, type, maxBoardNum, search);
		close(conn);
		
		return boardList;
	}

	/**
	 * 지역 검색 Service
	 * @param area
	 * @param type
	 * @param maxBoardNum
	 * @param search
	 * @return
	 * @throws Exception
	 */
	public List<Board> searchAreaBoard(int area, int type, int maxBoardNum, String search) throws Exception {

		Connection conn = getConnection();
		List<Board> boardList = dao.searchAreaBoard(conn, area, type, maxBoardNum, search);
		close(conn);
		
		
		return null;
	}
	
}
