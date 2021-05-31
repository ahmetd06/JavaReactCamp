package Concrete;

import Abstract.ISaleManager;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;

public class SaleManager implements ISaleManager {

	@Override
	public void buy(Gamer gamer, Product product) {
		System.out.println(gamer.getFirstName() + " isimli oyuncuya "+ product.getName() + " ürünü indirimsiz "+product.getUnitPrice()*( (100+product.getKdv())/100)+" TL ye satıldı");
		
		
	}

	@Override
	public void buy(Gamer gamer, Product product, Campaign[] campaigns) {
		
		double totalDiscountPercent=0;
		double priceAfterKdv=0;
		double priceAfterDiscount=0;
		
		
		priceAfterKdv= product.getUnitPrice() *  ((100+product.getKdv())/100);
		
		for(Campaign campaign:campaigns) {
			totalDiscountPercent+=campaign.getDiscountPercent();
		}
		
	
		priceAfterDiscount = priceAfterKdv*( (100-totalDiscountPercent)/100);
		
		System.out.println(gamer.getFirstName() + " isimli oyuncuya "+ product.getName() + " ürününü toplam yüzde" + totalDiscountPercent+" indirimle " + priceAfterDiscount+" liraya satıldı");
		
	}

}
