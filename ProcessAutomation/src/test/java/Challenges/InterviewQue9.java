package Challenges;


public class InterviewQue9 {

	public static void main(String[] args) {
		
		/**
		 * 
		 */
		int num = 999999999;
		
		addDigits(num);
	}
	
	public static void addDigits(int num) {
		int dummy = num;
		int sum = 0;
		if(num > 9) {
			while(dummy > 9) {
				while(num!=0) {
					sum += num % 10;
					num /= 10;
				}
				num = sum;
				dummy = sum;
				sum = 0;
			}
			
			System.out.println(dummy);
		}
	}
	

	

	
	

}
