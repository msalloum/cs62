// Multiple catch blocks with a try
// Note: exceptions are dependent in the sense that one is a subtype of the
//       other

import java.util.*;
import java.io.*;

public class SubtypeMain {

    public static void main(String[] args) {
	System.out.println(getCharFromString("ABC123"));	
    }

    public static char getCharFromString (String s) {

        // The order of catch clauses below matters and they
        // are written incorrectly on purpose.  How should they
        // be rearranged?
        // If they are not in the correct order, you will get
        // compiler errors.

	// This would be incorrect.
       	try {
	    return s.charAt(200);
       	}
        catch (RuntimeException e)	{
	    System.out.println(e.getMessage());
       	}
        catch (IndexOutOfBoundsException e)	{
	    System.out.println(e.getMessage());
       	}
        catch (StringIndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
       	}
        catch (NullPointerException e)	{
	    System.out.println(e + " because s is null");
       	}


        /*
        // This is correct
       	try {
	    return s.charAt(245);
       	}
        catch (StringIndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
       	}
        catch (IndexOutOfBoundsException e)	{
	    System.out.println(e.getMessage());
       	}
        catch (NullPointerException e)	{
	    System.out.println(e + " because s is null");
       	}
        catch (RuntimeException e)	{
	    System.out.println(e.getMessage());
       	}
        */
        
       	System.out.println("...continuing with the rest of the program");
	return s.charAt(0);
   }

}
