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
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value=""></td>
				<td>비밀번호</td>
				<td><input type="password" name="password" value=""></td>
			</tr>
			<tr>
				<td colspan="4"><textarea name="content" cols="68" rows="5"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><button type="submit">등록</button></td>
			</tr>
		</table>
	</form>
	<br>

	<c:forEach items="${guestbookList}" var="guestbookVo">
		<table border="1">
			<tr>
				<td>guestbookVo.no</td>
				<td>guestbookVo.name</td>
				<td>guestbookVo.regDate</td>
				<td><a href="/guestbook3/deleteForm/${guestbookVo.no}">[삭제]</a></td>
			</tr>
			<tr>
				<td colspan="4" class="text-left">${guestbookVo.content}</td>
			</tr>
		</table>
		<br>
	</c:forEach>
</body>
</html>