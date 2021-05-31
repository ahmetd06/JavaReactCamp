import java.time.LocalDate;


import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Category;
import Entities.Game;
import Entities.Gamer;
import Entities.PrepaidGameCodeForGift;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Ahmet");
		gamer.setLastName("Dündar");
		gamer.setDateOfBirth(LocalDate.of(1982, 1, 1));
		gamer.seteMail("ahmet@dundarcom");
		gamer.setNationalityId("1126222606");
		gamer.setPasswordHash("AKUTAKEMILUY");
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer);
		
		gamer.setDateOfBirth(LocalDate.of(1983, 2, 2));
		gamerManager.update(gamer);
		
		Category category = new Category();
		category.setId(1);
		category.setName("Araba Yarışı");
		
	
		
		Game game = new Game();
		game.setId(1);
		game.setCategoryId(category.getId());
		game.setName("Need For Speed");
		game.setDetail("");
		game.setDeveloper("EA Games");
		game.setKdv(18);
		game.setMinimumCpu("2 Core");
		game.setMinimumMemory("8 GB");
		game.setMinimumStorage("3 GB");
		game.setOperatingSystem("Windows 10 x64");
		game.setOtherGameDetails("x64 sistemlerde çalışmaktadır");
		game.setReleaseDate(LocalDate.of(2021, 5, 30));
		game.setSupportedLanguages("Türkçe/İngilizce/Japonca");
		game.setUnitPrice(100);
		game.setVersion("1.2");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("23 Nisan Kampanyası");
		campaign1.setDiscountPercent(10);
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setName("Yarıyıl Tatili Kampanyası");
		campaign2.setDiscountPercent(5);
		
		SaleManager saleManager = new SaleManager();
		saleManager.buy(gamer, game);
		
		Campaign[] campaigns= new Campaign[2];
		campaigns[0]= campaign1;
		campaigns[1]= campaign2;
		
		saleManager.buy(gamer, game, campaigns );
		
		Category category2= new Category();
		category2.setId(2);
		category2.setName("Ön Ödemeli Hediye Oyun Kartları");
		
		PrepaidGameCodeForGift prepaidGameCodeForGift = new PrepaidGameCodeForGift();
		prepaidGameCodeForGift.setId(2);
		prepaidGameCodeForGift.setName("118 Liralık Ön Ödemeli Hediye Oyun Kartı");
		prepaidGameCodeForGift.setCategoryId(category2.getId());
		prepaidGameCodeForGift.setUnitPrice(100);
		prepaidGameCodeForGift.setKdv(18);
		prepaidGameCodeForGift.setAmount(118);
		prepaidGameCodeForGift.setExpirationDate(LocalDate.of(2022, 12, 12));
		prepaidGameCodeForGift.setDetail("Satın almalarda kullanılabilecek ön ödemeli kart");
		
		saleManager.buy(gamer, prepaidGameCodeForGift);
	}

}
