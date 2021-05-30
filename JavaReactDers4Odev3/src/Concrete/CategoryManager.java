package Concrete;

import Abstract.ICategoryService;
import Entities.Category;

public class CategoryManager implements ICategoryService

{

	@Override
	public void add(Category category) {
		System.out.println(category.getName()+" kategorisi kaydedildi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println(category.getName()+" kategorisi güncellendi");
		
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(category.getName()+" kategorisi silindi");
		
		
	}

}
