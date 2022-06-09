package Challenges;

import java.util.Comparator;
import java.util.*;

import org.assertj.core.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		int[] numbers = {21,-10,50,39,88,-986};
		findLargestAndSmallestNumber();
	}
	
	// Brute Force Method
	public static void findLargestAndSmallestNumber(int[] numbers) {
		int largest = numbers[0];
		int smallest = numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i] > largest)
				largest = numbers[i];
			else if(numbers[i] < smallest)
				smallest = numbers[i];
		}
		System.out.println("Smallest: " + smallest + " & Largest: " + largest);
	}
	
	// Java 8 Streams
	public static void findLargestAndSmallestNumber() {
		List<Integer> numList = java.util.Arrays.asList(21,-10,50,39,88,-986);
		Integer smallest = numList.stream().min(Comparator.comparing(Integer::valueOf)).get();
		Integer largest = numList.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Smallest: " + smallest + " & Largest: " + largest);
	} 

}
