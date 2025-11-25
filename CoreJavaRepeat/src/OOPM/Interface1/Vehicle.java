package OOPM.Interface1;

//Interface
interface Vehicle {
	void start();
	void stop();
}

//Class 1: Car implementing Vehicle
class Car implements Vehicle {
	@Override
	public void start() {
		System.out.println("Car starts with a key ignition.");
	}

	@Override
	public void stop() {
		System.out.println("Car stops using hydraulic brakes.");
	}
}

//Class 2: Bike implementing Vehicle
class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("Bike starts using self-start or kick.");
	}

	@Override
	public void stop() {
		System.out.println("Bike stops using disc brakes.");
	}
}

//Class 3: Bus implementing Vehicle
class Bus implements Vehicle {
	@Override
	public void start() {
		System.out.println("Bus starts with a heavy diesel engine.");
	}

	@Override
	public void stop() {
		System.out.println("Bus stops using air brakes.");
	}
}
