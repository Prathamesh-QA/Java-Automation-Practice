package Challenges;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("Keep", "Peek"));

	}
	
	public static String isAnagram(String input1,String input2){

		if(input1.length() != input2.length())
			return "Both Inputs are not Anagram";
			
		char[] array1 = input1.toLowerCase().toCharArray();
		char[] array2 = input2.toLowerCase().toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1,array2)){
			return "Both Inputs are Anagram";
		}else{
			return "Both Inputs are not Anagram";
		}
		
	}

}
