<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:9000/petcarepedia/css/petcarepedia_song.css">
</head>
<body>
    <header>
        <div class="header-menu">
            <div class="header-content">
                <a href="http://localhost:9000/petcarepedia/index.do">
                    <div class="header-logo">
                        <img src="http://localhost:9000/petcarepedia/images/logo_white.png" width="60px" height="60px">
                        <span>PetCare Pedia</span>
                    </div>
                </a>
                
                <form name="headerSearchForm" action="searchProc.jsp" method="post">
                    <div class="header-search">
                        <div>
                            <input type="text" placeholder="키워드를 검색해보세요!">
                            <button type="button"><img src="http://localhost:9000/petcarepedia/images/foot_98DFFF.png" width="30px" height="30px"></button>
                        </div>
                    </div>
                </form>
                
                <div class="header-nav">
                    <ul>
                        <li>
                            <a href="http://localhost:9000/petcarepedia/search_main.do">병원검색</a>
                        </li>
                        <li>
                            <a href="http://localhost:9000/petcarepedia/review_main.do">리뷰사전</a>
                        </li>
                        <li>
                            <a href="http://localhost:9000/petcarepedia/login.do">로그인</a>
                        </li>
                        <li>
                            <a href="http://localhost:9000/petcarepedia/join.do">회원가입</a>
                        </li>
                        <li>
                            <a href="http://localhost:9000/petcarepedia/information.do?mid=hong">마이페이지</a>
                        </li>
                        <li>
                            <a href="#">로그아웃</a>
                        </li>
                        <li>
                            <a href="http://localhost:9000/petcarepedia/admin_notice.do">공지사항</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
</body>
</html>