package Concrete;

import java.time.LocalDate;

import Abstract.IPrepaidGameCodeForGiftService;
import Entities.PrepaidGameCodeForGift;

public class PrepaidGameCodeForGiftManager extends ProductManager implements IPrepaidGameCodeForGiftService{



	@Override
	public boolean checkIsThatValid(PrepaidGameCodeForGift prepaidGameCodeForGift) {
		
		if (prepaidGameCodeForGift.getExpirationDate().isBefore(LocalDate.now()) ) {
			return true;
		}else {
			return false;
		}
	}

	
}
