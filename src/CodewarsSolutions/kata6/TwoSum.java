package CodewarsSolutions.kata6;

/*
Write a function that takes an array of numbers (integers for the tests) and a target number.
It should find two different items in the array that, when added together, give the target value.
The indices of these items should then be returned in a tuple like so: (index1, index2).

For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
target will always be the sum of two different items from that array).

Based on: http://oj.leetcode.com/problems/two-sum/
 */

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target && numbers[i] != numbers[j]) {
                    return new int [] {i, j};
                }
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {2, 2, 3};
        int[] test3 = {1234, 5678, 9012};
        System.out.println(Arrays.toString(twoSum(test1, 4)));
        System.out.println(Arrays.toString(twoSum(test1, 3)));
        System.out.println(Arrays.toString(twoSum(test2, 5)));
        System.out.println(Arrays.toString(twoSum(test3, 2)));
        System.out.println(Arrays.toString(twoSum(test3, 10246)));
    }

}
