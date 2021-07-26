<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align ="center">
		<form id="frm" name="frm" action="updateBoard.do" method="post">
			<div>
				<h1>게시글 상세보기 </h1>
			</div>
			<div>
				<table border="1">
					<tr>
						<th width="100">글번호</th>
						<td width="70" align="center">${bId }
						<input type="hidden" id="bId" name="bId" value='${bId }'></td>
					</tr>
					<tr>
						<th width="100">글제목</th>
						<td><input type="text" id="bTitle" name="bTitle" value='${bTitle }'> </td>
					</tr>
					<tr>
						<th width="100">내용</th>
						<td> 
							<textarea rows="7" cols="110" id="bContent" name="bContent">${bContent }</textarea>
						</td>
					</tr>
				</table>
			</div>
			<div>
			<br/>
			<button type="button" onclick="location.href='boardList.do'">뒤로</button> &nbsp;&nbsp;&nbsp;
			<input type="submit" value="수정">	&nbsp;&nbsp;&nbsp;
			</div>
		</form>
	</div>
		
</body>
</html>