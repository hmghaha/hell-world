
public class MyRunnable implements Runnable {
	
	public void run() {
		for(int i = 0; i < 100; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running");
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runner = new MyRunnable();
		Thread alpha = new Thread(runner);
		Thread beta = new Thread(runner);
		alpha.setName("Alpha thread");
		beta.setName("Beta thread");
		alpha.start();
		beta.start();
		
	}
	

}
