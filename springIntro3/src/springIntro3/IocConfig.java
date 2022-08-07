package springIntro3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springIntro3")
@PropertySource("classpath:values.properties")
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MsSQLCustomerDal();
	}
	
	@Bean
	public ICustomerService service() {
		return new CustomerService(database());
	}

}
