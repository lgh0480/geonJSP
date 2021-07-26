<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 입력</title>
</head>
<body>
	<div align ="center">
			<div>
				<h1>게시글 상세보기 </h1>
			</div>
			<div>
			<form id="frm" name="frm" action="insertBoard.do" method="post">
				<div>
				<table border="1">
					<tr>
						
						<th width="100">작성자</th>
						<td width="150" >
							<input type="text" id="bWriter" name="bWriter" required="required">
						</td>
						<th width="100">작성일자</th>
						<td width="150" align="center"><input type="date" id="bdate" name="bdate"></td>
					</tr>
					<tr>
						<th width="100">글제목</th>
						<td colspan= "3"><input type="text" id="bTitle" name="bTitle" size="30" required="required"></td>
					</tr>
					<tr>
						<th width="100">내용</th>
						<td colspan="3"> 
							<textarea rows="7" cols="60" id="bContent" name="bContent" required="required" placeholder="여기에 내용을 써 주세요."></textarea>
						</td>
					</tr>
				</table>
			</div><br/>
			<div>
				<button type="submit" onclick="location.href='boardInsert.do'">등록</button>&nbsp;&nbsp;&nbsp;
				<button type="reset" >취소</button>	&nbsp;&nbsp;&nbsp;
				<button type="button" onclick="location.href='boardList.do'">목록 가기</button>
			</div>
		</form>
		</div>
	</div>
</body>
</html>