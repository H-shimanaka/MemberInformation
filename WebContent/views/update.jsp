<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>会員情報更新画面</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

	<form action="/MemberInformation/jp/co/aforce/controller/UpdateController" method="post">

		<b>会員情報更新</b>

		<ul>

			<li>会員番号<br>
				<input type="text" id="member_id" name="member_id" value="${mb.member_id}">
				<input type="submit" id="search" formmethod="get" value="検索"></li>

			<li>名前<br>
				姓 <input type="text" id="last_name" name="last_name" maxlength="20" value="${mb.last_name}">
				名 <input type="text" id="first_name" name="first_name" maxlength="20" value="${mb.first_name}"></li>

			<li>性別<br>
				<c:choose>
				<c:when test="${mb.sex == '男'}">
				<input type="radio" name="sex" value="1" checked>男
				<input type="radio" name="sex" value="2">女
				</c:when>
				<c:when test="${mb.sex == '女'}">
				<input type="radio" name="sex" value="1">男
				<input type="radio" name="sex" value="2" checked>女
				</c:when>
				<c:otherwise>
				<input type="radio" name="sex" value="1">男
				<input type="radio" name="sex" value="2">女
				</c:otherwise>
				</c:choose></li>

			<li>生年月日<br>
				<select name="birth_year" id="birth_year">
					<option value=""></option>
					<c:if test="${not empty mb.birth_year}">
						<option value = "${mb.birth_year}" selected>${mb.birth_year}(設定値)</option>
					</c:if>
				</select> 年
				<select name="birth_month" id="birth_month">
					<option value=""></option>
					<c:if test="${not empty mb.birth_month}">
						<option value = "${mb.birth_month}" selected>${mb.birth_month}(設定値)</option>
					</c:if>
				</select> 月
				<select name="birth_day" id="birth_day">
					<option value=""></option>
					<c:if test="${not empty mb.birth_day}">
						<option value = "${mb.birth_day}" selected>${mb.birth_day}(設定値)</option>
					</c:if>
				</select> 日</li>

			<li>職業<br>
				<select id="job" name="job">
					<option value=""></option>
					<option value="100">会社員</option>
					<option value="200">自営業</option>
					<option value="300">学生</option>
					<option value="400">その他</option>
					<c:if test="${not empty mb.job}">
						<c:choose>
							<c:when test="${mb.job == '会社員'}">
								<option value="100" selected>会社員(設定値)</option>
							</c:when>
							<c:when test="${mb.job == '自営業'}">
								<option value="200" selected>自営業(設定値)</option>
							</c:when>
							<c:when test="${mb.job == '学生'}">
								<option value="300" selected>学生(設定値)</option>
							</c:when>
							<c:when test="${mb.job == 'その他'}">
								<option value="400" selected>その他(設定値)</option>
							</c:when>
						</c:choose>
					</c:if>
				</select></li>

			<li>電話番号<br>
				<input type="tel" id="phone_number" name="phone_number" maxlength="32" value="${mb.phone_number}"></li>

			<li>メールアドレス<br>
				<input type="text" id="mail_address" name="mail_address" maxlength="128" value="${mb.mail_address}"></li>
		</ul>

		<div>
			<input type="button" onclick="location.href='/MemberInformation/views/menu.jsp'" value="戻る">
			<input type="reset" value="リセット">
			<input type="submit" id="submit" formmethod="post" value="更新">
		</div>

		<p>${errorMsg}</p>

	</form>

	<script src="${pageContext.request.contextPath}/js/script.js"></script>

</body>

</html>