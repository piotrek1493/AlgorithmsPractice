package LeetcodeSolutions.Medium;

/*
338. Counting Bits
Link: https://leetcode.com/problems/counting-bits/
Topics: Dynamic Programming, Bit Manipulation
 */

import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for(int i = 0; i <= num; i++) {
            result[i] = Integer.bitCount(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }
}
