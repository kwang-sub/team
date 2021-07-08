
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" scope="application"
	value="${pageContext.servletContext.contextPath }"/>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>같이떠나요 게시판</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<style>
     #q-search{
            height: 300px;
            background-color: #f8f8f8;
            text-align: center;
            padding-top: 40px;
            padding-bottom: 40px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
     }
     #q-search input{
            width: 80%; height:35px;
            max-width: 600px;
            background-image: url('https://drive.google.com/uc?id=1ekFsz_P2MZWoMUt0QyvZjPjAm2fx308R');
            background-repeat: no-repeat;
            background-size: 20px;
            background-position: 5px center;
            border : 1px solid rgb(182, 182, 182);
            border-radius: 5px;
            padding-left: 40px;
            font-size: 14px;
     }
     .category-selected{
            height: 30px;
            padding-top: 4px;
            background-color: #A66129;
            color:white;
            font-weight: 500;
            font-size: 14px;
            border-radius: 10px;
            margin-right: 5px ;
        }
       .category-unselected{
        height: 30px;
            padding-top: 4px;
            background-color: #EDEDED;
            color: #A66129;
            font-weight: 500;
            font-size: 14px;
            border-radius: 10px;
            margin-right: 5px ;
       }
       .category-btn>button{
           margin-left: 25px;
       }
       .width65{
           width: 65%;
           display: inline-block;
       }
       .user-profile{
            width: 20px; height: 20px;
            border: 1px solid gainsboro;
            border-radius: 100px;
            background-repeat: no-repeat;
            background-size: cover;
            display: inline-block;
            vertical-align:middle;
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
           margin-left: 5px;
           font-weight: 300;
       }
       .comments{
        width:fit-content;
           display: inline-block;
           font-size: 12px;
           margin-left: 5px;
           font-weight: 400;
           color: grey;
       }
       .count-comments{
           width:fit-content;
           display: inline-block;
           font-size: 12px;
           margin-left: 5px;
           font-weight: 500;
           color: #A66129;
           margin-right: 10px;
       }
       .report{
        width:fit-content;
           display: inline-block;
           font-size: 12px;
           margin-left: 5px;
           font-weight: 300;
       }
       .q-img{
           width:100px; height: 100px;
           border: 1px solid gainsboro;
           float: right;
           border-radius: 5px;
           background-repeat: no-repeat;
           background-size: cover;
       }
       .padding{
           padding: 10px;
       }
       .page-numbers{
            color: black;
            border: 0px;
       }
       .page-now{
           color: #A66129;
       }
       .color-grey{
           color: rgb(182, 182, 182);
       }

       @media(max-width: 480px){
            #waiting {
                display: none;
            }
            .padding{
               padding: 0px;
           }
       }
       @media(max-width: 520px){
           .padding{
               padding: 0px;
           }
       }
       @media(max-width: 620px){
           .padding{
               padding: 0px;
           }
       }
       @media(max-width: 760px){
           .padding{
               padding: 0px;
           }
       }
       .pagination {
			margin-left: auto; 
			margin-right: auto;
	   }
	    
	    @media(max-width: 770px) { 
            .category-btn{
                width: 100%;
                margin: auto;
            }
        }
 
       @media(min-width: 780px) { 
           .category-select { 
               display: none; 
            } 
        }
       @media(max-width: 780px) { 
           .category-btn { 
               display: none; 
            } 
        }
        .category-btn{
        text-align: center;
       }
       
</style>

	<div class="container">
	
	        		<c:if test="${empty param.memberNo }">
        			<c:if test="${empty param.area }">
                    	<form class="bg-white category-select" action="#" method="GET">
            
				            <div class="btn-group category-sm-btn">
				                <button class="btn btn-li btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				                  현재 카테고리
				                </button>
				                <div class="dropdown-menu">
				                    <a href="/yeowoori/board/list3?type=3">전체</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=1">분위기맛집</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=2">산책코스</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=3">커플데이트</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=4">카페투어</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=5" >기타</a><br>
				                </div>
				              </div>
				              
				              
				        </form>
				        <form class="category-btn" action="#" method="GET">
				            <div style="padding:10px;"></div>
				            <a class="btn btn-light category-selected" href="/yeowoori/board/list3?type=3" style="color:white;">전체</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=1">분위기맛집</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=2">산책코스</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=3">커플데이트</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=4">카페투어</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=5">기타</a>
				            <div style="padding : 20px"></div>
				        </form>
                    </c:if>
                    <c:if test="${!empty param.area }">
                    	<form class="bg-white category-select" action="#" method="GET">
            
				            <div class="btn-group category-sm-btn">
				                <button class="btn btn-li btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
				                  현재 카테고리
				                </button>
				                <div class="dropdown-menu">
				                    <a href="/yeowoori/board/list3?type=3">전체</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=1">분위기맛집</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=2">산책코스</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=3">커플데이트</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=4">카페투어</a><br>
				                    <a href="/yeowoori/board/list3?type=3&category=5" >기타</a><br>
				                </div>
				              </div>
				              
				        </form>
				        <form class="category-btn" action="#" method="GET">
				            <div style="padding:10px;"></div>
				            <a class="btn btn-light category-selected" href="/yeowoori/board/list3?type=3&area=${param.area }" style="color:white;">전체</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=1&area=${param.area }">분위기맛집</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=2&area=${param.area }">산책코스</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=3&area=${param.area }">커플데이트</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=4&area=${param.area }">카페투어</a>
				            <a class="btn btn-light category-unselected" href="/yeowoori/board/list3?type=3&category=5&area=${param.area }">기타</a>
				            <div style="padding : 20px"></div>
				        </form>
                    
                    </c:if>
        		</c:if>
	
	
	
	
	
        <div>
        
       
        
         <div>
            <div style="display: inline-block; margin-top: 40px; width: fit-content;">
                <div style="font-size: 12px; color:grey; font-weight: 300; width: fit-content; ">
                    정렬
                </div>
                <div style="font-weight: 500; font-size: 18px;">최신순</div>
                
            </div>
            <div style="float: right; margin-top: 40px;">
                <c:if test="${!empty loginMember }">
                <a href=" ${contextPath }/boardwrite?cp=1&type=3" class="btn btn-light" style="background-color:#A66129; color:white; width: 100px; ">
                    글 올리기
                </a>
                </c:if>
            </div>
        </div>

        <hr>
        
     
        <c:if test="${empty boardList }">
        		<h1 style="text-align: center;">작성된 글이 없습니다.</h1>
        </c:if>
        
    	<c:if test="${!empty boardList }">
        		<c:forEach items="${boardList }" var="board">
        		 <div style="padding : 5px;">
		            <div class="width65">
		                
		              	<a href="../board/view?no=${board.boardNo}&cp=${pagination.currentPage}&type=3${area}">
		              		<h6 style="display:inline-block;">${board.boardTitle }</h6>
		              	</a>
		                
		                <span class="btn btn-light category-selected" 
		                	style="font-size:12px; padding-top:2px; height: 20px; padding-left:7px; padding-right:7px;  margin-left:10px; color:white; ">
		                ${board.categoryName }
		                </span>
		                <a href="view?no=${board.boardNo}&cp=${pagination.currentPage}&type=3${area}">
		                 	<div style="font-size: 12px; line-height: 1.4; height:30px; over-flow:hidden; text-overflow: ellipsis; white-space: nowrap;">
		                    	${board.boardContent } 
		                	</div>
		                </a>
		               
		                <div class="user-profile" style="background-image: url(${contextPath}/${board.memberProfile});"></div>
		                <div class="user-name">${board.memberNickname}</div>
		                <div class="time">${board.createDate }</div>
		                <div class="comments">댓글</div>
		                <div class="count-comments">${board.commentCount }</div>
		                <a href="${contextPath }/board2/like/board?boardNo=${board.boardNo}&memberNo=${loginMember.memberNo}">
		                    <img src="https://drive.google.com/uc?id=1e719tW6BVTrSPiZQIxJZ8LUWWuNsx0Lc" height="15px">
		                    <div class="comments">좋아요</div>
		                </a>
		                <a class="report" href="${contextPath }/report/board?boardNo=${board.boardNo}&memberNo=${loginMember.memberNo}">신고</a>
		         	</div>
		            <c:if test="${!empty board.fileName[0] }">
		            	<div class="q-img" style="background-image: url('${contextPath}/${board.filePath[0]}${board.fileName[0]}'); float:right;"></div>
		            </c:if>
		            <div class="padding"></div>
		            <hr>
		        </div>
		        <c:set var="boardNo" value="${board.boardNo }"/>
        		</c:forEach>
        		
        </c:if>

		<div style="padding : 10px;"></div>



		<!-- 페이지네이션  -->

		 	<c:if test="${!empty param.area && empty param.category  }">
         	<c:set var = "areaCategory" value="&area=${param.area }" />
           	</c:if>
           			
           	<c:if test="${empty param.area && !empty param.category  }">
           	<c:set var = "areaCategory" value="&category=${param.category }" />
           	</c:if>
           			
 			<c:if test="${!empty param.area && !empty param.category }">
           	<c:set var = "areaCategory" value="&category=${param.category }&area=${param.area }" />
 			</c:if>  
 			
            <c:set var = "pageURL" value="list3?type=${pagination.boardType}${areaCategory}"/>
            
            <c:if test="${!empty param.memberNo && empty param.like }">
       			        
            	<c:set var = "prev" value="${contextPath }/board/list3/my?memberNo=${loginMember.memberNo}&type=3&&cp=${pagination.prevPage}"/>
       		</c:if>
            <c:if test="${empty param.memberNo }">
           		 <c:set var = "prev" value="${pageURL }&&cp=${pagination.prevPage}"/>
       			        
       		</c:if>
       		<c:if test="${!empty param.like }">
            	<c:set var = "prev" value="${contextPath }/board/list3/like?like=${param.like}&memberNo=${loginMember.memberNo}&type=3&&cp=${pagination.prevPage}"/>
           	</c:if>
       		
       		
       		<c:if test="${!empty param.like }">
	            <c:set var = "next" value="${contextPath }/board/list3/like?like=${param.like}&memberNo=${loginMember.memberNo}&type=3&&cp=${pagination.nextPage}"/>
           	</c:if>
       		
            <c:if test="${!empty param.memberNo && empty param.like }">
       			        
	            <c:set var = "next" value="${contextPath }/board/list3/my?memberNo=${loginMember.memberNo}&type=3&&cp=${pagination.nextPage}"/>
       		</c:if>
            <c:if test="${empty param.memberNo }">
	            <c:set var = "next" value="${pageURL }&&cp=${pagination.nextPage}"/>
       			        
       		</c:if>
           		
            
            <!-- 페이지 버튼 누를시 쿼리스트링 값 유지 되는법 확인하기  -->
            
           <div class="pagination-box row" style=";">
           	<ul class="pagination" style="text-align = center;" align="center">
           		<c:if test="${pagination.currentPage>pagination.pageSize }">
						<li><a class="page-link" href="${prev }">&lt;&lt;</a></li>          		
 					 
           		</c:if>	
           		
           		<c:if test="${pagination.currentPage>2 }">
						
						<c:if test="${empty param.memberNo &&empty like }">
							<li><a class="page-link" href="${pageURL}&cp=${pagination.currentPage-1}">&lt;</a></li>
           						
           				</c:if>                 		
						<c:if test="${!empty param.memberNo&& empty param.like }">
							<li><a class="page-link" href="${contextPath }/board/list3/my?memberNo=${loginMember.memberNo}&type=3&cp=${pagination.currentPage-1}">&lt;</a></li>
           						
           				</c:if>
           				<c:if test="${!empty param.like }">
							<li><a class="page-link" href="${contextPath }/board/list3/like?like=${param.like}&memberNo=${loginMember.memberNo}&type=3&cp=${pagination.currentPage-1}">&lt;</a></li>
           						
           				</c:if>
           				                 		
           		</c:if>	
           		
           		<c:forEach var="p" begin="${pagination.startPage }" end="${pagination.endPage }">
           			<li>
           				<c:choose>
           					<c:when test="${pagination.currentPage==p }">
           						<a class="page-link">${p}</a>
           					</c:when>
           					<c:otherwise>
           						
           						<c:if test="${empty param.memberNo &&empty like }">
	           						<a class="page-link" href="${pageURL}&cp=${p}">${p}</a>
           						</c:if>
           						<c:if test="${!empty param.memberNo && empty param.like }">
	           						<a class="page-link" href="${contextPath }/board/list3/my?memberNo=${loginMember.memberNo}&type=3&cp=${p}">${p}</a>
           						</c:if>
           						<c:if test="${!empty param.like }">
           						
	           						<a class="page-link" href="${contextPath }/board/list3/like?like=${param.like}&memberNo=${loginMember.memberNo}&type=3&cp=${p}">${p}</a>
           						</c:if>
           						
           					</c:otherwise>

           				</c:choose>
           			
           			</li>
           		</c:forEach>
           		
           		
           		
           		<c:if test="${pagination.currentPage<pagination.maxPage }">
       			        <c:if test="${empty param.memberNo &&empty like }">
       			        
							<li><a class="page-link" href="${pageURL}&cp=${pagination.currentPage+1}">&gt;</a> </li>                		
       					</c:if>
       					<c:if test="${!empty param.memberNo&& empty param.like }">
							<li><a class="page-link" href="${contextPath }/board/list3/my?memberNo=${loginMember.memberNo}&type=3&cp=${pagination.currentPage+1}">&gt;</a> </li>                		
       			        
       					</c:if>
       					
       					<c:if test="${!empty param.like }">
							<li><a class="page-link" href="${contextPath }/board/list3/like?like=${param.like}&memberNo=${loginMember.memberNo}&type=3&cp=${pagination.currentPage+1}">&gt;</a> </li>                		
           						
           				</c:if>
 					   
           		</c:if>	
           		
           		<c:if test="${pagination.endPage<pagination.maxPage }">
           			<c:if test="${empty param.memberNo &&empty like }">
						<li><a class="page-link" href="${next}">&gt;&gt;</a></li>              		
       				</c:if>
           		</c:if>	
           	
           	</ul>
           
           </div>
            
        
    </div>
    <div style="padding : 20px;"></div>
    <jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>
    
    <form action="#" method="POST" name="requestForm2">
    	<input type="hidden" name="no" value="${boardNo}">
   		<input type="hidden" name="loginMemberNo" value="${loginMember.memberNo }">
   		
    </form>
    
    <script>
    	function fnRequest(addr){
    		console.log(document.requestForm);
    		document.requestForm2.action = "../board2/"+addr;
    		document.requestForm2.submit();
    	}
    
    </script>
    
    
</body>
</html>