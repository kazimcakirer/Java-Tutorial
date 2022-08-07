package springIntro;

import org.springframework.beans.factory.annotation.Value;

public class MySQLCustomerDal implements ICustomerDal {

	@Value("{database.connetionString}")
	private String connetionString;
	
	@Override
	public void add() {

		System.out.println("Connetion String : " + connetionString);
		
		System.out.println("MySQL veritabaný çalýþtý");
	}
	
	

}
