/* This example illustrates the difference between 'compareTo' in
 * java.lang.Comparable and 'compare' in java.util.Comparator.
 */

public class UseHeap {

    private static int id = 0;

    private static Student makeStudent() {
        Student s = new Student("Name" + id, id);
        id = id + 1;
        return s;
    }

    public static void main(String[] args) {

        final int SIZE = 5;
        Heap<Student> heap = new Heap<Student>();

        for (int i = 0; i < SIZE; i++) {
            heap.add(makeStudent());
        }
        System.out.println("Students using natural ordering of ids:");
        while (!heap.isEmpty()) {
            System.out.println(heap.removeMin());
        }

        // Once more this time a Heap object containing String
        // elements and the highest priority element will be the
        // longest strings.  We can use the ByLength class.
        // See my detailed explanation in ByLength.java.
        Heap<String> heapbl = new Heap<String>(new ByLength());
        String s = "";
        for (int i = 0; i < SIZE; i++) {
            s = s + "a";
            heapbl.add(s);
        }
        System.out.println("Strings from shortest to longest:");
        while (!heapbl.isEmpty()) {
            System.out.println(heapbl.removeMin());
        }

        // Yet, once more this time a Heap object containing Integer
        // elements and the highest priority element will be the
        // largest integer.  We can use the Decreasing class:
        Heap<Integer> heapi = new Heap<Integer>(new Decreasing());
        for (int i = 0; i < SIZE; i++) {
            // heapi.add(new Integer(SIZE - i));
            heapi.add(SIZE - i);  // Rely on autoboxing
        }
        System.out.println("Integers from largest to smallest:");
        while (!heapi.isEmpty()) {
            System.out.println(heapi.removeMin());
        }

    }

}
