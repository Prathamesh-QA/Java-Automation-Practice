package Challenges;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		/**
		 * If input is 6
		 * It should return 5th Number in Fibonacci Sequence which is 8
		 */
		
		int input = 5;
		
		System.out.println(fibonacci(input));
	}

	private static long fibonacci(int input) {
		if(input <= 1){
			return input;
		}
		return (fibonacci(input-1) + fibonacci(input - 2));
	}
	
	
	
	

}
