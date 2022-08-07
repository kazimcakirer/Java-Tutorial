package springIntro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("springIntro")
public class IocConfig {
	
	@Bean
	public ICustomerDal database() {
		return new MsSQLCustomerDal();
	}

}
