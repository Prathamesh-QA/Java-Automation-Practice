package Challenges;

public class InterviewQue3 {

	public static void main(String[] args) {
		
	/**
	 * Input:"Hello New World"

		Output: "Holle Now Werld"
	 */
		String input = "Hello New World";
		reverseVowelInString(input);
	}
	
	public static void reverseVowelInString(String input) {
		int counter = 0;
		
		char[] inputArray = input.toCharArray();
		String vowel = "";
		for(int i=0;i<inputArray.length;i++) {
			if(isVowel(inputArray[i]) == 1) {
				counter++;
				vowel += inputArray[i];
			}
		}
		System.out.println(vowel);
		
		for(int i=0;i<inputArray.length;i++) {
			if(isVowel(inputArray[i]) == 1) {
				inputArray[i] = vowel.charAt(--counter);
			}
		}
		System.out.println(String.valueOf(inputArray));
		
	}
	
	public static int isVowel(char c) {
		String vowels = "aeiouAEIOU";
		return (vowels.indexOf(c) != -1) ? 1 : 0;
	}
	

}
