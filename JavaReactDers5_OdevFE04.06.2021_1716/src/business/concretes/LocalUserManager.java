package business.concretes;

import business.validation.abstracts.UserValidationService;
import core.Result;
import dataAccess.abstracts.UserDao;
import entities.concretes.LocalUser;
import entities.concretes.User;
import utility.Email;

public class LocalUserManager extends UserManager {

	private UserValidationService userValidationService;

	public LocalUserManager(UserDao userDao, UserValidationService userValidationService) {
		super(userDao);
		this.userValidationService = userValidationService;
	}

	public void sendVerificationCode(User user) {

		String verificationCode = "RANDOMBİŞEY";
		Email.sendEmail(user.geteMail(), verificationCode);
		user.setVerified(false);
		LocalUser localUser = (LocalUser) user;
		localUser.setVerificationCode(verificationCode);
	}

	public boolean checkVerificationCode(LocalUser localUser, String verificationCode) {

		if (localUser.getVerificationCode() == verificationCode) {
			localUser.setVerified(true);
			return true;
		}
		return false;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		if (userDao.get(user.geteMail()) != null) {
			System.out.println(" Bu mail adresi daha önce kullanılmış.Ekleme Başarısız");
			return;
		}

		Result result = userValidationService.validate(user);

		if (result.isSuccess()) {

			userDao.add(user);
			LocalUser localUser = (LocalUser) user;
			sendVerificationCode(localUser);

		} else {
			System.out.println(result.getMessage() + " Ekleme Başarısız");
		}
	}

}
