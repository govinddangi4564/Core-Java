package OOPM.Interface1;

public interface AInter {
	public default void show() {
		System.out.println("Show method at AInter");
	}
}

interface BInter{
	public default void hello() {
		System.out.println("Hello method at BInter");
	}
}

class ABclass implements AInter, BInter{
	public void hii() {
		System.out.println("Show method at ABInter");
	}
}
