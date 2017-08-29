package L1;

import java.util.Scanner;

public class Readn {

    public static int f2c (double fah) {
	return (int)((fah - 32.0) * (5.0/9.0));
    }


    public static void main (String[] args) {

	Scanner scan = new Scanner(System.in);

	System.out.print("\nHow many times do you want to repeat? (integer): ");

	int n = scan.nextInt();

        while (n > 0) {
	    System.out.print("\nEnter a Fahrenheit temperature (integer): ");
	    int fahr = scan.nextInt();
	    System.out.println(fahr + " in F = " + f2c(fahr) + " in C.");
	    n = n - 1;
	}
	System.out.print("\nDone - Bye...");
    }

}
