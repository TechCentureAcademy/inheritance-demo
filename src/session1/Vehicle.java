package session1;

//parent class/ super class
public class Vehicle {

	
	private int vinNumber;
	
	public void start() {
		System.out.println("Vehicle starting....");
	}
	
	public void move() {
		System.out.println("Vehicle moving....");
	}
	
	public void stop() {
		System.out.println("Vehicle stopped.....");
	}
	
	
	private void hiddenMethod() {
		System.out.println("Some hidden method");
	}
	
	
}

//parent class -> super class
//child class -> sub-class