package LeetcodeSolutions.Easy;

/*
821. Shortest Distance to a Character
Link: https://leetcode.com/problems/shortest-distance-to-a-character/
Topics: Array, String
 */

import java.util.Arrays;

public class ShortestDistanceToACharacter {
    public static int[] shortestToChar(String S, char C) {
        int[] result = new int[S.length()];
        int index = result.length;

        for(int i = 0; i < result.length; i++) {
            index = S.charAt(i) == C ? 0 : index + 1;
            result[i] = index;
        }

        index = result.length;

        for(int i = result.length-1; i >= 0; i--) {
            index = S.charAt(i) == C ? 0 : index + 1;
            result[i] = Math.min(result[i], index);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("this is a test", 't')));
    }
}
