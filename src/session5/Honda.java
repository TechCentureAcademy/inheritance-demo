package session5;

public class Honda {

	private final int id = 1;
	
	public void drive() {
		System.out.println("Honda driving");
	}
	public final void finalMethod() {
		System.out.println("final method");
	}
}

class Honda2 extends Honda{
	
		
	public void drive() {
		System.out.println("Honda2 driving");
	}
}


final class Civic extends Honda{
	
	public void drive() {
		System.out.println("Civic driving");
	}
	
}

