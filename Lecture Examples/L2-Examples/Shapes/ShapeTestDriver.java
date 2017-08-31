package Shapes;
public class ShapeTestDriver
{
	public static void main(String[] args)
	{
	    
	    Circle circle = new Circle(5); 			// Create a circle
	    Cylinder cylinder = new Cylinder(5, 2);  	// Create a cylinder
	    Square square = new Square(4);				// Create a square

	    // Now lets compare these different shapes
	    double circle_area = circle.findArea();
	    System.out.println(circle.toString() + "\nArea of circle: " + circle_area);
	    
	    double cylinder_area = cylinder.findArea();
	    System.out.println(cylinder.toString() + "\nArea of cylinder: " + cylinder_area);
	    
	    double square_area = square.findArea();
	    System.out.println(square.toString() + "\nArea of square: " + square_area);
	    
	    // lets assign the shapes to an array
	    Shape arr[] = new Shape[3];
	    arr[0] = circle;
	    arr[1] = cylinder;
	    arr[2] = square;
	    
	    Shape max = arr[0];
	    
	    for(int i=1; i < arr.length; i++)
	    {
	    	if (max.compareTo(arr[i]) < 1)
	    		max = arr[i];
	    }
	    
	    System.out.println("\n\nThe largest shape has an area of : " + max.findArea());
	    
	  
	}
}




