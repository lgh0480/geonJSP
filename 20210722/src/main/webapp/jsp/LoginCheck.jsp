<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리 결과</title>
</head>
<body>
<%--el 표현식 --%>
넘어온 아이디 : ${param.id }
넘어온 패스워드 : ${param.password }
	<%
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name= null;
		String msg = null;
		
		if(id.equals("hong") && password.equals("1234")){
			name ="홍길동";
			msg = name + "님 환영합니다.";
		}else{
			msg = "아이디 또는 패스워드가 맞지 않습니다 다시 확인해주세요";
		}
		
	%>
	<div align="center">
		<h1><%= msg %></h1> <%--표현식 --%>
		<a href="../index.jsp">홈 가기</a>
	</div>
</body>
</html>