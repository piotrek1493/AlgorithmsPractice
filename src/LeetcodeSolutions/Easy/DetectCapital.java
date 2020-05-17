package LeetcodeSolutions.Easy;

/*
520. Detect Capital
Link: https://leetcode.com/problems/detect-capital/
Topics: String
 */

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        return word.toUpperCase().equals(word) || word.toLowerCase().equals(word) ||
                (Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()).equals(word);
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
    }
}
