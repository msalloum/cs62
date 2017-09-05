// Try without the test.txt file created
// and with it created

import java.io.*;

public class MyUtilitiesMain {

    public static void main(String[] args) {
	double[] da = null;
	try {
	    da = new MyUtilities().getDataSet("test");
	}
	catch (BadDataSetException e) {
	    System.out.println("in main: " + e.getMessage());
	}

        System.out.println("Before for in main");
	for (double d : da) {
	    System.out.println(d);
	}
    }
}

class BadDataSetException extends Exception {
}

class MyUtilities {

    public double[] getDataSet(String setName) throws BadDataSetException {

	String file = setName + ".txt";
	FileInputStream in = null;

	try {
            System.out.println("Before. . .");
	    in = new FileInputStream(file);
            System.out.println("After. . .");
	    return readDataSet(in);
	}
	catch (IOException e) {
	    throw new BadDataSetException();
	}
	finally {
            System.out.println("finally. . .");
	    try {
		if (in != null) {
		    in.close();
		}
	    }
	    catch (IOException e) {
		;  // ignore: we either read the data OK
		   // or we're throwing BadDataSetException
	    }
	}
    }

    private double[] readDataSet(FileInputStream in) {
        System.out.println("in readDataSet");
        double[] da = new double[3];
	for (int i = 0; i < da.length; i++) {
	    da[i] = i;
	}
	return da;
    }

}
