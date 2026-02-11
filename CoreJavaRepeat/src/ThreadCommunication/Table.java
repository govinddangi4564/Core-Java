package ThreadCommunication;

public class Table {
	int food;
	boolean hasFood = false;

	public synchronized void produce(int food) {
		while (hasFood) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.food = food;
		hasFood = true;
		System.out.println("Food is produced : " + food);
		notify();
	}

	public synchronized int consume() {
		while (!hasFood) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Food is consumed : " + food);
		hasFood = false;
		notify();

		return food;
	}
}

class Producer extends Thread {
	Table table;

	public Producer(Table table) {
		this.table = table;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			table.produce(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {
	Table table;

	public Consumer(Table table) {
		this.table = table;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			table.consume();

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
