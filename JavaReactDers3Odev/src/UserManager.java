
public class UserManager {

	public void add(User user) {
		System.out.println(user.getId() + " nolu Kullanıcı Eklendi");
	}

	public void addMultiple(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

	public void update(User user) {
		System.out.println(user.getId() + " nolu Kullanıcı Güncellendi");
	}

	public void delete(User user) {
		System.out.println(user.getId() + " nolu Kullanıcı Silindi");
	}

}
