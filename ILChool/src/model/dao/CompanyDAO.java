package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Company;

public class CompanyDAO {
	private JDBCUtil jdbcUtil = null;
	
	public CompanyDAO() {
		jdbcUtil = new JDBCUtil();	// JDBCUtil ��ü ����
	}
	/**
	 * Ŀ�´�Ƽ ���̺� ���ο� �� ���� (PK ���� Sequence�� �̿��Ͽ� �ڵ� ����)
	 */
	public Company create(Company company) throws SQLException {
		String sql = "INSERT INTO Company VALUES (companyid_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] param = new Object[] {company.getName(), company.getForm(), company.getSummary(), company.getLocation(),
				company.getIndustry(), company.getSalary(), company.getCeo()};
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil �� insert���� �Ű� ���� ����
						
		String key[] = {"company_id"};	// PK �÷��� �̸�     
		try {    
			jdbcUtil.executeUpdate(key);  // insert �� ����
		   	ResultSet rs = jdbcUtil.getGeneratedKeys();
		   	if(rs.next()) {
		   		int generatedKey = rs.getInt(1);   // ������ PK ��
		   		company.setCompany_id(generatedKey); 	// id�ʵ忡 ����  
		   	}
		   	return company;
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
	 * ������ ȸ�� ������ ����
	 */
	public int update(Company company) throws SQLException {
		String sql = "UPDATE Company "
					+ "SET name=?, form=?, summary=?, location=?, indstury=?, salary=?, ceo=? "
					+ "WHERE company_id=?";
		Object[] param = new Object[] {company.getName(), company.getForm(), company.getSummary(), company.getLocation(),
				company.getIndustry(), company.getSalary(), company.getCeo(),
				company.getCompany_id()};				
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
	
	public int remove(String company_id) throws SQLException {
		String sql = "DELETE FROM Company WHERE company_id=?";		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {company_id});	// JDBCUtil�� delete���� �Ű� ���� ����

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
