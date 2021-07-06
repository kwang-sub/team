<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/common/header.jsp"></jsp:include>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>secession</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

<style>
.col-xs-12 {
	border: 1px solid gray;
}


a:hover{
text-decoration : none;
color : black;}


#cancel-btn {
	background-color: #A66129;
	color: white;
	font-size: medium;
	width: 40%;
	display: inline-block;
	margin-top :0;
	
}

#secession-btn {
	background-color: gray;
	opacity: 0.7;
	color: black;
	font-size: medium;
	width: 40%;
	display: inline-block;
	margin-left : 60px;
}

#classform{
	margin-left:15%;
}
</style>
</head>
<body>
	<div class="container" id="content-main">

		<div class="row my-5">

			<div class="col-sm-offset-2 col-sm-8" id="classform">
				<h4>회원 탈퇴 신청</h4>
				<p>회원 탈퇴 신청에 앞서 아래 내용을 반드시 확인해주세요.</p>
				<form method="POST" action="secession" onsubmit="return secessionValidate();" class="form-horizontal" role="form">
					<div class="bg-white rounded shadow-sm container p-3">

						<div class="panel panel-default">

							<div class="panel-body">
								<div class="form-group pull-left">
									<label class="control-label"> 회원 탈퇴 약관 </label>
									<div class="col-xs-12">
										<textarea class="form-control" readonly rows="10" cols="100">
제1조
이 약관은 샘플 약관입니다.

① 약관 내용 1

② 약관 내용 2

③ 약관 내용 3

④ 약관 내용 4


제2조
이 약관은 샘플 약관입니다.

① 약관 내용 1

② 약관 내용 2

③ 약관 내용 3

④ 약관 내용 4
</textarea>
									</div>
									<div class="checkbox pull-right">
										<div class="custom-checkbox">
											<div class="form-check">
												<input type="checkbox" name="agree" id="agree" class="form-check-input custom-control-input" required> <br> <label class="form-check-label custom-control-label" for="agree">위 내용을 모두 확인하였습니다. </label>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
				</div>

				<br>
				<div class="bg-white rounded shadow-sm container p-3">
					<p>여기우리 여행우리 커뮤니티에서 탈퇴하려는 이유가 무엇인가요? (복수 선택 가능)</p>



					<div class="panel panel-default">

						<div class="panel-body">
							<div class="form-group pull-left">

								<div class="col-xs-12">
								 	&nbsp;<input type="checkbox" id="reason1" name="reason"> <label for="reason1" >이유1</label> <br> 
								    &nbsp;<input type="checkbox" id="reason2" name="reason"> <label for="reason2">이유2</label> <br>
									&nbsp;<input type="checkbox" id="reason3" name="reason"> <label for="reason3">이유3</label> <br> 
									&nbsp;<input type="checkbox" id="reason4" name="reason"> <label for="reason4">이유4</label> <br> 
									&nbsp;<input type="checkbox" id="reason5" name="reason"> <label for="reason5">이유5</label> <br> 
									&nbsp;<input type="checkbox" id="reason6" name="reason"> <label for="reason6">이유6</label> <br> 
									&nbsp;<input type="checkbox" id="reason7" name="reason"> <label for="reason7">이유7</label> <br>


								</div>
								<div class="checkbox pull-right">
									<div class="custom-checkbox">
										<div class="form-check"></div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
				<br>

				<button class="btn btn-sm btn-block" id="secession-btn" type="submit">탈퇴 신청</button>
				<%-- <button class="btn btn-sm btn-block" id="cancel-btn" ><a href="${contextPath }/member/updateMyPage"  >취소하기</a></button> --%>
				<a class="btn btn-sm btn-block" href="${contextPath }/member/updateMyPage" id="cancel-btn" >취소하기</a>
			</form>

			</div>
		</div>
		</div>

	<script>
		function secessionValidate(){

		   if( $("input[name='reason']:checked").length == 0){
		      alert("이유를 선택해주세요");
		      return false;
		   }
		}
	
	</script>

</body>
</html>