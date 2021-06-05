package entities.concretes;

public class LocalUser extends User {
	private String passwordHash;
	private String verificationCode;

	public LocalUser() {
	}

	public LocalUser(int id, String firstname, String lastname, String eMail, boolean isVerified) {
		super(id, firstname, lastname, eMail, isVerified);

	}

	public String getPassword() {
		return passwordHash;
	}

	public void setPassword(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

}
