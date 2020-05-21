package LeetcodeSolutions.Easy;

/*
1200. Minimum Absolute Difference
Link: https://leetcode.com/problems/minimum-absolute-difference/
Topics: Array
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> results = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++) {
            if(Math.abs(arr[i+1] - arr[i]) < min) {
                min = Math.abs(arr[i+1] - arr[i]);
            }
        }

        for(int i = 0; i < arr.length - 1; i++) {
            if(Math.abs(arr[i+1] - arr[i]) == min) {
                List<Integer> pair = Arrays.asList(arr[i], arr[i+1]);
                results.add(pair);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4, 2, 1, 3}));
    }
}
