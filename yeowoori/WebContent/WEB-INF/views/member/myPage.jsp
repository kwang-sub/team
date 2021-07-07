<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" scope="application"
	value="${pageContext.servletContext.contextPath }"/>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이페이지</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
    <style>
      
       .category-selected{
            background-color: #A66129;
            color:white !important;
            font-weight: 500;
        }
       .category-unselected{
            color: #A66129 !important;
            font-weight: 500;
       }
       .category-btn>a{
           margin-left: 25px;
       }

       #profile-container{
           height: 400px;
           border: 1px solid rgb(220, 220, 220);
           box-sizing: border-box;
           border-radius: 3px;
           text-align: center;
           margin-left: 10px; 
           margin-bottom: 20px;
       }
       #profile-container > img{
           border-radius: 1000px;
           width: 100px;
           margin: 20px;
       }
 
       .show-all{
           float: right;
           font-size: 14px;
           color: grey;
           margin-right: 1%;
       }
       .board-img{
           display: inline-block;
           width: 48%;
            background-color: #eee;
           background-position: center;
           background-repeat: no-repeat;
           background-size: cover;
           margin-bottom:1%;
       }
       .img-right{
           margin-left: 1%;
       }
       .img-left{
           margin-right: 1%;
       }
       .board-img:after{
           content:"";
           display: block;
           padding-bottom: 100%;
       }
       .btn-brown{
           width: 100%; height: 45px;
           background-color: #A66129;
           border-radius: 10px;
           color: white;
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
      

    </style>
	

    <div class="container">
        <form class="bg-white category-select" action="#" method="GET">
            
            <div class="btn-group category-sm-btn">
                <button class="btn btn-li btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    마이페이지
                </button>
                <div class="dropdown-menu">
                    <a href="${contextPath}/member/myPage/my">나의활동</a><br>
                    <a href="${contextPath}/member/myPage/like">좋아요</a><br>
                    <a href="${contextPath}/member/updateMyPage">설정</a><br>
                </div>
              </div>
              
        </form>
        
        <div class="category-btn" >
            <div style="padding:10px;"></div>
            <h6 style="display: inline-block; font-weight: 500;">마이페이지</h6>
            <a class="btn btn-light category-unselected" href="${contextPath}/member/myPage/my">나의활동</a>
            <a class="btn btn-light category-unselected" href="${contextPath}/member/myPage/like" >좋아요</a>
            <a class="btn btn-light category-unselected" href="${contextPath}/member/updateMyPage">설정</a>
            <hr  align="center" style="border: solid #b6957c; border-width: 1px 0px 0px 0px; width:100%">
            <div style="padding : 20px"></div>
        </div>

        <div class="row board">
            <div class="col-sm-12 col-lg-3" id="profile-container">
                <img src="${contextPath}${loginMember.memberProfile}">
                <h5 style="font-weight: 600;">${loginMember.memberNickname }</h5>
                <div style="padding: 10px;"></div>
                <button class="btn btn-light" onclick="">설정</button>
                <hr align="center"style="width:80%">
                <div style="padding-top: 15px; padding-bottom: 10px;">
                    <img src="https://drive.google.com/uc?id=1e719tW6BVTrSPiZQIxJZ8LUWWuNsx0Lc" width="30px;">
                    <div style="padding-top: 15px; font-size: 14px; font-weight: 400;">좋아요</div>
                    <div>${likeCount }</div>
                </div>
            </div>

            <div style="padding :10px;"></div>

           <div class="col-sm-12 col-lg-8">
               <div class="row">
                    <div class="col-12 col-md-6 col-lg-6"> 
                        <div>
                            <h6 style="display: inline-block; margin-right: 10%; margin-bottom: 10px;">여행</h6>
                            <c:if test="${empty like }">
                            	<span style="color:#A66129">내가 작성한 수 : ${myTrip[0].count   == null ? 0 : myTrip[0].count }</span>
                            </c:if>
                            <c:if test="${!empty like }">
                            	<span style="color:#A66129">내가 좋아요한 게시글  수 : ${myTrip[0].count   == null ? 0 : myTrip[0].count }</span>
                            </c:if>
                            <c:if test="${empty like }">
                            
                         	   <div class="show-all"><a href="${contextPath }/board/list/my?memberNo=${loginMember.memberNo}&type=1">전체보기</a></div>
                            </c:if>
                            <c:if test="${!empty like }">
                            
                         	   <div class="show-all"><a href="${contextPath }/board/list/like?memberNo=${loginMember.memberNo}&type=1&like=${like}">전체보기</a></div>
                            </c:if>
                        </div>
                       
                       
                       
                        <c:forEach items="${myTrip }" var="my">
	                        <a href="${contextPath }/board/view?no=${my.boardNo}&cp=1&type=1">
		                        <div class="board-img img-left" class="col-sm-6 col-lg-1" 
		                            style="background-image: url(${contextPath}/${my.filePath }${my.fileNm });">
		                        </div> 
	                        
	                        </a>
                        </c:forEach>
                        
                        <div style="padding: 3px;"></div>
                        <a type="button" class="btn btn-brown" href="${contextPath}/boardwrite?type=1">여행 게시글 올리기</a>
                        <div style="padding-bottom:40px;"></div>
                    
                    </div>

                    

                    <div class="col-12 col-md-6 col-lg-6">
                        <div>
                                <h6 style="display: inline-block; margin-right: 10%; margin-bottom: 10px;">질문</h6>
                                <c:if test="${empty like }">
                                
                                	<span style="color:#A66129">내가 작성한 수 : ${myQuestion[0].count  == null ? 0 : myQuestion[0].count }</span>
                                </c:if>
                                <c:if test="${!empty like }">
                                
                                	<span style="color:#A66129">내가 좋아요한 게시글 수 : ${myQuestion[0].count  == null ? 0 : myQuestion[0].count }</span>
                                </c:if>
                                <div class="show-all"><a href="#">전체보기</a></div>
                        </div>
                   
                   
                        <ul class="list-group">
                        	<c:forEach items="${myQuestion }" var="my">
                        	
                        		
                        		
	                                <li class="list-group-item">
	                                 	<a href="${contextPath }/board/view?no=${my.boardNo}&cp=1&type=1">${my.boardTitle }</a>
	                                </li>
                        		
                        	</c:forEach>
                                
                            </ul>
                            <div style="padding: 10px;"></div>
                            <a type="button" class="btn btn-brown" href="${contextPath}/boardwrite?type=2">질문 올리기</a>
                            <div style="padding-bottom:40px;"></div>
                        </div>



                    <div class="col-12 col-md-6 col-lg-6" >
                        <div>
                                <h6 style="display: inline-block; margin-right: 10%; margin-bottom: 10px;">같이 떠나요</h6>
                                <c:if test="${empty like }">
                                
	                                <span style="color:#A66129">내가 작성한 수 : ${myTogether[0].count == null ? 0 : myTogether[0].count }</span>
                                </c:if>
                                <c:if test="${!empty like }">
                                
	                                <span style="color:#A66129">내가 좋아요한 게시글 수 : ${myTogether[0].count == null ? 0 : myTogether[0].count }</span>
                                </c:if>
                                <div class="show-all"><a href="#">전체보기</a></div>
                        </div>
                    
                    
                        <ul class="list-group">
                            <c:forEach items="${myTogether }" var="my">
                        	
                                <li class="list-group-item">
                               	 	<a href="${contextPath }/board/view?no=${my.boardNo}&cp=1&type=1">
	                        			${my.boardTitle }
	                        		</a>
	                        		
                                </li>
                        	</c:forEach>
                        </ul>
                        <div style="padding: 10px;"></div>
                        <a type="button" class="btn btn-brown" href="${contextPath}/boardwrite?type=3">게시글 올리기</a>
                        <div style="padding-bottom:40px;"></div>
                    </div>
               </div>

      <!--  <div class="col-12 col-md-6 col-lg-6 ">
                <div>
                        <h6 style="display: inline-block; margin-right: 10%; margin-bottom: 10px;">신고한 게시글</h6>
                        <span style="color:#A66129">5</span>
                        <div class="show-all">전체보기</div>
                </div>
                <ul class="list-group">
                        <li class="list-group-item">게시글 1</li>
                        <li class="list-group-item">게시글 2 </li>
                        <li class="list-group-item">게시글 3</li>
                        <li class="list-group-item">게시글 4</li>
                        <li class="list-group-item">게시글이 삭제되었습니다.</li>
                        <li class="list-group-item">게시글이 삭제되었습니다.</li>
                        <li class="list-group-item">게시글이 삭제되었습니다.</li>
                </ul>
                <div style="padding-bottom:40px;"></div>
            </div> -->
       </div>
                
                <div style="padding : 20px;" ></div>
           </div>





        </div>

        


       
        
            
            
            

  
            
        
    </div>



    
    <div style="padding: 40px;"></div>
    
    
	<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>

</body>
</html>