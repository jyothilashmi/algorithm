package dataStructures;

public class linkedStack {
	
	private Node head; // the first node
	 
	// nest class to define linkedlist node
	private class Node {
		int value;
		Node next;
		
	}
	
	public linkedStack()
	{
		head=null;
	}
	
	public int pop() throws LinkedListEmptyException
	{
		if(head==null)
		{
			 throw new LinkedListEmptyException();
			 
		}
		else
		{
			int value=head.value;
			head=head.next;
			return value;
		}
	}
	public void push(int value)
	{
		
		Node oldHead = head;
		
		System.out.println("current head"+oldHead);
		head = new Node();
		head.value = value;
		head.next = oldHead;
		
		System.out.println("new value"+value);
	}
	public static void main(String[] args) {
		linkedStack lls=new linkedStack();
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
		//System.out.println("Element removed from LinkedList: "+lls.pop());
		//System.out.println("Element removed from LinkedList: "+lls.pop());
		lls.push(10);
		System.out.println("Element removed from LinkedList: "+lls.pop());
		
		printList(lls.head);
		// TODO Auto-generated method stub

	}
	
	public static void printList(Node head) {
		Node temp = head;
		
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
		
	}

}
