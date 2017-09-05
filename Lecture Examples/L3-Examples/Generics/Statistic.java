import java.util.*;

public class Statistic {

	ArrayList list;
	
	public Statistic() {
		list = new ArrayList ();
	}
	
	public void add (Comparable elem) {
		list.add(elem);
	}
	
	public Comparable getElem(int index) {
		return (Comparable) list.get(index);
	}
	
	public int findMin() {
		int minIndex = -1;
		if (list.size() == 0)
			return minIndex;
		
		minIndex = 0;
		Comparable min = (Comparable) list.get(0); // let min be first element
		
		for(int i=1; i < list.size(); i++) {
			if(min.compareTo(list.get(i)) > 0) {
				min = (Comparable) list.get(i);
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
		Comparable max = (Comparable) list.get(0); // let max be first element
		
		for(int i=1; i < list.size(); i++) {
			if(max.compareTo(list.get(i)) < 0) {
				max = (Comparable) list.get(i);
				maxIndex = i;
			}
		}
		return maxIndex;	
	}
}
