package CollectionFramwork;

import java.util.Comparator;

public class MarksheetOrder implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		return o1.getName().compareTo(o2.getName());
	}	
}

class PercentageWise implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		return (int) (o2.getPercentage() - o1.getPercentage());
	}
}

class RollNoWise implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		return o1.getRollNo().compareTo(o2.getRollNo());
	}
	
}
