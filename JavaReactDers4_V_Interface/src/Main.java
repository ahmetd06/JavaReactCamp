
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger[] loggers= {new SmsLogger(),new DatabaseLogger()};
		CustomerManager customerManager= new CustomerManager(loggers);
		
		Customer customer = new Customer(1,"Ahmet","Dündar");
		customerManager.add(customer);
		 
		 
		
	}

}
