package springIntro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);		
		ICustumerService service = context.getBean("service", CustomerService.class);		
		service.add();

	}

}
