package model;



/**
 * 占쏙옙占쏙옙占� 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙 占십울옙占쏙옙 占쏙옙占쏙옙占쏙옙 클占쏙옙占쏙옙. USERINFO 占쏙옙占싱븝옙占� 占쏙옙占쏙옙占쏙옙
 */
public class TodoList {
	private int MemberId;
	private String Todo;
	private int TodoId;


	public TodoList() { }		// 占썩본 占쏙옙占쏙옙占쏙옙
	
	public TodoList(int MemberId, String Todo, int TodoId) {
		this.MemberId = MemberId;
		this.Todo = Todo;
		this.TodoId = TodoId;

	}
	
	public int getMemberId() {
		return MemberId;
	}

	public void setMemberId(int MemberId) {
		this.MemberId = MemberId;
	}

	public String getTodo() {
		return Todo;
	}

	public void setTodo(String Todo) {
		this.Todo = Todo;
	}
	public int getTodoId() {
		return TodoId;
	}

	public void setTodoId(int TodoId) {
		this.TodoId = TodoId;
	}

	

}
