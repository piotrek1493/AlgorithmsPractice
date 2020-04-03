package CodewarsSolutions.kata6;

/* TODO: Solution by Piotr Szukalski
    http://www.github.com/piotrek1493
 */

/*
Longest Palindrome
Find the length of the longest substring in the given string s that is the same in reverse.

As an example, if the input was “I like racecars that go fast”, the substring (racecar) length would be 7.

If the length of the input string is 0, the return value must be 0.

Example:
"a" -> 1
"aab" -> 2
"abcde" -> 1
"zzbaabcd" -> 4
"" -> 0
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    public static int longestPalindrome(final String s) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                if(isPalindrome(s.substring(i, j))) {
                    set.add(s.substring(i, j));
                }
            }
        }
        return set.stream().mapToInt(String::length).max().orElse(0);
    }

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("I like racecars that go fast"));
        System.out.println(longestPalindrome("aa"));
    }

}
