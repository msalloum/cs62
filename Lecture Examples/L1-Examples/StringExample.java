package L1;

import java.util.Random;
import java.util.Scanner;

public class StringExample 
{
	public static void main(String args[] )
	{
		String s = "123243";
		
		int num = Integer.parseInt(s);
		System.out.println(num);
		Random r = new Random(System.currentTimeMillis());
		System.out.println(r.nextInt());
		
		String a = "Hello";
		String b = new String(a);
		
		if(a == b)
			System.out.println("Yes, they are equal ... using == method");

		if(a.equals(b))
			System.out.println("Yes, they are equal ... using equals method");
	
	
	}

}



