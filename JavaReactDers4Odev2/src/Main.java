import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setDateOfBirth(LocalDate.of(1982, 1, 1));
		customer.setFirstName("Ahmet");
		customer.setLastName("Dündar");
		customer.setNationalityId("1126222606");
				
		customerManager.save(customer);
		
		BaseCustomerManager customerManager2 = new StarBucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setDateOfBirth(LocalDate.of(1982, 1, 1));
		customer2.setFirstName("Ahmet");
		customer2.setLastName("Dündar");
		customer2.setNationalityId("12345678910");
		
		customerManager2.save(customer2);
	}

}
