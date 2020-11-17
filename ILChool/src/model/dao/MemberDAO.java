package model.dao;

import java.sql.SQLException;
import model.Member;


public class MemberDAO {
	private JDBCUtil jdbcUtil = null;
	
	public MemberDAO() {			
		jdbcUtil = new JDBCUtil();	// JDBCUtil ��ü ����
	}
		

	public int create(Member member) throws SQLException {
		String sql = "INSERT INTO USERINFO VALUES (MemberID_seq.nextval, ?, ?, ?, ?, ?, ?)";		
		Object[] param = new Object[] {member.getMemberID(), member.getPassword(), 
				member.getName(), member.getEmail(), member.getPhone(), member.getAge(), member.getSubdate() };				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil �� insert���� �Ű� ���� ����
						
		try {				
			int result = jdbcUtil.executeUpdate();	// insert �� ����
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {		
			jdbcUtil.commit();
			jdbcUtil.close();	// resource ��ȯ
		}		
		return 0;			
	}

	/**
	 * ������ ����� ������ ����.
	 */
	public int update(Member member) throws SQLException {
		String sql = "UPDATE USERINFO "
					+ "SET password=?, name=?, email=?, phone=?, age=?, subdate=? "
					+ "WHERE memberID=?";
		Object[] param = new Object[] {member.getPassword(), member.getName(), 
				member.getEmail(), member.getPhone(),  member.getAge(), member.getSubdate()};				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil�� update���� �Ű� ���� ����
			
		try {				
			int result = jdbcUtil.executeUpdate();	// update �� ����
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		}
		finally {
			jdbcUtil.commit();
			jdbcUtil.close();	// resource ��ȯ
		}		
		return 0;
	}

	/**
	 * ����� ID�� �ش��ϴ� ����ڸ� ����.
	 */
	public int remove(int memberID) throws SQLException {
		String sql = "DELETE FROM USERINFO WHERE memberID=?";		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {memberID});	// JDBCUtil�� delete���� �Ű� ���� ����

		try {				
			int result = jdbcUtil.executeUpdate();	// delete �� ����
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		}
		finally {
			jdbcUtil.commit();
			jdbcUtil.close();	// resource ��ȯ
		}		
		return 0;
	}

	

}
