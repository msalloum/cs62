package Shapes;

public class Square extends Shape{
	private double width;


	/** Construct a Square with specified width and height */
	public Square(double width) {
		this.width = width;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	@Override
	public double findArea() {
		return width * width;
	}

	@Override
	public String toString() {
		return "Square side = " + width ;
	}

}