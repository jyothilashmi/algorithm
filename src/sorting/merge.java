package sorting;

public class merge {
	
	
		 void merge(int a[], int l, int m, int r) 
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
		            L[i] = a[l + i]; 
		        for (int j = 0; j < n2; ++j) 
		            R[j] = a[m + 1 + j]; 
		  
		        /* Merge the temp arrays */
		  
		        // Initial indexes of first and second subarrays 
		        int i = 0, j = 0; 
		  
		        // Initial index of merged subarry array 
		        int k = l; 
		        while (i < n1 && j < n2) { 
		            if (L[i] <= R[j]) { 
		                a[k] = L[i]; 
		                i++; 
		            } 
		            else { 
		                a[k] = R[j]; 
		                j++; 
		            } 
		            k++; 
		        }
		        
		        while(i<n1)
		        {
		        	a[k]=L[i];
		        	i++;
		        	k++;
		        }
		        
		        while(j<n2)
		        {
		        	a[k]=R[j];
		        	j++;
		        	k++;
		        }
		    }

		
	
	public  void mergeSort(int a[],int l,int r)
	{
		//int lengthofArray=r;
		
		if(r<2)
		{
			return;
		}
		
		int mid=r/2;
		
		int[] left=new int[mid];
		int right[]=new int[r-mid];
		
		for(int i=0;i<mid;i++)
		{
			left[i]=a[i];
		}
		for(int j=mid;j<=r;j++)
		{
			right[j]=a[j];
		}
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r-1);
		merge(a,l,mid,r-1);
		
		
	}
	public static void main(String[] args) {
		int []a= {2,4,7,5,8,3};
		
		
		
		merge ob = new merge(); 
	    ob.mergeSort(a, 0, a.length - 1); 
	    

		
	        int n = a.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(a[i] + " "); 
	        System.out.println(); 
	    

	}
	
	

}
