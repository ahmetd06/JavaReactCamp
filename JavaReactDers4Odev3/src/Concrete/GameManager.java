package Concrete;

import java.util.List;

import Abstract.IGameService;
import Entities.Game;

public class GameManager extends ProductManager implements IGameService{

	@Override
	public List<Game> getLowRequirementGames() {
		System.out.println("Veritabanından düşük konfigürasyonla oynanabilen oyunlar bulundu ve liste olarak döndürüldü");
		
		return null;
	}

	@Override
	public List<Game> getHighRequirementGames() {
		System.out.println("Veritabanından yüksek konfigürasyon isteyen oyunlar bulundu ve liste olarak döndürüldü");
		
		return null;
	}

}
