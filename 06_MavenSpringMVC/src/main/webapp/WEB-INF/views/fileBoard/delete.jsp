<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var = "root" value = "${pageContext.request.contextPath}"/>
<html>
<head>
<meta charset="UTF-8">
<title>파일보드 삭제 페이지</title>
</head>
<body>
	<div align="center">
		<form action="${root}/fileboard/deleteOk.do" method="post">
			<input type="hidden" name="boardNumber" value="${boardNumber}"/>
			<input type="hidden" name="pageNumber" value="${pageNumber}"/>
			
			<div>비밀번호를 입력해주세요.</div>
			<div>
				<input type="password" name="password"/>
			</div>
			<div>
				<input type="submit" value="글삭제"/>
				<input type="button" value="목록보기" onclick="location.href='${root}/fileboard/list.do?pageNumber=${pageNumber}'"/>
			</div>
		</form>
	</div>
</body>
</html>