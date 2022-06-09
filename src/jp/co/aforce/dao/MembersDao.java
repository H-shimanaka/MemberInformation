package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.co.aforce.beans.MemberBean;
import jp.co.aforce.tool.SQL;

public class MembersDao extends DAO {

	public int confirmMemberData(String last_name, String first_name, String sex, int birth_year, int birth_month, int birth_day, String job, String phone_number, String mail_address) {
		int count = 0;

		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(SQL.SQL_KK01_S01)){

			pstmt.setString(1, last_name);
			pstmt.setString(2, first_name);
			pstmt.setString(3, sex);
			pstmt.setInt(4, birth_year);
			pstmt.setInt(5, birth_month);
			pstmt.setInt(6, birth_day);
			pstmt.setString(7, job);
			pstmt.setString(8, phone_number);
			pstmt.setString(9, mail_address);

			try(ResultSet rs = pstmt.executeQuery()){

				while(rs.next()) {
					count = rs.getInt("count(*)");
				}

			}catch(SQLException e) {
				e.printStackTrace();
			}

		}catch(Exception e) {

		}

		return count;
	}


	public int registerNewMemberData(String last_name, String first_name, String sex, int birth_year, int birth_month, int birth_day, String job, String phone_number, String mail_address) {
		int insert = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
		String member_id = "A" + sdf.format(new Date());

		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(SQL.SQL_KK01_I01);){

			pstmt.setString(1, member_id);
			pstmt.setString(2, last_name);
			pstmt.setString(3, first_name);
			pstmt.setString(4, sex);
			pstmt.setInt(5, birth_year);
			pstmt.setInt(6, birth_month);
			pstmt.setInt(7, birth_day);
			pstmt.setString(8, job);
			pstmt.setString(9, phone_number);
			pstmt.setString(10, mail_address);

			insert = pstmt.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}

		return insert;
	}


	public int confirtExistMember(String member_id) {
		int count = 0;

		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(SQL.SQL_KK02_S01)){

			pstmt.setString(1, member_id);

			try(ResultSet rs = pstmt.executeQuery()){

				while(rs.next()) {
					count = rs.getInt("count(*)");
				}

			}catch(SQLException e) {
				e.printStackTrace();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		return count;
	}


	public MemberBean GetMemberData(String member_id) {

		MemberBean mb = new MemberBean();

		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(SQL.SQL_KK02_S02)){

			pstmt.setString(1, member_id);

			try(ResultSet rs = pstmt.executeQuery()){

				while(rs.next()) {
					mb.setMember_id(rs.getString("MEMBER_ID"));
					mb.setLast_name(rs.getString("LAST_NAME"));
					mb.setFirst_name(rs.getString("FIRST_NAME"));
					mb.setSex(rs.getString("SEX"));
					mb.setBirth_year(rs.getInt("BIRTH_YEAR"));
					mb.setBirth_month(rs.getInt("BIRTH_MONTH"));
					mb.setBirth_day(rs.getInt("BIRTH_DAY"));
					mb.setJob(rs.getString("JOB"));
					mb.setPhone_number(rs.getString("PHONE_NUMBER"));
					mb.setMail_address(rs.getString("MAIL_ADDRESS"));
				}

			}catch(SQLException e) {
				e.printStackTrace();
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		return mb;
	}


	public int UpdateMemberData(String member_id, String last_name, String first_name, String sex, int birth_year, int birth_month, int birth_day, String job, String phone_number, String mail_address) {
		int update = 0;

		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(SQL.SQL_KK02_U01);){

			pstmt.setString(1, last_name);
			pstmt.setString(2, first_name);
			pstmt.setString(3, sex);
			pstmt.setInt(4, birth_year);
			pstmt.setInt(5, birth_month);
			pstmt.setInt(6, birth_day);
			pstmt.setString(7, job);
			pstmt.setString(8, phone_number);
			pstmt.setString(9, mail_address);
			pstmt.setString(10, member_id);

			update = pstmt.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}

		return update;
	}


	public int DeleteMemberData(String member_id) {
		int delete = 0;

		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(SQL.SQL_KK03_D01)){

			pstmt.setString(1, member_id);

			delete = pstmt.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}

		return delete;
	}

}
