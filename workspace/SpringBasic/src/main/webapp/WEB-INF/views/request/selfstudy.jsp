<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="signup" method="post">
		id:<input type="text" name="id"><br>
		pw:<input type="password" name="pw"><br>
		name:<input type="text" name="name"><br>
		interesting:
		운동<input type="checkbox" name="inter" value="운동">
		게임<input type="checkbox" name="inter" value="게임">
		독서<input type="checkbox" name="inter" value="독서"><br>
		<input type="submit" value="제출">
	</form>

</body>
</html>