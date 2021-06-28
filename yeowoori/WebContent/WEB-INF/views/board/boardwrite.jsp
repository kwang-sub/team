<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title></title>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
      
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
          <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>



        <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.css" rel="stylesheet">
          <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
          <script src=" https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.18/lang/summernote-ko-KR.min.js"></script>
    <style>
        .content>form>div {
            height: 50px;
        }

        .area input[type=radio] {
            display: none;
        }

        .area input[type=radio]+label {
            height: 30px;
            padding-left: 10px;
            padding-right: 10px;
            padding-top: 4px;
            background-color: #EDEDED;
            color: #A66129;
            font-weight: 500;
            font-size: 14px;
            border-radius: 10px;
            margin-right: 5px;
        }

        .area input[type=radio]:checked+label {
            height: 30px;
            width: fit-content;
            padding-left: 10px;
            padding-right: 10px;
            padding-top: 4px;
            background-color: #A66129;
            color: white;
            font-weight: 500;
            font-size: 14px;
            border-radius: 10px;
            margin-right: 5px;
            margin-top: 0px;
        }

        .file {
            display: none;
        }

        .photo {
            height: 30px;
            padding-left: 10px;
            padding-right: 10px;
            padding-top: 4px;
            background-color: #EDEDED;
            color: #A66129;
            font-weight: 500;
            font-size: 14px;
            border-radius: 10px;
            margin-right: 5px;
        }

        #btn-label {
            background-color: #A66129;
            color: white;
            font-size: 16px;
            text-align: center;
            width: 200px;
            max-width: 20%;
            height: 40px;
            border-radius: 5px;
            margin-top: 0px;
        }



        body {
            margin: 10px
        }

        .where {
            display: block;
            margin: 25px 15px;
            font-size: 11px;
            color: #000;
            text-decoration: none;
            font-family: verdana;
            font-style: italic;
        }

        .filebox input[type="file"] {
            position: absolute;
            width: 1px;
            height: 1px;
            padding: 0;
            margin: -1px;
            overflow: hidden;
            clip: rect(0, 0, 0, 0);
            border: 0;
        }

        .filebox label {
            display: inline-block;
            padding: .5em .75em;
            color: #999;
            font-size: inherit;
            line-height: normal;
            vertical-align: middle;
            background-color: #fdfdfd;
            cursor: pointer;
            border: 1px solid #ebebeb;
            border-bottom-color: #e2e2e2;
            border-radius: .25em;
        }

        /* named upload */
        .filebox .upload-name {
            display: inline-block;
            padding: .5em .75em;
            font-size: inherit;
            font-family: inherit;
            line-height: normal;
            vertical-align: middle;
            background-color: #f5f5f5;
            border: 1px solid #ebebeb;
            border-bottom-color: #e2e2e2;
            border-radius: .25em;
            -webkit-appearance: none;
            -moz-appearance: none;
            appearance: none;
        }

        .filebox.bs3-primary label {
            color: #fff;
            background-color: #A66129;
            border-color: #A66129;
        }

        .photobox {
            margin-left: 70px;
        }
    </style>
	
	
</head>
<body>

	<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>

	   <div style="padding : 20px;"></div>
    <div class="container">
        <div class="row">
            <div class="col-xs-1">

            </div>
            <div class="col-12 col-lg-12">
                <form action="#">


                    <div>
                        <h3>게시글올리기</h3>
                    </div>
                    <div style="padding : 10px;"></div>
                    <div>
                        <select name="category" id="category" style="color: grey; height: 40px; max-width: 20%;">
                            <option value="여행">여행</option>
                            <option value="같이떠나요">같이떠나요</option>
                            <option value="질문">질문</option>
                        </select>
                        <input type="text" name="title" id="title" size="80" placeholder="제목"
                            style="height: 40px; width: 400px; max-width: 55%;">
                        <button type="submit" class="btn" id="btn-label" style="float:right;">올리기</button>
                    </div>
                    <div style="padding :5px;"></div>
                    <div>
                        <div style="color: grey; display: inline-block; margin-right: 10px; margin-bottom: 10px;">태그 선택
                        </div>
                        <div class="area" style="display: inline-block; margin-bottom: 10px;">
                            <input type="radio" id="mood" name="tag" value="분위기맛집">
                            <label for="mood">분위기맛집</label>
                            <input type="radio" id="walk" name="tag" value="산책코스">
                            <label for="walk">산책코스</label>
                            <input type="radio" id="couple" name="tag" value="커플데이트">
                            <label for="couple">커플데이트</label>
                            <input type="radio" id="cafe" name="tag" value="카페투어">
                            <label for="cafe">카페투어</label>
                            <input type="radio" id="etc" name="tag" value="기타" checked>
                            <label for="etc">기타</label>
                        </div>
                    </div>
                    <div>
                        <div style="color: grey; display: inline-block; margin-right: 10px; margin-bottom: 10px;">지역 선택
                        </div>
                        <span class="area">
                            <input type="radio" id="southwest" name="area" value="southwest" checked>
                            <label for="southwest">서남</label>
                            <input type="radio" id="southeast" name="area" value="southeast">
                            <label for="southeast">동남</label>
                            <input type="radio" id="northwest" name="area" value="northwest">
                            <label for="northwest">서북</label>
                            <input type="radio" id="northeast" name="area" value="northeast">
                            <label for="northeast"> 동북 </label>
                        </span>
                    </div>
                    <div style="padding :5px;"></div>
                    <div>
                        <span style="display:inline-block; margin-right: 22px;">
                            <img src="https://drive.google.com/uc?id=1HWSNypdXLIN0wOeCFaH7LdFvwCpMkejD" alt="photo"
                                style="height: 30px;">
                        </span>

                        <span>
                            <span class="filebox bs3-primary">
                                <label for="thumbnail">대표</label>
                                <input class="upload-name" value="파일선택" disabled="disabled">

                                <input type="file" id="thumbnail" name="thumbnail" class="upload-hidden">
                            </span>
                        </span>
                        
                    </div>
                    
                        <textarea  style="width : 100%; height: 400px; resize: none;"id="summernote" name="content" class="summernote"></textarea>
                    
                </form>

            </div>

            <div class="col-xs-1">

            </div>
        </div>
    </div>
    <div style="padding : 40px;"></div>
    <script>

        $(document).ready(function () {
            var fileTarget = $('.filebox .upload-hidden');
            var photoTarget = $('.photobox .upload-hidden');
            

            fileTarget.on('change', function () {
                if (window.FileReader) {
                    var filename = $(this)[0].files[0].name;
                } else {
                    var filename = $(this).val().split('/').pop().split('\\').pop();
                }

                $(this).siblings('.upload-name').val(filename);
            });
            
            
        });
        
        
            $('#summernote').summernote({
              tabsize: 2,
              height: 400,
              lang: "ko-KR",
              fontNames: ['Arial', 'Arial Black', 'Comic Sans MS', 'Courier New','맑은 고딕','궁서','굴림체','굴림','돋음체','바탕체'],
              fontSizes: ['8','9','10','11','12','14','16','18','20','22','24','28','30','36','50','72']
            });
          
            
          

        
        </script>

</body>
</html>