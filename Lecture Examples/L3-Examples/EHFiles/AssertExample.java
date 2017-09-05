/*
 * prompt> javac AssertExample.java
 * prompt> java -enableassertions AssertExample
 * prompt> java -ea AssertExample                 // this works too
 * prompt> java -disableassertions AssertExample
 * prompt> java -da AssertExample                 // this works too
 *
 */
public class AssertExample {

    public static void main (String[] args) {

        int x = 2;
        int y = 3;

        assert (x > y) : " x is not greater than y.";
        
	System.out.println("Checked okay");

    }
}
