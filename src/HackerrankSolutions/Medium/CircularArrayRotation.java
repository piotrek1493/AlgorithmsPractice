package HackerrankSolutions.Medium;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/circular-array-rotation/problem
 */

import java.util.Arrays;

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int[] rotated = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            rotated[(i + a.length + k) % a.length] = a[i];
        }

        a = rotated;

        int[] result = new int[queries.length];

        for(int i = 0; i < result.length; i++) {
            result[i] = a[queries[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularArrayRotation(new int[]{3,4,5}, 2, new int[]{1,2})));
    }

}

