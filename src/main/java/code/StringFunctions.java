package code;

public class StringFunctions {

	public static boolean isPalindrome(String str) {
		
		String reverseString="";
		boolean flag=false;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}

		if (str.equalsIgnoreCase(reverseString)) {
			flag=true;
		}		
		return flag;
	}

}
