
import java.util.*;

public class Heap<E> implements PurePriorityQueue<E> {

    protected static final int DEFAULT_INITIAL_CAPACITY = 11;

    protected ArrayList<E> list;

    protected Comparator<E> comparator;

    // Initializes this Heap object to be empty, with a given
    //   initial capacity, and elements ordered by the given
    //   Comparator object.
    // initialCapacity - the initial capacity of this Heap object.
    // comp - the Comparator object.
    //
    public Heap(int initialCapacity, Comparator<E> comp) {
        list = new ArrayList<E>(initialCapacity);
        comparator = comp;
    }

    // Initializes this Heap object to be empty, with a default
    //   initial capacity and with elements in a class that
    //   implements the Comparable interface.
    //
    public Heap() {
        this(DEFAULT_INITIAL_CAPACITY, null);
    }

    // Initializes this Heap object to be empty, with a given
    //   initial capacity and with elements in a class that
    //   implements the Comparable interface.
    // initialCapacity - the initial capacity of this Heap object.
    //
    public Heap(int initialCapacity) {
        this(initialCapacity, null);
    }

    // Initializes this Heap object to be empty, with a default
    //   initial capacity and with elements compared according to
    //   the Comparator object comp.
    // comp - the Comparator object used for comparing
    //        elements in this Heap object.
    //
    public Heap(Comparator<E> comp) {
        this(DEFAULT_INITIAL_CAPACITY, comp);
    }

    // Initializes this Heap object to a shallow copy of a
    //   specified Heap object.  The elements in this Heap object
    //   will be compared as in the specified Heap object.
    //   The worstTime(n) is O(n), where n is the number of 
    //   elements in the specified Heap object.
    // otherHeap - the specified Heap object to be copied to
    //   this Heap object.   
    //
    public Heap(Heap<E> otherHeap) {   // copy constructor
        list = new ArrayList<E>(otherHeap.list);
        comparator = otherHeap.comparator;
    }
    
    // Returns the number of elements in this PurePriorityQueue object.
    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Inserts a specified element into this Heap object.
    //   The worstTime(n) is O(n) since the arraylist may have to
    //       expand. averageTime(n) is constant though (see p 753)
    //
    public void add(E element) {
        list.add(element);
        percolateUp();
    }

    // Restores the heap properties to this Heap object,
    //  which was a heap, except, possibly, at index size() - 1.
    //  The worstTime(n) is O(log n), and averageTime(n) is constant.
    //
    protected void percolateUp() {
        int child = list.size() - 1;
        int parent;

        while (child > 0) {
            parent = (child - 1) / 2;  // parent's index = (child - 1)/2
            if (compare(list.get(child), list.get(parent)) >= 0) {
                break;
            }
            swap(parent, child);
            child = parent;
        }
    }

    // Compares two specified elements according to Comparable
    //   or a Comparator object.
    // element1 - one of the specified elements.
    // element2 - the other specified element.
    // Returns a negative integer, 0, or a positive integer,
    //   depending on whether element1 is less than, equal to,
    //   or greater than element2.
    //
    protected int compare(E element1, E element2) {
        return (comparator == null ?
                ((Comparable<E>)element1).compareTo(element2) :
                comparator.compare(element1, element2));
    }
    
    protected void swap(int parent, int child) {
        E temp = list.get(parent);
        list.set(parent, list.get(child));
        list.set(child, temp);
    }

    // Returns the smallest-valued element in this Heap object.
    // throws NoSuchElementException - if this Heap object is empty.
    public E getMin() {
        return list.get(0);
    }

    // Removes the smallest-valued element from this Heap object.
    //   The worstTime(n) is O(log n).
    // Returns the element removed.
    // throws NoSuchElementException - if this Heap object is empty.
    //
    public E removeMin() {
        E minElem = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        percolateDown(0);
        return minElem;
    }

    
    // Restores the heap properties to this Heap object, which
    //   is a heap except, possibly, at a specified position.
    // The worstTime(n) is O(log n).
    // start - the specified position where the restoration
    //         of the heap will begin.
    //
    protected void percolateDown(int start) {
        int parent = start;
        int child = (2 * parent) + 1;  // Lc = 2 p + 1
        while (child < list.size()) { 
            if (child < list.size() - 1 &&
                compare(list.get(child), list.get(child+1)) > 0) {
                child++; // child indexes smaller of the 2 children
            }
            if (compare(list.get(child), list.get(parent)) >= 0) {
                break;
            }
            swap(parent, child);
            parent = child;
            child = (parent << 1) + 1;  // parent << 1 is faster
        }                               // than 2 * parent
    }
    
}


