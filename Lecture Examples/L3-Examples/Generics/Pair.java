package classexamples;

public class Pair <T> {
	
   	private T first;
    private T second;
 
   	public Pair() { 
        first = null; 
        second = null; 
    } 
   	
   	public Pair(T firstItem, T secondItem) {
        first = firstItem;
        second = secondItem;
    }
    
   	public String toString() {
         return "(" + first + ", " + second + ")";
    }
   	
   	public static void main(String args[]) {
   		
   		Pair<Integer> p1 = new Pair<Integer>(new Integer(4), new Integer(6));
   		System.out.println(p1);
   		
   		
   	}

}