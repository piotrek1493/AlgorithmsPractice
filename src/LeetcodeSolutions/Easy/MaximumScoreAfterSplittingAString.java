package LeetcodeSolutions.Easy;

/*
1422. Maximum Score After Splitting a String
Link: https://leetcode.com/problems/maximum-score-after-splitting-a-string/
Topics: String
 */

public class MaximumScoreAfterSplittingAString {
    public static int maxScore(String s) {

        int score, maximumScore = 0;
        int index = 1;

        for(int i = 0; i < s.length() - 1; i++) {
            String left = s.substring(0, index);
            String right = s.substring(i + 1);
            score = count(left, '0') + count(right, '1');
            if(score > maximumScore) {
                maximumScore = score;
            }
            index++;
        }

        return maximumScore;
    }

    public static int count(String str, char c) {
        int counter = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("1111"));
    }
}
