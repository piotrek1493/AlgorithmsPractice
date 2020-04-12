package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/find-the-median/problem
 */

import java.util.Arrays;

public class FindTheMedian {
    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr.length % 2 != 0 ? arr[arr.length/2] : (arr[arr.length/2] + arr[arr.length/2+1])/2;
    }

    public static void main(String[] args) {
        System.out.println(findMedian(new int[]{0,1,2,3,4,5,6}));
        System.out.println(findMedian(new int[]{0,1,2,3,4,5,6,7}));
    }
}
