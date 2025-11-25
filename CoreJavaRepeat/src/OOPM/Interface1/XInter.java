package OOPM.Interface1;

public interface XInter {
	public default void show() {
		System.out.println("Show method at XInter");
	}
}

interface YInter{
	public default void show() {
		System.out.println("Show method at YInter");
	}
}

class XYClass implements XInter, YInter{

	@Override
	public void show() {
		XInter.super.show();
		YInter.super.show();
		
		System.out.println("Show method at XYClass");
	}
	
}
