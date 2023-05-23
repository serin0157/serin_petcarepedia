<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="http://localhost:9000/petcarepedia/images/foot_98DFFF.png" rel="shortcut icon" type="images/x-icon">
<title>result</title>
<link rel="stylesheet" href="http://localhost:9000/petcarepedia/css/search_result.css">

<script src="http://localhost:9000/petcarepedia/js/jquery-3.6.4.min.js"></script>
<script src="http://localhost:9000/petcarepedia/js/search_result.js"></script>
	
</head>

<body>
	<!-- header -->
	<!-- <iframe width="100%" height="100px"></iframe> -->
	<div class="header-wrapper">
		<jsp:include page="../header.jsp"></jsp:include>	
	</div>
	
	
	<!-- content -->
	<div class="result_main">
		<section class="info">
			<div class="info_d">
				<div class="images_d">
					<img src="${hospital.img}">
				</div>
				
				<div class="name_d">
					<div class="area_d">
						<a href="http://localhost:9000/petcarepedia/search/search_main.do">서울</a>
						<span>></span>
						<a href="http://localhost:9000/petcarepedia/search/search_main.do">${hospital.gloc}</a>
					</div>
					
					<span class="name">${hospital.hname}</span>
					<input type="hidden" name="hid" value="${hospital.hid}">
					<input type="hidden" name="hid" value="${hospital.hname}">
					<span class="grade">⭐ 5.0 | 리뷰 60</span>
					
					<button type="button" id="reservation"><img src="http://localhost:9000/petcarepedia/images/cal.png">간편 예약하기
								&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp></button>
					<div id="hmodal" class="modal">
					  <div class="modal-content">
					    <span class="close">&times;</span>
					    <iframe src="http://localhost:9000/petcarepedia/search/search_reservation.do" 
					     width="500px" height="500px" frameborder=0></iframe>
					  </div>
				  	</div>
					
					
					<div class="buttons">
						<button type="button" id="review"><img src="http://localhost:9000/petcarepedia/images/review.png">리뷰하기</button>
						<!-- <button type="button" id="share"><img src="http://localhost:9000/petcarepedia/images/share.png">공유하기</button> -->
						<button type="button" id="like"><img src="http://localhost:9000/petcarepedia/images/like.png">찜하기</button>
					</div>
				</div>
				
				<hr>
				
				<div class="link">
					<span><img src="http://localhost:9000/petcarepedia/images/loc.png">${hospital.loc}</span>
					<span><img src="http://localhost:9000/petcarepedia/images/home.png"><a href="${hospital.hrink}">병원 홈페이지 가기</a></span>
					<span><img src="http://localhost:9000/petcarepedia/images/call.png">${hospital.tel}</span>
				</div>
				
				<hr>
				
				<div class="nav">
					<span id="info_s">병원정보</span>
					<span id="review_s">리뷰</span>
				</div>
				
				<hr>
				
				<div class="api_info">
					<div class="api">
						<span>병원정보</span>
						<span>위치 & 진료시간</span>
						<!-- <div class="map"> -->
							<iframe class="map" src="http://localhost:9000/petcarepedia/search_map.do"
							scrolling="no" width="350px" height="285px" frameborder=0></iframe>
						<!-- </div> -->
						<span>${hospital.loc}</span>
					</div>
					
					<div class="time">
						<ul>
							<li>영업시간</li>
							<li>야간 휴진 여부</li>
							<li>휴일 휴진 여부</li>
							<li>특수동물 취급 여부</li>
							<li>소개</li>
						</ul>
						
						<ul>
							<li>${hospital.htime}</li>
							<li>${hospital.ntime}</li>
							<li>${hospital.holiday}</li>
							<li>${hospital.animal}</li>
							<li>${hospital.intro}</li>
						</ul>
					</div>
				</div>
				
				<hr>
			</div>
		
		</section>
		
		<section class="review">
			<div class="list">
				<div class="grade">
					<span>리뷰 60</span>
					
					<div class="total">
						<span>5.0 / 5</span>
						<span> ⭐ ⭐ ⭐ ⭐ ⭐</span>
					</div>
				</div>
				
				<!-- <div class="filter">
					<span>동물종류</span>
					<div class="dropdown-content">
						<p>기본정렬</p>
						<p>강아지</p>
						<p>고양이</p>
						<p>파충류</p>
						<p>기타</p> 
					</div>
					
					<span>기본정렬</span>
					<div class="dropdown-content">
						 <p>기본정렬</p>
						 <p>좋아요 많은 순서</p>
						 <p>평점 높은 순서</p>
						 <p>평점 낮은 순서</p>
					</div>
				</div> -->
				
				<div class="review_card">
					<div class="member">
						<div class="name">
							<img src="http://localhost:9000/petcarepedia/images/cat.png">
							<span>과테말라 냥이</span>
						</div>
						
						<hr class="member_hr">
						<span class="stext">⭐ 5 / 5</span>
						<hr class="member_hr">
						<!-- <span>친절  ⭐⭐⭐⭐⭐</span>
						<span>위생  ⭐⭐⭐⭐⭐</span> -->
						<span class="stot">별점  ⭐⭐⭐⭐⭐</span>
					</div>
					
					<div class="write">
						<h3>동물 종류 : 고양이</h3>
						<p>리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가리뷰내용거참우리고양이가</p>
					</div>
					
					<div class="date">
						<span>작성 일자 : 2023-04-28</span>
						<span>진료 일자 : 2023-04-26</span>
						<button id="like">좋아요&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp❤️ 100</button>
						<span><a href="http://www.naver.com">신고하기</a></span>
					</div>
				</div>
			</div>
		</section>	
	</div>	

	
	<!-- footer -->
	<iframe width="100%" height="100px"></iframe>
	<jsp:include page="../footer.jsp"></jsp:include>	
</body>
</html>