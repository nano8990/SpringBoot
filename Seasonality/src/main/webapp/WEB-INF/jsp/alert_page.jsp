<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Alert Page</title>
</head>
<script src="/static/js/alert_page.js"></script>
<body>
</body>
<script>
var message = "${message}";
var url = "${url}";
if (message != "") {
	alert(message);
}
if (url != "") {
	document.location.href = url;
}
</script>
</html>