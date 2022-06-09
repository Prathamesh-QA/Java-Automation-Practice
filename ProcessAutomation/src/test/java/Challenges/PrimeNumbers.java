package Challenges;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int number = 4;
		System.out.println(number + " is a Prime Number? " + isPrimeNumber(number));
		
	}
	
	private static boolean isPrimeNumber(int number) {
		if(number<2)
			return false;
		
		for(int i=2;i<number;i++) {
			if(number%i==0)
				return false;
		}
		
		return true;
	}

}
