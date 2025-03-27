<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

	<script>
		//이런 느낌으로 접근할 수 있다
		var msg = '${msg }';
		if(msg != '') {
			alert(msg);
		}
	</script>
	
</body>
</html>
