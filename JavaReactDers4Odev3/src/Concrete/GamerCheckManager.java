package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements IGamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		//Mernis doğrulaması yapmayı test ortamında devre dışı
		//bırakmak için 
		return true;
	}

}
