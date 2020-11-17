package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import model.FAMOUSSAYING;


public class FamousSayingDAO {
	private JDBCUtil jdbcUtil = null;
	
	public FamousSayingDAO() {			
		jdbcUtil = new JDBCUtil();	// JDBCUtil ��ü ����
	}
		

	public FAMOUSSAYING create(FAMOUSSAYING  fam) throws SQLException {
		String sql = "INSERT INTO Community VALUES (FamoussayingId_seq.nextval, ?)";		
		Object[] param = new Object[] {fam.getFamoussayingId(), fam.getFamoussaying()};				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil �� insert���� �Ű� ���� ����
						
		String key[] = {"FamoussayingId"};	// PK �÷��� �̸�     
		try {    
			jdbcUtil.executeUpdate(key);  // insert �� ����
		   	ResultSet rs = jdbcUtil.getGeneratedKeys();
		   	if(rs.next()) {
		   		int generatedKey = rs.getInt(1);   // ������ PK ��
		   		fam.setFamoussayingId(generatedKey); 	// id�ʵ忡 ����  
		   	}
		   	return fam;
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
	 * ������ ����� ������ ����.
	 */
	public int update(FAMOUSSAYING  fam) throws SQLException {
		String sql = "UPDATE FAMOUSSAYING "
					+ "SET Famoussaying()=? "
					+ "WHERE FamoussayingId=?";
		Object[] param = new Object[] {fam.getFamoussayingId(), fam.getFamoussaying()};				
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
	public int remove(int  FamoussayingId) throws SQLException {
		String sql = "DELETE FROM FAMOUSSAYING WHERE FamoussayingId=?";		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {FamoussayingId});	// JDBCUtil�� delete���� �Ű� ���� ����

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