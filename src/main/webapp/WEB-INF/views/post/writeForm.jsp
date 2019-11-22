<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>writeForm</title>
</head>
<body>
<form action="/post/save" method="post">
	<input type="text" name="title" placeholder="제목을 적어주세요" /> <br/>
	<textarea name="content" rows="5" cols="20" placeholder="내용을 적어주세요"></textarea><br/>
	<input type="submit" value="작성" />
</form>
</body>
</html>