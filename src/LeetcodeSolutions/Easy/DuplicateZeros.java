package LeetcodeSolutions.Easy;

/*
1089. Duplicate Zeros
Link: https://leetcode.com/problems/duplicate-zeros/
Topics: Array
 */

import java.util.Arrays;

public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0) {
                int j = arr.length - 2;
                while(j >= i) {
                    arr[j+1] = arr[j];
                    j--;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] test1 = {1,0,2,3,0,4,5,0};
        int[] test2 = {1,2,3};
        duplicateZeros(test1);
        duplicateZeros(test2);
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }
}
