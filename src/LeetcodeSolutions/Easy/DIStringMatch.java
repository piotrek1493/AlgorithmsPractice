package LeetcodeSolutions.Easy;

/*
942. DI String Match
Link: https://leetcode.com/problems/di-string-match/
Topics: Math
 */

import java.util.Arrays;

public class DIStringMatch {
    public static int[] diStringMatch(String S) {
        int[] result = new int[S.length() + 1];
        int min = -1;
        int max = 1;
        result[0] = 0;
        int index = 1;
        for(char c : S.toCharArray()) {
            if (c == 'I') {
                result[index] = max;
                max++;
            } else {
                result[index] = min;
                min--;
            }
            index++;
        }
        min++;
        for(int i = 0; i < result.length; i++) {
            result[i] -= min;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));
    }
}
