// See how throw is used.
// Also try two different ways suggested in main.
// Also see how exceptions are propagated between methods

public class SmallerMain {

    public static void main(String[] args) {

	// ***

	try {
	    System.out.println(smaller(2.0, 7.15));
	}
	catch (ArithmeticException ae) {
	    System.out.println(ae.getMessage());
	}

        System.out.println("Middle . . . ");
        
	try {
	    System.out.println(smaller(2.0, 2.15));
	}
	catch (ArithmeticException ae) {
	    System.out.println(ae.getMessage());
	}

	// What would happen if you move the next line to
	// where *** is?
        //	System.out.println(smaller(2.0, 7.15));
    }


    public static double smaller(double price1, double price2) {

	if (Math.abs(price1 - price2) > Math.min(price1, price2)) {
	    throw new ArithmeticException("difference too large");
	}
	return Math.min(price1, price2);
    }

}
