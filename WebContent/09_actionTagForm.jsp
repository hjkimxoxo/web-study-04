<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="actionTag">
아이디: <input type="text" name="userID"><br>
암호: <input type="password" name="userPW"><br>
<input type="radio" name="loginCheck" value="user" checked="checked">사용자
<input type="radio" name="loginCheck" value="manager" checked="checked">관리자
<input type="submit" value="로그인">
</form>
</body>
</html>