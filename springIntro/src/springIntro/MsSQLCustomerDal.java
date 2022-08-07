package springIntro;

import org.springframework.stereotype.Component;

@Component("database")
public class MsSQLCustomerDal implements ICustomerDal {

	@Override
	public void add() {

		System.out.println("MsSQL veritabaný çalýþtý");
		
	}
	

}
