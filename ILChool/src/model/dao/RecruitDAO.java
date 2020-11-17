package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Recruit;

/**
 * ����� ������ ���� �����ͺ��̽� �۾��� �����ϴ� DAO Ŭ����
 * Community ���̺��� Ŀ�´�Ƽ ������ �߰�, ����, ����, �˻� ���� 
 */
public class RecruitDAO {
	private JDBCUtil jdbcUtil = null;
	
	public RecruitDAO() {			
		jdbcUtil = new JDBCUtil();	// JDBCUtil ��ü ����
	}
		
	/**
	 * Ŀ�´�Ƽ ���̺� ���ο� �� ���� (PK ���� Sequence�� �̿��Ͽ� �ڵ� ����)
	 */
	public Recruit create(Recruit comm) throws SQLException {
		String sql = "INSERT INTO Recruit VALUES (Recruit_id_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, company_id_seq.nextval)";		
		Object[] param = new Object[] {(comm.getRecruit_id()!=0) ? comm.getRecruit_id() : null ,
				comm.getName(), comm.getUrl(), comm.getForm(), comm.getCareer(),
				comm.getTitle(), comm.getLocation(), comm.getIndustry(), comm.getJob(),
				comm.getWorkingType(), comm.getRegdate(), comm.getDeadline(),
				(comm.getCompany_id()!=0) ? comm.getCompany_id() : null};				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil �� insert���� �Ű� ���� ����
						
		String key[] = {"cId"};	// PK �÷��� �̸�     
		try {    
			jdbcUtil.executeUpdate(key);  // insert �� ����
		   	ResultSet rs = jdbcUtil.getGeneratedKeys();
		   	if(rs.next()) {
		   		int generatedKey = rs.getInt(1);   // ������ PK ��
		   		comm.setRecruit_id(generatedKey); 	// id�ʵ忡 ����  
		   	}
		   	return comm;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {		
			jdbcUtil.commit();
			jdbcUtil.close();	// resource ��ȯ
		}		
		return null;			
	}

	/**
	 * ������ Ŀ�´�Ƽ ������ ����
	 */
	public int update(Recruit comm) throws SQLException {
		String sql = "UPDATE Recruit "
					+ "SET Name=?, Url=?, Form=?, Career=?, Title=?, Location=?, Industry=?,"
					+ "Job=?, WorkingType=?, Regdate=?, Deadline=?"
					+ "WHERE Recruit_id=?, Company_id=?";
//		String chairId = comm.getChairId();
//		if (chairId.equals("")) chairId = null;
		Object[] param = new Object[] {comm.getName(), comm.getUrl(), comm.getForm(), comm.getCareer(),
				comm.getTitle(), comm.getLocation(), comm.getIndustry(), comm.getJob(),
				comm.getWorkingType(), comm.getRegdate(), comm.getDeadline(),
				(comm.getRecruit_id()!=0) ? comm.getRecruit_id() : null ,
						(comm.getCompany_id()!=0) ? comm.getCompany_id() : null};				
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
	 * �־��� ID�� �ش��ϴ� Ŀ�´�Ƽ ������ ����.
	 */
	public int remove(String commId) throws SQLException {
		String sql = "DELETE FROM Recruit WHERE Recruit_id=?";		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {commId});	// JDBCUtil�� delete���� �Ű� ���� ����

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
