import java.util.ArrayList;
import java.util.Random;


public class Box<T> {

	ArrayList<T> list;
	int index;
	public static void main(String[] args) {
		
		Box<Integer> b = new Box<Integer>();
		for(int i=1; i < 54; i++)
			b.add(i);
		
		System.out.println("Random Draw: " + b.drawItem());
	}
	
	public Box() {
		list = new ArrayList<T>();
	}
	
	public void add(T elem) {
		list.add(elem);
	}
	
	public boolean isEmpty() {
		if (list.size() == 0)
			return true;
		return false;
	}
	
	public T drawItem() {
		if (list.size() == 0)
			return null;
		
		Random r = new Random(System.currentTimeMillis());
		return list.get(r.nextInt(list.size()));
	}
}
