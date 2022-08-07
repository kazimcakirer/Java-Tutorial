package springIntro3;

import org.springframework.beans.factory.annotation.Value;

public class OracleCustomerDal implements ICustomerDal {
	
	@Value("${database.connetionString}")
	private String connetionString;

	@Override
	public void add() {

		System.out.println("Connetion String : " + connetionString);
		System.out.println("Oracle veritabaný çalýþtý");

	}

}
