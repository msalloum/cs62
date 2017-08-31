package Shapes;

public class Rectangle extends Shape{
	private double width;
	private double height;


	/** Construct a Rectnagle with specified width and height */
	public Rectangle(double width, double height) {
		this.width = width;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Return height  */
	public double getHeight() {
		return height;
	}

	@Override
	public double findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Square width = " + width +
			   " and height = " + height;
	}

}