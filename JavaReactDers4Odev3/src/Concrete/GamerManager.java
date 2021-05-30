package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager  implements IGamerService {

	private IGamerCheckService gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		

		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
		System.out.println(gamer.getFirstName()+" isimli oyuncu kaydedildi");
		}else {
			System.out.println(gamer.getFirstName()+" isimli oyuncu kaydedilemedi");
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" 'in bilgileri güncellendi");
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" isimli oyuncu silindi");
		
		
	}

	

}
