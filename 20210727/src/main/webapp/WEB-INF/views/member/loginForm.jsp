<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm 영역</title>
</head>
	<jsp:include page="../home/header.jsp"/>
<body>
	<div align="center">
		<h1> 로 그 인</h1>
		<div>
			<form id="frm" action="login.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="150">아 이 디</th>
							<td width="200">
								<input type="text" id="id" name="id" placeholder="아이디입력" required="required">
						</tr>
						<tr>
							<th width="150">비밀번호</th>
							<td width="200">
								<input type="password" id="password" name="password" placeholder="비밀번호 입력" required="required">
						</tr>
						
					</table>
				</div><br/>
					<div>
						<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;
						<input type="reset" value="취소">
					</div>
			</form>
		</div>
	</div>
</body>
</html>