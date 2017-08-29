package L1;

public class Var {

    public static void main (String[] args) {

	int width;   // Declare a variable
	width = 10;  // and initialize in two lines

	int height = 20; // Do both in one line

	int area;
	area = width * height;

	System.out.println();
	System.out.println("Width is " + 10);       // Role of " and "
	System.out.println("Height is " + height);  // Role of +

	System.out.println("Area of a rectangle with two sides 10" +
			   " and " + height + " is " + area);


	// Now, let's scale (enlarge) the rectangle:
	int xScaleFactor = 2;
	int yScaleFactor = 3;
	width = width * xScaleFactor;
	height = height * yScaleFactor;
	area = width * height;
	System.out.println("\nArea of a rectangle with two sides " +
                           width + " and " + height + " is " + area);

        // How about this one?:
	System.out.println(20 + 30 + "Width is " + 10 + 20);
    }

}

/*

 - width, height, area, xScaleFactor, yScaleFactor are called variables.

 - A variable gets created when it is declared.  You declare one by giving
   the type name followed by the variable name followed by a semicolon,
   e.g.,

          int width;
   
   Optionally you can assign an initial value, e.g.,

          int height = 20;

   The variable width is said to be of type 'int' (short for integer),
   which means that you can assign only an integer as a value of width.

   When and only when a variable is declared, a piece of memory large enough
   to hold a value of the type used, e.g., 32 bits of memory for int in this
   case, is allocated in memory somewhere.  Where? You don't really need to
   care where at this point.
   
 - You can assign a value to a variable.  You can update the value of
   a variable as many times as you wish.  Note that each and every
   occurrence of the name width in the example above refers to the same
   memory location, the one created by the declaration of that variable.

 - The '=' operator is called the 'assignment operator', meaning you can
   assign a value to a variable using the operator.

 - 'area = width + height;' is an example of assignment statement.

   How many assignment statements are there in the main function above?

 - The grammar of an assignment statement is the following:

    <identifier> = <expression>;

   . This means: an identifier followed by '=' followed by an expression
     followed by a semicolon (;).

   . The variables width, height, area, xScaleFactor, and yScaleFactor are
     identifiers.  We don't call Var (used as a class name in the program)
     a variable because we can't change the value of it as we would change
     the value of width - as many times as we want even.

   . Expression is something that has a value.  That is, if you evaluate an
     expression, it produces a value.  34 is an expression since it produces
     the number 34 as a value.  4 + 5 is an expression that produces the
     value 9.  x + y is an expression if x and y are valid expressions
     themselves, i.e., they are each a variable with a value.  For example,
     if x's value is 3 and y's value is 2, then x + y evaluates to 5.
     I will say more about expressions in class.

 - Note how I used System.out.println();

 - Note how I used '\n' in the System.out.println...

*/
