package LeetcodeSolutions.Medium;

/*
647. Palindromic Substring
Link: https://leetcode.com/problems/palindromic-substrings/
Topics: Dynamic Programming, String
 */

public class PalindromicSubstrings {
    public static int countSubstrings(String s) {

        int counter = s.length();

        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if(isPalindrome(str)) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
        System.out.println(countSubstrings("aaa"));
        System.out.println(countSubstrings("testingkayakwordsomeotherwordM1M22palindromes"));
    }
}
