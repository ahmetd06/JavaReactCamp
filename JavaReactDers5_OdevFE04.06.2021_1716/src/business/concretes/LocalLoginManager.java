package business.concretes;

import business.abstracts.LoginService;
import business.abstracts.UserService;
import core.LoginResult;
import entities.concretes.LocalUser;
import entities.concretes.User;

public class LocalLoginManager implements LoginService {

	UserService userService;

	public LocalLoginManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public LoginResult login(User user) {
		// TODO Auto-generated method stub
		LocalUser localUser = (LocalUser) userService.get(user.getId());
		LoginResult loginResult = new LoginResult();
		if (localUser.getPasswordHash() == ((LocalUser) userService.get(user.getId())).getPasswordHash()) {

			if (localUser.isVerified()) {

				loginResult.setSuccess(true);
				loginResult.setMessage("Kullanıcı giriş yaptı");
				loginResult.setUser(localUser);
			}

		} else {
			loginResult.setSuccess(false);
			loginResult.setMessage("Kullanıcı giriş yapamadı");
			loginResult.setUser(null);

		}

		return loginResult;

	}

}
