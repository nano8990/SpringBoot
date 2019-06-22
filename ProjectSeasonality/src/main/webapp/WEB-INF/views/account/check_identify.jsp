<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계정 생성</title>
<style>
</style>
<link href="/static/css/account/check_identify.css" rel="stylesheet" />
</head>
<body>
	<input type="button" class="go_home" onclick = "location.href = '/'" value="홈 화면으로" />
	<div class="center">
		<form action="do_check_identify" method="post">
			<input type="text" id="keyNumber" name="key_number" placeholder="주민번호 6자리" class="a" required="required" />
			<input type="submit" class="btn" value="중복검사" />
		</form>
	</div>
</body>
</html>