package searching;

import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/*Algorithm
LINEAR_SEARCH(A, N, VAL)
Step 1: [INITIALIZE] SET POS = -1
Step 2: [INITIALIZE] SET I = 1
Step 3: Repeat Step 4 while I<=N
Step 4: IF A[I] = VAL
SET POS = I
PRINT POS
Go to Step 6
[END OF IF]
SET I = I + 1
[END OF LOOP]
Step 5: IF POS = -1
PRINT " VALUE IS NOT PRESENTIN THE ARRAY "
[END OF IF]
Step 6: EXIT*/







public class linear {
	
	public static void main(String[] args) {
		
		
		int a[]={2,45,67,78},val=80;
		boolean flag=false;
		
		System.out.println("value to be search"+ val);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val)
			{
				
				flag=true;
				break;
			}
			else
				flag=false;
			
		}
		
		if(flag==true)
		{
			System.out.println("value  found......exiting....");
		}
		else
		{
			System.out.println("value  not found......exiting....");
		}
	}

}
