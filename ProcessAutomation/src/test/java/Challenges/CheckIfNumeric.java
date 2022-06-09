package Challenges;

public class CheckIfNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumeric("afb2jksdh"));
	}
	
	public static boolean isEmpty(String input) {
		return input == null || input.length() == 0;
	}
	
	public static boolean isNumeric(String input) {
		if(isEmpty(input))
			return false;
		
		for(int i=0;i<input.length();i++) {
			if(!Character.isDigit(input.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
