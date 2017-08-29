package L1;
/*

 We will see how we make choices in our programs.  A few examples of making
 choices would be:

   - I will go hiking tomorrow if the weather is nice or stay home if not.

   - Given an integer, if it is even, do one thing and do something else
     if odd.

 Note that conditionals are absolutely necessary in programming languages.
 In fact, a programming langauge without conditionals would not be
 considered a programming language.

 We use conditional statements to express this concept.  Let's see how we
 do that in Java.  

 A conditional statement is of the following form.  That is, this is the
 syntax of an "if statement":

       if (<booleanExpression>) {
          <true_branch_statement>
       }
       else {
          <false_branch_statement>
       }

The meaning (semantics) of this statement is as follows:  

   Evaluate the <booleanExpression> first.  If the value is true, then do
   <true_branch_statement>.  If the value is false, then do
   <false_branch_statement>.  So, it will end up taking one or the other
   but never both.

*/

public class Cond {

    // isEven checks if n is even or not
    public static boolean isEven (int n) {
        return ((n % 2) == 0);
    }


    // isInRange checks if a is in (m, n]
    public static boolean isInRange (int a, int m, int n) {
	boolean isGreater = m < a;
	boolean isLess = (a <= n);  // parens are not necessary, but
                                    // make it easier to read.
	return (isGreater && isLess);
        // Could've written the whole thing in one line like this:
        // return ((m < a) && (a <= n));
    }


    public static void main (String[] args) {
	int num = 101;

        if (num > 100) {
            System.out.println(num + " is greater than 100");
        }

	if (isEven(num)) {
	    System.out.println(num + " is even.");
	}
	else {
	    System.out.println(num + " is odd.");
	}

	num = 6000;
	if (isInRange(num, 2000, 6000)) {
	    System.out.println(num + " is in range.");
	}
	else {
	    System.out.println(num + " is not in range.");
	}

	boolean b = 3 != 4;
	System.out.println(b);

    }

}

