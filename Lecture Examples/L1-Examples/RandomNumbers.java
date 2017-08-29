package L1;

import java.util.Random;

public class RandomNumbers {

    public static void main (String[] args) {

	// randgen is an instance (aka an object) of type Random.
	// It is created by invoking a constructor of the class
	// Random.  Random() is calling (invoking) the constructor.
	// We call constructors using the 'new' operator.  Note that
	// a constructor has the same name as the class itself.  A
	// class may have multiple constructors as long as their
	// parameter lists are distinct.  In the example below, we
	// are calling the constuctor that does not take any argument.
	// The constructor that has no parameter is called the default
	// constructor given a class.
	// 
	// This randgen object which is an instance of the class Random
        // is an object that knows how to generate random numbers.  We
        // can generate random numbers by calling one of many methods
        // defined in the Random class, e.g., nextInt(), nextInt(100),
        // nextFloat(), etc.  See the Java doc for information on other
        // available methods in that class.  Note that Random is a
        // class defined in the package (library) named java.util as
        // you see in the import statement above.  We have seen another
        // class defined in that package that we have used, what was it?

	Random randgen = new Random();

	System.out.println("A random integer: " + randgen.nextInt());

	System.out.println("0...9: " + randgen.nextInt(10));

	System.out.println("1...10: " + (randgen.nextInt(10) + 1));

	System.out.println("1...10 ???: " + randgen.nextInt(10) + 1);

	System.out.println("-10...9: " + (randgen.nextInt(20) - 10));

	System.out.println("Float, 0...1: " + randgen.nextFloat());
    }

}
