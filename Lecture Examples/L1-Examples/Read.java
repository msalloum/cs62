package L1;

/*

 Many programs that we write will READ some data as input from the user
 (namely keyboard),  perform some COMPUTATION with the input data, and
 finally produce (PRINT) some output (to the computer screen) that the
 user would find useful.  So, there is this read-compute-print mode of
 computing.

 Computer is designed with four basic hardware components: CPU, memory,
 input device(s), and output device(s).  We use CPU and memory to compute
 (roughle speaking), an input device to read input from the user, and
 an output device to print the result to the user.  An input device that
 we will use the most in this course will be the keyboard, called the 
 standard input device.  An output device that we will use the most in
 this course will be the console (computer screen), called the standard
 output device.  Later on in the semester we will write programs that
 read input data from a file rather than from the keyboard, and produce
 output into a file as well rather than to the console.

 First, let's see a simple example on how to read something from the
 keyboard, do some simple computation/calculation with the data that
 was read in, and produce some output to the console just to show you
 the mechanics.  Once we know the basic machanics, we can be more
 creative, which is what you will do in the programming assignment.
 
 We already know how to generate output to the console - use 
 System.out.print(...) or System.out.println(...).  To read from the
 keyboard, we will use the java.util.Scanner class as shown below.

*/

/* Import the Scanner class from the java.util package into the default
 * package that we use, which is java.lang.
 */
import java.util.Scanner;
public class Read {
    public static void main (String[] args) {
	// This is a scanner 'object' that knows how to read from
	// the keyboard some input value such as integers, real numbers,
	// strings (words), etc.  See the Java documentation on Scanner
        // class in the java.util package.  We don't know what an object
        // is yet.  Just assume that you need Line 1 below whenever you
        // want to read something from the keyboard for now.
        //
	Scanner scan = new Scanner(System.in);    // Line 1

        System.out.print("\n\nEnter a Fahrenheit temperature (integer): ");
	// Read an integer.
	int fahr;
	fahr = scan.nextInt();  // nextInt reads an int
	System.out.println("This is the temperature read in: " + fahr);


	System.out.print("\nEnter the gas price per gallon today (real): ");
	// Read a double this time.
	double price;
	price = scan.nextDouble();  // nextDouble reads a double
	System.out.println("$" + price + " a gallon?  ?*((&(^^&%^^%^$$$^!!!");

	System.out.print("\nEnter a word that describes how you feel today: ");
	// Read a string (word) this time.
	String word = scan.next();           // Line 2, next reads a string
	System.out.println(word + "!");
    }

}

/*
 Line 1:
 
 Use of import does not conform to the program structure that we are
 using now, but we will treat it as an exception for now.

 We can actually eliminate import if we are willing to type a little
 more as described below.
 
 The code below is what you would have to write on Line 1 instead 
 if you did not import java.util.Scanner at the top of the file.  

   java.util.Scanner scan = new java.util.Scanner(System.in);


 That is, you would have to use a fully qualified name including the
 package where the class is defined every time we use the name Scanner.
 Otherwise, the compiler would not understand what Scanner means.  To
 eliminate the repeated use of java.util. in front of the name Scanner,
 you can use the import statement once at the top of the file and use
 just the class name without the package qualifier in the rest of your
 file.  If Scanner is used alone, it will try to find the meaning of
 the name Scanner in the Java's default package (i.e., java.lang).  It
 won't find it there.  Since there is an imported package, namely
 java.util, it will try to find it there and it will find it there.
 If java.util is not imported, the compiler won't be able to find the
 meaning of Scanner and generate a compile-time error.

 In Java, System.in refers to the standard input device, which is the
 keyboard.
 
 What is the standard output device called in Java then?  
 Your guess would be right!  System.out which we have been using when
 we printed something out to the screen, i.e., the standard output
 device.
 
*/

/*
 The classes that we create, e.g., Hello, Var, MixedTypes, Read, belong
 to the package named java.lang by default.  So if you want to use
 anything from a different package in a class such as Read, you must
 tell the compiler what from what package you want to use.  As you can
 imagine, all the names in Java are divided into a small number of
 packages and a name is unique in a package.  That is, you cannot have
 two classes with the same name in a package.
*/

/*
 Line 2:

 If you input a sentence rather than a single word, e.g., like this:

    You must be feeling great today.

 What would 'scan.next()' do?  Would it read the entire sentence or
 just one word, i.e., 'You' in this case?  Verify your guess by actually
 running the program with that as your input.

 If you look through the class java.util.Scanner, you will see some
 other functions that do different things.  Take a look.
 

*/
