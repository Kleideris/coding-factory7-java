package gr.aueb.cf.challenges.tasks14;

public class StringUtils {

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= string.length(); i++) {
            sb.append(string.charAt(string.length() - i));
        }
        return String.valueOf(sb);
    }

    public static String upperCaseString(String string) {
        return string.toUpperCase();
    }

    public static boolean isStringPalindrome(String string) {
        boolean isPalindrome = true;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
