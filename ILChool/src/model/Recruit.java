package model;

import java.util.Date;

public class Recruit {
	private int Recruit_id;
	private String Name;
	private String Url;
	private String Form;
	private String Career;
	private String Title;
	private String Location;
	private String Industry;
	private String Job;
	private String WorkingType;
	private Date Regdate;
	private Date Deadline;
	private int Company_id;
	
	public Recruit() { }
	
	public Recruit(int recruit_id, String name, String url, String form, String career, String title,
			String location, String industry, String job, String workingType, Date regdate, Date deadline,
			int company_id) {
		super();
		this.Recruit_id = recruit_id;
		this.Name = name;
		this.Url = url;
		this.Form = form;
		this.Career = career;
		this.Title = title;
		this.Location = location;
		this.Industry = industry;
		this.Job = job;
		this.WorkingType = workingType;
		this.Regdate = regdate;
		this.Deadline = deadline;
		this.Company_id = company_id;
	}


	public int getRecruit_id() {
		return Recruit_id;
	}


	public void setRecruit_id(int recruit_id) {
		this.Recruit_id = recruit_id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public String getUrl() {
		return Url;
	}


	public void setUrl(String url) {
		this.Url = url;
	}


	public String getForm() {
		return Form;
	}


	public void setForm(String form) {
		this.Form = form;
	}


	public String getCareer() {
		return Career;
	}


	public void setCareer(String career) {
		this.Career = career;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		this.Title = title;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		this.Location = location;
	}


	public String getIndustry() {
		return Industry;
	}


	public void setIndustry(String industry) {
		this.Industry = industry;
	}


	public String getJob() {
		return Job;
	}


	public void setJob(String job) {
		this.Job = job;
	}


	public String getWorkingType() {
		return WorkingType;
	}


	public void setWorkingType(String workingType) {
		this.WorkingType = workingType;
	}


	public Date getRegdate() {
		return Regdate;
	}


	public void setRegdate(Date regdate) {
		this.Regdate = regdate;
	}


	public Date getDeadline() {
		return Deadline;
	}


	public void setDeadline(Date deadline) {
		this.Deadline = deadline;
	}


	public int getCompany_id() {
		return Company_id;
	}


	public void setCompany_id(int company_id) {
		this.Company_id = company_id;
	}


	/**
	 *
	 */
	@Override
	public String toString() {
		return "Recruit_DTO [Recruit_id=" + Recruit_id + ", Name=" + Name + ", Url=" + Url + ", Form=" + Form
				+ ", Career=" + Career + ", Title=" + Title + ", Location=" + Location + ", Industry=" + Industry
				+ ", Job=" + Job + ", WorkingType=" + WorkingType + ", Regdate=" + Regdate + ", Deadline=" + Deadline
				+ ", Company_id=" + Company_id + "]";
	}
	
	
	
}
