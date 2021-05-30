package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		boolean result=false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()) , 
					gamer.getFirstName().toUpperCase(new Locale("tr")),
					gamer.getLastName().toUpperCase(new Locale("tr")), 
					gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
		
			result=false;
			e.printStackTrace();
		}
		
		return result;
	}

}
