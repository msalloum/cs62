package L1;
/*

   There are at least two different ways of expressing iteration.

   1. Using recursion

   2. Using a while loop

   One form may be more natural than the other in expressing the
   kind of iteration that you have in mind.  Identifying which one
   to use comes with experience.

   A rule of thumb: try to use 'while' first.  If you are fond of
   recursion, then try it by all means.  Recursion seems somewhat
   more difficult to grasp initially, but once you get the hang of
   it, it is something you will like a lot.

   There are a few other forms in java, namely 'for' loop and 'do'
   loop, but we won't worry abont them until later.

   Here is a detailed description of how while loops work.

   - while loop

     The syntax (format, grammar) is of the following form:

	while <test> <body>;

     <test> can be any legal boolean (logical) expression.
     <body> can be any statement, a single statement or a compound
     statement (i.e., a sequence of statements enclosed in a pair of
     curly braces).

     The semantics (meaning) of it is: repeat the <body> as long as
     <test> evaluates to 'true'.  As soon as <test> evaluates to
     'false' skip the body and move on to the next line following 
     the end of the while body.  That is, you evaluate <test> first.
     If the value is true, then do the <body> and come back to evaluate
     <test> again; otherwise skip the <body> and continue to the line
     following the loop.

     It is important to do something in the <body> part of the while
     loop that affects the <test>.  That is, you would want to change
     something in the <body> so that the <test> evaluates to false at
     some point and gets out of the loop.  Otherwise, your program
     will be stuck in an infinite loop.  In fact, here is a simple
     way of creating an infinite loop:

        while (true) {<dowhatever>};

     For example,
     
        int i = 2;
        while (i > 0) { System.out.println(i); };

     The pattern of a while loop is as follows:

        <set up a loop control variable with an initial value>

        while (<test with the variable>) {
            <do something>
            <update the control variable so the loop will end
             eventually>
        }
        <whatever follows the loop comes here>

     while (1 == 1) { ... } 
     while (true) { ... } 
*/

public class Iter {

    public static int factorialRec (int n) {
	if (n == 0) {
	    return 1;
	}
	else {
	    return n * factorialRec(n - 1);
	}
    }

    // This function is incorrect - fix it?
    public static int factorialWhile (int n) {
	int result = 1;

	while (n > 0)             // test part
        {                         // beginning of body
	    result = result * n;

	}                         // end of body
	return result;
    }


    public static void main (String[] args) {
	System.out.println("factorialRec(6)   = " + factorialRec(6));
	System.out.println("factorialWhile(6) = " + factorialWhile(6));
    }

}
