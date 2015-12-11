
public class Palindrome {
	public static <T> boolean isPalindrome(T elem) {
		String res = elem.toString();
		StringBuilder reversed = new StringBuilder(res);
		reversed = reversed.reverse();
		
		return res.equals(reversed.toString());
	}
}
