package Animals;

public class Cat extends Animal{

	
	
	public Cat(String name, String color)
	{
		super(name, color);
	}
	
	@Override
	public void speak()  // overwriting method in parent class Animal
	{
		System.out.println("meawooo");
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Animal other = (Animal) obj;
		
		if (other instanceof Cat && other.color.equals(this.color)) {
			return true;
		}
		return false;
	}
}
