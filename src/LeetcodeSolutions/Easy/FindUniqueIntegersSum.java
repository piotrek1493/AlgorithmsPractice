package LeetcodeSolutions.Easy;

/*
1304. Find N Unique Integers Sum up to Zero
Link: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
Topics: Array
 */

public class FindUniqueIntegersSum {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        if(n % 2 == 0) {
            for (int i = 0; i < result.length/2; i++) {
                result[index++] = i + 1;
                result[index++] = -(i + 1);
            }
        } else {
            for (int i = 0; i < result.length/2; i++) {
                result[index] = i + 1;
                index++;
                result[index] = -(i + 1);
                index++;
            }
            result[result.length - 1] = 0;
        }

        return result;
    }
}
