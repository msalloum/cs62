import java.util.*;

public class HeapSort {

    public static void main(String[] args) {

        Integer[] intArray = {59,46,32,80,46,55,87,43,44,81, 
                              95,12,17,80,75,33,40,61,16,50};
        
        ArrayList<Integer> scores = new ArrayList<Integer>(intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            scores.add(intArray[i]);
        }

        System.out.println(scores);
        heapSort(scores);
        System.out.println(scores);
    }


    // Sorts a specified List object into the order determined
    //   by the compareTo method in the elements’ class.
    //   The worstTime(n) is O(n log n).   
    // aList - the List object to be sorted.
    
    public static <E> void heapSort(List<E> aList) {
        
        Heap<E> aHeap = new Heap<E>(aList.size());
        
        for (E element : aList) {
            aHeap.add(element);
        }
        aList.clear();

        // Copy elements, smallest to largest, from heap to aList:
        while (aHeap.size() > 0) {
            aList.add(aHeap.removeMin());
        }
    }

}
