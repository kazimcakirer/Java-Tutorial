package example;

public class main2 {

	public static void main(String[] args) {
		CustomerManager customer = new CustomerManager();
		customer.database = new OracleDatabase();
		customer.getCustomer();
	}

}
