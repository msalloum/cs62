package L1;

import java.util.Random;

public class PassByValue2 {
	   public static void main(String args[])
	   {
		   Obj a = new Obj(3);
		   Obj b = new Obj(8);
		   
		   System.out.println("Before swap func: " + a.toString() + " " + b.toString());
		   swap(a, b);
		   System.out.println("After swap func: " + a.toString() + " " + b.toString());
	   }
	   public static void swap(Obj a, Obj b)
	   {
		   Obj temp = b;
		   b = a;
		   a = temp;
		   System.out.println("Inside swap func: " + a.toString() + " " + b.toString());
		   
	   }
}

class Obj
{
	int val;
	public Obj(int n)
	{
		val = n;
	}
	public String toString()
	{
		return "Obj: " + val;
	}
}