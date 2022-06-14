<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/guestbook3/delete" method="post">
		<table>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pass"></td>
				<td><button type="submit">삭제</button></td>
				<td><a href="/guestbook3/addList">메인으로 돌아가기</a></td>
			</tr>
		</table>
		<input type='text' name="action" value="delete"><br>
		<input type='text' name="no" value="${no}"><br>
	</form>
</body>
</html>