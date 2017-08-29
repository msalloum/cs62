package L1;

public class ArrayExamples {

    /* Returns an array of n random integers.  The integers are
     * chosen from the interval [0..n)
     *
     * This example demonstrates how to create an array as well
     * as how to return an array from a function.
     */
    public static int[] randomIntArray (int n) {
	int[] A;
	A = new int[n];
	// int[] A = new int[n];  // same thing written in one line

	java.util.Random r = new java.util.Random();
	for (int i = 0; i < n; i++) {
	    A[i] = r.nextInt(n);
	}
	return A;
    }


    /* Returns the largest integer in the non-empty array B.
     *
     * This example demonstrates how to accept an array as a parameter
     * value passed from a caller of this function.
     */
    // Precondition: B is non-empty.
    public static int largest (int[] B) {
	int biggest = B[0];
	for (int i = 1; i < B.length; i++) {
	    if (B[i] > biggest) {
		biggest = B[i];
	    }
	}
	return biggest;
    }

    
    /* This example demonstrates how two functions communicate between
     * them using an array as a communication medium.  That is, one
     * function, the caller, passes an array to another function, the
     * callee.  If the callee changes the values in the array in its
     * body, the changes that were made in the callee are visible
     * (preserved) in the caller as well.  That is, the array is
     * shared between the caller and the callee.
     * 
     * Note that the changes you are making to B are preserved in
     * the array A in main.  To understand this, try the memory
     * representation diagram we used.
     * While the function scale is excuting, there are two references
     * into the array in memory: one is A from the main 'box' and
     * the other is B from the scale 'box'.  The array itself is located
     * outside both functions' local memory areas. That is, the array
     * is located inside a special region of memory called heap.
     * As soon as scale finishes its execution, the reference from B
     * disappears because B is a local variable inside the scale 'box',
     * but A remains still pointing to the array object.  We will draw
     * these diagrams in class together.
     *
     * Alternatively, you could design scale so that it returns
     * an array.  And then change the call to scale in main so that
     * it expects an array to be returned from scale and use the
     * returned value to reset it to A.  That would be a rather
     * strange way to achieve the same effect.  Try it if you want.
     */
    public static void scale (int[] B, int factor) {
	for (int i = 0; i < B.length; i++) {
	    B[i] = B[i] * factor;
	}
    }

    /* Prints the elements in an array
     */
    public static void print (int[] A) {
	for (int i = 0; i < A.length; i++) {
	    System.out.println(A[i]);
	}
    }


    /* Talk about memory model here (if time permits?)
     */
    public static void main (String[] args) {
	// An array containing integers...
	int[] A = randomIntArray(5);    // Line 1
	print(A);                       // Line 2
	System.out.println();

	System.out.println("Largest:" + largest(A));  // Line 3
	System.out.println();

	scale(A, 2);
	print(A);
    }
    
}

/*
	int[] A = randomIntArray(5);    // Line 1

By looking at this line, what can we say about randomIntArray without
even peaking at the definition of randomIntArray?  Well, we know that
it would be expecting an argument of type int.  We also know that it
would be returning an array of int.


	print(A);                       // Line 2

What can we say about this function print by looking at this line alone?
Well, it would expect to get an array of ints as argument because the type
of A is an array of ints.  We also know that it would not rerurn anything
useful because the return value of print is not being used here at all.
However, the fact that this caller does not do anything with the return
value does not necessarily mean that print would not return anything
useful.  It is because a return value can be ignored altogether even if
the callee actually returns something useful.


	System.out.println("Largest:" + largest(A));  // Line 3

What can we say about largest?  Well, it expects an array of int,
and it would return something the + operator can use as one of its
operands.  That is somewhat unsatisfying because largest could return
almost any type of value: int, double, String, char, etc.  The return
value will be converted into a String value if it isn't already a String
value so that it can be concatenated with the string "Largest:".
You will need to see the definition (signature at least) of the callee to
know exactly what it actually expects and returns.

*/
