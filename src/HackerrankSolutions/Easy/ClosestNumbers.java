package HackerrankSolutions.Easy;

/*
The hackerrank.com task descriptions are fairly lengthy, so I don't include them in comments in solution files:
Link: https://www.hackerrank.com/challenges/closest-numbers/problem
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {
    public static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) < min) {
                result.clear();
                min = Math.abs(arr[i] - arr[i+1]);
                result.add(arr[i]);
                result.add(arr[i+1]);
            } else if (Math.abs(arr[i] - arr[i+1]) == min) {
                result.add(arr[i]);
                result.add(arr[i+1]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(closestNumbers(new int[]{5, 2, 3, 4, 1})));
        System.out.println(Arrays.toString(closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854})));
        System.out.println(Arrays.toString(closestNumbers(new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470})));
    }
}
