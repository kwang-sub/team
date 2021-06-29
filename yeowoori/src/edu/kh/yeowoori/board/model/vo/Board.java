package edu.kh.yeowoori.board.model.vo;

import java.sql.Timestamp;
import java.util.List;

public class Board {
	private int boardNo;
	private String boardtitle;
	private String memberName;
	private String categoryName;
	private String areaCategory;
	private int readCount;
	private Timestamp createDate;
	
	private List<String> filePath;
	private List<String> fileName;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardtitle() {
		return boardtitle;
	}

	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getAreaCategory() {
		return areaCategory;
	}

	public void setAreaCategory(String areaCategory) {
		this.areaCategory = areaCategory;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public List<String> getFilePath() {
		return filePath;
	}

	public void setFilePath(List<String> filePath) {
		this.filePath = filePath;
	}

	public List<String> getFileName() {
		return fileName;
	}

	public void setFileName(List<String> fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardtitle=" + boardtitle + ", memberName=" + memberName
				+ ", categoryName=" + categoryName + ", areaCategory=" + areaCategory + ", readCount=" + readCount
				+ ", createDate=" + createDate + ", filePath=" + filePath + ", fileName=" + fileName + "]";
	}
	
	
}
