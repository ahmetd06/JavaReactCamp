package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		boolean result=false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()) , 
					customer.getFirstName().toUpperCase(new Locale("tr")),
					customer.getLastName().toUpperCase(new Locale("tr")), 
					customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
		
			result=false;
			e.printStackTrace();
		}
		
		return result;
	}

}
