<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title></title>
	 <style>
        #type{
            text-align: center;
        }
        .pagination {
			margin-left: auto; 
			margin-right: auto;
		}
    </style>
</head>
<body>

	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
	 <div class="container">
        <div class="row">
          <div class="col-sm-1">
          </div>
          <div class="col-sm-10">
              <div id="type">
                  <h2>공지사항</h2>
              </div>
				 <c:forEach items="${boardList }" var="board">
						<div>
			                  <hr>
						        <h5>[공 지] ${board.boardTitle }</h5> <br>
						                  ${board.boardContent }<br><br>
						                  <fmt:formatDate value="${board.createDate }" pattern="yyyy-mm-dd"/>
						                  
			              </div>
				</c:forEach> 
				
				
				<div>
					 <c:set var = "pageURL" value="list?type=${pagination.boardType}"/>
            <c:set var = "prev" value="${pageURL }&&cp=${pagination.prevPage}"/>
            <c:set var = "next" value="${pageURL }&&cp=${pagination.nextPage}"/>
            
            
            
            <!-- 페이지 버튼 누를시 쿼리스트링 값 유지 되는법 확인하기  -->
            
           
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
           						<c:if test="${!empty param.area && empty param.memberNo }">
	           						<a class="page-link" href="${pageURL}&cp=${p}&area=${param.area}">${p}</a>
           						</c:if>
           						<c:if test="${!empty param.category && empty param.memberNo }">
	           						<a class="page-link" href="${pageURL}&cp=${p}&category=${param.category}">${p}</a>
           						</c:if>
           						<c:if test="${!empty param.category && !empty param.area && empty param.memberNo }">
	           						<a class="page-link" href="${pageURL}&cp=${p}&category=${param.category}&area=${param.area}">${p}</a>
           						</c:if>
           						<c:if test="${empty param.category && empty param.area && empty param.memberNo }">
	           						<a class="page-link" href="${pageURL}&cp=${p}">${p}</a>
           						</c:if>
           						<c:if test="${empty param.category && empty param.area && !empty param.memberNo }">
           							<a class="page-link" href="${contextPath }/board/list/my?memberNo=${loginMember.memberNo}&type=1&cp=${p}">${p}</a>
           						</c:if>
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
				
				</div>
              
          </div>
          	
          <div class="col-sm-1">
          </div>
        </div>
      </div>
</body>
</html>