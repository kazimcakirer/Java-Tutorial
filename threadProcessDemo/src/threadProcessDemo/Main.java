package threadProcessDemo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Processer processer = new Processer();
		
		processer.start();
		
		
		Thread.sleep(10000);
		
		processer.shutdown();
		
		
		
		
		
	}

}
