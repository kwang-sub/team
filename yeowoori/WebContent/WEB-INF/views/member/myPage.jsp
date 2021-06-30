<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이 페이지</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <link href='//spoqa.github.io/spoqa-han-sans/css/SpoqaHanSansNeo.css' rel='stylesheet' type='text/css'>
    <style>
        * { font-family: 'Spoqa Han Sans Neo', 'sans-serif'; }
        a{
            color : black;
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
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

    <div class="container">
        <form class="bg-white category-select" action="#" method="GET">
            
            <div class="btn-group category-sm-btn">
                <button class="btn btn-li btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    마이페이지
                </button>
                <div class="dropdown-menu">
                    <a href="#">나의활동</a><br>
                    <a href="#">좋아요</a><br>
                    <a href="#">알림</a><br>
                    <a href="#">설정</a><br>
                </div>
              </div>
              
        </form>
        
        <form class="category-btn" action="#" method="GET">
            <div style="padding:10px;"></div>
            <h6 style="display: inline-block; font-weight: 500;">마이페이지</h6>
            <button class="btn btn-light category-selected" name="category" value="전체">나의활동</button>
            <button class="btn btn-light category-unselected" name="category" value="분위기맛집">좋아요</button>
            <button class="btn btn-light category-unselected" name="category" value="산책코스">알림</button>
            <button class="btn btn-light category-unselected" name="category" value="커플데이트">설정</button>
            <hr  align="center" style="border: solid #b6957c; border-width: 1px 0px 0px 0px; width:100%">
            <div style="padding : 20px"></div>
        </form>

        <div class="row board">
            <div class="col-sm-12 col-lg-3" id="profile-container">
                <img src="https://image.ohou.se/i/bucketplace-v2-development/uploads/users/profile_images/161767217197477349.jpeg?gif=1&w=320&h=320&c=c">
                <h5 style="font-weight: 600;">유저 닉네임</h5>
                <div style="padding: 10px;"></div>
                <button class="btn btn-light">설정</button>
                <hr align="center"style="width:80%">
                <div style="padding-top: 15px; padding-bottom: 10px;">
                    <img src="https://drive.google.com/uc?id=1e719tW6BVTrSPiZQIxJZ8LUWWuNsx0Lc" width="30px;">
                    <div style="padding-top: 15px; font-size: 14px; font-weight: 400;">좋아요</div>
                    <div>130</div>
                </div>
            </div>

            <div style="padding :10px;"></div>

           <div class="col-sm-12 col-lg-8">
               <div class="row">
                    <div class="col-12 col-md-6 col-lg-6"> 
                        <div>
                            <h6 style="display: inline-block; margin-right: 10%; margin-bottom: 10px;">여행</h6>
                            <span style="color:#A66129">17</span>
                            <div class="show-all">전체보기</div>
                        </div>
                        <div class="board-img img-left" class="col-sm-6 col-lg-1" 
                            style="background-image: url('https://pbs.twimg.com/media/Dz0_ZLKUcAE-Foh.jpg:large');">
                        </div>
                        <div class="board-img img-right" class="col-sm-6 col-lg-1" 
                            style="background-image: url('https://t1.daumcdn.net/cfile/tistory/998C41385D29FEDC06');">
                        </div>
                        <div class="board-img img-left" class="col-sm-6 col-lg-1" 
                            style="background-image: url('https://mblogthumb-phinf.pstatic.net/MjAxOTAyMjZfMjQ4/MDAxNTUxMTg4NTMyNTk0.ntasq8yP_BaB0IzSXVAeW3LUZCEhzZG-STpO70SKWRQg.ByhPhxQQecefiVwvMlyGiWefOVZP2dYHuQRs6WHfnv0g.JPEG.yeanzz/%EA%BC%AC%EC%95%99%EB%93%9C%ED%8C%8C%EB%A6%AC24-1.jpg?type=w800');">
                        </div>
                        <div class="board-img img-right" class="col-sm-6 col-lg-1" 
                            style="background-image: url('https://i.pinimg.com/originals/53/ae/3e/53ae3ebcd93980ff7ff04b6b9b8a48a7.jpg');">
                        </div>
                        <div style="padding: 3px;"></div>
                        <button type="button" class="btn btn-brown">여행 게시글 올리기</button>
                        <div style="padding-bottom:40px;"></div>
                    
                    </div>

                    

                    <div class="col-12 col-md-6 col-lg-6">
                        <div>
                                <h6 style="display: inline-block; margin-right: 10%; margin-bottom: 10px;">질문</h6>
                                <span style="color:#A66129">17</span>
                                <div class="show-all">전체보기</div>
                        </div>
                        <ul class="list-group">
                                <li class="list-group-item">어디가 맛있나요?</li>
                                <li class="list-group-item">종로구 맛집은 어디인가요</li>
                                <li class="list-group-item">호캉스 추천 부탁</li>
                                <li class="list-group-item">서울 여행 질문 있어요!</li>
                                <li class="list-group-item">인스타 감성 카페 찾아요~</li>
                                <li class="list-group-item">뷰맛집 카페 알려주실 분?</li>
                                <li class="list-group-item">뷰맛집 카페 알려주실 분?</li>
                            </ul>
                            <div style="padding: 10px;"></div>
                            <button type="button" class="btn btn-brown">질문 올리기</button>
                            <div style="padding-bottom:40px;"></div>
                        </div>



                    <div class="col-12 col-md-6 col-lg-6" >
                        <div>
                                <h6 style="display: inline-block; margin-right: 10%; margin-bottom: 10px;">같이 떠나요</h6>
                                <span style="color:#A66129">5</span>
                                <div class="show-all">전체보기</div>
                        </div>
                        <ul class="list-group">
                                <li class="list-group-item">같이 떠나는 게시글 1</li>
                                <li class="list-group-item">같이 떠나는 게시글 2 </li>
                                <li class="list-group-item">같이 떠나는 게시글 3</li>
                                <li class="list-group-item">같이 떠나는 게시글 4</li>
                                <li class="list-group-item">같이 떠나는 게시글 5</li>
                                <li class="list-group-item">같이 떠나는 게시글 6</li>
                                <li class="list-group-item">같이 떠나는 게시글 7</li>
                        </ul>
                        <div style="padding: 10px;"></div>
                        <button type="button" class="btn btn-brown">질문 올리기</button>
                        <div style="padding-bottom:40px;"></div>
                    </div>
               </div>

               <div class="col-12 col-md-6 col-lg-6">
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
            </div>
       </div>
                
                <div style="padding : 20px;" ></div>
           </div>





        </div>

        


       
        
            
            
            

  
            
        
    </div>



    
    <div style="padding: 40px;"></div>
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

	<jsp:include page="/WEB-INF/views/common/footer.jsp"></jsp:include>

</body>
</html>