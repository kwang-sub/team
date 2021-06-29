<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    
    
    <title>header</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    <link href='//spoqa.github.io/spoqa-han-sans/css/SpoqaHanSansNeo.css' rel='stylesheet' type='text/css'>
    <style>
        * {  font-family: 'Spoqa Han Sans Neo', 'sans-serif'; }
        body{padding-top: 50px;}
        #icons{position: fixed; top: 0; left: 0; right: 0; bottom: 0; 
        padding-top: 10px; padding-left: 6%; padding-right: 6%; padding-bottom:10px; 
        background-color: white;
        height: 50px;
        z-index: 1;} 
        .icon{margin-left: 30px; float: right; }
        .menu{font-weight: 500; padding-right: 30px;}
        .color-grey{ color:grey; }
        #search-form{
            display: none;
            float:left; 
            margin-left: 10px;
        }
        #search-bar{
            border: 1px solid grey; border-radius: 5px; 
            width: 150px; height: 25px; 
            box-sizing: border-box;
        }
        #search-bar-btn{
            padding-left: 15px; 
            padding-right: 0px;
            padding-top: 0px;
            margin-top: 0px;
            margin-right: 0px;
        }

        /*  ******************* */
        #carousel-bg{
            width: 100%; height: auto;
            background-color: rgb(245, 245, 245);   
            padding-left: 8%; padding-top: 30px; padding-right: 8%; padding-bottom: 10px;
        }
        .carousel-img1{
            width: 500px; height: 400px;
            max-width: 100%;
            border: 1px solid black;
            background-color:rgb(83, 83, 83);
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
            display: inline-block;
            position: relative;
        }
        .carousel-cap{
            color: white;
            max-width: 100%;
            height: 80px;
            position: absolute;
            top: 70%;
            margin-left: 5%;
            margin-right: 5%;
        }
        .carousel-img2{
            width: 500px; height: 150px;
            display: inline-block;
            max-width: 100%;
            background-color:rgb(83, 83, 83);
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        .carousel-btn{
            border: 0px;
            border-radius: 20px;
            width: 80px;
            height: 30px;
        }
        .notice-bar{
            background-color: rgb(245, 245, 245);   
            height: 30px;
            margin-bottom: 10px;
        }
        .notice-content{
            line-height: 2;
            text-align: center;
        }
        .notice-content > a{
            color: black;
        }
        .main-board{
            max-width: 100%;
            margin-bottom: 10px;
        }
        .more{
            width: 70px; height: 25px;
            background-color: #eee;
            border-radius: 5px;
            line-height: 1.8;
            text-align: center;
            float: right;
            color: grey;
            font-size: 14px;
            margin-right: 10px;
        }
</style>
</head>
    <body>
        <div id="icons">
            <a href="login" class="icon" id="user-icon"><img src="resources/img/user.png" height="20px"></a>
            <a href="#" class="icon" id="heart-icon"><img src="resources/img/like.png" height="20px"></a>
            <div class="icon" id="search-icon">
                <img id="search-btn" src="resources/img/search.png" height="20px">
                <form id="search-form">
                    <input  type="search" id="search-bar" name="search" placeholder="search"><button id="search-bar-btn" style="background-color: white; border: white;" ><img src="resources/img/search.png" height="20px" ></button>
                </form>
            </div>
            <div class="icon" id="area-icon" style="padding:0px;" >
                <div style="background-color: black; width: 40px; text-align: center; border-radius: 5px; color: white; font-weight: 500; display: inline-block; font-size: 13px;">
                    <span style="position: relative; top: 1px;">동남</span>
                </div>
            </div>
            
        </div>
        
        <div class="header navbar navbar-expand-lg navbar-light bg-white ">
            <div class="container">
                <a class="navbar-brand" href="${contextPath}"><img src="resources/img/logo.png" style="width: 150px;"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <ul class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active menu"><a class="nav-link" href="#">공지</a></li>
                        <li class="nav-item active menu"><a class="nav-link" href="/yeowoori/board/list?type=1">여행</a></li>
                        <li class="nav-item active menu"><a class="nav-link" href="#">질문</a></li>
                        <li class="nav-item active menu"><a class="nav-link" href="#">같이 떠나요</a></li>
                    </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link " href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              다른 지역 보기
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                              <a class="dropdown-item color-grey" href="#">동북</a>
                              <a class="dropdown-item color-grey" href="#">서남</a>
                              <a class="dropdown-item color-grey" href="#">서북</a>
                            </div>
                          </li>
                    </ul>
                </div>
            </div>
        </div>
        <hr  align="center" style="border: solid #b6957c; border-width: 1px 0px 0px 0px; width:100%">
        <script>
            
            $("#search-btn").on("click",function(){
                $("#search-form").css("display","inline-block");
                $("#search-btn").css("display","none");
                $("#search-bar").focus(); 
            })
            $(document).ready(function(){
                $(document).mousedown(function( e ){
                    if( $("#search-form").is(":visible") ) {
                        $("#search-form").each(function(){
                            var l_position = $(this).offset();
                            l_position.right = parseInt(l_position.left) + ($(this).width());
                            l_position.bottom = parseInt(l_position.top) + parseInt($(this).height());

                            if( ( l_position.left <= e.pageX && e.pageX <= l_position.right )
                                && ( l_position.top <= e.pageY && e.pageY <= l_position.bottom ) ) {
                            } else {
                                $(this).hide();
                                $("#search-btn").css("display","inline-block");
                            }
                        });
                    }
                });
            });
        </script>

        <%-- 로그인 실패와 같은 메시지가 서버로부터 전달되어 온 경우 출력 --%>
	    <c:if test="${!empty title }">
		<script>
			swal({
				"icon" : "${icon}",
				"title" : "${title}",
				"text" : "${text}"
			})
		</script>
		
		<%-- 특정 스코프에 있는 속성(변수)를 제거 할 수있음 --%>
		<%-- 서버로부터 전달 받은 메세지를 1회 출력후 제거 (반복 출력되지 않는다.) --%>
		<c:remove var="text"/>
		<c:remove var="icon"/>
		<c:remove var="title"/>
	</c:if>
        

</body>
</html>