package LeetcodeSolutions.Easy;

/*
136. Single Number
Link: https://leetcode.com/problems/single-number/
Topics: Hash Table, Bit Manipulation
 */

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
