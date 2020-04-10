package CodewarsSolutions.kata6;

/*
You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

Example

sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */

import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        int temp;
        for(int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] % 2 != 0 && array[j] % 2 != 0 && array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5,3,2,8,1,4})));
        System.out.println(Arrays.toString(sortArray(new int[]{999,1,2,2,51,39,-181,Integer.MAX_VALUE,Integer.MAX_VALUE-1})));
        System.out.println(Arrays.toString(sortArray(new int[]{10,9,8,7,6,5,4,3,2,1})));
    }
}
