/**
 * 
 */
package Challenges;

/**
 * @author P.Dhamanaskar
 *
 */
public class NumberPallindrome {

	public static void main(String[] args) {

		int number = 454;
		System.out.println("Given number " + number + " is a Pallindrome? " + checkNumberPallindrome(number));
	}
	
	public static boolean checkNumberPallindrome(int number) {
		int duplicate = number;
		int reverse = 0;
		if(number > 9) {
			while(duplicate>0) {
				reverse = reverse * 10 + duplicate % 10;
				duplicate /= 10;
			}
		}
		if(number == reverse) 
			return true;
		else
			return false;
		
	}

}
