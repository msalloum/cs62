package Shapes;


public class Cylinder extends Circle {
	/** length of this cylinder */
	private double length;

	/** Construct a cylinder with specified radius and length */
	public Cylinder(double radius, double length) {
		super(radius);
		this.length = length;
	}

	/** Return length */
	public double getLength() {
		return length;
	}

	/** Return the surface area of this cylinder. 
	 * The formula is 2 * circle area + cylinder body area */
	@Override
	public double findArea() {
		return 2 * super.findArea() + 2 * getRadius() * Math.PI * length;
	}

	/** Return the volume of this cylinder */
	public double findVolume() {
		return super.findArea() * length;
	}

	@Override
	public String toString() {
		return "Cylinder length = " + length +
				" radius = " + getRadius();
	}

}