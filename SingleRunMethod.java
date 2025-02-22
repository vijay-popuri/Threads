package ThreadsProgs;

class Alpha4 extends Thread {

	public synchronized void run() {
		String thread = Thread.currentThread().getName();
		if (thread.equals("VIJAY")) {
			printVijay();
		} else if (thread.equals("ONO")) {
			printOno();
		} else {
			greet();
		}
	}

	public void printOno() {
		for (int i = 0; i < 5; i++) {
			System.out.println("ONO");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void printVijay() {
		for (int i = 0; i < 4; i++) {
			System.out.println("VIJAY");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void greet() {
		for (int i = 0; i < 2; i++) {
			System.out.println("GOOD MORNING.");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class SingleRunMethod {

	public static void main(String[] args) {
		
		//Hey here if you use the synchronised then the thread which thread schedular that only executes other 
		//will not executed untill it is completed its task.
		

		Alpha4 a = new Alpha4();

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);

		t1.setName("VIJAY");
		t2.setName("ONO");
		t3.setName("GREET");

		t1.start();
		t2.start();
		t3.start();

	}

}
