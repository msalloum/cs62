// Simple try-catch example

import java.io.*;

public class PrintHalfMain {

    public static void main(String[] args) throws IOException {
	Numbers.printHalf("50");
	System.out.println("\n\n");
	Numbers.printHalf("5.0");	
    }

}


class Numbers {
    /**
     *  Prints one half of the value of the int in a specified String object.
     *
     *  @param s - the String object that consists of an int.
     * 
     *
     */
    public static void printHalf(String s) {
	try {
	    System.out.println("Half of " + s + " is " +
			       Integer.parseInt(s) / 2);
	}
	catch (NumberFormatException e)	{
	    System.out.println(e + " is not an int");
            System.out.println(e.getMessage());
	}

	System.out.println("\n...continuing with the rest of the program");
    }

}
