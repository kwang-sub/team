<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>html문서 제목</title>
        <style>
        .card{
            border: none;
        }
        a{
            color : black;
        }
        .main{
            margin-top: 10px;
        }
        
        .card-head{
            margin-bottom: 15px;
        }
        .card-img-top{
            height: 300px;
        }
        .rounded-circle{
            width: 40px;
            height: 40px;
        }
        .userProple > th > div{
            color: gray ;
        }
        .card-body{
            padding-top: 5px;
            padding-right:5px ;
            padding-left:5px ;
        }
       .card-body>div>div>span>img{
        width:20px;
        height: 70%;
       }
       .category-btn{
        text-align: center;
       }
       .category-selected{
            background-color: #A66129;
            color:white;
            font-weight: 500;
        }
       .category-unselected{
            color: #A66129;
            font-weight: 500;
       }
       .category-btn>button{
           margin-left: 25px;
          
       }
        #write-btn{
            width: 50px;
            height: 50px;
            border: none;
            background-color: #A66129;
            color: white;
            line-height: 20px;
            font-size: 50px;
            padding-bottom: 5px;
            float: right;
        }
       @media(max-width: 992px) { 
            .card-block{
                margin-right: 100px;
            }
        }
       @media(max-width: 770px) { 
            .card-block{
                margin-right: 100px;
                margin-left: auto;
            }
            .category-select{
                position: relative;
                left: 160px;
            }
            .category-btn{
                width: 100%;
                margin: auto;
            }
        }
        @media(max-width: 600px){
            .card-block{
                margin-left: 80px;
            }
            .category-select{
                position: relative;
                left: 60px;
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
        @media(min-width: 1200px){
            .main{
            margin-left: 45px;

            }
        }
        
        .pagination {
			margin-left: auto; 
			margin-right: auto;
		}

    </style>
</head>
<body>


<br>

	
	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include> 
    <div class="container">
        <form class="bg-white category-select" action="#" method="GET">
            
            <div class="btn-group category-sm-btn">
                <button class="btn btn-li btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  현재 카테고리
                </button>
                <div class="dropdown-menu">
                    <a href="/yeowoori/board/list?type=1">전체</a><br>
                    <a href="/yeowoori/board/list?type=1&category=2" >분위기맛집</a><br>
                    <a href="#">산책코스</a><br>
                    <a href="#">커플데이트</a><br>
                    <a href="#">카페투어</a><br>
                    <a href="#" >기타</a><br>
                </div>
              </div>
              
        </form>
        <form class="category-btn" action="#" method="GET">
            <div style="padding:10px;"></div>
            <a class="btn btn-light category-selected" href="/yeowoori/board/list?type=1">전체</a>
            <a class="btn btn-light category-unselected" href="/yeowoori/board/list?type=1&category=2">분위기맛집</a>
            <a class="btn btn-light category-unselected" href="/yeowoori/board/list?type=1&category=2">산책코스</a>
            <a class="btn btn-light category-unselected" href="/yeowoori/board/list?type=1&category=2">커플데이트</a>
            <a class="btn btn-light category-unselected" href="/yeowoori/board/list?type=1&category=2">카페투어</a>
            <a class="btn btn-light category-unselected" href="/yeowoori/board/list?type=1&category=2">기타</a>
            <div style="padding : 20px"></div>
        </form>
        
        <div class="" style="height: 35px;">
            <form action="${contextPath}/boardwrite?cp=1" method="GET">
    
                <button id="write-btn" class="rounded-circle">+</button>
            </form>

        </div>
        <div class="row main">
        
        <c:choose>
        	<c:when test="${empty boardList }">
        		<h1 style="text-align: center;">
        			작성된 글이 없습니다
        		</h1>
        	</c:when>
        
        	<c:otherwise>
        		<c:forEach items="${boardList }" var="board">
        		
	                            
        		
	                            
        		
        		
        			 <div class="col-sm-6 col-md-4 card-block">
	                <div class="card" style="width: 18rem; border: none;">
	                    <div class="card-head">
	                        <table class="userProple">
	                            <th style="padding-right: 5px;">
	                            
	                            
	                            
	                            <%-- 유저프로필 이상확인 필요!!!!!!!!!!!!!!!!! --%>
	                            <c:choose>
	                            	<c:when test="${!empty board.memberProfile }">
	                            	
	                                <img src="${contextPath}${board.memberProfile}" class=" rounded-circle" alt="">
	                            	</c:when>
	                            	
	                            	<c:otherwise>
	                            		<img src="${contextPath}/resources/img/user.png" class=" rounded-circle" alt="">
	                            	</c:otherwise>
	                            </c:choose>
	                            
	                            </th>
	                            <th>
	                                    <div>${board.memberNickname }</div>
	                                    <div style="font-weight: 400; font-size: 14px;">${board.memberContent }</div>
	                            </th>
	                        </table>
	                    </div>
	                    
	                    <c:choose>
	                    	<c:when test="${empty board.fileName[0] }">
			                    <a href="#">
			                    <img src="${contextPath}/resources/img/noimage.png" class="card-img-top" alt="...">
			                    </a>
	                    	</c:when>
	                    	<c:otherwise>
	                    		<a href="#">
	                    		
			                    <img src="${contextPath}/${board.filePath[0]}${board.fileName[0]}" class="card-img-top" alt="...">
	                    		</a>
	                    	</c:otherwise>
	                    </c:choose>
	                    
	                   
	                    
	                    
	                    <div class="card-body">
	                        <div class="row">
	                            <div class="col-xl-12" style="padding-top: 3px; padding-bottom: 5px;">
	                                <span style="padding-left: 5px;">
	                                    <img src="https://drive.google.com/uc?id=1qxz-wF69nTfWlkXBZ70xkWTjO_yjeblU" style="height: 20px; width: auto;">
	                                    <span style="margin-left: 5px; padding-top: 10px;">15</span>
	                                </span>
	                                <span style="float: right; padding-right: 5px;">
	                                        <img src="https://drive.google.com/uc?id=1e719tW6BVTrSPiZQIxJZ8LUWWuNsx0Lc" style="height: 20px; width: auto;" alt="">
	                                        <span style="margin-left: 5px;">30</span>
	                                </span>
	                            </div>
	                        </div>
	                        <p class="card-text">${board.boardContent }</p>
	                    </div>
	                </div>
	            </div>
        		</c:forEach>
	           
        	
        	
        	</c:otherwise>
        </c:choose>

            
  
            
        </div>
    </div>
            <c:set var = "pageURL" value="list?type=${pagination.boardType}"/>
            <c:set var = "prev" value="${pageURL }&&cp=${pagination.prevPage}"/>
            <c:set var = "next" value="${pageURL }&&cp=${pagination.nextPage}"/>
            
            
           
           <div class="pagination-box row" style=";">
           	<ul class="pagination">
           		<c:if test="${pagination.currentPage>pagination.pageSize }">
					<li><a class="page-link" href="${prev }">&lt;&lt;</a></li>          		
           		</c:if>	
           		<c:if test="${pagination.currentPage>2 }">
					<li><a class="page-link" href="${pageURL}&cp=${pagination.currentPage-1}">&lt;</a></li>                 		
           		</c:if>	
           		
           		<c:forEach var="p" begin="${pagination.startPage }" end="${pagination.endPage }">
           			<li>
           				<c:choose>
           					<c:when test="${pagination.currentPage==p }">
           						<a class="page-link">${p}</a>
           					</c:when>
           					<c:otherwise>
           						<a class="page-link" href="${pageURL}&cp=${p}">${p}</a>
           					</c:otherwise>
           				</c:choose>
           			
           			</li>
           		</c:forEach>
           		
           		<c:if test="${pagination.currentPage<pagination.maxPage }">
					<li><a class="page-link" href="${pageURL}&cp=${pagination.currentPage+1}">&gt;</a> </li>                		
           		</c:if>	
           		<c:if test="${pagination.currentPage<pagination.maxPage }">
					<li><a class="page-link" href="${next}">&gt;&gt;</a></li>              		
           		</c:if>	
           	
           	</ul>
           
           </div>
            

</body>
</html>