<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/menu.css">
</head>
<body>
	<div align="center">
		<div>	<!-- 메뉴부분 -->
    		<ul>
     			<li><a class="active" href="home.do">Home</a></li>
     			<c:if test="${empty name }">
      			<li><a href="loginForm.do">Login</a></li>
      			</c:if> <!-- 로그인을 했을때 나타내는 것들 -->
      			<c:if test="${not empty name }">
      				<li><a href="logout.do">LogOut</a></li>
      				<li><a href="#contact">Contact</a></li>
      				<li><a href="#about">About</a></li>
      				<li><a href="#about">Product</a></li>
      				<li><a href="#about">Service</a></li>
      				<c:if test="${author eq 'ADMIN' }">
      					<li><a href="#about">Members</a></li> <!-- 관리자가 로그인 했을때 권한->어드민 -->
      				</c:if>
      			</c:if>
      			
    		</ul>
		</div>
		
	</div>
</body>
</html>