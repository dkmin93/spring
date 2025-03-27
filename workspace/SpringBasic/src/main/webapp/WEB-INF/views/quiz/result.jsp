<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	
	리다이렉션 된 페이지<br>
	${msg }
	
	
	<script>
		var msg = '${msg}';
		
		if(msg != '') {
			alert(msg);
		}
	</script>
	
	
</body>
</html>