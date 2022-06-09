package Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {

		String sentence = "Java is a Beautiful OOPS language ready and is a beautiful Automation Tool";
		findDuplicateWords(sentence);

	}
	
	public static void findDuplicateWords(String sentence) {
		Map<String,Integer> wordMap = new HashMap<>();
		if(sentence == null)
			throw new RuntimeException("Input sentence cannot be null");
		
		if(sentence != null) {
			sentence = sentence.toLowerCase().trim();
			String[] wordArray = sentence.split(" ");
			
			for(String word : wordArray) {
				if(wordMap.containsKey(word)) {
					wordMap.put(word, wordMap.get(word)+1);
				}else {
					wordMap.put(word, 1);
				}
			}
			Set<Entry<String,Integer>> entrySet = wordMap.entrySet();
			for(Entry<String,Integer> entry : entrySet) {
				if(entry.getValue() > 1) {
					System.out.println(entry.getKey() + ": Is a duplicate word in given sentence with repeatation count " + entry.getValue());
				}
			}
		}
	}

}
