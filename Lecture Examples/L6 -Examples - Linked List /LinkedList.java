
public class LinkedList {
	Node head;
	int size;
	//-------------------------------------------------
	public LinkedList() {
		head = null;
		size = 0;
	}
	//-------------------------------------------------
	public int getSize() {
		return size;
	}
	//-------------------------------------------------
	public void addFirst(int newData)
	{
	   	// Step 1 – create a new node
		Node newNode = new Node(newData);
 		// Step 2 – set newNode to point to head 
		newNode.setNext(head); 
		//or we can write 	newNode.next = head;

 		// Step 3 – change head to point to newNode
	   	head = newNode;
		// Step 4 – finally, increase size of linked list
	   	size++;
	}
	//-------------------------------------------------
	public int removeFirst()
	{
	   	// Step 1 – let temp point to head
		Node temp = head;
 		// Step 2 – set newNode to point to head 
		head = head.getNext(); 
		//or we can write 	head = head.next;

 		// Step 3 – set temp.next to null
	   	temp.setNext(null);
		// Step 4 – finally, decrease size of linked list
	   	size--;
		return temp.getData();
	}
	//-------------------------------------------------
	public void print()
	{
		if (head == null){
			System.out.println("empty list");
			return;
		}
		Node current = head;
		while(current != null)
		{
			System.out.print(current.getData() +  " ");
			current = current.getNext();
		}
		System.out.println();
	}
	//-------------------------------------------------	
	public void printInOrderRecursive()
	{
		if (head == null){
			System.out.println("empty list");
			return;
		}
		printInOrderRecursiveHelper(head);
		System.out.println();
	}
	private  void printInOrderRecursiveHelper(Node curr)
	{
		if (curr == null){
			return;
		}

		System.out.print(curr.getData() +  " ");
		printInOrderRecursiveHelper(curr.getNext());	
	}
	//--------------------------------------------------
	public void addLast(int newData)
	{
	   if (head==null) {
	      head = new Node(newData);
	      size++;
	      return;
	   }
	   Node temp = head;
	   // find the last node in the list
	   while (temp.getNext() != null)
	      temp = temp.getNext();
	   temp.setNext(new Node(newData));
	   size++;
	}
	//--------------------------------------------------
	public Node find(int value)
	{
	   for (Node current=head; current!=null;   current=current.getNext())
	      if (current.getData()==value) {
	    	  System.out.println("Found element :) ");
	         return current;
	      }
	   System.out.println("Element not found :( ");
	   return null;
	}
	//--------------------------------------------------
	public int removeLast()
	{
	   if (size==0) throw 
	      new IllegalStateException( "the list is empty" );
	   if (size==1) 
		   return removeFirst();
	   
	   Node prev = null;
	   Node current = head;
	   while (current.getNext() != null)
	   {
	      prev = current;
	      current = current.getNext();
	   }
	   prev.setNext(null);
	   size--;
	   return current.getData();
	}
	//-------------------------------------------------
	public void addAt(int newData, int index)
	{
		if (size < index ) {
			addLast(newData);
			return;
		}
		else if (index == 0) {
			addFirst(newData);
			return;
		}
		int count = 0;
		Node newNode = new Node(newData);
		Node current = head;
		while(current.getNext() != null && count < index-1) {
			current = current.getNext();
			count++;
		}
		Node temp = current.getNext();
		newNode.setNext(temp);
		current.setNext(newNode);
		size++;
	}
	//-------------------------------------------------
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		l.addFirst(3);
		l.addFirst(8);
		l.addFirst(9);
		l.addLast(6);
		l.addLast(5);
		l.addFirst(4);
		System.out.println(l.getSize());
		l.print();
		l.removeLast();
		l.print();
		Node n = l.find(-4);
		l.addAt(-9, 0);
		l.print();
		l.addAt(85, 3);
		l.print();
		l.addFirst(74);
		l.printInOrderRecursive();
		l.addFirst(94);
		l.print();
	}

}
