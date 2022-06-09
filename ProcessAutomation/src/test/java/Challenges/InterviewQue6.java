package Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class InterviewQue6 {

	public static void main(String[] args) {
		
		
		/**
		 * 
		 * Duplicate Chars : 
		 *  Input : Hello
		 * 
		 */
		String input = "Hello";
		findOccurence(input);
			
	}
	
	public static void findOccurence(String input) {
		input = input.trim();
		char[] charArray = input.toCharArray();
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character c : charArray) {
			if(charMap.containsKey(c))
				charMap.put(c, charMap.get(c) + 1);
			else
				charMap.put(c, 1);
		}
		
		Set<Entry<Character,Integer>> entryMap = charMap.entrySet();
		for(Entry<Character,Integer> entry : entryMap) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}
	
	

}
