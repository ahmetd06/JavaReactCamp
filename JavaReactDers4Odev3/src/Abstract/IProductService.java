package Abstract;

import Entities.Product;

public interface IProductService {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
}
