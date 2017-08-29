package L1;
/*

 Read these comments carefully as you try to understand the program given
 at the bottom of this file.

 Let's keep yesFun with four parameters.

 However, this time it will RETURN something useful.

 The function yesFun in this case must return a value.

 What type of value?  'int' because the return type of yesFun is declared
 to be of type 'int' as in 'int yesFun (...)'.

 Note how the returned value can be used.  Since the returned value is
 an int value, the function call (e.g., yesFun(1, '$', 22.33, "Scheme"))
 can be used in any context where an int value is expected.


 On Line 1, the function yesFun has a 'signature' consisting of:

    (1) the return type of the function, i.e., 'int' in this case,

    (2) the name of the function, i.e., 'yesFun' in this case, and

    (3) the parameter list of the function,
        i.e., (int x, char y, double z, String lang) in this case.

 These three things (return type, function name, and parameter list)
 together uniquely identify a function.  That is, you can tell one
 function from another by looking only at these three things, thus
 the term 'signature'.

 Let's examine the paramter list of yesFun in more detail: It consists
 of four parameters: first one is named 'x' of type 'int', second named
 'y' of type 'char', the third named 'z' of type 'double', and the fourth
 named 'lang' of type 'String'.

 As we have seen so far, a function's parameter list can have zero or
 more parameters.  If it has zero argument, you still have to use an
 empty pair of parentheses, i.e., (), in the definition of the function
 as well as in a call to that function.

 Students often get confused about the meaning of what 'return' means
 when we say a function 'returns' a value of type int.  Line 2 through
 Line 7 in this program are NOT returning anything.  They are merely
 outputting some value to the output device (i.e., the standard output
 device or the screen).  Line 0 and Line 8 with their 'return'
 statements actually 'return' a value, an 'int' value in each of the
 two cases.

 Just like the argument type must match its corresponding parameter's
 type, the return type must make sense in the context where the function
 call was made.  When yesFun is called on Line 9, Line 8 of yesFun
 returns a value of type int (which is consistent with what the return
 type of yesFun says on Line 1).  The returned value would certainly be
 of correct type to be used as we evaluate the rest of Line 9 after the
 call to yesFun is completed.  That is, aaa is an int value; the +
 operator expects to add int values; and yesFun returned an int value;
 thus the + operator will be able to proceed with the addition operation.

 The notion of "procedural abstraction", i.e., doing abstraction with
 procedures (aka functions): It means that we give a name to a piece
 of code, however complex it may be, and refer to it by that name in
 some other parts of a program.  The piece of code becomes an
 abstracted entity represented by that name.  For example, 'square'
 is the name for the code that represents the body of that function.
 Incidentally, that body is very simple, but if it was for 'squareRoot'
 it would be many more lines of code and we can just as simply and
 easily refer to those lines by the simple name 'squareRoot' (or
 'sqrt' as it is often named in a library of a programming language
 including Java, see Math.sqrt(...)).  The abstracted piece of code
 is usually refered to as the black box, thus the term 'black box
 abstraction'.  That is, the abstracted body of the function is treated
 as a black box and we only care about the interface into the function.
 The signature of a function shows the interface to the function.
 As we will see as we continue our study of computer science, this
 is just one of the fundamental concepts used in software design.
 Question: How many instances of such abstracted entities do you see
 in the class Func4?

 Since we are doing it using a function (which is also commonly
 referred to as a 'procedure'), we call this kind of abstraction
 procedural abstraction.  Yes, there are other kinds of abstractions:
 data abstraction for example, which we will talk about later when
 the time comes.
 */

public class Func4 {

    public static int square (int n) {
	return n * n;    // Line 0
    }


    public static int yesFun (int x, char y, double z, String lang) {// Line 1
	System.out.println(lang);                         // Line 2
	System.out.println(x + ", " + y + ", " + z + "," + " fun!"); // Line 3
	System.out.println(x + " yes, it's fun!");        // Line 4
	System.out.println(x + " Oh, yeah!");             // Line 5
	System.out.println(x + " Come on try it!");       // Line 6
	System.out.println();                             // Line 7
	return x * square(x);         // Line 8
    }

    public static void main (String[] args) {

	int aaa = 11;

	int val1 = aaa + yesFun(1, '$', 22.33, "Scheme");   // Line 9
	System.out.println("The returned value: " + val1 + "\n\n");

	int n = 2;
	char c = '#';
	double d = 33.44;
	System.out.println("The returned value this tims: "
			   + yesFun(n, c, d, "Java"));

    }

}
