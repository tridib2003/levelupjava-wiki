class DemoThread implements Runnable {
	
	Thread th;
	
	DemoThread() {
		th = new Thread(this, "Demo Thread");
		System.out.println("Child thread: " + th);
	}
	
	public void run() {
		
		try {
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("Child thread: " + i);
				Thread.sleep(500);
			}
			
		} catch(InterruptedException exc) {
			System.out.println("Child thread interrupted");
		}
		
		System.out.println("Exit from child thread");
	}
}

public class MultithreadingDemo {

	public static void main(String[] args) {
		
		DemoThread dt = new DemoThread();
		dt.th.start(); // starts execution of the child thread
		
		try {
			
			for (int i = 1; i <= 5; i++) {
				System.out.println("Main thread: " + i);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted");
		}

		System.out.println("Exit from main thread");
	}

}
