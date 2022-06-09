package Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java is a versatile language.And used for Automation Testing";
		findDuplicateCharOccurence(sentence);
	}
	
	public static void findDuplicateCharOccurence(String sentence) {
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char[] charArray = sentence.trim().toCharArray();
		for(Character ch : charArray) {
			if(charMap.containsKey(ch))
				charMap.put(ch, charMap.get(ch) + 1);
			else
				charMap.put(ch, 1);
		}
		Set<Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Entry<Character,Integer> entry : entrySet) {
			if(entry.getValue()>1)
				System.out.println("Duplicate character: " + entry.getKey() + " found " + entry.getValue() + " times.");
		}
		
	}
	
	

}
