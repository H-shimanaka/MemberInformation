package jp.co.aforce.model;

import jp.co.aforce.dao.MembersDao;

public class RegistModel {

	public int registerNewMemberData(String last_name, String first_name, String sex, int birth_year, int birth_month, int birth_day, String job, String phone_number, String mail_address) {

		MembersDao dao = new MembersDao();
		int insert = dao.registerNewMemberData(last_name, first_name, sex, birth_year, birth_month, birth_day, job, phone_number, mail_address);

		return insert;

	}

}
