package Challenges;

public class Coding1 {

	public static void main(String[] args) {
		
		/**
		 *I/P : Generate encrypted string. 
				Each character of string needs to be represented by integer.
				Input : ab2cd4z
				Outout: ababcdcdcdcdz
		 */
		String input = "ab2cd4z$3e";
		System.out.println(encryptInput(input));
	}
	
	public static String encryptInput(String input) {
		String output = "";
		char inputChars[] = input.toCharArray();
		for(char c : inputChars) {
			if(Character.isDigit(c)) {
				int count = Character.getNumericValue(c);
				for(int i=0;i<count;i++) {
					output += input.substring(0, input.indexOf(c));
				}
				input = input.substring(input.indexOf(c)+1);
			}
		}
		return output;
	}
	
	
	
	
	

}
