package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array that is to be created: ");
	      int size = sc.nextInt();
	      int arr[]=new int[size];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++){
	         arr[i] = sc.nextInt();
	      }
	      //Reading the number
	     /* System.out.println("Enter the required sum: ");
	      int reqSum = sc.nextInt();*/
	      System.out.println("The array created is: "+Arrays.toString(arr));
	      
	     int i, j, temp,count=0,ex=0,pass=0; 
	     int n=arr.length;
	        boolean swapped; 
	        for (i = 0; i < n; i++)  
	        { 
	            swapped = false; 
	            for (j = 0; j < n-i-1; j++)  
	            { 
	                if (arr[j] > arr[j + 1])  
	                { 
	                    // swap arr[j] and arr[j+1] 
	                    temp = arr[j]; 
	                    arr[j] = arr[j + 1]; 
	                    arr[j + 1] = temp; 
	                    swapped = true; 
	                    
	                    System.out.printf("The array exchange is: "+ ++ex); 
	                } 
	            } 
	  
	            // IF no two elements were  
	            // swapped by inner loop, then break 
	           if (swapped == false) 
	           {
	        	   System.out.printf("The array skipped is: "+ ++count); 
	        	   break;
	           }
		
	           System.out.printf("The array pass is: "+ ++pass);
		
		// TODO Auto-generated method stub

	}
	        
	        	  System.out.println("The array sorted is: "+Arrays.toString(arr));
	        
	       // System.out.println(); 
	}
}
