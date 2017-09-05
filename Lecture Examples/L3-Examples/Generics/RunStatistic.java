
public class RunStatistic {

	public static void main(String[] args) {
		
		// Example without generics
		
		Statistic str1 = new Statistic();
		str1.add("red");
		str1.add("green"); 
		str1.add("yellow");
		str1.add("purple");
		str1.add("blue");
		
		System.out.println("Min: " + str1.getElem(str1.findMin()));
		System.out.println("Max: " + str1.getElem(str1.findMax()));
		
		Statistic num1 = new Statistic();
		num1.add(45);
		num1.add(1);
		num1.add(16);
		num1.add(8);
		num1.add(-98);
		num1.add("red"); // compiles but causes runtime error
		
		System.out.println("Min: " + num1.getElem(num1.findMin()));
		System.out.println("Max: " + num1.getElem(num1.findMax()));

		
		// Example with generics
		
		StatisticGeneric<String> str2 = new StatisticGeneric<String>();
		str2.add("red");
		str2.add("green");
		str2.add("yellow");
		str2.add("purple");
		str2.add("blue");
		
		System.out.println("Min: " + str2.getElem(str2.findMin()));
		System.out.println("Max: " + str2.getElem(str2.findMax()));
		
		StatisticGeneric<Integer> num2 = new StatisticGeneric<Integer>();
		num2.add(45);
		num2.add(1);
		num2.add(16);
		num2.add(8);
		num2.add(-98);
		// num2.add("green"); // does not compile !
		
		System.out.println("Min: " + num2.getElem(num2.findMin()));
		System.out.println("Max: " + num2.getElem(num2.findMax()));
		
		
	}

}
