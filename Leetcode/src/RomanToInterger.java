import java.util.LinkedHashMap;
import java.util.Map;

public class RomanToInterger {

	public int romanToInt(String s) {

		Map<Character, Integer> map = new LinkedHashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int sum = 0;
		char[] romanCharacters = s.toCharArray();
		int value;

		for (int i = romanCharacters.length - 1; i >= 0; i--) {
			value = map.get(romanCharacters[i]);

			if ((i != 0) && (i != romanCharacters.length - 1)) {
				if ((romanCharacters[i] == romanCharacters[i - 1]) || (romanCharacters[i] == romanCharacters[i + 1])) {
					sum += value;
					continue;
				}
			}

			if (i == 0) {
				if ((romanCharacters.length != 1) && (romanCharacters[i] == romanCharacters[i + 1])) {
					sum += value;
					return sum;
				}
			}

			if (value >= sum) {
				sum += value;
			} else {
				sum -= value;
			}

		}
		return sum;
	}

	public static void main(String[] args) {

		RomanToInterger romanToInterger = new RomanToInterger();
		int value = romanToInterger.romanToInt("D");
		System.out.println(value);

	}

}
