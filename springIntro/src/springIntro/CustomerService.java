
package springIntro;

import org.springframework.stereotype.Component;

@Component("service")
public class CustomerService implements ICustomerService {

	private ICustomerDal database;

	public CustomerService() {

	}

	@Override
	public void add() {
		database.add();

	}

}
