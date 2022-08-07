package threadProcessDemo;

public class Processer extends Thread {
	private volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			System.out.println("running");
		}
	}

	public void shutdown() {
		this.running = false;
	}

}