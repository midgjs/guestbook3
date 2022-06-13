<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/guestbook3/add" method="get">
		<table border="1" width="510px">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="4"><textarea name="content" cols="68" rows="5"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><button type="submit">등록</button></td>
			</tr>
		</table>
		<input type="hidden" name="action" value="add">
	</form>
	<br>

	<c:forEach items="${guestbookList}" var="guestbookVo">
		<table border="1" width="510px">
			<tr>
				<td>guestbookVo.no</td>
				<td>guestbookVo.name</td>
				<td>guestbookVo.regDate</td>
				<td><a href="./deleteForm/${guestbookVo.no}">삭제</a></td>
			</tr>
			<tr>
				<td colspan="4"></td>
			</tr>
		</table>
		<br>
	</c:forEach>
</body>
</html>