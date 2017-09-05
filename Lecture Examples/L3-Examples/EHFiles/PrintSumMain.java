// Multiple catch blocks with a try
// Note: these exceptions being caught are indepentdent of each other
//       that is, there is no superclass-subclass relationship between
//       any pair.

import java.util.*;
import java.io.*;

public class PrintSumMain {

    public static void main(String[] args) {
	printSum("50 30");	

	System.out.println("\n\n");
	printSum(null);	

	System.out.println("\n\n");
	printSum("50");	

	System.out.println("\n\n");
	printSum("50 4.5");	
    }

    /**
     *  Prints the sum of the two int values in a specified String object.
     *
     *  @param s - the String object that consists of two int values.
     *	 
     */
    public static void printSum (String s) {
       	try {
	    StringTokenizer st = new StringTokenizer(s);
	    int first = Integer.parseInt(st.nextToken());
	    int second = Integer.parseInt(st.nextToken());
	    System.out.println("The sum of " + first + " and " +
			       second + " is " + (first + second));
       	}
        catch (NullPointerException e1)	{
	    System.out.println(e1 + " because s is null");
       	}
        catch (NumberFormatException e2) {
	    System.out.println(e2 + " is not an integer");
       	}
       	catch (NoSuchElementException e3) {
	    System.out.println(e3 + " because there must be two ints");
       	}

       	System.out.println("...continuing with the rest of the program");
   }

}
