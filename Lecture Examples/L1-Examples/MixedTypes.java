package L1;

public class MixedTypes {

    public static void main (String[] args) {

	final double PI = 3.14;  // final means it is a constant

	int radius = 4;

	double area = PI * radius * radius;    // Line 1

	System.out.println("\nRadius = " + radius + ", Area = " + area);

	// This line wouldn't work.
	// int area2 = PI * radius * radius;          // Line 2

	int area3 = (int)(PI * radius * radius);      // Line 3
	System.out.println("\nRadius = " + radius + ", Area = " + area3);
	
	double circumference = 2 * Math.PI * radius;  // Line 4
	System.out.println("\nRadius = " + radius + ", Circumference = "
			   + circumference);
    }

}

/*

 - Line 1: note that we are multiplying an integer with a double number,
           and assign it to a double variable.

           Java does the right thing if it can be done.  This is what
           Java does in this case: it realizes that PI is a double value
           and radius is an integer because that is how they are declared.
           To multiply them together, it first converts 4 (int) into
           4.0 (double) because it can be done without losing any precision
           due to the fact that real is more general (can represent more
           values) than integer.  Then, multiplies 3.14 and 4.0.  The
           result of that is then multiplied by 4.0 again.  The order of
           evaluation is from left-to-right as long as the precedence of
           the operators are at the same level.
           Finally the calculated value is assigned as the value of area.

 - If you change Line 1 to this:

	int area2 = PI * radius * radius;    // Line 2

   You will get a compile time error.  Java compiler realizes that
   assigning a double into a variable of type int would lose precision,
   so it won't allow it.

   If you want to force the issue, then you can actually override what
   the compiler wants to do.  You do that by forcing the type conversion
   against the will of the compiler.  We call this typecasting, and we do
   that as shown on Line 3.

	int area3 = (int)(PI * radius * radius);    // Line 3

   I wonder how much of all this is intuitive to you.  As you learn
   the language Java (or any langugage for that matter), see if things
   are intuitive or not.  The language designers try very hard to make
   things intuitive to humans.

   We deal with types in math as well, but never rigidly like we do in
   computer languages.  It is necessary that we get picky about these
   things in most languages because they are related to how data are
   represented in hardware.  We will talk about this when I explain
   how data types for Java are represented in hardware later.

 - What does 'final' mean?

   It means that PI is a constant.  That is, it is NOT a variable.
   In other words, your program is not allowed to change the value
   once a constant is given a value.

   So, this is legal:
   
	final double PI = 3.14;

   Would this be legal?  No.

	final double PI;
	PI = 3.14;

   How about this? No.

	final double PI;
	PI = 3.14;
        PI = 4.22;

 - Useful things like PI is already defined in Java, and if you want to
   use the one already defined in Java for PI, you use 'Math.PI' as I
   used it on Line 4.

   If you want to see other mathematical things that are also defined
   in Java, go to the "Browse the J2SE 6.0 API documentation" link on
   the class web page and find and click on "Math" under "All Classes".
   If you want to obtain an absolute value of a double value, e.g.,
   -34.56, you can use Math.abs(-34.56) or Math.abs(rate) if rate is
   a variable of type double.

   As you see on that web site, there are MANY classes defined in the
   Java's libraries.  We will use some of them this semester, Math
   being one of them.

   On that web site, you see the term "Packages".  In Java they call a
   library a package.  If you click on "java.lang", you will see the 
   classes that are included in that library (package) alone.  There
   you will see one named Math.  That means Math belongs to the package
   java.lang, meaning java.language.

   The naming convention in Java for the things that are defined in a
   class is that you use the dot ('.') operator.  That is, we use the
   class name followed by a dot followed by something that is defined
   in the class, e.g., Math.PI.  We refer to a function defined in a
   class in a similar manner, e.g., for the abs function in Math we do
   Math.abs(-34.2) which returns 34.2.

   The packages that we will use the most this semester are java.lang
   and java.util.  Packages use the dot ('.') notation.  Packages are
   organized in a hierarchical fashion.  java (lower-case j here) is
   a package that is divided into smaller packages, e.g., lang, util,
   etc.  We use the dot notation to refer to a sub-package within a
   package, e.g., java.lang, java.util, etc.

   In one of the next examples (Read.java), we will use a class named
   "Scanner" in the package java.util.

   The classes that we create, e.g., Hello, Var, MixedTypes, belong to
   the package named java.lang by default.  I will say more about it
   in one of the next examples, Read.java.

*/
