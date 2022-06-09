package Challenges;


public class InterviewQue8 {

	public static void main(String[] args) {
		
		/**
		 * 
		 */
		
		String input = "Prathamesh Dattaram Dhamanaskar";
		String sub = "D";
		System.out.println(countSubstring(input, sub));
		
	}
	
	public static int countSubstring(String input,String sub) {
		int counter = 0;
		String[] inputSplit = input.split(" ");
		if(input != null && !input.isEmpty()) {
			int count = inputSplit.length;
			for(int i=0;i<count;i++) {
				if(inputSplit[i].indexOf(sub) > -1) {
					counter++;
				}
			}
		}
		return counter;
		
	}
	

	
	

}
