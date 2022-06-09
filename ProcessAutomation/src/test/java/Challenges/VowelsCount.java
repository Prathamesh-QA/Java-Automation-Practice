package Challenges;

import java.util.function.IntPredicate;

public class VowelsCount {

	public static void main(String[] args) {

		// Java :
		String str = "testing";
		int vowelCount = 0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i)))
				vowelCount++;
		}
		System.out.println("Vowel Count is " + vowelCount + " for input: " + str);
		
		System.out.println("Using Java-8 Streams");
		IntPredicate predicate = new IntPredicate() {
			
			@Override
			public boolean test(int s) {
				// TODO Auto-generated method stub
				return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
						s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U';
			}
		};
		
		String test = "Naveen AutomationLabs";
		long count = test.chars().filter(predicate).count();
		System.out.println(count);
		
	}
	
	public static boolean isVowel(char s) {
		return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
				s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U';			
	}

}
