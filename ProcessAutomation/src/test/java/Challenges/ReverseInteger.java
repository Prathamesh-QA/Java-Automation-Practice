package Challenges;

public class ReverseInteger {

	public static void main(String[] args) {
		
		Integer number = 8792;
		System.out.println(reverseNumber(number));
	}
	
	public static Integer reverseNumber(Integer number) {
		Integer reverse = 0;
		while(number > 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}

}
