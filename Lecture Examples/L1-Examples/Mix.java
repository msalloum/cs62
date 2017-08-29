package L1;
/*
   Now we have seen methods, conditionals, and loops, let's see
   how we could combine them to do some interesting work.

   This program has a logical error, can you fix it?

*/

public class Mix {

    public static boolean isEven (int n) {
        /* You could write it this way, but don't!
        if ((n % 2) == 0) {
            return true;
        }
        else {
            return false;
        }
        */
        return ((n % 2) == 0);  // better!
    }


    // Do you see any problem with this function?  Fix it if you do.
    // Precondition: n > 0
    public static int mix1 (int n) {
	int evenSum = 0;
	int oddSum = 0;

	while (n > 0) {
	    if (isEven(n)) {
		evenSum = evenSum + n;
	    }
	    else {
		oddSum = oddSum + n;
	    }
	}
        
	return Math.abs(evenSum - oddSum);
    }


    public static void mix2 (String dir, int n) {
	if (dir == "forward") {
	    int i = 0;
	    while (i <= n) {
		System.out.println(i);
		i = i + 1;
	    }
	}
	else {  // "backward"
	    while (n >= 0) {
		System.out.println(n);
		n = n - 1;
	    }
	}
    }



    public static void main (String[] args) {

	System.out.println(mix1(3));
	System.out.println();

	mix2("forward", 3);

	System.out.println();

	mix2("backward", 3);
    }


}
