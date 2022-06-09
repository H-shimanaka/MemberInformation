package jp.co.aforce.model;

import jp.co.aforce.dao.MembersDao;

public class UpdateModel {

	public int UpdateMemberData(String member_id, String last_name, String first_name, String sex, int birth_year, int birth_month, int birth_day, String job, String phone_number, String mail_address) {

		MembersDao dao = new MembersDao();
		int update = dao.UpdateMemberData(member_id, last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);

		return update;
	}

}
