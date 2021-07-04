package edu.kh.yeowoori.board.model.service;

import static edu.kh.yeowoori.common.JDBCTemplate.*;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

import edu.kh.yeowoori.board.model.dao.SelectBoardDAO;
import edu.kh.yeowoori.board.model.vo.Board;
import edu.kh.yeowoori.board.model.vo.Pagination;

public class SelectBoardService {

	private SelectBoardDAO dao = new SelectBoardDAO();
	
	
	
	/** 페이징 처리 객체 생성용 service
	 * @param cp
	 * @param boardType
	 * @param category 
	 * @param area 
	 * @return pagination
	 */
	public Pagination getPagination(int cp, int boardType, int area, int category) throws Exception {
		
		
		Connection conn = getConnection();
		Map<String, Object> map = null;
		
//		DB에서 전체 게시글 수 +게시판 이름을 얻어옴
		if(area!=0 && category==0) {
			map = dao.getListCount(conn, cp, boardType, area);
		}else if(area==0 && category !=0 ) {
			map = dao.getListCount(cp, conn, boardType, category);
		}else if(area!=0 && category != 0) {
			map = dao.getListCount(cp, conn, boardType, category, area);
		}else {
			map = dao.getListCount(conn, cp, boardType);
		}
		
		close(conn);
		
		int listCount = (map.get("listCount")==null) ? 0 : (int)map.get("listCount");
		String boardName = (String)map.get("boardName");
		
		
		return new Pagination(cp, listCount, boardType, boardName);
	}
	
	/** 내가 작성한글 페이지네이션처리
	 * @param cp
	 * @param memberNo
	 * @param memberNo2 
	 * @return
	 * @throws Exception
	 */
	public Pagination getMyPagination(int cp, int boardType, int memberNo) throws Exception {
		Connection conn = getConnection();
		Map<String, Object> map = dao.getMyListCount(conn, cp, boardType,memberNo);
		close(conn);
		int listCount = (map.get("listCount")==null) ? 0 : (int)map.get("listCount");
		String boardName = (String)map.get("boardName");
		
		return new Pagination(cp, listCount, boardType, boardName);
	}




	/**게시글 목록 조회
	 * @param pagination
	 * @param category 
	 * @param area 
	 * @return boardList
	 * @throws Exception
	 */
	public List<Board> selectBoardList(Pagination pagination, int area, int category) throws Exception {
		Connection conn = getConnection();
		
		List<Board> boardList = null;
		if(area != 0 && category == 0) {
			boardList = dao.selectBoardList(conn, area, pagination);
		}else if (area == 0 && category != 0) {
			boardList = dao.selectBoardList(category, conn, pagination);
		}else if (area != 0 && category != 0) {
			boardList = dao.selectBoardList(category, conn, pagination, area);
			
		}else {
			boardList = dao.selectBoardList(conn, pagination);
		}
		
		close(conn);
		return boardList;
	}

	/**	내가 작성한 게시글 목록 조회
	 * @param pagination
	 * @param memberNo
	 * @return
	 * @throws Exception
	 */
	public List<Board> selectBoardList(Pagination pagination, int memberNo) throws Exception {
		Connection conn = getConnection();
		List<Board> boardList = null;
		boardList = dao.selectBoardList(conn, pagination, memberNo);
		close(conn);
		return boardList;
	}

	/**
	 * 게시글 상세조회 Service
	 * @param boardNo
	 * @return board
	 * @throws Exception
	 */
	public Board selectBoard(int boardNo) throws Exception{
		Connection conn = getConnection();
		Board board = dao.selectBoard(conn, boardNo);
		close(conn);
		
		return board;
	}




}
