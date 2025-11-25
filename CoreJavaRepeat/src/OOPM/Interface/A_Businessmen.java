package OOPM.Interface;

public class A_Businessmen extends A_Person implements A_Richman {
	private String bussiness;

	public String getBussiness() {
		return bussiness;
	}

	public void setBussiness(String bussiness) {
		this.bussiness = bussiness;
	}

	@Override
	public void earnMoney() {
		System.out.println("Businessmen Earn't 500 crore Per Month.");

	}

	@Override
	public void party() {
		System.out.println("Businessmen throw party worth 5 crore.");
	}

	@Override
	public void donation() {
		System.out.println("Businessmen donate 2 crore.");
	}

}
