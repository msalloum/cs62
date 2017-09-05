import java.util.ArrayList;


public class RunAlg {
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer> ();
		list.add(new Integer(13));
		list.add(new Integer(-1));
		list.add(new Integer(73));
		list.add(new Integer(32));    
		list.add(new Integer(5));
		list.add(new Integer(-15));
		list.add(new Integer(2));
		list.add(new Integer(-34));
    
		System.out.print("\n Before Sorting: ");
		print(list);
		
		/* Lets sort the list of shapes in ascending order of area */
		sort(list);  
		
		System.out.print("\n After Sorting: ");
		print(list);
		
    	Integer n = new Integer(5);
		/* Lets search the list for a shape with equal area */
		int result = binarySearch(list, 0, list.size(), n);
		if(result == -1)
			System.out.println("\n Element not found! ");
		else
			System.out.println("\n Element found at location " + result);
    
	}

	/* Implement a recursive binarySearch */
	public static <T extends Comparable<T>> int binarySearch(ArrayList<T> list, int i, int j, T val)
	{
		if (i >= j)
			return -1;
		
		int mid = (j + i) / 2;
		T midVal = list.get(mid);
		
		int result = val.compareTo(midVal);
		if (result == 0) {
			return mid;
		}
		else if(result < 0) {
			return binarySearch (list, i , (mid-1), val);
		}
		else // result > 0
		{
			return binarySearch (list, (mid+1), j , val);
		}
	}
	
	/* Implement generic insertion sort */
	public static <T extends Comparable<? super T>> void sort(ArrayList<T> list)
	{
		if (list.size() <= 1) // only 1 element, nothing to do
			return; 

		T temp;
		for(int i=1; i < list.size(); i++) {
			temp = list.get(i);
			int j = i-1;
			while ( j >= 0 && list.get(j).compareTo(temp)> 0)
			{
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, temp);
		}
	}
	
	public static <T> void print(ArrayList<T> list)
	{
		for(int i=0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " " );
		}
	}

}
