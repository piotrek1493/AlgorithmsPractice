package LeetcodeSolutions.Easy;

/*
557. Reverse Words in a String III
Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/
Topics: String
 */

public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        for(int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i]);
        }

        return String.join(" ", words);
    }

    // helper method, using an array of characters to speed up the algorithm
    public static String reverse(String orig) {
        char[] s = orig.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("A random sentence to see if it works"));
    }
}
