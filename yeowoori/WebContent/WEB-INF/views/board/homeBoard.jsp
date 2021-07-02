
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>여기우리, 여행우리</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
    <style>
        .bg-img{
            position: absolute;
            top: 0;
            left: 0;
            background-color: #777;
            width: 70%;
            height: 60%;
            margin-top: 2rem;
            margin-left: 15%;
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
        /* Carousel base class */
        .carousel {
        margin-bottom: 4rem;
        }
        /* Since positioning the image, we need to help out the caption */
        .carousel-caption {
        bottom: 1rem;
        z-index: 10;
        }
        /* Declare heights because of positioning of img element */
        .carousel-item {
        height: 32rem;
        }
        .carousel-item > img {
        position: absolute;
        top: 0;
        left: 0;
        min-width: 100%;
        height: 32rem;
        }

        .carousel-control-next,
        .carousel-control-prev  {
            filter: invert(40%);
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

        @media (min-width: 40em) {
            .carousel-caption p {
                margin-bottom: 1.25rem;
                font-size: 1.25rem;
                line-height: 1.4;
            }
        }
        
    </style>
    <div style="padding: 10px;"></div>
    <h6 style="padding-left: 8%; margin-bottom: 20px;">여행 인기 게시글</h6>

    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" role="img" aria-label=" :  " preserveAspectRatio="xMidYMid slice" focusable="false"><title> </title><rect width="100%" height="100%" fill="#f8f8f8"/><text x="50%" y="50%" fill="#777" dy=".3em"> </text></svg>
          <div class="container">
              <a href="#">
                    <div class="bg-img" style="background-image: url('');"></div>
                    <div class="carousel-caption text-left">
                    <h3 style="color: black;">Example headline.</h3>
                    <p style="color: black;">Some representative placeholder content for the first slide of the carousel.</p>
                    </div>
               </a>
          </div>
        </div>
        <div class="carousel-item">
          <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" role="img" aria-label=" :  " preserveAspectRatio="xMidYMid slice" focusable="false"><title> </title><rect width="100%" height="100%" fill="#f8f8f8"/><text x="50%" y="50%" fill="#777" dy=".3em"> </text></svg>
          
          <div class="container">
                <a href="#">
                    <div class="bg-img" style="background-image: url('');"></div>
                    <div class="carousel-caption text-left">
                    <h3 style="color: black;">Example headline.</h3>
                    <p style="color: black;">Some representative placeholder content for the first slide of the carousel.</p>
                    </div>
               </a>
          </div>
        </div>
        <div class="carousel-item">
          <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" role="img" aria-label=" :  " preserveAspectRatio="xMidYMid slice" focusable="false"><title> </title><rect width="100%" height="100%" fill="#f8f8f8"/><text x="50%" y="50%" fill="#777" dy=".3em"> </text></svg>
          
          <div class="container">
                <a href="#">
                    <div class="bg-img" style="background-image: url('');"></div>
                    <div class="carousel-caption text-left">
                    <h3 style="color: black;">Example headline.</h3>
                    <p style="color: black;">Some representative placeholder content for the first slide of the carousel.</p>
                    </div>
                </a>
           </div>
      </div>
      <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div>
    </div>

        <div class="notice-bar">
            <div class="notice-content">
                <a href="#"> <!-- 해당 공지글로 이동-->
                    <img src="https://drive.google.com/uc?id=1Qa_8qymuVwaissFmndNUsXEIuHkOLq9H" style="width:20px">
                    <span style="padding-left: 10px;"><a href="#">공지사항 1....</a></span>
                </a>
            </div>
        </div>
        <div class="notice-bar">
            <div class="notice-content">
                <a href="#"> <!-- 해당 공지글로 이동-->
                    <img src="https://drive.google.com/uc?id=1Qa_8qymuVwaissFmndNUsXEIuHkOLq9H" style="width:20px">
                    <span style="padding-left: 10px;"><a href="#">공지사항 2....</a></span>
                </a>
            </div>
        </div>        <div class="notice-bar">
            <div class="notice-content">
                <a href="#"> <!-- 해당 공지글로 이동-->
                    <img src="https://drive.google.com/uc?id=1Qa_8qymuVwaissFmndNUsXEIuHkOLq9H" style="width:20px">
                    <span style="padding-left: 10px;"><a href="#">공지사항 3....</a></span>
                </a>
            </div>
        </div>
        <div style="padding: 30px;"></div>
        <div class="container">
            <div class="row">
                <div class="col-sm">
                    <div class="main-board">
                        <h6 style="margin-left:10px; margin-bottom: 10px; display: inline-block;">질문</h6>
                        <a class="more" href="#">더보기</a> <!--질문 게시판으로 이동-->
                    </div>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="#">질문게시글 7개</a></li>

                      </ul>
                </div>
                <div style="padding : 20px;"></div>
                <div class="col-sm">
                    <div class="main-board">
                        <h6 style="margin-left:10px; margin-bottom: 10px; display: inline-block;">같이 떠나요</h6>
                        <a class="more" href="#">더보기</a> <!-- 같이 떠나요 게시판으로 이동-->
                    </div>
                    <ul class="list-group">
                        <li class="list-group-item"><a href="#">같이 떠나요 게시글 7개</a></li>
                      </ul>
                </div>
            </div>
        </div>
        <div style="padding:40px;"></div>

  
  
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script>
    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
    
    
