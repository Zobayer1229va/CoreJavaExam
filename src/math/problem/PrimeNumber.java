package math.problem;

public class PrimeNumber {
	public static void main(String[] args) {
		
		/* Find the prime numbers from 1 to 1000 then print to console.Also print out the total prime numbers within the range. 
		 	(prime numbers are only divisible by number 1 and the number itself.) 
      	(for example numbers like 2,3,5,7,9,11,13.....n are prime numbers.  
		 		*/ 

		int number = 1000;
        int count = 0;
        long sum = 0;
        System.out.print("The prime numbers between 1 and 1000:   ");
        while(count < 3){
            if(isPrimeNumber(number)){
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println(sum);
    }
     
    private static boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


}
