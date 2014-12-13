package math.problem;

public class Pattern {
	public static void main(String[] args) { 
		 		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output. 
		 		 *  
		 		 * 1,2,3,4,5,10,12,14,16,18,23,26,29,32,35,40,44,48,52,56,61,66,71,76,81.......n 
		 		 *  
		 		 */ 
		int next = 1; 
 		int step = 1; 
 		int Count = 50; 
 		
 		 
 		System.out.println("The first 50 elements are:"); 
 		for ( int i = 1; i <= Count; i++ ) { 
 			
 			System.out.format( "%4d ", next ); 
 			 
 			if ( i % 5 == 0 ){ 
 				step++; 
 				next = next + 5; 
 				System.out.println(); 
 				
 			} else { 
 				next = next + step; 


}
 }
}
}
