package business.concretes;

import GoogleAuthenticationExternalLibrarySample.GoogleAuthenticationResult;
import GoogleAuthenticationExternalLibrarySample.GoogleAuthenticationService;
import business.abstracts.LoginService;
import business.abstracts.UserService;
import core.LoginResult;
import entities.concretes.ExternalUser;
import entities.concretes.User;

public class GoogleLoginManagerAdapter implements LoginService {
	private UserService userService;

	public GoogleLoginManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public LoginResult login(User user) {

		GoogleAuthenticationResult googleAuthenticationResult = new GoogleAuthenticationResult();
		GoogleAuthenticationService googleAuthenticationService = new GoogleAuthenticationService();

		googleAuthenticationResult = googleAuthenticationService.AuthGoogleUser();// bu metod iel googlenin kendi login
																					// arayüzü açılıp login olunduğu ve
																					// sonucun döndürüldüğü simüle
																					// edildi

		ExternalUser externalUser = new ExternalUser();

		LoginResult loginResult = new LoginResult();

		if (googleAuthenticationResult.isAuthenticated()) {
			externalUser.setFirstname(googleAuthenticationResult.getFirstName());
			externalUser.setLastname(googleAuthenticationResult.getLastName());
			externalUser.seteMail(googleAuthenticationResult.geteMail());
			externalUser.setExternalSystemsMemberId(googleAuthenticationResult.getUserId());
			externalUser.setVerified(true);

			if (!userService.isVerifiedUser(externalUser)) {
				userService.add(externalUser);
			}

			loginResult.setSuccess(true);
			loginResult.setMessage("Google ile login olundu");
			loginResult.setUser(externalUser);
		} else {
			loginResult.setSuccess(false);
			loginResult.setMessage("Google ile login olunamadı");
			loginResult.setUser(null);
		}
		return loginResult;
	}

}
