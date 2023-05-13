package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import code.StringFunctions;

public class StringFunctionsTest {
	@DisplayName("String Is Palindrome")
	@Test
	public void test1() {

		boolean result = StringFunctions.isPalindrome("madam");
		Assertions.assertTrue(result);
	}
	@DisplayName("String Is Not Palindrome")
	@Test
	public void test2() {

		boolean result = StringFunctions.isPalindrome("shivani");
		Assertions.assertFalse(result);
	}

}
