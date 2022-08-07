package springIntro3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);

		ICustomerService service = context.getBean("service", ICustomerService.class);

		service.add();

	}

}
