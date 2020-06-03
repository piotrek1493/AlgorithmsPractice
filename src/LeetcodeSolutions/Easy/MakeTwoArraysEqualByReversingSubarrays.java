package LeetcodeSolutions.Easy;

/*
1460. Make Two Arrays Equal by Reversing Sub-arrays
Link: https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
Topics: Array
 */

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }

    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3}));
        System.out.println(canBeEqual(new int[]{7}, new int[]{7}));
        System.out.println(canBeEqual(new int[]{1,12}, new int[]{12,1}));
        System.out.println(canBeEqual(new int[]{3,7,9}, new int[]{3,7,11}));
        System.out.println(canBeEqual(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1}));
    }
}
