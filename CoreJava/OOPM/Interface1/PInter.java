package Interface1;

public interface PInter {
	public void show();
	
	public default void hello() {
		System.out.println("I am hello at PInter");
	}
	
	public static void main(String[] args) {
		PQ ob = new PQ();
		ob.show();
		ob.hi();
	}
}

interface QInter{
	public void hi();
	
	public default void wish() {
		System.out.println("Wish you from QInter");
	}
}

class PQ implements PInter, QInter{
	
	@Override
	public void hi() {
		System.out.println("Hi from P at PQ");
	}
	
	@Override
	public void show() {
		System.out.println("Show from Q at PQ");
	}
}