package classexamples;

import Shapes.Shape;

public class MyList<T extends Comparable> {
	
	private T arr[];
	private int arr_length = 5;
	private int arr_index = 0;
	
	public MyList() {
		arr = (T[]) new Object[arr_length];
	}
	
	public void addElement(T elem) {
		if (arr_index < arr_length) {
			arr[arr_index] = elem;
			arr_index ++;
		}
		else{
			arr_length += 10;
			T arr2[] = (T[]) new Object[arr_length];
			for(int i=0; i < arr_index; i++) {
				arr2[i] = arr[i];
			}
			
			arr = arr2;
			arr[arr_index] = elem;
			arr_index ++;
		}
	}
	
	public String toString() {
		String s = "My List includes: ";
		for(int i=0; i <arr_index; i++) {
			s += arr[i] + " ";
		}
		return s;
	}
	
	
	public static void main(String args[]) {
		
		MyList<Shape> s;
		
		MyList<String> L = new MyList<String>();
		
		L.addElement("Apple");
		L.addElement("Pear");
		L.addElement("Pineapple1");
		L.addElement("Pineapple2");
		L.addElement("Pineapple3");
		L.addElement("Pineapple4");
		L.addElement("Pineapple5");
		L.addElement("Pineapple6");
		L.addElement("Pineapple7");
		L.addElement("Pineapple8");
		
		System.out.println(L);
	}
		
}
