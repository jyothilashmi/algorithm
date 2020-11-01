package problemSolving;

public class ratio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={-4 ,3, -9, 0, 4, 1 };
		 int positive=0,negative=0,zeros=0,size=arr.length;
	        float posRatio=0,negaRatio=0,zerRatio=0;

	        for(int i=0;i<size;i++)
	        {
	            if(arr[i]==0)
	            {
	                zeros++;
	               
	            }
	            else if(arr[i]>0)
	            {
	             positive++;   
	             
	            }
	            else if(arr[i]<0)
	            {
	                negative++;
	                
	            }
	            else
	            {
	                System.out.println("Invalid digits");
	            }
	        }
	        
	        System.out.println("negative"+negative);
	        System.out.println("pso"+positive);
	        System.out.println("z"+zeros);
	        System.out.println(size);
	        
	    posRatio=(float)positive/size;
	    negaRatio=(float)negative/size;
	    zerRatio=(float)zeros/size;

	    System.out.printf("%.4f ",posRatio); 
        System.out.printf("%.4f ", negaRatio); 
        System.out.printf("%.4f ",zerRatio); 
        System.out.println(); 
	}

}
