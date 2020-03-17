package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/icecream-parlor/problem
 */

import java.util.Arrays;

public class IceCreamParlor {
    static int[] icecreamParlor(int m, int[] arr) {

        int[] result = new int[2];

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(i != j && arr[i] + arr[j] == m) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(icecreamParlor(6, new int[]{1,3,4,5,6})));
    }

}
