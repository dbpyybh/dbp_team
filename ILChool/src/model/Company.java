package model;

public class Company {
	private int company_id;
	private String name;
	private String form;
	private String summary;
	private String location;
	private String industry;
	private int salary;
	private String ceo;
	
	public Company() {}

	public Company(int company_id, String name, String form, String summary, String location, String industry,
			int salary, String ceo) {
		super();
		this.company_id = company_id;
		this.name = name;
		this.form = form;
		this.summary = summary;
		this.location = location;
		this.industry = industry;
		this.salary = salary;
		this.ceo = ceo;
	}
	
	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	@Override
	public String toString() {
		return "Company [id=" + company_id + ", name=" + name + ", form=" + form + ", summary=" + summary
				+ ", location=" + location + ", industry=" + industry + ", salary=" + salary + ", ceo="+ceo+"]";
	}
}
