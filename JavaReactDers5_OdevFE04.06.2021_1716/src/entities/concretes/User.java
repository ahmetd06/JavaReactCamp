package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String firstname;
	private String lastname;
	private String eMail;

	private boolean isVerified;

	public User() {
	}

	public User(int id, String firstname, String lastname, String eMail, boolean isVerified) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.eMail = eMail;
		this.isVerified = isVerified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

}
