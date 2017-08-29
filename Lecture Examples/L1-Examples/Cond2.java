package L1;
/*

 Conditionals with multiple branches...

 */

public class Cond2 {

    public static void main (String[] args) {

	System.out.println("absolute of " + 55 + " is " + abs(55));
	System.out.println("absolute of " + 0 + " is " + abs(0));
	System.out.println("absolute of " + -55 + " is " + abs(-55));

	System.out.println("Monday is encoded as " + encodeDay("Monday"));
	System.out.println("Friday is encoded as " + encodeDay("Friday"));

	System.out.println("1 represents " + encodeDay2(1));
	System.out.println("5 represents " + encodeDay2(5));

    }


    public static int abs (int n) {
	if (n > 0) {
	    return n;
	}
	else if (n == 0) {
	    return n;
	}
	else {
	    return -n;
	}
    }


    // Returns -1 if input argument makes no sense
    public static int encodeDay (String day) {
	if (day == "Sunday") {
	    return 0;
	}
	else if (day == "Monday") {
	    return 1;
	}
	else if (day == "Tuesday") {
	    return 2;
	}
	else if (day == "Wednesday") {
	    return 3;
	}
	else if (day == "Thursday") {
	    return 4;
	}
	else if (day == "Friday") {
	    return 5;
	}
	else if (day == "Saturday") {
	    return 6;
	}
	else {
	    return -1;
	}
    }

    // Returns -1 if input argument makes no sense
    // See what the differeces are between this and the one
    // above. Which is better? Why?
    public static int encodeDay2 (String day) {
        int code = -1;
	if (day == "Sunday") {
	    code = 0;
	}
	if (day == "Monday") {
            code = 1;
	}
	if (day == "Tuesday") {
            code = 2;
	}
	if (day == "Wednesday") {
	    return 3;
	}
	if (day == "Thursday") {
	    return 4;
	}
	if (day == "Friday") {
	    return 5;
	}
	if (day == "Saturday") {
	    return 6;
	}
        return code;
    }

    // Note that switch is quite limited in that n can only be
    //      an int value.
    // Returns "" if input argument makes no sense in this function.
    //
    public static String encodeDay2 (int n) {
	switch(n) {
	case 0: return "Sunday";
	case 1: return "Monday";
	case 2: return "Tuesday";
	case 3: return "Wednesday";
	case 4: return "Thursday";
	case 5: return "Friday";
	case 6: return "Satday";
	default: return "";
	}
    }

}

