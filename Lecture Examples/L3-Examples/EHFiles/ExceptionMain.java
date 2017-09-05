// Try to understand the control flow with try-catch

import java.io.*;

public class ExceptionMain {

    public static void main(String[] args) {
	ExceptionHandling.try1();
    }

}

class ExceptionHandling {

    public static void try1() {
	System.out.println("start of try1");
	try {
	    try2();
	}
	catch (IOException e) { 
	    System.out.println (e + "something went wrong with IO");
	}
	System.out.println ("end of try1");
    }

    public static void try2() throws IOException {
	System.out.println("start of try2");
	try3();
	System.out.println("end of try2");
    }

    public static void try3() throws IOException {
	System.out.println("start of try3");
	throw new IOException("IO error in method try3: ");        	
    }

}
