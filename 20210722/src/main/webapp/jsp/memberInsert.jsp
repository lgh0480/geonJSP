<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<%
		request.setCharacterEncoding("utf-8");
	
		String id =request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		int age = Integer.valueOf(request.getParameter("age"));
		String[] hobbys = request.getParameterValues("hobby");
		
	%>
<body>
		<%--el 표현식 
	<div align="center">
		<div><h1>회원가입내역</h1></div>
		<div>
			<h3>아이디: ${param.id }</h3>
			<h3>패스워드: ${param.password }</h3>
			<h3>이름: ${param.name }</h3>
			<h3>나이: ${param.age }</h3>
			<h3>취미: ${params.hobby[0] }</h3>
		</div>
	</div>
	--%>
	<div><h1>회원가입내역</h1></div>
		<div>
			<h3>아이디: <%= id %></h3>
			<h3>패스워드: <%= password %></h3>
			<h3>이름: <%= name %></h3>
			<h3>나이: <%= age %></h3>
			<h3>취미: <%= hobbys[0] %> </h3>
		</div>
	
</body>
</html>