package core;

import entities.concretes.User;

public class LoginResult extends Result {

	private User User;

	public LoginResult(boolean success, String message, User user) {
		super(success, message);
		User = user;
	}

	public LoginResult(boolean success, String message) {
		super();

	}

	public LoginResult() {
		super(false, "");
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

}
