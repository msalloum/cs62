package SortingAlgorithms;

public class BinarySearch<T extends Comparable> {
	
	public static <T extends Comparable<T>> int BSIterative(T arr[], T elem ){	
		int low = 0;
		int high = arr.length-1;
		int mid;
		while(low <= high) {
			mid = (int) Math.floor((low+high)/2);
			if(arr[mid].compareTo(elem) == 0 ) {
				return mid;
			}
			else if (arr[mid].compareTo(elem) > 0) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static <T extends Comparable<T>> int BSRecursive(T arr[], T elem) {
		return BSRecursive_Helper(arr, elem, 0, arr.length-1);
	}
	
	public static <T extends Comparable<T>> int BSRecursive_Helper(T arr[], T elem, int low, int high ){	
	
		int mid;
		if (low > high) {
			return -1;
		}
		else {
			mid = (int) Math.floor((low+high)/2);
			if(arr[mid].compareTo(elem) == 0 ) {
				return mid;
			}
			else if (arr[mid].compareTo(elem) > 0) {
				return BSRecursive_Helper(arr, elem, low, mid-1 );
			}
			else {
				return BSRecursive_Helper(arr, elem, mid+1, high );
			}
		}
	}
	
	public static void main(String args[]) {
		Integer arr1[] = {1,4,6,8,10,24,55,77,99,234,5343};
		String arr2[] = {"A", "C","E","G", "I", "T","Z"};
		
		System.out.println(BinarySearch.BSIterative(arr1, 5));
		assert BinarySearch.BSIterative(arr1, 5) == -2;
		
		System.out.println(BinarySearch.BSIterative(arr2, "C"));
		
		System.out.println(BinarySearch.BSRecursive(arr1, 5340));
		
		System.out.println(BinarySearch.BSRecursive(arr2, "T"));
	}
}
