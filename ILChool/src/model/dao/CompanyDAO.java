package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.Company;

public class CompanyDAO {
	private JDBCUtil jdbcUtil = null;
	
	public CompanyDAO() {
		jdbcUtil = new JDBCUtil();	// JDBCUtil 객체 생성
	}
	/**
	 * 커뮤니티 테이블에 새로운 행 생성 (PK 값은 Sequence를 이용하여 자동 생성)
	 */
	public Company create(Company company) throws SQLException {
		String sql = "INSERT INTO Company VALUES (companyid_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] param = new Object[] {company.getName(), company.getForm(), company.getSummary(), company.getLocation(),
				company.getIndustry(), company.getSalary(), company.getCeo()};
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil 에 insert문과 매개 변수 설정
						
		String key[] = {"company_id"};	// PK 컬럼의 이름     
		try {    
			jdbcUtil.executeUpdate(key);  // insert 문 실행
		   	ResultSet rs = jdbcUtil.getGeneratedKeys();
		   	if(rs.next()) {
		   		int generatedKey = rs.getInt(1);   // 생성된 PK 값
		   		company.setCompany_id(generatedKey); 	// id필드에 저장  
		   	}
		   	return company;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {		
			jdbcUtil.commit();
			jdbcUtil.close();	// resource 반환
		}		
		return null;			
	}
	
	/**
	 * 기존의 회사 정보를 수정
	 */
	public int update(Company company) throws SQLException {
		String sql = "UPDATE Company "
					+ "SET name=?, form=?, summary=?, location=?, indstury=?, salary=?, ceo=? "
					+ "WHERE company_id=?";
		Object[] param = new Object[] {company.getName(), company.getForm(), company.getSummary(), company.getLocation(),
				company.getIndustry(), company.getSalary(), company.getCeo(),
				company.getCompany_id()};				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil에 update문과 매개 변수 설정
			
		try {				
			int result = jdbcUtil.executeUpdate();	// update 문 실행
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		}
		finally {
			jdbcUtil.commit();
			jdbcUtil.close();	// resource 반환
		}		
		return 0;
	}
	
	public int remove(String company_id) throws SQLException {
		String sql = "DELETE FROM Company WHERE company_id=?";		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {company_id});	// JDBCUtil에 delete문과 매개 변수 설정

		try {				
			int result = jdbcUtil.executeUpdate();	// delete 문 실행
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		}
		finally {
			jdbcUtil.commit();
			jdbcUtil.close();	// resource 반환
		}		
		return 0;
	}
}
