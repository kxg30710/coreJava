import java.util.stream.IntStream;

public class Palindrome {
	class Solution {
		public boolean isPalindrome(int x) {
			String input = Integer.toString(x);
			return IntStream.range(0, input.length())
					.noneMatch(i -> input.charAt(i) != input.charAt(input.length() - i - 1));

		}
	}
}
