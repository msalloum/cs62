package L1;
// CS 51
// Art Lee

/*
 * To compile Hello.java to create Hello.class.  Hello.java is the
 *    program source file that we write and Hello.class is a compiled
 *    version of Hello.java.  'javac' stands for 'JAVA Compiler'.
 *
 *    javac Hello.java                    ; case-sensitive!
 *
 * To run (or execute) the compiled file:
 * 
 *    java Hello                          ; NOT java Hello.class
 *
 * To generate a human readable form of the .class to the console,
 *    i.e., computer screen:
 *
 *    javap -c Hello                      ; to the console
 *
 * If you want to save the human readable form into a file, e.g.,
 * Hello.bytecode, you can do so by this command:
 *
 *    javap -c Hello > Hello.bytecode
 *
 */

public class Hello {     // Line 1

    public static void main (String[] args) {

	System.out.println("Welcome to CS!");

	System.out.println(34.0/0);

    }

}

/* 
 First, Line 1 says 'class Hello' among other things.  That means that we
 are creating a class named Hello.  The class named Hello is to be contained
 in a file named Hello.java for it to be a legal class (for now).

 Second, as you look at the program, I am going to assume that some
 things are intuitively obvious.  For example, '(' matches ')'.
 '[' matches ']'.  '{' matches '}'.  If you have an opening '(', there
 must be a closing one: ')'.

 The entire content of this file makes up a program named 'Hello'.
 Obviously, the Java compiler would not understand the meaning of
 these sentences that I am writing in this paragraph.  These extra
 annotations we add to the program are called 'comments'.  Anything
 following two slashes (//) on a line is considered a comment and ignored
 by the compiler when it compiles that program.  Also anything that is
 enclosed between 'a slash followed by an asterisk' and 'an asterisk
 followed by a slash' is also considered a comment.  I hope you can see
 why I can't type 'a slash followed by an asterisk' in its literal form
 in this paragraph.  Nested comments are not allowed and if I wrote a
 pair of 'a slash followed by an asterisk' and 'an asterisk followed by
 a slash' in this paragraph, that is what I would be creating.  As you
 can see this file contains only 11 lines of real Java code and a whole
 bunch of comments.

 Third, some things that we should ignore in the Java program above:

 When you write a simple Java program, there are some decorations
 that we must include to make the compiler happy.  They include everything
 below except the dots (...):

    public class ... {

        public static void main (String[] args) {
            ...
        }

    }

 You only need to worry about what to put in place of the dotted parts
 (...) in the programs that you will be writing, at least initially
 (until I give you a revised program structure).  That is, any Java program
 that you will write initially will be in this structure, namely one class
 of some name containing only one function named 'main'.  No exceptions
 until you are given an updated program structure.

 We will in time explain what each piece of the decorations means,
 but for now we will just regard them as necessary distractions.

 So, your creativity will only affect the parts that are marked
 with dots (...) for now.  That is, the creative parts of the
 program given above include only the following:

     Hello

     System.out.println("Welcome to CS!");
     System.out.println(34/10);

 The creativity we exercised in the program is the idea that the name of
 the class that we are creating is Hello and that the program would print
 to the computer screen when we run "Welcome to CS!" and 3 in two separate
 lines.  This program as it is written is considered a legal program in
 the programming language Java because there is no error in the program.

 Are we going to talk 'legal talks' in this class?  OH YES!
 Some programs are considered legal and others are not.  The
 compiler would accept only legal programs for the language the 
 compiler is written for.  So, both of the following programs would
 be legal.

    public class Hello {

        public static void main (String[] args) {
            System.out.println("Welcome to CS!");
        }
    }

    public class Hello {

        public static void main (String[] args) {
            int x = 22;
        }
    }

 But, the following example would not be legal:

    pulic clas Hello {

        publc satic oid main (string[) args) {
            System.out.println("Welcome to CS!");
        >
    }

 because any of the following alone would make it illegal in that
 program:

    - pulic is misspelled
    - so is clas
    - so is publc
    - so is satic
    - oid too
    - string should have been String, i.e., Java is case-sensitive
    - [) should have been []
    - > should have been }
        (or leave it out completely and see what happens)

 You get the idea?  A compiler is a veeeeery picky program.  It would
 not allow any single minute mistake in a program.  Leave out that ';'
 at the end of the line starting with System... and see what happens.
 Go ahead!  Try to compile it and see what error message(s) you get
 from the compiler.

 These are some of the possible mistakes that you could make in your
 program that the compiler will be complaining about.  So, we call
 them compile time errors.

 So, if you clean up all the compile time errors, will it always
 work without any error when you run it with the 'java' command that
 runs the Java executer (known as interpreter in the case of Java)?
 Not really.  You can write a program that passes the compiler without
 any problem, but does not pass the interpreter.  Suppose we wrote 0
 instead of 10 by mistake in the program above, like this:

        System.out.println(34/0);

 It will pass the compiler, but it will crash at run time, i.e., while
 going through the interpreter.  We all know that dividing a number by
 0 should not be allowed!

 The compiler mainly checks to see if your program is in the correct
 form, namely syntactically correct, without worrying about the meaning
 of your program.  The interpreter is the one that gives meaning to your
 program.  Let me use an analogy: If you say "I ate a computer.", the
 sentence is grammatically correct, i.e., it is syntactically correct
 in English.  However, semantically it does not make any sense, namely
 it has no acceptable meaning in English.  Java is a language much like
 English is a language.  As a language it has its grammar and meanings
 associated with grammatically correct sentences that you write in the
 language.  Any program that you write in Java must be correct
 syntactically first and semantically as well!

 I mentioned the word 'function' without defining what it means.  I
 will explain it when the time comes.  'main' in this program is 
 called a function much like 'f' is called a function in 'f(x) = x + 3'.
 We will get back to this concept again later.

*/


