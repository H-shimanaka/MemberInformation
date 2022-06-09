package jp.co.aforce.tool;

public class SQL {

	public static final String SQL_KK01_S01 = "SELECT COUNT(*) FROM MEMBER_INFO "
											+ "WHERE LAST_NAME = ? "
											+ "AND FIRST_NAME = ? "
											+ "AND SEX = ? "
											+ "AND BIRTH_YEAR = ? "
											+ "AND BIRTH_MONTH = ? "
											+ "AND BIRTH_DAY = ? "
											+ "AND JOB = ? "
											+ "AND PHONE_NUMBER = ? "
											+ "AND MAIL_ADDRESS = ?;";



	public static final String SQL_KK01_I01 = "INSERT INTO MEMBER_INFO (MEMBER_ID, LAST_NAME, FIRST_NAME, SEX, BIRTH_YEAR, BIRTH_MONTH, BIRTH_DAY, JOB, PHONE_NUMBER, MAIL_ADDRESS) "
												+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


	public static final String SQL_KK02_S01 = "SELECT COUNT(*) FROM MEMBER_INFO "
												+ "WHERE MEMBER_ID = ?";

	public static final String SQL_KK02_S02 = "SELECT * FROM MEMBER_INFO "
												+ "WHERE MEMBER_ID = ?";

	public static final String SQL_KK02_U01 = "UPDATE MEMBER_INFO SET "
												+ "LAST_NAME = ?, "
												+ "FIRST_NAME = ?, "
												+ "SEX = ?, "
												+ "BIRTH_YEAR = ?, "
												+ "BIRTH_MONTH = ?, "
												+ "BIRTH_DAY = ?, "
												+ "JOB = ?, "
												+ "PHONE_NUMBER = ?, "
												+ "MAIL_ADDRESS = ? "
												+ "WHERE MEMBER_ID = ?;";


	public static final String SQL_KK03_D01 = "DELETE FROM MEMBER_INFO "
												+ "WHERE MEMBER_ID = ?";
}
