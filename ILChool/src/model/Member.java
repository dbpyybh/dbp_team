package model;

import java.util.Date;

/**
 * ����� ������ ���� �ʿ��� ������ Ŭ����. USERINFO ���̺�� ������
 */
public class Member {
	private int memberID;
	private String password;
	private String name;
	private String email;
	private String phone;
	private int age;
	private Date subdate;

	public Member() { }		// �⺻ ������
	
	public Member(int memberID, String password, String name, String email, String phone, int age) {
		this.memberID = memberID;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}
	
	public Member(int memberID, String password, String name, String email, String phone, int age, Date subdate) {
		this(memberID, password, name, email, phone, age);
		this.age = age;
		this.subdate = subdate;
	}

	public Member(int memberID, String name) {
		this.memberID = memberID;
		this.name = name;
	}
	
	/*public void update(User updateUser) {
        this.password = updateUser.password;
        this.name = updateUser.name;
        this.email = updateUser.email;
        this.phone = updateUser.phone;
    }*/
	
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getSubdate() {
		return subdate;
	}

	public void setSubdate(Date subdate) {
		this.subdate = subdate;
	}



}
