<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>
<link rel="stylesheet" href="resources/css/main.css">
</head>
<body>
	<div class="top_gnb_area">
				<ul class="list">
					<c:if test = "${member == null}">
		                <li>
		                    <a href="/member/login">로그인</a>
		                </li>
		                <li>
		                    <a href="/member/join">회원가입</a>
		                </li>
		             </c:if>
		             
		             <c:if test="${member != null }">
	                                    
			             <c:if test="${member.adminCk == 1}">
	                        <li><a href="/admin/main">관리자 페이지</a></li>
	                     </c:if>
	                    
	                    <li>
	                      	  <a id="gnb_logout_button">로그아웃</a>
	                    </li>
	                    <li>
	                      	  마이룸
	                    </li>
	                    <li>
	                       	 장바구니
	                    </li>
                	</c:if>    
	                <li>
                   		고객센터
                	</li>            
            	</ul>    
			</div>
</body>
</html>