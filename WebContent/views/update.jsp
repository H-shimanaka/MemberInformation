<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>会員情報更新画面</title>
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

		input[value="検索"]{width:15%;
				  			height:40px;
				  			background-color:#0066CC;
				  			color:white;
				  			margin-left:15%;
				  			border-width:1px;}

		div input{width:15%;
				  height:40px;
				  background-color:#0066CC;
				  color:white;
				  margin:0 1%;
				  border-width:1px;}
	</style>
</head>

<body>

	<form action="/MemberInformation/jp/co/aforce/controller/UpdateController" method="post">

		<b>会員情報更新</b>

		<ul>

			<li>会員番号<br>
				 <input type="text" name="member_id" value="${mb.member_id}">
				 <input type="submit" formmethod="get" value="検索"></li>

			<li>名前<br>
				姓 <input type="text" name="last_name" value="${mb.last_name}">
				名 <input type="text" name="first_name" value="${mb.first_name}"></li>

			<li>性別<br>
				<input type="radio" name="sex" value="男">男
				<input type="radio" name="sex" value="女">女</li>

			<li>生年月日<br>
				<select name="birth_year" id="birth_year"><option value=""></option></select> 年
				<select name="birth_month" id="birth_month"><option value=""></option></select> 月
				<select name="birth_day" id="birth_day"><option value=""></option></select> 日</li>

			<li>職業<br>
				<select name="job">
					<option value=""></option>
					<option value="会社員">会社員</option>
					<option value="自営業">自営業</option>
					<option value="学生">学生</option>
					<option value="その他">その他</option>
				</select></li>

			<li>電話番号<br>
				<input type="tel" name="phone_number" value="${mb.phone_number}"></li>

			<li>メールアドレス<br>
				<input type="text" name="mail_address" value="${mb.mail_address}"></li>
		</ul>

		<div>
			<input type="button" onclick="location.href='/MemberInformation/views/menu.jsp'" value="戻る">
			<input type="reset" value="リセット">
			<input type="submit" formmethod="post" value="更新">
		</div>

		<p>${errorMsg}</p>

	</form>

	<script src="${pageContext.request.contextPath}/js/script.js"></script>

</body>

</html>