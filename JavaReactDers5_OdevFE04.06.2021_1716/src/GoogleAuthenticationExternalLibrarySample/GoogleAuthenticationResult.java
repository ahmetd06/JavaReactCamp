package GoogleAuthenticationExternalLibrarySample;

public class GoogleAuthenticationResult {

	private String firstName;
	private String lastName;
	private String userId;
	private String eMail;
	private boolean isAuthenticated;

	public GoogleAuthenticationResult() {
	}

	public GoogleAuthenticationResult(String firstName, String lastName, String userId, String eMail,
			boolean isAuthenticated) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.eMail = eMail;
		this.isAuthenticated = isAuthenticated;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isAuthenticated() {
		return isAuthenticated;
	}

	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}

}
