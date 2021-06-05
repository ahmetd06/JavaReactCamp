package business.validation.abstracts;

import core.Result;
import entities.concretes.User;

public interface UserValidationService {
	public Result validate(User user);
}
