package springIntro3;

import org.springframework.beans.factory.annotation.Value;

public class MsSQLCustomerDal implements ICustomerDal {
	
	@Value("${database.connectionString}")
	private String connetionString;

	@Override
	public void add() {

		System.out.println("Connetion String : " + connetionString);

		System.out.println("MsSQL veritabaný çalýþtý");
		
	}
	

}
