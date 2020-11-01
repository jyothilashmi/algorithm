package sorting;

public class selectionSort {
	
	static int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
    static int i;
	static int j;
	int k;
	static int pos;
	static int temp; 
    
     static int size=a.length;
     public  static int sm(int a[], int n, int i)  
	    {
	    	int small,ps;  
	    	small = a[i];  
	        ps = i;
	        
	        for(j=i+1;j<n;j++)
	        {
	        	System.out.println("\nj...\n"+ j); 
	        	if(a[j]<small)
	        	{
	        		small=a[j];
	        		System.out.println("\nsmall...\n"+ small); 
	        		ps=j;
	        		System.out.println("\nps...\n"+ ps); 
	        	}
	        }
	        
	        return ps;
	    }
	public static void main(String[] args) {

    
    for(i=0;i<size;i++)
    {
    	pos=sm(a,size,i);
    	System.out.println("\npos...\n"+ pos);  
    	temp=a[i];
    	System.out.println("\n temp...\n"+ temp); 
    	a[i]=a[pos]; 
    	System.out.println("\na[i]...\n"+ a[i]); 
        a[pos] = temp;
    	System.out.println("\npos...\n"+ a[pos]); 
    	
    }
    System.out.println("\nprinting sorted elements...\n");  
    for(i=0;i<10;i++)  
    {  
        System.out.println(a[i]);  
    }  
}  
   

}
