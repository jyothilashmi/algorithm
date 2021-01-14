package sorting;

public class mergeSort {
	
	
	 void merge(int arr[], int l, int m, int r) 
	    {
	        // Find sizes of two subarrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	        System.out.println("n1 "+n1);
	        System.out.println("n2" +n2);

	        /* Create temp arrays */
	        int L[] = new int[n1]; 
	        int R[] = new int[n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j = 0; j < n2; ++j) 
	            R[j] = arr[m + 1 + j]; 
	  
	        /* Merge the temp arrays */
	  
	        // Initial indexes of first and second subarrays 
	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = l; 
	        while (i < n1 && j < n2) { 
	            if (L[i] <= R[j]) { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        }
	    }
	
	
	void sort(int[] arr,int l,int r)
	{
		int countl=1;
				int countr=1;
				int mergecall=1;
		if(l<r)
		{
			int m=(l+r)/2;
			 // Sort first and second halves 
            sort(arr, l, m); 
            System.out.println("count left"+countl);
            countl++;
            sort(arr, m + 1, r); 
            System.out.println("count right"+countr);
            countr++;
            merge(arr, l, m, r); 
            System.out.println("count merge"+mergecall);
            mergecall++;
		}
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
	public static void main(String[] args) {
		
	
	int arr[] = { 12, 11, 13, 5, 6, 7 }; 
	  
    System.out.println("Given Array"); 
    printArray(arr); 

    mergeSort ob = new mergeSort(); 
    ob.sort(arr, 0, arr.length - 1); 

    System.out.println("\nSorted array"); 
    printArray(arr); 
	}

}
