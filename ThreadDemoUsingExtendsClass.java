package ThreadsProgs;

class Alpha extends Thread {

	public void run() {
		printOno();

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

}

class Beta extends Thread {

	public void run() {
		printVijay();

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

}

class Gama extends Thread {

	public void run() {
		greet();

	}

	public void greet() {
		System.out.println("GOOD MORNING.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class ThreadDemoUsingExtendsClass {

	public static void main(String[] args) {
		Alpha a1 = new Alpha();

		Beta b1 = new Beta();

		Gama g1 = new Gama();
		
		a1.start();
		
		b1.start();
		
		g1.start();

	}

}
