<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>会員情報登録画面</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
	<style type="text/css">
		form{width:70%;
			 height:90%;
			 border:solid 0.5px black;
			 padding:2.5% 2.5%;}

		b{font-size:20px;}

		li{list-style:square;
		   margin:15px 0;}

		div{margin:5% 0;
			text-align:center;}

		select{width:15%;}

		div input{width:15%;
				  height:40px;
				  background-color:#0066CC;
				  color:white;
				  margin:0 1%;
				  border-width:1px;}
	</style>
</head>

<body>

	<form  action="/MemberInformation/jp/co/aforce/controller/RegistController" method="post">

		<b>会員情報登録</b>

		<ul>
			<li>名前<br>
				姓 <input type="text" name="last_name" required> 名 <input type="text" name="first_name" required></li>

			<li>性別<br>
				<input type="radio" name="sex" value="男" required>男
				<input type="radio" name="sex" value="女" required>女</li>

			<li>生年月日<br>
				<select name="birth_year" id="birth_year" required><option value=""></option></select> 年
				<select name="birth_month" id="birth_month" required><option value=""></option></select> 月
				<select name="birth_day" id="birth_day" required><option value=""></option></select> 日</li>

			<li>職業<br>
				<select name="job" required>
					<option value=""></option>
					<option value="会社員">会社員</option>
					<option value="自営業">自営業</option>
					<option value="学生">学生</option>
					<option value="その他">その他</option>
				</select></li>

			<li>電話番号<br>
				<input type="tel" name="phone_number" required></li>

			<li>メールアドレス<br>
				<input type="text" name="mail_address" required></li>
		</ul>

		<div>
			<input type="button" onclick="location.href='/MemberInformation/views/menu.jsp'" value="戻る">
			<input type="reset" value="リセット">
			<input type="submit" value="登録">
		</div>

		<p>${errorMsg}</p>

	</form>

	<script src="${pageContext.request.contextPath}/js/script.js"></script>

</body>

</html>