package business.abstracts;

import core.LoginResult;
import entities.concretes.User;

public interface LoginService {

	LoginResult login(User user);
}
