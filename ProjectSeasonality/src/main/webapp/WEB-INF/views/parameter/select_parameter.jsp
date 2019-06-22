<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Select Parameter</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="/static/js/parameter/select_parameter.js"></script>
</head>
<body>
	<h1>Select Parameter</h1>
	<form action="do_select" method="get">
		REGIONID<br />
		<span id="spanRegionId">
			<input type="text" name="region_id" onChange="changeRegionId()" placeholder="REGIONID" /><br />
		</span>
		<br />
		PRODUCT<br />
		<span id="spanProduct">
			<input type="text" name="product" onChange="changeProduct()" placeholder="PRODUCT" /><br />
		</span>
		<br />
		YEARWEEK<br />
		<input type="text" name="yearweek_start" placeholder="YEARWEEK START" /> ~ <input type="text" name="yearweek_end" placeholder="YEARWEEK END" /><br />
		<br />
		QTY<br />
		<input type="text" name="qty_up" placeholder="QTY UP" /> ~ <input type="text" name="qty_down" placeholder="QTY DOWN" /><br />
		<br />
		<input type="submit" value="Search">
	</form>
</body>
</html>