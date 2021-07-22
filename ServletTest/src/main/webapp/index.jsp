<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ServletTest index.jsp</title>
</head>
<body>
	<h1>여기가 시작이야! ㅋㅋ</h1>
	<h1><a href="./HelloWorld?id=hong">서블릿 호출</a></h1>
	<!-- ?id=hong get방식 -->
	
	<form id="frm" name="frm" method="get" action="HelloWorld">
		<input type="submit" value="전송">
	</form>
</body>
</html>