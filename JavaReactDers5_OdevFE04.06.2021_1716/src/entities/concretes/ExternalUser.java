package entities.concretes;

public class ExternalUser extends User {
	private String externalSystemsMemberId;

	public ExternalUser() {
	}

	public ExternalUser(int id, String firstname, String lastname, String eMail, boolean isVerified,
			String externalSystemsMemberId) {
		super(id, firstname, lastname, eMail, isVerified);
		this.externalSystemsMemberId = externalSystemsMemberId;
	}

	public String getExternalSystemsMemberId() {
		return externalSystemsMemberId;
	}

	public void setExternalSystemsMemberId(String externalSystemsMemberId) {
		this.externalSystemsMemberId = externalSystemsMemberId;
	}

}
