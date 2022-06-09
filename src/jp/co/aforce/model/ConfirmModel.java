package jp.co.aforce.model;

import jp.co.aforce.dao.MembersDao;

public class ConfirmModel {

	public int confirmMemberData(String last_name, String first_name, String sex, int birth_year, int birth_month, int birth_day, String job, String phone_number, String mail_address) {

		MembersDao dao = new MembersDao();
		int count = dao.confirmMemberData(last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);

		return count;
	}

	public int confirmExistMember(String member_id) {

		MembersDao dao = new MembersDao();
		int count = dao.confirtExistMember(member_id);

		return count;
	}

}
