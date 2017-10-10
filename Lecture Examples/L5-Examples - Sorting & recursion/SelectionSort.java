package SortingAlgorithms;

public class SelectionSort implements SortInterface {

	
	public void sort(int[] array) {
		selectionSortIterative(array);	
		
		// selectionSortRecusive(array, 0); 
	}
		
	
	/**
	* Sorts integer array using iterative selection sort 
	* @param array array of integers to be sorted
	*/
	private static void selectionSortIterative(int[] array) {		
		for(int i = 0; i < array.length; ++i) {
			int min = indexOfSmallest(array, i); 			
			swap(array, i, min);			
		}
	}
		
		
	private static void selectionSortRecursive(int[] array, int startIndex) {
		if(startIndex < array.length) {

			// find smallest element in array[startIndex...n]
			int smallest = indexOfSmallest(array, startIndex);

			// move largest element to position startIndex
			swap(array, smallest, startIndex);

			// recurse on everything to the left of startIndex
			selectionSortRecursive(array, startIndex+1);

		}
	}
	
	/**
	 * @param array array of integers
	 * @param startIndex valid index into array
	 * @return index of smallest value in array[startIndex...n]
	 */
	protected static int indexOfSmallest(int[] array, int startIndex) {		
		int smallest = startIndex;
		for(int i = startIndex+1; i < array.length; ++i) {
			if(array[i] < array[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}

	
	/**
	 * Swaps array[n1] and array[n2]
	 * 
	 * @param array array of integers
	 * @param n1 valid index into array
	 * @param n2 valid index into array
	 * @throws IllegalArgumentException if n1 or n2 are not valid indices
	 */
	protected static void swap(int[] array, int n1, int n2){
		if(n1 >= array.length || n2 >= array.length || n1 < 0 || n2 < 0) {
			throw new IllegalArgumentException("Invalid array indices");
		}

		int tmp = array[n1];
		array[n1] = array[n2];
		array[n2] = tmp;
	}


	@Override
	public void sort(Object[] array) {
		// TODO Auto-generated method stub
		
	}

	
}
