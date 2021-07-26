<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지글 상세보기 </title>
</head>
<body>
	<div align ="center">
			<div>
				<h1>게시글 상세보기 </h1>
			</div>
			<div>
				<table border="1">
					<tr>
						<th width="100">글번호</th>
						<td width="70" align="center">${board.bId }</td>
						<th width="100">작성자</th>
						<td width="150" align="center">${board.bWriter }</td>
						<th width="100">작성일자</th>
						<td width="150" align="center">${board.bDate }</td>
						<th width="100">조회수</th>
						<td width="70" align="center">${board.bHit }</td>
						
					</tr>
					<tr>
						<th width="100">글제목</th>
						<td colspan= "7">${board.bTitle }</td>
					</tr>
					<tr>
						<th width="100">내용</th>
						<td colspan="7"> 
							<textarea rows="7" cols="110">${board. bContent }</textarea>
						</td>
					</tr>
				</table>
			</div>
			<div>
			<br/>
			<button type="button" onclick="location.href='boardList.do'">뒤로</button> &nbsp;&nbsp;&nbsp;
			<button type="button" onclick="update()">수정</button>	&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="location.href='deleteForm.do'">삭제</button>	&nbsp;&nbsp;&nbsp;
			</div>
	</div>
	<!-- 수정  -->
	<div>
		<form id="updatefrm" name="updatefrm" action="updateForm.do" method="post">
			<input type="hidden" id ="ubId" name="ubId" value='${board.bId }'>
			<input type="hidden" id ="uTitle" name="uTitle" value='${board.bTitle }'>
			<input type="hidden" id ="uContent" name="uContent" value='${board.bContent }'>
		</form>
		<script type="text/javascript">
			function update(){
				updatefrm.submit();
			}
		</script>
	</div>
</body>
</html>