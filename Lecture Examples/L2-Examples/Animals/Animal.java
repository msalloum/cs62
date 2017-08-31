package Animals;


public abstract class  Animal {
	String name;
	String color;
	
	public Animal (String name, String color)
	{
		this.name = name;
		this.color = color;
	}
	
	public void speak()
	{
		System.out.println("I'm an animal");
	}
	
	public static void main (String args[])
	{
		Animal a1;
		a1 = new Dog("Fido", "gray");
		a1.speak();
		
		a1 = new Cat("Cleo", "black and white");
		a1.speak();
		
		// Check if is a cat
		if (a1 instanceof Cat) {
			System.out.println("Yep... its a cat");
		}
		
		Animal a2 = new Cat ("Madi", "black and white");
		System.out.println("Are equal: " + a1.equals(a2));
		
		Animal d2 = new Dog ("Madi", "black and white");
		System.out.println("Are equal: " + a1.equals(d2));
		
		
		
	}
	
}
