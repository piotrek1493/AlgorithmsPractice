package LeetcodeSolutions.Easy;

/*
888. Fair Candy Swap
Link: https://leetcode.com/problems/fair-candy-swap/
Topics: Array
 */

import java.util.Arrays;

public class FairCandySwap {
    public static int[] fairCandySwap(int[] A, int[] B) {

        int sumAlice = 0;
        int sumBob = 0;

        for(int i : A) {
            sumAlice += i;
        }

        for(int i : B) {
            sumBob += i;
        }

        for(int i = 0; i < A.length; i++) {
            int temp1 = sumAlice - A[i];
            for(int j = 0; j < B.length; j++) {
                int temp2 = sumBob - B[j];
                if(temp1 + B[j] == temp2 + A[i]) {
                    return new int[]{A[i], B[j]};
                }
            }
        }


        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,2}, new int[]{2,3})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{2}, new int[]{1,3})));
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,2,5}, new int[]{2,4})));
    }
}
