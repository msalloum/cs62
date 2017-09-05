import java.util.*;

public class StatisticGeneric<T extends Comparable<T>> {

	ArrayList<T> list;
	
	public StatisticGeneric() {
		list = new ArrayList<T> ();
	}
	
	public void add (T elem) {
		list.add(elem);
	}
	
	public T getElem(int index) {
		return  list.get(index);
	}
	
	public int findMin() {
		int minIndex = -1;
		if (list.size() == 0)
			return minIndex;
		
		minIndex = 0;
		T min = list.get(0); // let min be first element
		
		for(int i=1; i < list.size(); i++) {
			if(min.compareTo(list.get(i)) > 0) {
				min = list.get(i);
				minIndex = i;
			}
		}
		return minIndex;	
	}
	
	public int findMax() {
		int maxIndex = -1;
		if (list.size() == 0)
			return maxIndex;
		
		maxIndex = 0;
		T max = list.get(0); // let max be first element
		
		for(int i=1; i < list.size(); i++) {
			if(max.compareTo(list.get(i)) < 0) {
				max =  list.get(i);
				maxIndex = i;
			}
		}
		return maxIndex;	
	}
	
	// implement 'public T findMedian()' method to find median element in list
	
}

