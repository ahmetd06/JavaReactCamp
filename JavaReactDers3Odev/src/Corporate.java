
public class Corporate extends User {

	private String companyName;

	public Corporate() {
		super();
		
	}

	public Corporate(int id, String email, String companyName) {
		super(id, email);
		this.companyName=companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
