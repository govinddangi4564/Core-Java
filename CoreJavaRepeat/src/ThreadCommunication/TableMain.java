package ThreadCommunication;

public class TableMain {
	public static void main(String[] args) {
		
		Table table = new Table();
		Producer producer = new Producer(table);
		Consumer consumer = new Consumer(table);
		
		consumer.start();
		producer.start();
	}
}
