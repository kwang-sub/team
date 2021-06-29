<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
 <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>html문서 제목</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <style>
        a{
            color : black;
        }
        .main{
            margin-top: 10px;
        }
        
        
        
        <%-- 보더라인 none 적용 왜안되는지 확인해야됨--%>
        
        .card{
            border: none;
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


    </style>
</head>
<body>


<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
    <div class="container">
        <form class="bg-white category-select" action="#" method="GET">
            
            <div class="btn-group category-sm-btn">
                <button class="btn btn-li btn-sm dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  현재 카테고리
                </button>
                <div class="dropdown-menu">
                    <a href="#">전체</a><br>
                    <a href="#" >분위기 맛집</a><br>
                    <a href="#">산책코스</a><br>
                    <a href="#">커플데이트</a><br>
                    <a href="#">카페투어</a><br>
                    <a href="#" >기타</a><br>
                </div>
              </div>
              
        </form>
        
        <form class="category-btn" action="#" method="GET">
            <div style="padding:10px;"></div>
            <button class="btn btn-light category-selected" name="category" value="전체">전체</button>
            <button class="btn btn-light category-unselected" name="category" value="분위기맛집">분위기맛집</button>
            <button class="btn btn-light category-unselected" name="category" value="산책코스">산책코스</button>
            <button class="btn btn-light category-unselected" name="category" value="커플데이트">커플데이트</button>
            <button class="btn btn-light category-unselected" name="category" value="카페투어">카페투어</button>
            <button class="btn btn-light category-unselected" name="category" value="기타">기타</button>
            <div style="padding : 20px"></div>
        </form>

        <div class="row main">

            <div class="col-sm-6 col-md-4 card-block">
                <div class="card" style="width: 18rem;">
                    <div class="card-head">
                        <table class="userProple">
                            <th style="padding-right: 5px;">
                                <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class=" rounded-circle" alt="">
                            </th>
                            <th>
                                    <div>유저닉네임</div>
                                    <div style="font-weight: 400; font-size: 14px;">유저가 설정한 한줄 소개</div>
                            </th>
                        </table>
                    </div>
                    <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class="card-img-top" alt="...">
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
                        <p class="card-text">유저가 적은 내용유저가 적은 내용유저가 적은 내용유저가 적은 내용</p>
                    </div>
                </div>
            </div>
            
           
            <div class="col-sm-6 col-md-4 card-block">
                <div class="card" style="width: 18rem;">
                    <div class="card-head">
                        <table class="userProple">
                            <th style="padding-right: 5px;">
                                <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class=" rounded-circle" alt="">
                            </th>
                            <th>
                                    <div>유저닉네임</div>
                                    <div style="font-weight: 400; font-size: 14px;">유저가 설정한 한줄 소개</div>
                            </th>
                        </table>
                    </div>
                    <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class="card-img-top" alt="...">
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
                        <p class="card-text">유저가 적은 내용유저가 적은 내용유저가 적은 내용유저가 적은 내용</p>
                    </div>
                </div>
            </div>
            
            
            <div class="col-sm-6 col-md-4 card-block">
                <div class="card" style="width: 18rem;">
                    <div class="card-head">
                        <table class="userProple">
                            <th style="padding-right: 5px;">
                                <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class=" rounded-circle" alt="">
                            </th>
                            <th>
                                    <div>유저닉네임</div>
                                    <div style="font-weight: 400; font-size: 14px;">유저가 설정한 한줄 소개</div>
                            </th>
                        </table>
                    </div>
                    <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class="card-img-top" alt="...">
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
                        <p class="card-text">유저가 적은 내용유저가 적은 내용유저가 적은 내용유저가 적은 내용</p>
                    </div>
                </div>
            </div>

            
            <div class="col-sm-6 col-md-4 card-block">
                <div class="card" style="width: 18rem;">
                    <div class="card-head">
                        <table class="userProple">
                            <th style="padding-right: 5px;">
                                <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class=" rounded-circle" alt="">
                            </th>
                            <th>
                                    <div>유저닉네임</div>
                                    <div style="font-weight: 400; font-size: 14px;">유저가 설정한 한줄 소개</div>
                            </th>
                        </table>
                    </div>
                    <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class="card-img-top" alt="...">
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
                        <p class="card-text">유저가 적은 내용유저가 적은 내용유저가 적은 내용유저가 적은 내용</p>
                    </div>
                </div>
            </div>

            
            <div class="col-sm-6 col-md-4 card-block">
                <div class="card" style="width: 18rem;">
                    <div class="card-head">
                        <table class="userProple">
                            <th style="padding-right: 5px;">
                                <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class=" rounded-circle" alt="">
                            </th>
                            <th>
                                    <div>유저닉네임</div>
                                    <div style="font-weight: 400; font-size: 14px;">유저가 설정한 한줄 소개</div>
                            </th>
                        </table>
                    </div>
                    <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class="card-img-top" alt="...">
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
                        <p class="card-text">유저가 적은 내용유저가 적은 내용유저가 적은 내용유저가 적은 내용</p>
                    </div>
                </div>
            </div>

            
            <div class="col-sm-6 col-md-4 card-block">
                <div class="card" style="width: 18rem;">
                    <div class="card-head">
                        <table class="userProple">
                            <th style="padding-right: 5px;">
                                <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class=" rounded-circle" alt="">
                            </th>
                            <th>
                                    <div>유저닉네임</div>
                                    <div style="font-weight: 400; font-size: 14px;">유저가 설정한 한줄 소개</div>
                            </th>
                        </table>
                    </div>
                    <img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTFfMiAg%2FMDAxNjIzMzU5NzIwMDU4.YsCl4ZpXk99sB2Zl5MFAHVNIB_scdpu1hIaOrE7YX8og.t1zM2xSsox9giQO1H7yNZmGGhmKeauVbmUBuRRYjIc8g.JPEG.redtico63%2F1623357995954_edit.jpg&type=a340" class="card-img-top" alt="...">
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
                        <p class="card-text">유저가 적은 내용유저가 적은 내용유저가 적은 내용유저가 적은 내용</p>
                    </div>
                </div>
            </div>
            
            
            

  
            
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
</body>
</html>