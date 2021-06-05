package business.abstracts;

import entities.concretes.LocalUser;
import entities.concretes.User;

public interface UserService {
	void add(User user);

	void update(User user);

	void delete(User user);

	User getByMail(String eMail);

	LocalUser get(int id);

	boolean isVerifiedUser(User user);

}
