<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시글</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<style>
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
       #etc-board{
           float: right;
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
       #to-top{
           background-color: white;
           width: 45px; height: 70px;
           text-align: center;
           padding-top: 5px;
           line-height: 1.5;
           border-radius: 5px;
           border: 1px solid rgb(214, 214, 214);
           font-size: 12px;
            position: fixed;
            bottom: -25px;
            right: 10px;
       }
</style>
    <div style="padding :20px;" id="top"></div>
    <div class="container">
        <h5>서울 여행 코스 추천 서울식물원</h5>
        <div style="padding : 3px;"></div>
        <button class="btn btn-light category-selected" name="category" value="산책코스">산책코스</button>
        <button class="btn btn-light category-selected" name="category" value="커플데이트">커플데이트</button>
        <div style="padding : 5px;"></div>
        <div style="display: inline-block; margin-top: 8px;">
            <div class="user-profile" style="background-image: url('');"></div>
            <div class="user-name">유저닉네임</div>
            <div class="time">2021.5.24. 10:43</div>
        </div>
        <div id="etc-board">
            <a href="#" style="padding-right : 10px;">
                <img src="https://drive.google.com/uc?id=1e719tW6BVTrSPiZQIxJZ8LUWWuNsx0Lc" height="15px">
            </a>
            <span style="font-size: 12px; color: grey;">138</span>
            <div style="padding : 5px; display: inline-block;"></div>
            <div class="dropdownleft" style="display: inline-block;">
                <button class="btn" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <img src="https://drive.google.com/uc?id=1CBODLkaPUc8Zt4MCTz-uAIBiRgmYjepI" height="15px">
                </button>
                <div class="dropdown-menu " aria-labelledby="dropdownMenuButton">
                  <a class="dropdown-item " href="#">수정하기</a>
                  <a class="dropdown-item" href="#">삭제하기</a>
                </div>
              </div>
        </div>
        <hr>
        <div style="padding: 10px;"></div>
        <img src="https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/47uI/image/bhCo5ld5HPr7bXDvSFrt6YKzT9k.jpg">
        <div style="padding :5px;"></div>
        <p>
            유저가 적은 내용유저가 적은 내용유저가 적은 내용<br>
            유저가 적은 내용유저가 적은 내용유저가 적은 내용<br>
            유저가 적은 내용유저가 적은 내용유저가 적은 내용<br>
            유저가 적은 내용유저가 적은 내용
        </p>
        <div style="padding: 10px;"></div>
        <div class="comments">조회</div>
        <div class="comments">123</div>
        <div class="comments">댓글</div>
        <div class="comments">1</div>
        <a href="#" class="report">신고</a>
        <div style="padding: 20px;"></div>
        <hr>
        <div style="padding: 20px;"></div>
        <h6>댓글 1</h6>
        <div style="padding: 5px;"></div>
        <div class="user-profile-big" style="background-image: url('');"></div>
        <form class="text-container">
            <input type="text" class="input-comment" placeholder="댓글을 입력해주세요.">
            <button type="submit" class="btn-submit">등록</button>
        </form>
        <div style="padding: 10px;"></div>
        <div class="user-profile-big" style="background-image: url(''); margin-bottom: 30px;"></div>
        <div style="display: inline-block;">
            <div class="user-name" style="font-size: 14px; margin-left: 0px;">유저닉네임</div>
            <div style="display: inline-block; margin-left: 10px; font-size: 14px;">댓글 내용</div>
            <div>
                <div class="time" style="margin-left: 0px; margin-right: 20px;">1시간 전</div>
                <a href="#">
                    <img src="https://drive.google.com/uc?id=1e719tW6BVTrSPiZQIxJZ8LUWWuNsx0Lc" height="15px">
                    <div class="comments">좋아요</div>
                </a>
                <div class="report">신고</div>
            </div>
        </div>
        
        <div id="to-top"><a href="#header" style="color: grey;">▲<br>TOP</a></div>
    </div>
    <div style="padding : 40px;"></div>
    
    <jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>
</body>
</html>