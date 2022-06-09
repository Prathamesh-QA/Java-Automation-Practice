package Challenges;

public class InterviewQue2 {

	public static void main(String[] args) {
		
	/**
	 * 1. Reverse the string without using extra space (Array) and don't use inbuilt method (Split).

	Input: "delhi is capital of india"
		Output: "india of capital is delhi"
		
		delhi is capital of india
		
		delhi is
		
		si ihled
		
	 */
		
		String input = "delhi is capital of india";
		String reverse = "";
		String updatedInput = "";
		for(int i=input.length()-1;i>=0;i--) {
			reverse += input.charAt(i);
		}
		int count = input.split(" ").length;
		for(int i=0;i<count;i++) {
			updatedInput += reverseString(reverse) + " ";
			if(reverse.indexOf(" ") != -1)
				reverse = reverse.substring(reverse.indexOf(" ")).trim();
		}
		System.out.println(updatedInput);
	}
	
	public static String reverseString(String input) {
		StringBuffer sb;
		if(input.split(" ").length>1)
			sb = new StringBuffer(input.substring(0,input.indexOf(" ")));
		else
			sb = new StringBuffer(input);
		return sb.reverse().toString();
		
	}
	

}
