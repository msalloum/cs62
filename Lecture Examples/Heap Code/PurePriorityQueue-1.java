
public interface PurePriorityQueue<E> { // Does not extend Collection<E>

    // Returns the number of elements in this PurePriorityQueue object.
    int size();

    // Determines if this PurePriorityQueue object has no elements.
    // Returns true if this PurePriorityQueue object has no elements;
    //         otherwise, return false;
    boolean isEmpty();

    // Inserts a specified element into this PurePriorityQueue object.
    // The worstTime(n) is O(n).
    // element - the element to be inserted into this
    //           PurePriorityQueue object.
    void add(E element);

    // Returns the highest-priority element in this
    //   PurePriorityQueue object.  The worstTime(n) is O(1).
    // Returns the highest-priority element in this 
    //   PurePriorityQueue object.
    // Throws NoSuchElementException - if this PurePriorityQueue
    //   object is empty.
    E getMin();

    // Removes the highest-priority element from this
    //   PurePriorityQueue object.  The worstTime(n) is O(log n).
    // Returns the element removed.
    // Throws NoSuchElementException - if this PurePriorityQueue
    //   object is empty.
    E removeMin();

}
