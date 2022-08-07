package springIntro;

public class CustomerDal implements ICustomerDal {

	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("connection string="+this.connectionString);
		System.out.println("Veri eklendi.");
	}
}
