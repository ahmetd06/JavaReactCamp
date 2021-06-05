import business.concretes.GoogleLoginManagerAdapter;
import business.concretes.LocalLoginManager;
import business.concretes.LocalUserManager;
import business.concretes.UserManager;
import business.validation.concretes.LocalUserValidationManager;
import core.LoginResult;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.LocalUser;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalUserManager localUserManager = new LocalUserManager(new HibernateUserDao(),
				new LocalUserValidationManager());

		LocalUser localUser = new LocalUser();

		localUser.setId(1);
		localUser.seteMail("ahmet@asd.com");
		localUser.setFirstname("ahmet");
		localUser.setLastname("asd");
		localUser.setPassword("123456");

		localUserManager.add(localUser);

		localUserManager.checkVerificationCode(localUser, "ıeuıasgaısug");

		LocalLoginManager localLoginManager = new LocalLoginManager(
				new LocalUserManager(new HibernateUserDao(), new LocalUserValidationManager()));

		LoginResult loginResult = localLoginManager.login(localUser);

		System.out.println(loginResult.getMessage());

		GoogleLoginManagerAdapter googleLoginManagerAdapter = new GoogleLoginManagerAdapter(
				new UserManager(new HibernateUserDao()));

		User user = new User();

		loginResult = googleLoginManagerAdapter.login(user);
		System.out.println(loginResult.getMessage());

	}

}
