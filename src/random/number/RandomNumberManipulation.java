package random.number;

import java.util.Random;


public class RandomNumberManipulation {
	public static void main(String[] args) {

	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   */
int[] Array = new int[50];
System.out.println("The original random number's array: ");
		for(int i = 0; i< Array.length; i++)
		{
			Random Rn = new Random();
			Array[i] = Rn.nextInt(500);
			System.out.format("%5d ", Array[i]); 
			if ( (i + 1) % 10 == 0 ) 
				System.out.println(); 
			} 
		 		System.out.println(); 
}
}

