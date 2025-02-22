package ThreadsProgs;


class Alpha1 implements Runnable{

	@Override
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

class Beta1 implements Runnable{

	@Override
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

class Gama1 implements Runnable{

	@Override
	public void run() {
		greet();
		
	}
	
	public void greet() {
		for(int i=0;i<3;i++) {
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

public class ThreadUsingImplemets {

	public static void main(String[] args) {
		
		//here what the work the thread should do is present in the run method
		//but the run method presnt the alpha,gama, and beta classes okay thats why the we need objects of those three classes 
		//to give the life for the threads we need to use the start method.
		
		Alpha1 a=new Alpha1();
		Beta1 b= new Beta1();
		Gama1 g= new Gama1();
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(g);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
		
	}
}
