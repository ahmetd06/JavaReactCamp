package Concrete;

import Abstract.IProductService;
import Entities.Product;

public class ProductManager implements IProductService{

	@Override
	public void add(Product product) {
		System.out.println(product.getName()+" isimli ürün kaydedildi");
		
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName()+" isimli ürün güncellendi");
		
		
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName()+" isimli ürün güncellendi");
		
		
	}

}
