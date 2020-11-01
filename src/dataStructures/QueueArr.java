package dataStructures;

import java.util.Scanner;

public class QueueArr {
	
	/**
	 * 
	 * 
	 * 
	 * Algorithm
Step 1: IF REAR = MAX - 1
Write OVERFLOW
Go to step
[END OF IF]
Step 2: IF FRONT = -1 and REAR = -1
SET FRONT = REAR = 0
ELSE
SET REAR = REAR + 1
[END OF IF]
Step 3: Set QUEUE[REAR] = NUM
Step 4: EXIT
	 * @param args YET TO COMPLETE THE PGM
	 */
	int rear=-1,front=-1;   
	
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
    
   /* boolean isempty()
    {
    	return(top<0);
    }*/
    void insert(Scanner sc)
    {
    	 
        if(front == -1 && rear == -1)  
        {  
            front = 0;  
            rear = 0;  
            
            
        }  
        else   
        {  
            rear = rear+1;  
        }  
      System.out.println("Enter Value");  
        int val = sc.nextInt(); 
        arr[rear] = val;
        System.out.println("\nValue inserted to rear");  
    }
    	void delete(Scanner sc)
    	{
    		if (front == -1 || front > rear)  
    	    {  
    			 System.out.println("\nUNDERFLOW\n");  
    	        return;  
    	              
    	    }  
    	    else  
    	    {  
    	    	
    	        int val = arr[front];  
    	        if(front == rear)  
    	        {  
    	            front = -1;  
    	            rear = -1 ;  
    	        }  
    	        else   
    	        {  
    	            front = front + 1;  
    	        }  
    	        System.out.println("\nvalue deleted ");  
    	    }  	
    	}
    		void display()  
            {  
                System.out.println("Printing stack elements .....");  
                for(int i = front; i<arr[i];i++)  
                {  
                    System.out.println(arr[i]);  
                }  
            } 
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueArr ar=new QueueArr();
		int choice=0;  
		
	    Scanner sc = new Scanner(System.in);   
	    System.out.println("*********queue operations using array*********\n");  
	    System.out.println("\n------------------------------------------------\n");  
		while(choice != 4)  
	    {  
	        System.out.println("\nChose one from the below options...\n");  
	        System.out.println("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");  
	        System.out.println("\n Enter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	        case 1:  
	            ar.insert(sc);  
	            break;  
	            case 2:  
	           ar.delete(sc); 
	            break;  
	            case 3:  
	            ar.display();  
	            break;  
	            
	            default:     
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        }; 
	}
	}

}
