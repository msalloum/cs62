import java.util.*;

public class Decreasing implements Comparator<Integer> {

    public int compare(Integer i, Integer j) {
        return (j.compareTo(i));
    }

}
