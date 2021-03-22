package session2;

//there is an IS-A relationship between cat and animal
//cat is an animal
//Cat IS-A Animal
public class Cat extends Animal{

	public String eyeColor;
	public String whiskers;
	
	
	public Cat(String color, int size, String type, boolean isDangerous
			, String eyeColor, String whiskers) {
		
		super(color, size, type, isDangerous);
		this.eyeColor = eyeColor;
		this.whiskers = whiskers;
		
	}
	
	public void meow() {
		System.out.println("Cat is meowing....");
	}
	
	public void catchMice() {
		System.out.println("Catching mice one by one");
	}
	
	public void drinkMilk() {
		System.out.println("Cat is drinking milk");
	}
	
	public void purring() {
		System.out.println("Cat is purring....");
	}
	
	public void playWithOwner() {
		System.out.println("Playing with owner");
	}


	@Override
	public String toString() {
		return "Cat [eyeColor=" + eyeColor + ", whiskers=" + whiskers + ", color=" + color + ", size=" + size
				+ ", type=" + type + ", isDangerous=" + isDangerous + "]";
	}
	
	
	
	
	
}
