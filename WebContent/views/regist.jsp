<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>会員情報登録画面</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

	<form  action="/MemberInformation/jp/co/aforce/controller/RegistController" method="post">

		<b>会員情報登録</b>

		<ul>
			<li>名前<br>
				姓 <input type="text" id="last_name" name="last_name" maxlength="20">
				名 <input type="text" id="first_name" name="first_name" maxlength="20"></li>

			<li>性別<br>
				<input type="radio" name="sex" value="1">男
				<input type="radio" name="sex" value="2">女</li>

			<li>生年月日<br>
				<select name="birth_year" id="birth_year"><option value=""></option></select> 年
				<select name="birth_month" id="birth_month"><option value=""></option></select> 月
				<select name="birth_day" id="birth_day"><option value=""></option></select> 日</li>

			<li>職業<br>
				<select id="job" name="job">
					<option value=""></option>
					<option value="100">会社員</option>
					<option value="200">自営業</option>
					<option value="300">学生</option>
					<option value="400">その他</option>
				</select></li>

			<li>電話番号<br>
				<input type="tel" id="phone_number" name="phone_number"></li>

			<li>メールアドレス<br>
				<input type="text" id="mail_address" name="mail_address"></li>
		</ul>

		<div>
			<input type="button" onclick="location.href='/MemberInformation/views/menu.jsp'" value="戻る">
			<input type="reset" value="リセット">
			<input type="submit" id="submit" value="登録">
		</div>

		<p>${errorMsg}</p>

	</form>

	<script src="${pageContext.request.contextPath}/js/regist.js"></script>

</body>

</html>