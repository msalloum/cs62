package Shapes;

///////////////////////////////////////////////////////////
class Circle extends Shape 
{
	/** The radius of the circle */
	private double radius = 1;
	
	/** Construct a circle with a specified radius */
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
		
	@Override
	public double findArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle radius = " + getRadius();
	}
}
//////////////////////////////////////////////////////////////////