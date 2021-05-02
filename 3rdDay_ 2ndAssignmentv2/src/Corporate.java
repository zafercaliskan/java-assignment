public class Corporate extends User {
	int id;
	int userId;
	String companyName;
	
	public Corporate() {
	}

	public Corporate(int id, int userId, String companyName) {
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}	
}