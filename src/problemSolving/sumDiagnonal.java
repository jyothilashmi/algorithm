package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumDiagnonal {
	
	public static int difference(int arr[][], int n) 
    { 
        // Initialize sums of diagonals 
        int primaryd = 0, d2 = 0; 
       
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
            	System.out.println("value of i "+i);
            	System.out.println("value of j "+j);
            	System.out.println("value of arr "+arr[i][j]);
                // finding sum of primary diagonal 
                if (i == j) 
                	primaryd += arr[i][j]; 
       
                // finding sum of secondary diagonal 
                if (i == n - j - 1) 
                    d2 += arr[i][j]; 
            } 
        } 
       
        // Absolute difference of the sums 
        // across the diagonals 
        return Math.abs(primaryd - d2); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3; 
        
        int arr[][] = 
        { 
            {11, 2, 4}, 
            {4 , 5, 6}, 
            {10, 8, -12} 
        }; 
       
        
       // System.out.print(difference(arr, n)); 
        
        List<List<Integer>> bb = new ArrayList<>();
        List<Integer> arrRowItems = new ArrayList<>();
        
        arrRowItems.add(3);
        arrRowItems.add(5);
        arrRowItems.add(6);
        
        arrRowItems.add(9);
        arrRowItems.add(4);
        arrRowItems.add(1);
        
        arrRowItems.add(3);
        arrRowItems.add(2);
        arrRowItems.add(5);
        
        bb.add(arrRowItems);
        System.out.println("size "+arrRowItems.size());
        int size=arrRowItems.size();
        Integer[]temp = arrRowItems.toArray(new Integer[size]);
        int result[]=new int[size];
        int f=3;
        int[][] array = new int[3][3];
        int primaryd=0,d2=0;
        
        for (int h = 0; h < size; ++h) {
            result[h] = temp[h];
        }
      
        
        for(int g=0;g<temp.length;g++)
        {
        	
        	int t=0;
        	result[g]=temp[g];
        	
        	for(int m=0;m<f;m++)
        	{
        		
        		for(int z=0;z<f;z++)
        		{
        			array[m][z]=result[t];
        			t++;
        		}
        	}
        	
        }
        
       
        List<Integer>number=new ArrayList<>();
        
        for (int k = 0; k < f; k++) 
        { 
            for (int l = 0; l< f; l++) 
            { /*
            	System.out.println("value of i "+k);
            	System.out.println("value of j "+l);
            	System.out.println("value of arr "+array[k][l]);*/
                // finding sum of primary diagonal 
                if (l == k) 
                	primaryd += arr[k][l]; 
               
               
                // finding sum of secondary diagonal 
                if (k == f - l - 1) 
                    d2 += array[k][l]; 
                
            } 
        } 
        
for(Integer c:number)
{
	System.out.println(number.get(c).toString());
}
        
	}

}
