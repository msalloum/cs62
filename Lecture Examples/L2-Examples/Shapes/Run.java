package Shapes;

public class Run 
{
	public static void main(String[] args)
	{
		
	    Circle circle1 = new Circle(10); 			// Create a circle
	    Cylinder cylinder1 = new Cylinder(5, 2);  	// Create a cylinder
	    Square square1 = new Square(4);				// Create a square

	    // Now lets compare these different shapes
	    double circle_area = circle1.findArea();
	    System.out.println(circle1.toString() + "\nArea of circle: " + circle_area);
	    
	    double cylinder_area = cylinder1.findArea();
	    System.out.println(cylinder1.toString() + "\nArea of cylinder: " + cylinder_area);
	    
	    double square_area = square1.findArea();
	    System.out.println(square1.toString() + "\nArea of square: " + square_area);
	    
	    Shape max;
	    
	    if(circle1.compareTo(cylinder1) > 0)
	    {
	    	System.out.println("area of the circle is bigger than area of the cylinder");
	    	max = circle1;
	    }
	    else
	    {	
	    	System.out.println("area of the circle is smaller or equal to the area of the cylinder");
	    	max = cylinder1;
	    }
	    
	    if(square1.compareTo(max) > 0)
	    {
	    	System.out.println("square is the largest !");
	    }
	    else
	    {	
	    	System.out.println("");
	    } 
	}
}




