package ThreadsProgs;


public class ThreadSleepDemo {

	public static void main(String[] args) {
		System.out.println("Application started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Application terminated successfully.......");
		
	}
}
