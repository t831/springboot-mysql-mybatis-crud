<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updateForm</title>
</head>
<body>
<form action="/post/update" method="post">
	<input type="hidden" value="${post.id}" name="id" />
	<input type="text" name="title" value="${post.title}"/><br/>
	<textarea name="content" rows="5" cols="20">
	${post.content}
	</textarea><br/>
	<input type="submit" value="수정" />
</form>
</body>
</html>