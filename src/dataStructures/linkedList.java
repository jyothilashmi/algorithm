package dataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list=new LinkedList<String>();

	     //Adding elements to the Linked list
	     list.add("Steve");
	     list.add("Carl");
	     list.add("Raj");

	     //Adding an element to the first position
	     list.addFirst("Negan");

	     //Adding an element to the last position
	     list.addLast("Rick");

	     //Adding an element to the 3rd position
	     list.add(2, "Glenn");
	     
	     System.out.println("LinkedList:" + list);

	      // offer a new element
	      list.offer("Element");

	      // print the new list
	      System.out.println("LinkedList:" + list);
	      
	      list.addLast("mike");
	      
	      System.out.println("LinkedList:" + list);
	      

	      list.poll();
	      
	      System.out.println("LinkedList:" + list);

	      list.peekFirst();
	      
	      System.out.println("LinkedList:" + list);
	      Object firstvar = list.get(6);
	       System.out.println("First element: " +firstvar);
	       list.set(6, "Changed first iiitem");
	       Object firstvar2 = list.get(6);
	       System.out.println("First element after update by set method: " +firstvar2);
	  /*  list.

	     //Iterating LinkedList
	     Iterator<String> iterator=list.iterator();
	     while(iterator.hasNext()){
	       System.out.println(iterator.next());
	}*/
	}
}
