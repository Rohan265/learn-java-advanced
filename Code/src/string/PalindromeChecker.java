package string;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Handle empty strings and single-character strings
        if (str.length() <= 1) {
            return true;
        }

        // Iterate from both ends of the string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If  the loop completes without returning false, it's a palindrome
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "hello";

        if (isPalindrome(str1)) {
            System.out.println(str1  + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }
    }
}
