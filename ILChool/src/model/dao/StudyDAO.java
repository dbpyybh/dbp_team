package model.dao;

import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import model.Study;

public class StudyDAO {
	private JDBCUtil jdbcUtil = null;
	
	public StudyDAO() {
		jdbcUtil = new JDBCUtil();
	}
	
	//스터디 테이블에 새로운 행 생성
	public int create(Study study) throws SQLException {
		String sql = "INSERT INTO STUDY VALUES (?, ?, ?, ?, ?, ?, ? ,?, ?)";
		Object[] param = new Object[] {study.getStudy_id(), study.getTitle(), study.getCategory(), 
				study.getLocation(), study.getAge(), study.getCompanyname(), study.getHeadcount(), 
				study.getPeriod(), study.getCompany_id()};
		jdbcUtil.setSqlAndParameters(sql, param);
		
		try {
			int result = jdbcUtil.executeUpdate();
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {
			jdbcUtil.commit();
			jdbcUtil.close();
		}
		return 0;
	}
	
	//기존의 스터디 정보를 수정
	public int updateStudy(Study study) throws SQLException {
		String sql = "UPDATE STUDY "
				+ "SET title=?, category=?, location=?, age=?, companyname=?, headcount=?, period=?, company_id=? "
				+ "WHERE user_id=?";
		Object[] param = new Object[] {study.getStudy_id(), study.getTitle(), study.getCategory(), 
				study.getLocation(), study.getAge(), study.getCompanyname(), study.getHeadcount(), 
				study.getPeriod(), study.getCompany_id()};
		jdbcUtil.setSqlAndParameters(sql, param);
		
		try {
			int result = jdbcUtil.executeUpdate();
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {
			jdbcUtil.commit();
			jdbcUtil.close();
		}
		return 0;
	}
	
	//study_id에 해당하는 스터디 삭제
	public int deleteStudy(int study_id) throws SQLException {
		String sql = "DELETE FROM STUDY WHERE study_id=?";
		jdbcUtil.setSqlAndParameters(sql, new Object[] {study_id});
		
		try {
			int result = jdbcUtil.executeUpdate();
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {
			jdbcUtil.commit();
			jdbcUtil.close();
		}
		return 0;
	}
	
	//study_id에 해당하는 스터디 정보에 찾아 도메인 클래스에 데이터 저장하여 반환
	public Study getStudyByNo(int study_id) throws SQLException {
		String sql = "SELECT title, category, location, age, companyname, headcount, period, company_id "
				+ "FROM STUDY " + "WHERE study_id=? ";
		jdbcUtil.setSqlAndParameters(sql, new Object[] {study_id});
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();
			if (rs.next()) {
				Study study = new Study(
						study_id,
						rs.getString("title"), rs.getString("category"),
						rs.getString("location"), rs.getString("age"),
						rs.getString("companyname"), rs.getInt("headcount"),
						rs.getInt("period"), rs.getInt("company_id"));
						return study;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();
		}
		return null;
	}
	
	//모든 스터디 리스트 반환
	public List<Study> getAllStudyList() throws SQLException {
		String sql = "SELECT study_id, title, category, location, age, companyname, headcount, period, company_id "
				+ "FROM STUDY";
		jdbcUtil.setSqlAndParameters(sql, null);
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();
			List<Study> allStudyList = new ArrayList<Study>();
			while (rs.next()) {
				Study study = new Study(
						rs.getInt("user_id"),
						rs.getString("title"),
						rs.getString("category"),
						rs.getString("locatino"),
						rs.getString("age"),
						rs.getString("companyname"),
						rs.getInt("headcount"),
						rs.getInt("period"),
						rs.getInt("company_id"));
				allStudyList.add(study);
			}
			return allStudyList;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();
		}
		return null;
	}
	
	//기업별 스터디 리스트 반환
	public List<Study> getStudyByCompany(String companyname) throws SQLException {
		String sql = "SELECT study_id, title, category, location, age, companyname, headcount, period, company_id "
				+ "FROM STUDY " + "WHERE companyname = ?";
		jdbcUtil.setSqlAndParameters(sql,  new Object[] {companyname});
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();
			List<Study> studyListByCom = new ArrayList<Study>();
			while (rs.next()) {
				Study study = new Study(
						rs.getInt("user_id"),
						rs.getString("title"),
						rs.getString("category"),
						rs.getString("locatino"),
						rs.getString("age"),
						rs.getString("companyname"),
						rs.getInt("headcount"),
						rs.getInt("period"),
						rs.getInt("company_id"));
				studyListByCom.add(study);
			}
			return studyListByCom;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();
		}
		return null;
	}
	
	//종류별 스터디 리스트 반환
	public List<Study> getStudyByCategory(String category) {
		String sql = "SELECT study_id, title, category, location, age, companyname, headcount, period, company_id "
				+ "FROM STUDY " + "WHERE category = ?";
		jdbcUtil.setSqlAndParameters(sql,  new Object[] {category});
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();
			List<Study> studyListByCat = new ArrayList<Study>();
			while (rs.next()) {
				Study study = new Study(
						rs.getInt("user_id"),
						rs.getString("title"),
						rs.getString("category"),
						rs.getString("locatino"),
						rs.getString("age"),
						rs.getString("companyname"),
						rs.getInt("headcount"),
						rs.getInt("period"),
						rs.getInt("company_id"));
				studyListByCat.add(study);
			}
			return studyListByCat;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();
		}
		return null;
	}
	
	//지역별 스터디 리스트 반환
	public List<Study> getStudyByLocation(String location) {
		String sql = "SELECT study_id, title, category, location, age, companyname, headcount, period, company_id "
				+ "FROM STUDY " + "WHERE location = ?";
		jdbcUtil.setSqlAndParameters(sql,  new Object[] {location});
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();
			List<Study> studyListByLoc = new ArrayList<Study>();
			while (rs.next()) {
				Study study = new Study(
						rs.getInt("user_id"),
						rs.getString("title"),
						rs.getString("category"),
						rs.getString("locatino"),
						rs.getString("age"),
						rs.getString("companyname"),
						rs.getInt("headcount"),
						rs.getInt("period"),
						rs.getInt("company_id"));
				studyListByLoc.add(study);
			}
			return studyListByLoc;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();
		}
		return null;
	}
	
	
}
