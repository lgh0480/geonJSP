<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈</title>
</head>
<body>
	<%--최근에는 이렇게 사용 --%>
	<%-- <jsp:forward page="main.do"/>--%>
	<%
		response.sendRedirect("jsp/main.jsp");
	%>
</body>
</html>