package Abstract;

import Entities.Campaign;
import Entities.Gamer;
import Entities.Product;

public interface ISaleManager {
	void buy(Gamer gamer,Product product);
	void buy(Gamer gamer,Product product,Campaign[] campaigns);
}
