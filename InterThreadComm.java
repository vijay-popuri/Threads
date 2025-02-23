package ThreadsProgs;

class Producer extends Thread {
	Queue q;
	int data = 1;

	Producer(Queue q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.produce(data++);
		}
	}

}

class Consumer extends Thread {
	Queue q;

	Consumer(Queue q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.consume();
		}
	}

}

class Queue {
	int data;
	boolean flag = false;

	synchronized public void produce(int i) {

		try {
			// data=i;
			if (flag == true) {
				wait();
			} else {
				data = i;
				System.out.println("Data Produced " + data);
				flag = true;
				notify();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	synchronized public void consume() {

		try {

			if (flag == false) {
				wait();
			} else {
				System.out.println("Data consumed " + data);
				flag = false;
				notify();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

public class InterThreadComm {

	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();

	}

}
