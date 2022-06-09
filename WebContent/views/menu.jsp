<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>メニュー画面</title>
	<style type="text/css">
		form{width:70%;
			 height:90%;
			 border:solid 0.5px black;
			 padding:2.5% 2.5%;}

		b{font-size:20px;}

		div{text-align:center;
			margin:10% 0;}

		input{width:40%;
			  height:40px;
			  background-color:#0066CC;
			  color:white;
			  margin:2% 0;
			  border-width:1px;}

	</style>
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