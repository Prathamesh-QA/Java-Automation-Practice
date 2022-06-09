package Challenges;

public class PallindromeNumber {

	public static void main(String[] args) {
		String input = "hb1d2gd1jky";
		System.out.println("Is given number " + input + " pallindrome? " + isPallindrome(input));
	}
	
	public static boolean isPallindrome(String pallindrome) {
		pallindrome = pallindrome.replaceAll("[^0-9]", "");
		Integer num = Integer.parseInt(pallindrome.trim());
		Integer duplicate = num;
		Integer reverse = 0;
		while(duplicate > 0) {
			reverse = reverse * 10 + duplicate % 10;
			duplicate /= 10;
		}
		return num == reverse;
	}

}
