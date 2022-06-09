package jp.co.aforce.model;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.dao.MembersDao;

public class GetMemberDataModel {

	public MemberBean GetMemberData(String membet_id) {

		MembersDao dao = new MembersDao();
		MemberBean mb = dao.GetMemberData(membet_id);

		return mb;
	}

}
