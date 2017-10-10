package SortingAlgorithms;

public class SortDriver {

	
		public static void main(String args[]) {
			
			Integer arr1[] = {4,7,2,-9,0,33,45,22,-8,6,4,4,3,77};
		
			
			MergeSort m = new MergeSort();
			m.sort(arr1);
			m.printArr(arr1);
		}
		
	
}
