
public class MainThreadDemo {

	public static void main(String[] args) {
		
		Thread th = Thread.currentThread();
		System.out.println("Current thread: " + th);
		
		th.setName("Demo Thread");
		System.out.println("New thread name: " + th.getName());
	
		try {
			
			for (int n = 1; n <= 5; ++n) {
				System.out.println(n);
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
		
	}
	
}

