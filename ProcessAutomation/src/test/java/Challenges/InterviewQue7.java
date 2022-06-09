package Challenges;

public class InterviewQue7 {

	public static void main(String[] args) {
		
		
		/**
		 * 1. Reverse the string without using extra space (Array) and don't use inbuilt method (Split).

		Input: "delhi is capital of india"
			Output: "india of capital is delhi"
			
			delhi is capital of india
			
			delhi is
			
			si ihled
			
		 */
		String input = "india of capital is delhi";
		String reverse = "";
		String output = "";
		for(int i=input.length()-1;i>=0;i--)
			reverse += input.charAt(i);
		
		int count = reverse.split(" ").length;
		for(int i=0;i<count;i++) {
			output += reverseInput(reverse) + " ";
			if(reverse.indexOf(" ") != -1)
				reverse = reverse.substring(reverse.indexOf(" ")).trim();
		}
		System.out.println("Output: " + output.trim());	
	} 
	
	public static String reverseInput(String input) {
		StringBuffer sb;
		if(input.split(" ").length > 1)
			sb = new StringBuffer(input.substring(0,input.indexOf(" ")));
		else
			sb = new StringBuffer(input);
		
		return sb.reverse().toString();
	}
	
	

}
