package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Recruit;

/**
 * 사용자 관리를 위해 데이터베이스 작업을 전담하는 DAO 클래스
 * Community 테이블에서 커뮤니티 정보를 추가, 수정, 삭제, 검색 수행 
 */
public class RecruitDAO {
	private JDBCUtil jdbcUtil = null;
	
	public RecruitDAO() {			
		jdbcUtil = new JDBCUtil();	// JDBCUtil 객체 생성
	}
		
	/**
	 * 커뮤니티 테이블에 새로운 행 생성 (PK 값은 Sequence를 이용하여 자동 생성)
	 */
	public Recruit create(Recruit comm) throws SQLException {
		String sql = "INSERT INTO Recruit VALUES (Recruit_id_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, company_id_seq.nextval)";		
		Object[] param = new Object[] {(comm.getRecruit_id()!=0) ? comm.getRecruit_id() : null ,
				comm.getName(), comm.getUrl(), comm.getForm(), comm.getCareer(),
				comm.getTitle(), comm.getLocation(), comm.getIndustry(), comm.getJob(),
				comm.getWorkingType(), comm.getRegdate(), comm.getDeadline(),
				(comm.getCompany_id()!=0) ? comm.getCompany_id() : null};				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil 에 insert문과 매개 변수 설정
						
		String key[] = {"cId"};	// PK 컬럼의 이름     
		try {    
			jdbcUtil.executeUpdate(key);  // insert 문 실행
		   	ResultSet rs = jdbcUtil.getGeneratedKeys();
		   	if(rs.next()) {
		   		int generatedKey = rs.getInt(1);   // 생성된 PK 값
		   		comm.setRecruit_id(generatedKey); 	// id필드에 저장  
		   	}
		   	return comm;
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
	 * 기존의 커뮤니티 정보를 수정
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
	
	/**
	 * 주어진 ID에 해당하는 커뮤니티 정보를 삭제.
	 */
	public int remove(String commId) throws SQLException {
		String sql = "DELETE FROM Recruit WHERE Recruit_id=?";		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {commId});	// JDBCUtil에 delete문과 매개 변수 설정

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
