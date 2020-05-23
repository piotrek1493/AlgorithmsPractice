package LeetcodeSolutions.Medium;

/*
739. Daily Temperatures
Link: https://leetcode.com/problems/daily-temperatures/
Topics: Hash Table, Stack
 */

import java.util.Arrays;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];

        for(int i = 0; i < T.length; i++) {
            for(int j = i + 1; j < T.length; j++) {
                if(T[j] > T[i]) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{83, 39, 64, 100, 91, 72, 99, 45})));
    }
}
