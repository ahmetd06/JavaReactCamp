package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.LocalUser;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("hybernate ile eklendi");

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalUser get(int id) {
		// TODO Auto-generated method stub
		System.out.println(" id nolu kullanıcı döndürüldü");
		LocalUser user = new LocalUser();
		user.seteMail("veritabaniolmadigindantesticinbirkullanici@donduruldu.com");
		user.setFirstname("test");
		user.setLastname("deneme");
		user.setVerified(true);
		return user;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		System.out.println(" tüm kullanıcılar döndürüldü");
		return null;
	}

	@Override
	public User get(String eMail) {
		// TODO Auto-generated method stub
		System.out.println(" emailin ait olduğu kullanıcı varsa döndürülür yoksa null döndürülür");

		return null;
	}

}
