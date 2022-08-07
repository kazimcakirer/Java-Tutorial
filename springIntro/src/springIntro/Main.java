package springIntro;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IService servis = context.getBean("service", IService.class);
		
		servis.add();

	}

}
