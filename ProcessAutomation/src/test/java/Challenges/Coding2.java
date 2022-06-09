package Challenges;

public class Coding2 {

	public static void main(String[] args) {
		
		/**
		 * Write a code to generate below output format for any string input:  

			Input: "I am an Automation Engineer" 

				Output: "i ma na noitamotua reenigne"
		 */
		
		String input = "I am an Automation Engineer";
		input = input.toLowerCase();
		String output = "";
		
		String[] valArray = input.split(" ");
		for(String val : valArray) {
			output += reverseWord(val) + " ";
		}
		System.out.print("Output: " + output.trim());
		
	}
	
	public static String reverseWord(String given) {
		char[] chArray = given.toCharArray();
		String reversed = "";
		for(int i=chArray.length-1;i>=0;i--) {
			reversed += chArray[i];
		}
		return reversed;
	}
	

	
	
	
	
	

}
