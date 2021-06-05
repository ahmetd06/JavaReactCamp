package business.validation.concretes;

import business.validation.abstracts.UserValidationService;
import core.Result;
import entities.concretes.LocalUser;
import entities.concretes.User;
import utility.CheckWithRegex;

public class LocalUserValidationManager implements UserValidationService {

	@Override
	public Result validate(User user) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.setSuccess(true);

		LocalUser localUser = (LocalUser) user;

		if (localUser.getPassword().length() < 6) {
			result.setSuccess(false);
			result.setMessage(result.getMessage() + " Parola en az 6 karakter olmalıdırr");
		}
		if (!CheckWithRegex.isEmail(localUser.geteMail())) {
			result.setSuccess(false);
			result.setMessage(result.getMessage() + " Geçerli bir mail adresi giriniz");
		}
		if (localUser.getFirstname().length() < 3) {
			result.setSuccess(false);
			result.setMessage(result.getMessage() + " İsim en az iki karakter olmadıdır");
		}
		if (localUser.getLastname().length() < 3) {
			result.setSuccess(false);
			result.setMessage(result.getMessage() + " Soyadı en az iki karakter olmadıdır");
		}
		return result;
	}

}
