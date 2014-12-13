package math.problem;

public class PrintNumber {
	public static void main(String[] args) { 
		 		 
		 		/* use a for loop to print 1 to 100 and then store into an array. 
		 		 *then use another for loop to print only odd numbers.Then add the  
		 		 *total numbers from the array. 
		 		 */ 
		 		int[] array = new int[100]; 
		 		int i,Sum =0; 
		 		 
				for (i =1; i<=100; i++) 
		 		{ 
		 			System.out.println(i); 
		 			array[i-1] = i; 
		 		} 
		 		 
		 		for (i = 0; i<array.length;i++) 
		 		{ 
		 			if(array[i]%2 != 0) 
		 			{ 
		 				System.out.println(array[i]); 
					} 
				} 
		 		 
		 		for(i=0; i<array.length;i++) 
		 		{ 
		 			Sum += array[i]; 
		 		} 
		 		System.out.println("The Sum of Numbers is: "+Sum); 
		 		 
		 		 


}
}