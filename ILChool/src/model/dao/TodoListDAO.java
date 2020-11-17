package model.dao;

import java.sql.ResultSet;

import java.sql.SQLException;


import model.TodoList;


public class TodoListDAO {
	private JDBCUtil jdbcUtil = null;
	
	public TodoListDAO() {			
		jdbcUtil = new JDBCUtil();	// JDBCUtil 占쏙옙체 占쏙옙占쏙옙
	}
		

	public TodoList create(TodoList todo) throws SQLException {
		String sql = "INSERT INTO Community VALUES (TO_DO_ID_seq.nextval, ?, ?, ?)";		
		Object[] param = new Object[] {todo.getMemberId(), todo.getTodo(), todo.getTodoId()};				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil 占쏙옙 insert占쏙옙占쏙옙 占신곤옙 占쏙옙占쏙옙 占쏙옙占쏙옙
						
		String key[] = {"TodoId"};	// PK 占시뤄옙占쏙옙 占싱몌옙     
		try {    
			jdbcUtil.executeUpdate(key);  // insert 占쏙옙 占쏙옙占쏙옙
		   	ResultSet rs = jdbcUtil.getGeneratedKeys();
		   	if(rs.next()) {
		   		int generatedKey = rs.getInt(1);   // 占쏙옙占쏙옙占쏙옙 PK 占쏙옙
		   		todo.setTodoId(generatedKey); 	// id占십드에 占쏙옙占쏙옙  
		   	}
		   	return todo;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {		
			jdbcUtil.commit();
			jdbcUtil.close();	// resource 占쏙옙환
		}		
		return null;			
	}


	/**
	 * 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙.
	 */
	public int update(TodoList todo) throws SQLException {
		String sql = "UPDATE TodoList "
					+ "SET MemberId=?, Todo()=? "
					+ "WHERE TodoId=?";
		Object[] param = new Object[] {todo.getTodo(), todo.getMemberId(), todo.getTodoId()};				
		jdbcUtil.setSqlAndParameters(sql, param);	// JDBCUtil占쏙옙 update占쏙옙占쏙옙 占신곤옙 占쏙옙占쏙옙 占쏙옙占쏙옙
			
		try {				
			int result = jdbcUtil.executeUpdate();	// update 占쏙옙 占쏙옙占쏙옙
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		}
		finally {
			jdbcUtil.commit();
			jdbcUtil.close();	// resource 占쏙옙환
		}		
		return 0;
	}

	
	/**
	 * 占쌍억옙占쏙옙 ID占쏙옙 占쌔댐옙占싹댐옙 커占승댐옙티 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙.
	 */
	public int remove(int TodoId) throws SQLException {
		String sql = "DELETE FROM TodoList WHERE TodoId=?";		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {TodoId});	// JDBCUtil占쏙옙 delete占쏙옙占쏙옙 占신곤옙 占쏙옙占쏙옙 占쏙옙占쏙옙

		try {				
			int result = jdbcUtil.executeUpdate();	// delete 占쏙옙 占쏙옙占쏙옙
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		}
		finally {
			jdbcUtil.commit();
			jdbcUtil.close();	// resource 占쏙옙환
		}		
		return 0;
	}
}