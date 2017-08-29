package L1;

public class Operators {

    public static void main (String[] args) {

	int n = 25;

	int m = 4;

	int quotient = n / m;         // Line 1
	System.out.println("\nQuotient = " + quotient);

	int remainder = n % m;        // Line 2
	System.out.println("Remainder = " + remainder);

	double div = n/m;             // Line 3
	System.out.println("Div = " + div);

        double div2 = (double)n/m;    // Line 4
	System.out.println("Div2 = " + div2);

	div2 = (double)n/(double)m;    // Line 4a
	div2 = (double)(n/m);          // Line 4b
    }

}

/*

The operator '/' is the division operator.  However depending on
the types of operands, it exhibits different meanings.

On Line 1, operands are both integers, so it will do integer division,
meaning the fractional part is truncated.

On Line 3, n/m will compute an integer 6, but it will be automatically
converted into a floating point number (double), i.e., 6.0, as it is
assigned to div since div is declared to be of type double, and converting
the int value 6 to a double number 6.0 does not change the precision.

On Line 4, (double)n forces the value of n (25) into a double 25.0.
Since one operand of / is a double and the other is an int, Java decides
to do a real division since real is more general than integer.  So, it
will convert m into double automatically and do the real number division, 
producing 6.25 which is then assigned to div2.  What would Lines 4a and 4b
do?

Finally, the '%' operater on Line 2 computes the remainder.  You will find
this operator very useful as you work on Problem Set 2.

So operators that you will often use include:

  + (addition)

  - (subtraction)

  * (multiplication)

  / (division)

  % (modulo)

There is precedence among operators.  If you are not sure or if you want
to make it clear, use prentheses liberally.
For example,

      34 + 30 * 21 - 10 / 20

is equivalent to 

      34 + (30 * 21) - (10 / 20)

Also

      double div2 = (double)n/m;     // Line 4

is equivalent to 

      double div2 = ((double)n)/m;   // Line 4

*/
