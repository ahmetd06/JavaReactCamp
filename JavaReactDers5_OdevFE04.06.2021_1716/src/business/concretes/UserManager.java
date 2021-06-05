package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.LocalUser;
import entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;

	}

	@Override
	public void add(User user) {

		userDao.add(user);

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}

	@Override
	public User getByMail(String eMail) {
		// TODO Auto-generated method stub

		return userDao.get(eMail);
	}

	@Override
	public boolean isVerifiedUser(User user) {
		// TODO Auto-generated method stub
		if (userDao.get(user.getId()).isVerified())
			return true;
		return false;
	}

	@Override
	public LocalUser get(int id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

}
