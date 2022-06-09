package Challenges;

import java.util.List;
import java.util.stream.Collectors;
import org.assertj.core.util.Arrays;

public class InterviewQue1 {

	public static void main(String[] args) {
		
		int a[] = {3,4,2,3,16,3,15,16,15,15,16,2,3};
		int b[] = {7,3,4,16,15,2};
		
		
		List list1 = Arrays.asList(a);
		List list2 = Arrays.asList(b);
		list1.addAll(list2);
		List updatedList = (List) list1.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(updatedList);
		
	}
	

}
