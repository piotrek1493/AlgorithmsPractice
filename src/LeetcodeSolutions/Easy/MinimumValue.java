package LeetcodeSolutions.Easy;

/*
1413. Minimum Value to Get Positive Step by Step Sum
Link: https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
Topics: Array
 */

public class MinimumValue {
    public static int minStartValue(int[] nums) {
        int[] tempVals = new int[nums.length];

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            tempVals[i] = sum;
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < tempVals.length; i++) {
            if(tempVals[i] < min) {
                min = tempVals[i];
            }
        }

        if(min > 0) {
            return 1;
        }

        return Math.abs(min) + 1;
    }

    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3, 2, -3, 4, 2}));
        System.out.println(minStartValue(new int[]{1, 2}));
        System.out.println(minStartValue(new int[]{1, -2, -3}));
    }
}
