package SortingAlgorithms;
import java.util.ArrayList;

/**
 * Implementation of the MergeSort algorithm

 *
 * @param <E> type of data to be sorted
 */
public class MergeSort<E extends Comparable<E>> implements SortInterface<E>{
	
	/**
	 * MergeSort helper method.  Sorts data >= start and < end
	 * 
	 * @param list data to be sorted
	 * @param low start of the data to be sorted
	 * @param high end of the data to be sorted (exclusive)
	 */
	private void mergeSortHelper(E data[], int low, int high){
		if( high-low > 1 ){
			int mid = low + (high-low)/2;
			
			mergeSortHelper(data, low, mid);
			mergeSortHelper(data, mid, high);
			merge(data, low, mid, high);
		}
	}

	/**
	
	 * Merge data >= low and < high into sorted data.  Data >= low and < mid are in sorted order.
	 * Data >= mid and < high are also in sorted order
	 * 
	 * @param data the partially sorted data
	 * @param low bottom index of the data to be merged
	 * @param mid midpoint of the data to be merged
	 * @param high end of the data to be merged (exclusive)
	 */
	public void merge(E data[], int low, int mid, int high){
		Object[] temp = new Object[high-low];
				
		int tempIndex = 0;
		int lowIndex = low;
		int midIndex = mid;
		
		while( lowIndex < mid &&   midIndex < high ){ // while haven't reached end of segments
			
			if( data[lowIndex].compareTo(data[midIndex]) < 1 ){
				temp[tempIndex] = data[lowIndex];
				lowIndex++;
			}else{
				temp[tempIndex] = data[midIndex];
				midIndex++;
			}
			
			tempIndex++;
		}
		
		// copy over the remaining data on the low to mid side if there
		// is some remaining.  
		while( lowIndex < mid ){
			temp[tempIndex] = data[lowIndex];
			tempIndex++;
			lowIndex++;
		}
		
		// copy over the remaining data on the mid to high side if there
		// is some remaining.  Only one of these two while loops should
		// actually execute
		while( midIndex < high ){
			temp[tempIndex] = data[midIndex];
			tempIndex++;
			midIndex++;
		}

		// copy the data back from temp to list 
		for( int i = 0; i < temp.length; i++ ){
			data[i+low] =  (E)temp[i];
		}
	}

	@Override
	public void sort(E[] array) {
		mergeSortHelper(array, 0, array.length-1);
		
	}


	public void printArr(E array[]) {
		
		for (int i=0; i < array.length;i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

}
