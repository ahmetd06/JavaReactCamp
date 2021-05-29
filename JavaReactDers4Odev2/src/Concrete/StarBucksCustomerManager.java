package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService customerCheckService;
	
	public StarBucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Mernis doğrulaması başarısız. Kayıt yapılamadı");
		}
	}

	
}
