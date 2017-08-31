package Animals;

public class Dog extends Animal{
	
	
	public Dog(String name, String color) {
		super(name, color);
	}
	
	@Override
	public void speak()  // overwriting method in parent class Animal
	{
		System.out.println("owff");
	}
}
