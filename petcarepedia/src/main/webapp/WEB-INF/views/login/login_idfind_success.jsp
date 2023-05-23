<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="http://localhost:9000/petcarepedia/images/foot_98DFFF.png" rel="shortcut icon" type="image/x-icon">
<title>펫캐어피디아 | 아이디,비밀번호 찾기</title>
<link rel="stylesheet" href="http://localhost:9000/petcarepedia/css/petcarepedia_song.css">
<script src="http://localhost:9000/petcarepedia/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/petcarepedia/js/petcarepedia_jquery_song.js"></script>

</head>
<body>
	<!-- header -->
	<jsp:include page="../header.jsp"></jsp:include>
	
	<!-- content -->
	<div class="content">
		<div class="find-content">
			<div class="content-logo">
				<img src="http://localhost:9000/petcarepedia/images/contentlogo.png" width="300px">
			</div>
			
			<div class="find-box">
				<div>
					<div id="btnMenuIdFind">아이디 찾기</div>
					<div id="btnMenuPwFind">비밀번호 재설정</div>
				</div>
				
				<ul>
					<li class="find-success">
						<p>회원가입 시 사용한 아이디는</p>
						<p id="id_sec"></p>
						<p>입니다.</p>
					</li>
					<li><button type="button" id="btnBackLogin" class="btn-submit">로그인 화면으로 돌아가기</button></li>
				</ul>
			</div>
		</div>
	</div>
	
	<!-- footer -->
	<jsp:include page="../footer.jsp"></jsp:include>
	
	<script>
		let id = "${mid}";
		let id_sec = id.substring(0,id.length/2) + '*'.repeat(id.length/2);
		document.getElementById("id_sec").innerHTML=id_sec;
	</script>
</body>
</html>