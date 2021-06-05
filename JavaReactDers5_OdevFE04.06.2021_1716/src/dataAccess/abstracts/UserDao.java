package dataAccess.abstracts;

import java.util.List;

import entities.concretes.LocalUser;
import entities.concretes.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	LocalUser get(int id);

	User get(String eMail);

	List<User> getAll();
}
