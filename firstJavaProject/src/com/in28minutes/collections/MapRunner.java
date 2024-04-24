package com.in28minutes.collections;

import java.util.HashMap;

class words {
	HashMap<String, Integer> noOfWordsHashMap = new HashMap<>();

	HashMap<String, Integer> getNoOfWordsInAWord(String words) {
		String[] noOfWords = words.split(" ");

		words.toLowerCase();

		for (String word : noOfWords) {
			if (noOfWordsHashMap.containsKey(word)) {
				noOfWordsHashMap.put(word, noOfWordsHashMap.get(word) + 1);
			} else {
				noOfWordsHashMap.put(word, 1);
			}
		}
		return noOfWordsHashMap;

	}

	HashMap<Character, Integer> getNoOfCharssInAWord(String words) {

		String wordsInLowerCase = words.toLowerCase();
		HashMap<Character, Integer> noOfCharsHashMap = new HashMap<>();

		for (int i = 0; i < wordsInLowerCase.length(); i++) {
			char c = wordsInLowerCase.charAt(i);
			if (c != ' ') {
				if ((noOfCharsHashMap.containsKey(c))) {
					noOfCharsHashMap.put(c, noOfCharsHashMap.get(c) + 1);
				} else {
					noOfCharsHashMap.put(c, 1);
				}
			}
		}
		return noOfCharsHashMap;

	}
}

public class MapRunner {
	public static void main(String[] args) {
		HashMap<String, Integer> noOfWords = new HashMap<>();
		HashMap<Character, Integer> noOfChars = new HashMap<>();
		String words = "This is a great great thing This this ";
		words wordCount = new words();

		System.out.println(wordCount.getNoOfWordsInAWord(words.toLowerCase()));
		System.out.println(wordCount.getNoOfCharssInAWord(words));

	}
}
