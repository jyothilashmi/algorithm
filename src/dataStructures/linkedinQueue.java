package dataStructures;

import java.util.Scanner;

public class linkedinQueue {
	
	Node front, rear; 
	class Node { 
	    int i; 
	    Node next; 
	  
	    // constructor to create a new linked list node 
	    // i data and next is address of the next node 
	    public Node(int i) 
	    { 
	        this.i = i; 
	        this.next = null; 
	    } 
	    public void displayData()
	    {
	    	System.out.println("i= " + i);
	    }
	} 
	
	
	public linkedinQueue()
	{
		this.front = this.rear = null; 
	}
	
	public int dequeue()
	{
		int temp=front.i;
		// If no node left after deleting node 
		if(front.next == null){
			   rear = null;
			  }
		  // front starts pointing to next element
		  front = front.next;
		  return temp;
	}
	public void enqueue(int i)
	{
		
		 // Create a new LL node 
        Node temp = new Node(i); 
  
        // If queue is empty, then new node is front and rear both 
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return; 
        } 
        
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp; 
		


	}
	 // Method to traverse and display all nodes
	 public void displayList(){
	  // Start from first node
	  Node current = front;
	  // loop till last node
	  while(current != null){
	   current.displayData();
	   current = current.next;
	  }
	 }
	public static void main(String[] args) {

		linkedinQueue q = new linkedinQueue(); 
        q.enqueue(10); 
        System.out.println("Queue Front1 : " + q.front.i); 
        System.out.println("Queue Rear1 : " + q.rear.i); 
        q.enqueue(20); 
        System.out.println("Queue Front 2: " + q.front.i); 
        System.out.println("Queue Rear 2: " + q.rear.i); 
        q.dequeue(); 
        System.out.println("Queue Front3 : " + q.front.i); 
        System.out.println("Queue Rear 3: " + q.rear.i); 
        //q.dequeue(); 
        System.out.println("Queue Front4 : " + q.front.i); 
        System.out.println("Queue Rear4 : " + q.rear.i); 
        q.enqueue(30); 
        System.out.println("Queue Front 5: " + q.front.i); 
        System.out.println("Queue Rear 5: " + q.rear.i); 
        q.enqueue(40); 
        System.out.println("Queue Front 6 : " + q.front.i); 
        System.out.println("Queue Rear 6 : " + q.rear.i); 
        q.enqueue(50);
        System.out.println("Queue Front 7: " + q.front.i); 
        System.out.println("Queue Rear 7: " + q.rear.i); 
        q.dequeue(); 
        System.out.println("Queue Front 8: " + q.front.i); 
        System.out.println("Queue Rear 8: " + q.rear.i); 
        q.displayList();
	}
}
