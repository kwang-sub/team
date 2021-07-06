<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<c:set var="contextPath" scope="application"
	value="${pageContext.servletContext.contextPath }"/>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${board.boardTitle }</title>
</head>
<body>
<div id="top"></div>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<style>
     
        .user-profile{
            width: 20px; height: 20px;
            border: 1px solid gainsboro;
            border-radius: 100px;
            background-repeat: no-repeat;
            background-size: cover;
            display: inline-block;
            vertical-align:middle;
       }
        .user-profile-big{
            width: 40px; height: 40px;
            border: 1px solid gainsboro;
            border-radius: 100px;
            background-repeat: no-repeat;
            background-size: cover;
            display: inline-block;
            vertical-align:middle;
            margin-right: 20px;
       }
       .user-name{
           width:fit-content;
           display: inline-block;
           font-size: 12px;
           margin-left: 5px;
           font-weight: 500;
       }
       .time{
           width:fit-content;
           display: inline-block;
           font-size: 12px;
           margin-left: 30px;
           font-weight: 300;
       }
      
       .comments{
        width:fit-content;
           display: inline-block;
           font-size: 12px;
           margin-right: 10px;
           font-weight: 400;
           color: grey;
       }
       .report{
            color: grey;
           font-size: 12px;
           margin-left: 10px;
           font-weight: 300;
           display: inline-block;
       }
       .text-container{
           display: inline-block;
           width: 80%; height: 35px;
           border : 1px solid rgb(192, 192, 192);
           border-radius: 5px;

       }
       .input-comment{
           width: 85%; height: 32px;
           border: 0px;
           border-radius: 5px;
       }
       .btn-submit{
           background-color: white;
           border: 0px;
           padding: 0px;
           height: 5px;
           color: grey;
           font-weight: 500;
           float: right;
           margin-right: 10px;
           line-height: 2.3;
       }
       
		
</style>
    
    <div class="container">
        
       
        <div style="padding: 20px;"></div>
        <h6>댓글 ${board.commentCount }</h6>
        <div style="padding: 5px;"></div>
        
        <c:if test="${!empty loginMember }">
        <div class="user-profile-big" style="background-image: url(${loginMember.memberProfile});"></div>
        <div class="text-container">
            <input type="text" class="input-comment" id="commentContent" name="commentContent" placeholder="댓글을 입력해주세요.">
            <button type="button" class="btn-submit" id="addComment" onclick="addComment();">등록</button>
        </div>
        </c:if>
        
        <div style="padding: 10px;"></div>
        <div class="user-profile-big" style="background-image: url('${board.memberProfile}'); margin-bottom: 30px;"></div>
        <div style="display: inline-block;">
            <div class="user-name" style="font-size: 14px; margin-left: 0px;">${board.memberNickname }</div>
            <div style="display: inline-block; margin-left: 10px; font-size: 14px;">${comment.commentContent }</div>
            <div>
                <div class="time" style="margin-left: 0px; margin-right: 20px;">${comment.commentDate}</div>
                <a href="#">
                    <img src="https://drive.google.com/uc?id=1e719tW6BVTrSPiZQIxJZ8LUWWuNsx0Lc" height="15px">
                    <div class="comments">좋아요</div>
                </a>
                <a href="#" class="report">신고</a>
            </div>
        </div>
        
        <hr>
    
    <form action="#" method="POST" name="requestForm">
    	<input type="hidden" name="boardNo" value="${board.boardNo}">
    	<input type="hidden" name="cp" value="${param.cp }">
    	<input type="hidden" name="type" value="${param.type }">
    	<input type="hidden" name="area" value="${param.area }">
    </form>
    
    <script>
    	const loginMemberNo = "${loginMember.memberNo}";
    	const boardNo = ${board.boardNo};
    	let beforCommentRow;
    	
    	//댓글 등록
    	function addComment(){
    		const commentContent = $("#commentContent").val();
    		if(commentContent.trim() =="") {
    			swal("댓글 내용이 없습니다.");
    		}else{
    			$.ajax({
    				url : "${contextPath}/comment/insertComment",
    				type : "POST",
    				data : {"memberNo" : loginMemberNo,
    						"boardNo" : boardNo,
    						"commentContent" : commentContent },
    				success : function(result){
    					if(result>0){
    						swal({
        						"icon" : "success",
        						"title" : "댓글 등록 성공"
        					})
        					$("#commentContent").val("");
    					}
    				},
    				error : function(){
    					console.log("댓글 삽입 실패");
    				}
    			})
    		}
    	}
    	
    </script>
    
</body>
</html>