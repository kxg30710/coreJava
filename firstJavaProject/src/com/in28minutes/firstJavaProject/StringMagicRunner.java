package com.in28minutes.firstJavaProject;

class StringMagic {
	public String findLongestWord(String sentence) {
		int lengthOfTheLongestWord = 0;
		String longestWord = null;
		String[] words = sentence.split(" ");

		for (String word : words) {
			if (lengthOfTheLongestWord < word.length()) {
				longestWord = word;
				lengthOfTheLongestWord = word.length();
				// System.out.println(longestWord);
			}
		}

		return longestWord;

	}
}

public class StringMagicRunner {

	public static void main(String[] args) {
		StringMagic longestWord = new StringMagic();
		System.out.println(longestWord.findLongestWord("     "));
	}

}
