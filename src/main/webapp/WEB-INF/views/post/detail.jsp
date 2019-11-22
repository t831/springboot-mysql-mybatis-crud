<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>제목 : ${post.title}</p>
<p>작성자 아이디: ${post.userId}</p>
<p>내용 : ${post.content}</p>
<br/>
<a href="/post/updateForm/${post.id}">수정하기</a>
<a href="/post/delete/${post.id}">삭제하기</a>
</body>
</html>