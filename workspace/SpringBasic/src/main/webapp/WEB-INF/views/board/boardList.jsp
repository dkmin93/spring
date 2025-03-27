<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--다음 화면을 처리하는 메서드를 컨트롤러에 생성하세요 --%>
	<h2>게시글 목록</h2>
	
	<table>
		<c:forEach var="vo" items="${list}" varStatus="status">
		<tr>
			<td>번호${status.index}</td>
			<td>작성자${vo.name}</td>
			<td>제목${vo.title}</td>
			<td>내용${vo.content}</td>
			<td>비고${vo.memo}</td>
			<td><input type="button" value="삭제" onclick="location.href='boardDelete?bno=${status.index}';"></td>
		</tr>
		</c:forEach>
	</table>
	
	<%--게시글 작성페이지로 이동시키세요. --%>
	<a href="boardRegist">게시글 작성</a>
	
</body>
</html>