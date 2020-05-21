package LeetcodeSolutions.Easy;

/*
917. Reverse Only Letters
Link: https://leetcode.com/problems/reverse-only-letters/
Topics: String
 */

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
        int right = S.length() - 1;
        int left = 0;
        char[] ca = S.toCharArray();

        while(left < right) {
            if(!Character.isLetter(ca[left])) {
                left++;
            } else if(!Character.isLetter(ca[right])) {
                right--;
            } else {
                char temp = ca[left];
                ca[left] = ca[right];
                ca[right] =  temp;
                left++;
                right--;
            }
        }
        return String.valueOf(ca);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q"));
    }
}
