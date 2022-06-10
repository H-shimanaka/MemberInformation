
/*生年月日のセレクトタグにオプション追加*/
let birth_year = document.getElementById("birth_year");
let birth_month = document.getElementById("birth_month");
let birth_day = document.getElementById("birth_day");

for(let i = 1920; i <= 2020; i++){
	const option = document.createElement("option");
	option.text = i;
	option.value = i;
	birth_year.appendChild(option);
}

for(let i = 1; i <= 12; i++){
	const option = document.createElement("option");
	option.text = i;
	option.value = i;
	birth_month.appendChild(option);
}

for(let i = 1; i <= 31; i++){
	const option = document.createElement("option");
	option.text = i;
	option.value = i;
	birth_day.appendChild(option);
}


/* フォームのバリデーションチェック*/
const submitBtn = document.getElementById("submit");

submitBtn.addEventListener('click',(e) =>{

	const last_name = document.getElementById("last_name").value;
	const first_name = document.getElementById("first_name").value;
	const sex = document.getElementsByName("sex");
	const birth_year = document.getElementById("birth_year").value;
	const birth_month = document.getElementById("birth_month").value;
	const birth_day = document.getElementById("birth_day").value;
	const job = document.getElementById("job").value;
	const phone_number = document.getElementById("phone_number").value;
	const mail_address = document.getElementById("mail_address").value;

	let sexValue = "";
	for(let i = 0; i < sex.length; i++){
		if(sex.item(i).checked){
			sexValue = sex.item(i).value;
		}
	}

	if(last_name == ""){
		e.preventDefault();
		window.alert("名前_姓は必須入力項目です")
	}else if(first_name == ""){
		e.preventDefault();
		window.alert("名前_名は必須入力項目です")
	}else if(sexValue == ""){
		e.preventDefault();
		window.alert("性別は必須入力項目です")
	}else if(birth_year == ""){
		e.preventDefault();
		window.alert("生年月日_年は必須入力項目です")
	}else if(birth_month == ""){
		e.preventDefault();
		window.alert("生年月日_月は必須入力項目です")
	}else if(birth_day == ""){
		e.preventDefault();
		window.alert("生年月日_日は必須入力項目です")
	}else if(job == ""){
		e.preventDefault();
		window.alert("職業は必須入力項目です")
	}else if(phone_number == ""){
	e.preventDefault();
		window.alert("電話番号は必須入力項目です")
	}else if(mail_address == ""){
		e.preventDefault();
		window.alert("メールアドレスは必須入力項目です")
	}

});
