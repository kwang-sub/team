package edu.kh.yeowoori.member.model.vo;

import java.sql.Date;

public class Member {
	private int memberNo;         
    private String memberId;     
    private String memberPw;     
    private String memberEmail;
    private String memberContent;
    private String memberNickname;
    private Date enrollDate;   
    private String memberStatus;   
    private String memberGrade;
    private String memberProfile;
	    
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(int memberNo, String memberId, String memberEmail, String memberContent,
			String memberNickname, Date enrollDate, String memberStatus, String memberGrade, String memberProfile) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberEmail = memberEmail;
		this.memberContent = memberContent;
		this.memberNickname = memberNickname;
		this.enrollDate = enrollDate;
		this.memberStatus = memberStatus;
		this.memberGrade = memberGrade;
		this.memberProfile = memberProfile;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberContent() {
		return memberContent;
	}

	public void setMemberContent(String memberContent) {
		this.memberContent = memberContent;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	public String getMemberProfile() {
		return memberProfile;
	}

	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPw=" + memberPw + ", memberEmail="
				+ memberEmail + ", memberContent=" + memberContent + ", memberNickname=" + memberNickname
				+ ", enrollDate=" + enrollDate + ", memberStatus=" + memberStatus + ", memberGrade=" + memberGrade
				+ ", memberProfile=" + memberProfile + "]";
	}

	
	
	
	
	
	
}
