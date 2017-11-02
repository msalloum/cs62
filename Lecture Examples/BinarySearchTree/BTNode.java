class BTNode<T extends Comparable<T>> 
{
	T data;
	BTNode<T> left;
	BTNode<T> right;
	
	public BTNode (T initialData)
	{
		data = initialData;
		left = null;
		right = null;
	}
	
	public BTNode (T initialData, BTNode<T> initialLeft, BTNode<T> initialRight)
	{
		data = initialData;
		left = initialLeft;
		right = initialRight;
	}
}