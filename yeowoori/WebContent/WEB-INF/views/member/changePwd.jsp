<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>

<style>
#btn-change {
	background-color: #A66129;
	color: white;
	font-size: medium;
}

label {
	font-weight: bold;
}

p {
	font-size: small;
}

* {
	font-family: 'Spoqa Han Sans Neo', 'sans-serif';
}

a {
	color: black;
}

.category-selected {
	background-color: #A66129;
	color: white;
	font-weight: 500;
}

.category-unselected {
	color: #A66129;
	font-weight: 500;
}

.category-btn>button {
	margin-left: 25px;
}

.category-btn {
	width: 100%;
	padding-right: 15px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
}

#h4-change {
	font-weight: bold;
}
</style>
</head>
<body>

	<form class="category-btn" action="#" method="GET">
		<div style="padding: 10px;"></div>
		<h6 style="display: inline-block; font-weight: bold;">설정</h6>
		<button class="btn btn-light category-unselected" name="category"
			value="내 정보 수정">내 정보 수정</button>
		<button class="btn btn-light category-selected" name="category"
			value="비밀번호 변경">비밀번호 변경</button>
		<hr align="center"
			style="border: solid #b6957c; border-width: 1px 0px 0px 0px; width: 100%">
		<div style="padding: 20px"></div>
	</form>

	<div class="container" id="content-main">

		<div class="row my-5">

			<div class="col-md-5 offset-md-3">
				<h4 id="h4-change">&nbsp; 비밀번호 변경</h4>

				<div class="bg-white rounded shadow-sm container p-3">
					<form method="POST" action="changePwd"
						onsubmit="return pwdValidate();" class="form-horizontal"
						role="form">


						<div>
							<label for="pwd1">현재 비밀번호</label>
						</div>
						<div class="row mb-3 form-row">
							<input type="password" class="form-control" id="currentpwd"
								name="pwd1" maxlength="20" required>
						</div>
						<div class="col-md-6 offset-md-3">
							<span>&nbsp;</span>
						</div>

						<div>
							<label for="pwd1">새 비밀번호</label>
							<p>영어 소문자, 대문자, 특수문자 포함(8~12자)</p>
						</div>
						<div class="row mb-3 form-row">
							<input type="password" class="form-control" id="newpwd1"
								name="pwd1" maxlength="20" required>
						</div>

						<div class="col-md-6 offset-md-3">
							<span>&nbsp;</span>
						</div>

						<div>
							<label for="pwd1">새 비밀번호 확인</label>
						</div>
						<div class=" form-row">
							<input type="password" class="form-control" id="newpwd2"
								name="pwd1" maxlength="20" required>
						</div>




						<hr>
						<button class="btn btn-lg btn-block" id="btn-change" type="submit">비밀번호
							변경</button>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>