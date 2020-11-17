package model;



/**
 * ����� ������ ���� �ʿ��� ������ Ŭ����. USERINFO ���̺�� ������
 */
public class FAMOUSSAYING {
	private int FamoussayingId;
	private String Famoussaying;


	public FAMOUSSAYING() { }		// �⺻ ������
	
	public FAMOUSSAYING(int FamoussayingId, String Famoussaying) {
		this.FamoussayingId = FamoussayingId;
		this.Famoussaying = Famoussaying;

	}
	

	
	/*public void update(User updateUser) {
        this.password = updateUser.password;
        this.name = updateUser.name;
        this.email = updateUser.email;
        this.phone = updateUser.phone;
    }*/
	
	public int getFamoussayingId() {
		return FamoussayingId;
	}

	public void setFamoussayingId(int FamoussayingId) {
		this.FamoussayingId = FamoussayingId;
	}

	public String getFamoussaying() {
		return Famoussaying;
	}

	public void setFamoussaying(String Famoussaying) {
		this.Famoussaying = Famoussaying;
	}

	

}
