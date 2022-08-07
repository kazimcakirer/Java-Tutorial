
package springIntro3;

import org.springframework.stereotype.Component;

@Component("service")
public class CustomerService implements ICustomerService {

	private ICustomerDal database;

	public CustomerService(ICustomerDal customerDal) {
		this.database=customerDal;

	}

	@Override
	public void add() {
		database.add();

	}

}
