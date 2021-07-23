<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>회 원 가 입</h1>
			<div>			
				<form id="frm" name="frm" action="memberInsert.do" method="post">
					<div>
						<table border="1">
							<tr>
								<th width="150">아이디</th>
								<td width="400">
									<input type="text" id="id" name="id" placeholder="아이디 입력" required="required">
								</td>
							</tr>
							
							<tr>
								<th width="150">패스워드</th>
								<td width="400">
									<input type="password" id="password" name="password" placeholder="비밀번호 입력" required="required">
								</td>
							</tr>
							
							<tr>
								<th width="150">패스워드확인</th>
								<td width="400">
									<input type="password" id="passcheck" name="passcheck" placeholder="비밀번호 확인" required="required">
								</td>
							</tr>
							
							<tr>
								<th width="150">이 름</th>
								<td width="400">
									<input type="text" id="name" name="name" placeholder="이름 입력" required="required">
								</td>
							</tr>
							
							<tr>
								<th width="150">나 이</th>
								<td width="400">
									<input type="text" id="age" name="age" placeholder="나이 입력" required="required">
								</td>
							</tr>
							
							<tr>
								<th width="150">취  미</th>
								<td width="400">
									<input type="checkbox" id="hobbys" name="hobbys" value="등산">등산
									<input type="checkbox" id="hobbys" name="hobbys" value="헬스">헬스
									<input type="checkbox" id="hobbys" name="hobbys" value="낚시">낚시
									<input type="checkbox" id="hobbys" name="hobbys" value="운동">운동
									<input type="checkbox" id="hobbys" name="hobbys" value="독서">독서
								</td>
							</tr>
						</table>
					</div><br>
					<div>
						<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset" value="취 소">
					</div>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>