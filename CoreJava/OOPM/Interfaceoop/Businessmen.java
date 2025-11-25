package Interfaceoop;

public class Businessmen extends Person implements Richmen{
private String Business;

public String getBusiness() {
	return Business;
}

public void setBusiness(String business) {
	Business = business;
}

@Override
public void earnMoney() {
	System.out.println("Rizwan is a businessmen and he earn 1.4 crore per Months.");
}

@Override
public void Party() {
	System.out.println("Rizwan Give party to his friends. ");
	
}

@Override
public void donation() {
	System.out.println("Rizwan Donates his 20% earning to the poor people and Cherity.");
	
}

}

