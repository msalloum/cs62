package Shapes;
//////////////////////////////////////////////////////////////////////
public abstract class Shape implements Comparable {
	
	/** Return the area of this shape */
	public abstract double findArea();
	
	/** Return the perimeter of this shape */
	//public abstract double findPerimeter();
	
	/* What happens if we un-comment the findPerimeter() method?
	 * Since this method is abstract, it requires sub-classes to implement this method
	 * or to be declared abstract. 
	 */
	
	/** Implement the compareTo method defined in Comparable */
	@Override
	public int compareTo(Object o)
	{
		if (findArea() > ((Shape)o).findArea())
			return 1;
		else if (findArea() < ((Shape)o).findArea())
			return -1;
		else
			return 0;
	}

}
//////////////////////////////////////////////////////////////////////