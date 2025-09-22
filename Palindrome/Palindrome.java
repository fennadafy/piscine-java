
public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String first_part = s.toLowerCase().substring(0, s.length() / 2);
        String last_part = (s.length() % 2 == 0) ? s.toLowerCase().substring(s.length() / 2, s.length()) : s.toLowerCase().substring(s.length() / 2 + 1, s.length());
        return first_part.equals(reverce(last_part));
    }

    public static String reverce(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res = s.charAt(i) + res;
        }
        return res;
    }
}
