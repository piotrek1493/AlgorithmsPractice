package LeetcodeSolutions.Easy;

/*
28. Implement strStr()
Link: https://leetcode.com/problems/implement-strstr/
Topics: Two Pointers, String
 */

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if("".equals(needle)) return 0;
        if(needle.length() > haystack.length()) return -1;

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if(haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
    }
}
