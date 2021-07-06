<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>updateMyPage</title>

<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<style>
* {
	font-family: 'Spoqa Han Sans Neo', 'sans-serif';
}

a {
	color: black;
}

.category-selected {
	background-color: #A66129;
	color: white !important;
	font-weight: 500;
}



.category-unselected {
	color: #A66129 !important;
	font-weight: 500;
}

.category-btn>a {
	margin-left: 25px;
	
}

.category-btn {
	width: 100%;
	padding-right: 15px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
}

#update-btn {
	background-color: #A66129;
	color: white;
	font-size: medium;
	width: 40%;
	/* margin-left: 10%; */
	margin : auto;
}

.input-email {
	display: inline-block;
	width: 46%;
	margin-bottom: 0;
	float: left;
}

#email-at {
	display: inline-block;
	float: left;
	width: 8%;
	text-align: center;
	line-height: 38px;
}

h6 {
	font-weight: bold;
}

h4 {
	font-weight: bold;
}

hr {
	width: 66%;
	/* margin-left: 0; */
}

p {
	font-size: 11px;
}

/*#update{
            margin-left: 6%;
        }*/
#female {
	display: inline-block;
}

#male {
	display: inline-block;
}

#updateForm > div{
	margin-top : 30px;
}

.session-btn{
	float : right;
	color : gray; 
	opacity : 0.7;
}

#fileArea{
		display : none;
	}
	

   
  .boardImg{
  	cursor : pointer;
		width: 200px;
		height: 200px;
		border : 1px solid #ced4da;
		position : relative;
	}
	

	
	.boardImg > img{
		max-width : 100%;
		max-height : 100%;
		position: absolute;
		top: 0;
		bottom : 0;
		left : 0;
		right : 0;
		margin : auto;
	}
	


</style>

</head>

<body>


	<div class="container" id="content-main">
		<div class="category-btn" >
			<div style="padding: 10px;"></div>
			<h6 style="display: inline-block; font-weight: bold;">설정</h6>
			<a class="btn btn-light category-selected" href="${contextPath}/member/updateMyPage">내 정보 수정</a>
			<a class="btn btn-light category-unselected"  href="${contextPath}/member/changePwd">비밀번호 변경</a>
			<hr align="center" style="border: solid #b6957c; border-width: 1px 0px 0px 0px; width: 100%">

		</div>

		<div class="row my-5">

			<div class="col-md-8 offset-md-2">
				<h4 id="update" style="margin-left : 18%;">내 정보 수정</h4>
				<a class="session-btn" href="${contextPath}/member/secession">탈퇴하기</a>
				<div class="bg-white rounded shadow-sm container p-3">
					<form method="POST" action="" onsubmit="return updateMyPageValidate();" class="form-horizontal" role="form" id="updateForm">


						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>아이디</h6>
							</div>
							<div class="col-md-6">
								<h5 id="id">${loginMember.memberId }</h5>
							</div>
						</div>

						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>닉네임</h6>
								<p>*필수항목</p>
							</div>
							<div class="col-md-6">
								<input type="text " class="form-control" placeholder="${loginMember.memberNickname }" id="nickname" name="nickname">
							</div>


						</div>
						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>이메일</h6>
								<p>*필수항목</p>
							</div>
							<div class="col-md-6">
								<h5 id="email">${loginMember.memberEmail }</h5>
							</div>
						</div>


						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>프로필 이미지</h6>
							</div>
							<div class="mr-2 boardImg" id="contentImgArea1">
						<img id="contentImg1">
					</div>
						</div>
							<div id="fileArea">
					<input type="file" id="img0" name="img0" onchange="LoadImg(this,0)"> 
				</div>

						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>한줄 소개</h6>
							</div>
							<div class="col-md-6">
								<input type="text " class="form-control" id="intro" name="intro" placeholder="${loginMember.memberContent }">
							</div>
						</div>
						<div class="row my-6 form-row">
							<hr>
							<button class="btn btn-lg btn-block" type="submit" id="update-btn">내 정보 수정</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script>
	
	//닉네임 유효성 검사
	function updateMyPageValidate(){
		 const regExp =  /^[가-힣]{2,15}$/;

		    const nickname = $("#nickname").val().trim();

		    if(!regExp.test(nickname)){
		       swal({ "icon"  : "warning" ,
		    	   	  "title" : "닉네임이 유효하지 않습니다.",
		    	   	  "text"  : "한글 2~15자리이내로 작성해주세요."});
		       return false;
		    }
	// 한줄 소개 검사  
		    const regExp1 =  /^[가-힣]{1,20}$/;

		    const intro = $("#intro").val().trim();

		    if(!regExp1.test(intro)){
		       swal({ "icon"  : "warning" ,
		    	   	  "title" : "한줄소개가 유효하지 않습니다.",
		    	   	  "text"  : "한글 1~20자리이내로 작성해주세요."});
		       return false;
		    
	    }
	}
	
	
	</script>
</body>

</html>