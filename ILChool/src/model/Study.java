package model;

public class Study {
	private int study_id;
	private String title;
	private String category;
	private String location;
	private String age;
	private String companyname;
	private int headcount;
	private int period;
	private int company_id;
	
	public Study() { }
	
	public Study(int study_id, String title, String category, String location, String age, String companyname, int headcount, int period, int company_id) {
		this.study_id = study_id;
		this.title = title;
		this.category = category;
		this.location = location;
		this.age = age;
		this.companyname = companyname;
		this.headcount = headcount;
		this.period = period;
		this.company_id = company_id;
	}
	
	public int getStudy_id() {
		return study_id;
	}
	public void setStudy_id(int study_id) {
		this.study_id = study_id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
	public int getHeadcount() {
		return headcount;
	}
	public void setHeadcount(int headcount) {
		this.headcount = headcount;
	}
	
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	
	public int getCompany_id() {
		return company_id;
	}
	public void setCompanyID(int company_id) {
		this.company_id = company_id;
	}
	
	
}
