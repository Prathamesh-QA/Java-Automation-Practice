package Challenges;

public class ExtractDigitsFromString {

	public static void main(String[] args) {
		String str = "The page not found 404";
        String str1 = "Internal Server 500 Error";
        System.out.println(getDigitsFromGivenString(str));
	}
	
	public static String getDigitsFromGivenString(String input) {
		String digits = input.replaceAll("[^0-9]", "");
		return digits;
	}

}
