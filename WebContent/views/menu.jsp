<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>メニュー画面</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/menu.css">
</head>

<body>

	<form>

		<b>メニュー画面</b>

		<div>
			<input type="button" onclick="location.href='/MemberInformation/views/regist.jsp'" value="会員情報登録"><br>
			<input type="button" onclick="location.href='/MemberInformation/views/update.jsp'" value="会員情報更新"><br>
			<input type="button" onclick="location.href='/MemberInformation/views/delete.jsp'" value="会員情報削除">
		</div>

	</form>

</body>

</html>