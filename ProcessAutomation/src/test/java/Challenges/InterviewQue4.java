package Challenges;

public class InterviewQue4 {

	public static void main(String[] args) {
		
		/*
		 * Print only those characters which are not present in 2nd input
		 * 	Input1="Hello"
			Input2="World"
			Output= H e
		 * 
		 */
		
		String str1 = "Hello";
		String str2 = "World";
		
		for(int i=0;i<str1.length();i++) {
			if(str2.indexOf(str1.charAt(i)) == -1)
				System.out.print(str1.charAt(i) + " ");
		}
		
	}
	
	

}
