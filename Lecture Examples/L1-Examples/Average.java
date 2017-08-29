package L1;

/*   We saw how to iterate using recursion and while loops so far.  We will
see another kind of a loop: 'for' loop.

3. using for loops

The syntax (format, grammar) of a for loop is of the following form:

for (<init>; <test>; <modify>) <body>;

<test> can be any legal logical (boolean) expression.
<body> can be any statement, a single statement or a compound
            statement (i.e., a bunch of statements enclosed in a pair of
            curly braces).
     <init> is where you establish a loop control variable with an
            initial value.            
     <modify> is where you update the value of the loop control
            variable that you set up in <init> so that you can eventually
            get out of the loop.

     The semantics (meaning) of it is: execute <init> first - ONCE!
     Then, evaluate <test> next.  If the <test> evaluates to false, then
     end the loop and continue with the line following the loop.  If the
     <test> evaluates to true on the other hand, do the <body>.  Then,
     execute <modify> next.  Then evaluate <test> again and repeat until
     it exits the loop.  Here again, you will want to modify something
     in the <modify> part of the loop so that <test> will eventually
     evaluate to false.  You can make modification(s) in the <body>
     part of the loop in addition to or instead of in <modify>.
     Usually, it is easier to understand your program if you do it in
     the <modify> part.   Here is a way to create an infinite loop with
     a for loop:

	for (;;) <body>;

     That is, all three of the parts inside the parentheses are optional.
     You can have 0, 1, 2, or 3 of those components inside the pair of
     parentheses depending on what you want to express.

   Now that we understand loops, let's expand our universe by allowing
   more things to be used in the ...... part of a function definition.
   The next langauge construct we will study is arrays!


   Arrays

     I will explain the basic ideas on arrays on the board in class rather
     than describing them here.
    
     The example in this file will show you how arrays are created and 
     used in a Java program.

     Array is an example of a data structure much like an int is a data
     structure although a very simple one.  When we encounter a new data
     structure, try to understand the following:

        1. How to create an instance of the data structure

        2. How to use the instance created in two ways
           2.1. How do you write a value into the data structure?  It is
                called 'write access'.
           2.2. How do you read a value out of the data structure?
                It is called 'read access'.

        3. How to destroy it when you are done using it (as you will see
           we don't need to worry about step 3 in Java unlike in some
           other languages like C++).
           
     One useful piece of information about arrays is: if array name is
     aaa, then aaa.length will give you the length of the array, i.e.,
     the number of elements that you could put into the array.  Note that
     it is not aaa.length(), but aaa.length.  That is, length is not a
     function.
 */

import java.util.Random;

public class Average {

    // Doing it with what we already know (without using an array)
    // Don't do it this way!
    public static void ave () {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        int n5 = 50;
        int n6 = 60;
        
        double average = (n1 + n2 + n3 + n4 + n5 + n6) / 6.0;

        System.out.println("The average of those six integers is: " + average);
    }


    /* Using an array - case 1
     *
     * Creating an array with initial values in one step.
     *
     * This is useful when you already know exactly what elements you
     *   will include in the array at the time the array is created.
     *   Sometimes, you may not know the exact elements at the time
     *   an array is created.  We will see such cases below later.
     */
    public static void ave2 () {
	int[] n = {10, 20, 30, 40, 50, 60};
        
	double average = (n[0] + n[1] + n[2] + n[3] + n[4] + n[5]) / 6.0;

        System.out.println("The average of those six integers is: " + average);
    }

    /* Using an array - case 2
     * Creating an array without initial values, then assigning values
     * afterwards.
     */
    public static void ave3 () {
        final int SIZE = 6;
	int[] n = new int[SIZE];  // size is the size of the array

        n[0] = 10;
	n[1] = 20;
	n[2] = 30;
	n[3] = 40;
	n[4] = 50;
	n[5] = 60;
        
	double average = (n[0] + n[1] + n[2] + n[3] + n[4] + n[5]) / 6.0;

        System.out.println("The average of those six integers is: " + average);
    }


    /* Using an array - case 3
     * In this case we don't even know the size of the array at compile-time.
     * Neither the elements that will be included in the array.
     */
    public static void ave4 (int size) {

	int[] numbers = new int[size];  // size is not known until run-time

        /* Loops are veeeeery useful when dealing with arrays
         * Let's use a while loop first.
         */
	int i = 0;
	while (i < numbers.length) {  // Note that it's not numbers.length(),
	    numbers[i] = i * i;       // i.e., length is not a function!
	    i = i + 1;                // What is it then? We will talk about
	}                             // it when we talk about objects later.

        /* Let's now use a for loop this time.
         * See which loop is more convenient between 'while' and 'for'.
         */
        int sum = 0;
	for (int j = 0; j < numbers.length; j = j + 1) {
	    sum = sum + numbers[j];
	}
        
        System.out.println("The average of those " + size + " integers is: "
			   + (double)sum/size);

        /* What would happen if we changed the loop control variable j
         * to i in the next for loop?
         * Is it okay to use j again although we already used it once in
         * the for loop above?
         */
        int product = 1;
	for (int j = 0; j < numbers.length; j = j + 1) {
	    product = product * numbers[j];
	}
        System.out.println("The product of those " + size + " integers is: "
			   + product);
        
    }


    public static void main (String[] args) {   

	ave();

        System.out.println();
	ave2();

        System.out.println();
	ave3();

        System.out.println();
	ave4(10);
    }
}
