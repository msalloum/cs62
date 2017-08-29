package L1;
/*

 Conditionals with nested if...else's

 */

public class Cond3 {

    public static boolean isEven (int n) {
	return (n % 2 == 0);
    }

    public static double nestedIfElseTest (int n) {
	if (n > 0) {
	    if (isEven(n)) {
		return Math.exp(n);
	    }
	    else {
		if (n > 2000) {
		    return Math.log(n);  // natural log
		}
		else {
		    return Math.log10(n); // base 10 log
		}
	    }
	}
	else if (n == 0) {
	    return n;
	}
	else {  // n < 0
	    if (isEven(n)) {
		return Math.log(n);
	    }
	    else {
		return Math.exp(n);
	    }
	}
    }


    public static void main (String[] args) {

	System.out.println("nestedIfElseTest, 40: " + nestedIfElseTest(40));

	System.out.println("nestedIfElseTest, 45: " + nestedIfElseTest(45));

	System.out.println("nestedIfElseTest,  0: " + nestedIfElseTest(0));

	System.out.println("nestedIfElseTest, -40: " + nestedIfElseTest(-40));

	System.out.println("nestedIfElseTest, -45: " + nestedIfElseTest(-45));

    }


}

