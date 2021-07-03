<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

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
				<div class="bg-white rounded shadow-sm container p-3">
					<form method="POST" action="" onsubmit="return pwdValidate();" class="form-horizontal" role="form" id="updateForm">


						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>아이디</h6>
							</div>
							<div class="col-md-6">
								<input type="password" class="form-control" placeholder="userid" id="userid" name="userid">
							</div>
						</div>

						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>닉네임</h6>
								<p>*필수항목</p>
							</div>
							<div class="col-md-6">
								<input type="password" class="form-control" placeholder="유저닉네임" id="nickname" name="nickname">
							</div>


						</div>
						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>이메일</h6>
								<p>*필수항목</p>
							</div>
							<div class="col-md-6">
								<input type="email" class="form-control input-email" id="email-id" name="email" placeholder="이메일" autocomplete="off" required> <span id="email-at">@</span> <input type="email" class="form-control input-email" id="email-address" name="email" autocomplete="off" required>
							</div>
						</div>


						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>프로필 이미지</h6>
							</div>
							<div class="col-md-6">
								<input type="password" class="form-control" id="newPwd2" name="newPwd2">
							</div>
						</div>


						<div class="row my-6 form-row">
							<div class="col-md-2 offset-md-2">
								<h6>한줄 소개</h6>
							</div>
							<div class="col-md-6">
								<input type="password" class="form-control" id="newPwd2" name="newPwd2">
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
</body>

</html>