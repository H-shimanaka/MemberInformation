package jp.co.aforce.model;

import jp.co.aforce.dao.MembersDao;

public class DeleteModel {

	public int DeleteMemberData(String member_id) {

		MembersDao dao = new MembersDao();
		int delete = dao.DeleteMemberData(member_id);

		return delete;
	}

}
