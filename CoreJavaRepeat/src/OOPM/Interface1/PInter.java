package OOPM.Interface1;

public interface PInter {
	public void show();
}

interface QInter{
	public void show();
}

class PQClass implements PInter, QInter{

	@Override
	public void show() {
		System.out.println("Show at PQ class of PInter and QInter");
	}
	
}
