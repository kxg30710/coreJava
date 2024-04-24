public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {

		int lengthOfSmallestString = Integer.MAX_VALUE;
		String smallestString = null;
		String longestCommonPrefix = "";
		int noOfStrings = strs.length;
		int count = 0;

		for (int i = 0; i < noOfStrings; i++) {
			if (lengthOfSmallestString > strs[i].length()) {
				lengthOfSmallestString = strs[i].length();
				smallestString = strs[i];
			}
		}

		while (lengthOfSmallestString > 0) {
			longestCommonPrefix = "";
			count = 0;
			for (int j = 0; j <= noOfStrings - 1; j++) {

				if (strs[j].startsWith(smallestString)) {

					count++;
					if (count == noOfStrings) {
						longestCommonPrefix = smallestString;
						return longestCommonPrefix;
					}
					continue;
				}
			}
			smallestString = smallestString.substring(0, lengthOfSmallestString - 1);
			lengthOfSmallestString = smallestString.length();

		}

		return longestCommonPrefix;
	}

	public static void main(String[] args) {

		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] strs = { "" };
		String longestCommonPrefix = lcp.longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}

}
