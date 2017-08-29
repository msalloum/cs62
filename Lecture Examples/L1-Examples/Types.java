package L1;

public class Types {

    public static void main (String[] args) {

	int numberOfStudents = 10;

	double interestRate = 5.75;

	char letter = 'M';

	String name = "Amy";

	boolean isRaining = false;

	System.out.println(numberOfStudents + ", " +
			   interestRate + ", " +
			   letter + ", " +
			   name + " , " +
			   isRaining);


	// Let's change the values for these varaibles using assignment
	// operator:

	numberOfStudents = numberOfStudents + 100;

	interestRate = interestRate - 0.75;

	letter = 'm';

	name = "Amy" + " rocks.";

	isRaining = true;

	System.out.println("\n" + numberOfStudents + ", \n" +
			   interestRate + ", \n" +
			   letter + ", \n" +
			   name + " , " +
			   isRaining);

    }

}

/*

 - The variable numberOfStudents is said to be of type 'int' (short for
   integer)

   . That means that you can assign only an integer as the value of
     numberOfStudents.

 - The variable interestRate is of type 'double' (Java's way of
   saying 'real')

   . That means that you can assign only a double value as the value
     of interestRate.

 - The variable letter is of type 'char' (short for 'character')

 - The variable name is of type 'String' (Note the upper-case letter 'S')

 - The variable isRaining is of type 'boolean'.  There are only two
   possible values for a boolean variable, i.e., true or false.

 - For integers, int, short, and long all represent integers, but the
   largest integer they can represent is different.  For the programs that
   we will write in this course, int will be large enough.  So, let's
   stick with int unless we really need long.

 - Similarly float and double both represent real numbers, but we will
   use double in this class for convenience.  If you want to learn the
   differences between them, look them up in a Java reference.

 - There are 8 basic data types, also known as primitive data types,
   in Java:

      int, short, long for integers
      float, double for reals
      char for characters
      boolean for true and false
      byte for a byte of data

   Note: String is not one of the primitive data types.  It is actually
   a compound data type.  A string consists of 0 or more characters, and
   a string value is enclosed by a pair of double quotes, e.g., "...".

*/
