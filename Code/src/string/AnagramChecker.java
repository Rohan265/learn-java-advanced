package string;

import java.util.Arrays;

public class AnagramChecker {
	public static boolean areAnagrams(String str1, String str2) {
		// Check if the strings have different lengths
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert the strings to character arrays for sorting
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		// Sort the character arrays
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare the sorted character arrays
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		if (areAnagrams(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");

		}
	}
}