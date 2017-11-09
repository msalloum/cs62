import java.util.*;


/* The String class in Java implements the Comparable interface with a
 * compareTo method that reflects a lexicographic ordering.
 * What if we did not want the "natural" ordering?
 * For applications in which the "natural" ordering--through the Comparable
 * interface--is inappropriate, elements can be compared with the
 * java.util.Comparator interface.  The Comparator<T> interface has
 * a method with the following signature:
 *
 *       int compare(T o1, T o2)
 *
 * See the details on the Java docs page.
 *
 * The ByLength class below shows an example.  See how it is used in
 * conjunction with Heap and UseHeap.  This is used to compare two strings
 * using their lengths rather than the natural ordering.
 *
 * One advantage of using a Comparator object is that no changes need be made
 * to the element class.
 */
public class ByLength implements Comparator<String> {

    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 == len2) {
            return s1.compareTo(s2);
        }
        return len1 - len2;
    }

}
