package business.concretes;

import java.util.List;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	
	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride ürün kabul edilemiyor");
		return;
		}
		this.productDao.add(product);
		this.loggerService.logToSystem("loglandı");
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
