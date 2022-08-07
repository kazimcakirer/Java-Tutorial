package threadProcessDemo;

public class ApplicationSynchronized {

	private int count = 0;

	public static void main(String[] args) {
		ApplicationSynchronized app = new ApplicationSynchronized();
		
		app.doCount();
		

	}
	
	protected synchronized void increment() {
		this.count++;
	}

	private void doCount() {
		Thread  thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<10000;i++) {
					increment();
				}
			}
		});
		Thread  thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<10000;i++) {
					increment();
				}
			}
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("Sayaç : " + count);
	}

}
