package L1;

public class PassByValue 
{
   public static void main(String args[])
   {
	   int a = 8;
	   int b = 2;
	   
	   System.out.println("Before swap function:\t" + 
	                      " a: " + a + " b: " + b);
	   swap(a, b);
	   System.out.println("After swap function:\t" + 
	                      " a: " + a + " b: " + b);
   }
   public static void swap(int a, int b)
   {
	   int temp = b;
	   b = a;
	   a = temp;
	   System.out.println("Inside swap function:\t" + 
	                      " a: " + a + " b: " + b);
   }
}
