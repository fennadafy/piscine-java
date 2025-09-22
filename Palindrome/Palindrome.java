
public class Palindrome {

    public static boolean isPalindrome(String s) {
        String first_part = s.toLowerCase().substring(0, s.length() / 2);
        String last_part = (s.length() % 2 == 0) ? s.toLowerCase().substring(s.length() / 2, s.length()) : s.toLowerCase().substring(s.length() / 2 + 1, s.length());
        // System.out.println(first_part);
        // System.out.println(reverce(last_part));
        // if (first_part == reverce(last_part)){
        //     return true
        // }
        // return false;
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
